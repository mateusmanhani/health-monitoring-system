package org.healthapp.service;

import io.grpc.stub.StreamObserver;
import org.healthapp.entity.HeartRateLog;
import org.healthapp.entity.Patient;
import org.healthapp.heartrate.HeartRateRequest;
import org.healthapp.heartrate.HeartRateResponse;
import org.healthapp.heartrate.HeartRateServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
public class HeartRateGrpcService extends HeartRateServiceGrpc.HeartRateServiceImplBase {
    @Autowired
    private final HeartRateService heartRateService;

    public HeartRateGrpcService(HeartRateService heartRateService) {
        this.heartRateService = heartRateService;
    }

    @Override
    public void getCurrentHeartRate(HeartRateRequest request, StreamObserver<HeartRateResponse> responseObserver) {
        HeartRateLog log = heartRateService.getLatestLogForPatient(request.getPatientId());

        HeartRateResponse response = HeartRateResponse.newBuilder()
                .setBpm(log.getBpm())
                .setTimestamp(log.getTimestamp().toString())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void streamHeartRate(HeartRateRequest request, StreamObserver<HeartRateResponse> responseObserver){
        int patientId = request.getPatientId();
        Optional<Patient> patient = heartRateService.getPatient(patientId);
        if (patient.isEmpty()) throw new RuntimeException("Patient Invalid");

        // Simulate streaming ( in a real app, this would connect to a live data source, eg a smartwatch)
        Random random = new Random();
        try{
            for (int i = 0; i < 10; i++) {
                int bpm = 70+ random.nextInt(30); // Random BPM between 70 and 100
                HeartRateResponse response = HeartRateResponse.newBuilder()
                        .setBpm(bpm)
                        .setTimestamp(LocalDateTime.now().toString())
                        .setStatus(getStatus(bpm))
                        .setPatientName(patient.get().getName() + " " + patient.get().getSurname())
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(1000); // ! second delay between updates
            }
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        } finally {
            responseObserver.onCompleted();
        }
    }

    private String getStatus(int bpm){
        if (bpm < 60) return "LOW";
        if (bpm > 100) return "HIGH";
        return "OK";
    }
}
