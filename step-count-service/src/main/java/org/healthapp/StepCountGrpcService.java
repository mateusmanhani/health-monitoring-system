package org.healthapp;

import org.healthapp.entity.StepCountLog;
import io.grpc.stub.StreamObserver;
import org.healthapp.stepcount.StepCountServiceGrpc;
import org.healthapp.stepcount.StepCountRequest;
import org.healthapp.stepcount.StepCountResponse;
import org.healthapp.stepcount.StepCountLogResponse;




import java.util.List;

public class StepCountGrpcService extends StepCountServiceGrpc.StepCountServiceImplBase {

    private final StepCountLogService stepCountLogService;

    public StepCountGrpcService(StepCountLogService stepCountLogService) {
        this.stepCountLogService = stepCountLogService;
    }

    @Override
    public void getSteps(StepCountRequest request, StreamObserver<StepCountResponse> responseObserver) {
        StepCountLog log = stepCountLogService.getLatest(request.getPatientId());

        StepCountResponse response = StepCountResponse.newBuilder()
                .setSteps(log.getSteps())
                .setTimestamp(log.getTimestamp().toString())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void streamSteps(StepCountRequest request, StreamObserver<StepCountLogResponse> responseObserver) {
        List<StepCountLog> logs = stepCountLogService.getHistory(request.getPatientId());

        for (StepCountLog log : logs) {
            StepCountLogResponse resp = StepCountLogResponse.newBuilder()
                    .setPatientId(request.getPatientId())
                    .setSteps(log.getSteps())
                    .setTimestamp(log.getTimestamp().toString())
                    .build();
            responseObserver.onNext(resp);
        }
        responseObserver.onCompleted();
    }

}
