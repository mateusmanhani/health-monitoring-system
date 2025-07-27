package org.healthapp.falldetection.service;

import io.grpc.stub.StreamObserver;
import org.healthapp.falldetection.FallDetectionRequest;
import org.healthapp.falldetection.FallDetectionResponse;
import org.healthapp.falldetection.FallDetectionServiceGrpc;
import org.healthapp.falldetection.repository.InMemoryFallDetectionRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FallDetectionServiceImpl extends FallDetectionServiceGrpc.FallDetectionServiceImplBase {
    private final InMemoryFallDetectionRepository repository = new InMemoryFallDetectionRepository();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    @Override
    public StreamObserver<FallDetectionRequest> monitorFalls(final StreamObserver<FallDetectionResponse> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(FallDetectionRequest request) {
                // Simulate fall detection logic: if accelZ is close to -9.8, assume a fall
                boolean fallDetected = Math.abs(request.getAccelZ()) > 9.5;
                if (fallDetected) {
                    repository.addFallEvent(request.getPatientId(),
                        new InMemoryFallDetectionRepository.FallEvent(
                            request.getAccelX(),
                            request.getAccelY(),
                            request.getAccelZ(),
                            LocalDateTime.parse(request.getTimestamp(), formatter)
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
