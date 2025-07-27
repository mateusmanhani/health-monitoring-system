package org.healthapp.falldetection.service;

import com.google.protobuf.Empty;
import org.healthapp.heartrate.PatientResponse;
import io.grpc.stub.StreamObserver;
import org.healthapp.falldetection.FallDetectionRequest;
import org.healthapp.falldetection.FallDetectionResponse;
import org.healthapp.falldetection.FallDetectionServiceGrpc;
import org.healthapp.falldetection.repository.InMemoryFallDetectionRepository;
import org.healthapp.entity.Patient;

import java.time.format.DateTimeFormatter;

public class FallDetectionServiceImpl extends FallDetectionServiceGrpc.FallDetectionServiceImplBase {
    private final InMemoryFallDetectionRepository repository = new InMemoryFallDetectionRepository();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void getAllPatients(Empty request, StreamObserver<PatientResponse> responseObserver) {
        for (Patient patient : repository.getAllPatients()) {
            PatientResponse response = PatientResponse.newBuilder()
                    .setPatientId(patient.getPatientId())
                    .setName(patient.getName())
                    .setSurname(patient.getSurname())
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getFallEventHistory(FallDetectionRequest request, StreamObserver<FallDetectionResponse> responseObserver) {
        int patientId = request.getPatientId();
        for (InMemoryFallDetectionRepository.FallEvent event : repository.getFallEvents(patientId)) {
            FallDetectionResponse response = FallDetectionResponse.newBuilder()
                    .setMessage("Fall event recorded.")
                    .setTimestamp(event.getTimestamp().format(formatter))
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getLatestFallEvent(FallDetectionRequest request, StreamObserver<FallDetectionResponse> responseObserver) {
        int patientId = request.getPatientId();
        InMemoryFallDetectionRepository.FallEvent event = repository.getLatestFallEvent(patientId);
        if (event != null) {
            FallDetectionResponse response = FallDetectionResponse.newBuilder()
                    .setMessage("Latest fall event.")
                    .setTimestamp(event.getTimestamp().format(formatter))
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<FallDetectionRequest> monitorFalls(final StreamObserver<FallDetectionResponse> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(FallDetectionRequest request) {
                boolean fallDetected = Math.abs(request.getAccelZ()) > 9.5;
                if (fallDetected) {
                    repository.addFallEvent(request.getPatientId(),
                        new InMemoryFallDetectionRepository.FallEvent(
                            request.getAccelX(),
                            request.getAccelY(),
                            request.getAccelZ(),
                            java.time.LocalDateTime.parse(request.getTimestamp().replace("T", " ").substring(0, 19), formatter)
                        )
                    );
                    FallDetectionResponse response = FallDetectionResponse.newBuilder()
                        .setMessage("Fall Detected! Medical Assistance Required.")
                        .setTimestamp(request.getTimestamp())
                        .build();
                    responseObserver.onNext(response);
                }
            }
            @Override
            public void onError(Throwable t) {
                responseObserver.onCompleted();
            }
            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
