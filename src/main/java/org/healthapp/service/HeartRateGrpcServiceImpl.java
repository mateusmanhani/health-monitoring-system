package org.healthapp.service;

import io.grpc.stub.StreamObserver;
import org.healthapp.entity.HeartRateLog;
import org.healthapp.heartrate.HeartRateRequest;
import org.healthapp.heartrate.HeartRateResponse;
import org.healthapp.heartrate.HeartRateServiceGrpc;

public class HeartRateGrpcServiceImpl extends HeartRateServiceGrpc.HeartRateServiceImplBase {

    private final HeartRateService heartRateService;

    public HeartRateGrpcServiceImpl(HeartRateService heartRateService) {
        this.heartRateService = heartRateService;
    }

    @Override
    public void getCurrentHeartRate(HeartRateRequest request, StreamObserver<HeartRateResponse> responseObserver) {
        HeartRateLog log = heartRateService.getLatestLogForPatient(request.getPatientId().getValue());

        HeartRateResponse response = HeartRateResponse.newBuilder()
                .setBpm(log.getBpm())
                .setTimestamp(log.getTimestamp().toString())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
