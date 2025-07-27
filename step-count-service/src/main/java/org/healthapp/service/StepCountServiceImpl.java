package org.healthapp.service;

import io.grpc.stub.StreamObserver;
import org.healthapp.repository.InMemoryStepCountRepository;
import org.healthapp.entity.StepCountLog;
import org.healthapp.stepcount.*;
import java.time.format.DateTimeFormatter;

public class StepCountServiceImpl extends StepCountServiceGrpc.StepCountServiceImplBase {
    private final InMemoryStepCountRepository repository = new InMemoryStepCountRepository();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void getSteps(StepCountRequest request, StreamObserver<StepCountResponse> responseObserver) {
        int patientId = request.getPatientId();
        StepCountLog log = repository.getLatestLogForPatient(patientId);
        String patientName = repository.getPatientName(patientId);
        if (log != null) {
            StepCountResponse response = StepCountResponse.newBuilder()
                    .setSteps(log.getSteps())
                    .setTimestamp(log.getTimestamp().format(formatter))
                    .setPatientName(patientName)
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void streamSteps(StepCountRequest request, StreamObserver<StepCountLogResponse> responseObserver) {
        int patientId = request.getPatientId();
        for (StepCountLog log : repository.getLogsForPatient(patientId)) {
            StepCountLogResponse response = StepCountLogResponse.newBuilder()
                    .setPatientId(patientId)
                    .setSteps(log.getSteps())
                    .setTimestamp(log.getTimestamp().format(formatter))
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }
}
