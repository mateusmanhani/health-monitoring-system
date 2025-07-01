package org.healthapp;

import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.healthapp.heartrate.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Service
public class HeartRateGrpcClientService {

    private final HeartRateServiceGrpc.HeartRateServiceBlockingStub blockingStub;

    private final HeartRateServiceGrpc.HeartRateServiceStub asyncStub;

    private final ManagedChannel channel;

    public HeartRateGrpcClientService() {
        this.channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        this.blockingStub = HeartRateServiceGrpc.newBlockingStub(channel);
        this.asyncStub = HeartRateServiceGrpc.newStub(channel);
    }

    // For Single Response
    public HeartRateResponse getHeartRate(int patientId){
        HeartRateRequest request = HeartRateRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        return blockingStub.getCurrentHeartRate(request);
    }

    // Get patient heart rate history
    public List<HeartRateLogResponse> getHeartRateHistory(int patientId){
        List<HeartRateLogResponse> history = new ArrayList<>();
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

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
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

