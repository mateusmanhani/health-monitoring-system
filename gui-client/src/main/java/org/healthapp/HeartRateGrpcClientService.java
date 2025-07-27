package org.healthapp;

import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.healthapp.heartrate.*;
import org.springframework.stereotype.Service;

import javax.jmdns.ServiceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Service
public class HeartRateGrpcClientService {
    private HeartRateServiceGrpc.HeartRateServiceBlockingStub blockingStub;
    private HeartRateServiceGrpc.HeartRateServiceStub asyncStub;

    public HeartRateGrpcClientService() {
        ServiceInfo info = JmDnsServiceDiscovery.discoverService("_grpc._tcp.local.", "HeartRateService");
        if (info != null) {
            String host = info.getHostAddresses()[0];
            int port = info.getPort();
            ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
            blockingStub = HeartRateServiceGrpc.newBlockingStub(channel);
            asyncStub = HeartRateServiceGrpc.newStub(channel);
        } else {
            System.err.println("HeartRateService not found via jmDNS!");
        }
    }

    // For Single Response
    public HeartRateResponse getHeartRate(int patientId){
        if (blockingStub == null) return null;
        HeartRateRequest request = HeartRateRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        return blockingStub.getCurrentHeartRate(request);
    }

    // Get patient heart rate history
    public List<HeartRateLogResponse> getHeartRateHistory(int patientId){
        List<HeartRateLogResponse> history = new ArrayList<>();
        if (asyncStub == null) return history;
        CountDownLatch latch = new CountDownLatch(1);

        HeartRateRequest request = HeartRateRequest.newBuilder().setPatientId(patientId).build();

        asyncStub.getHeartRateHistory(request, new StreamObserver<>() {
            @Override
            public void onNext(HeartRateLogResponse response) {
                history.add(response);
            }

            @Override
            public void onError(Throwable throwable) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        try{
            latch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e){
            e.printStackTrace();
            e.getMessage();
        }

        return history;
    }

    //  For streaming
    public void streamHeartRate(int patientId, StreamObserver<HeartRateResponse> responseObserver){
        HeartRateRequest request = HeartRateRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        asyncStub.streamHeartRate(request,responseObserver);
    }

    public List<PatientResponse> getAllPatients(){

        List<PatientResponse> patients = new ArrayList<>();

        CountDownLatch latch = new CountDownLatch(1);

        asyncStub.getAllPatients(Empty.newBuilder().build(), new StreamObserver<>() {
            @Override
            public void onNext(PatientResponse response) {
                patients.add(response);
            }

            @Override
            public void onError(Throwable throwable) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        try{
            latch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            e.getMessage();
        }

        return patients;
    }
}
