package org.healthapp;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.healthapp.heartrate.HeartRateRequest;
import org.healthapp.heartrate.HeartRateResponse;
import org.healthapp.heartrate.HeartRateServiceGrpc;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class HeartRateClientService {

    private final HeartRateServiceGrpc.HeartRateServiceBlockingStub blockingStub;

    private final HeartRateServiceGrpc.HeartRateServiceStub asyncStub;

    private final ManagedChannel channel;

    public HeartRateClientService() {
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
}

