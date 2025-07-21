package org.healthapp;

import io.grpc.ManagedChannel;
import org.springframework.stereotype.Service;

import org.healthapp.stepcount.StepCountServiceGrpc;
import org.healthapp.stepcount.StepCountRequest;
import org.healthapp.stepcount.StepCountResponse;
import org.healthapp.stepcount.StepCountLogResponse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class StepCountGrpcClientService {
    private final StepCountServiceGrpc.StepCountServiceBlockingStub blockingStub;

    public StepCountGrpcClientService(ManagedChannel channel) {
        this.blockingStub = StepCountServiceGrpc.newBlockingStub(channel);
    }

    public StepCountResponse getLatestStepCount(int patientId) {
        StepCountRequest request = StepCountRequest.newBuilder()
                .setPatientId(patientId)
                .build();
        return blockingStub.getSteps(request);
    }

    public List<StepCountLogResponse> getStepHistory(int patientId) {
        StepCountRequest request = StepCountRequest.newBuilder()
                .setPatientId(patientId)
                .build();

        Iterator<StepCountLogResponse> iterator = blockingStub.streamSteps(request);
        List<StepCountLogResponse> logs = new ArrayList<>();
        iterator.forEachRemaining(logs::add);
        return logs;
    }
}
