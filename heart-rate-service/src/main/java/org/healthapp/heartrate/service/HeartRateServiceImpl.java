package org.healthapp.heartrate.service;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import org.healthapp.heartrate.HeartRateRequest;
import org.healthapp.heartrate.HeartRateResponse;
import org.healthapp.heartrate.HeartRateLogResponse;
import org.healthapp.heartrate.PatientResponse;
import org.healthapp.heartrate.HeartRateServiceGrpc;
import org.healthapp.heartrate.repository.InMemoryHeartRateRepository;
import org.healthapp.entity.Patient;

import java.time.format.DateTimeFormatter;

public class HeartRateServiceImpl extends HeartRateServiceGrpc.HeartRateServiceImplBase {
    private final InMemoryHeartRateRepository repository = new InMemoryHeartRateRepository();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void GetCurrentHeartRate(HeartRateRequest request, StreamObserver<HeartRateResponse> responseObserver) {
        int patientId = request.getPatientId();
        InMemoryHeartRateRepository.HeartRateLog log = repository.getCurrentHeartRate(patientId);
        Patient patient = repository.getPatientById(patientId);
        if (log != null && patient != null) {
            HeartRateResponse response = HeartRateResponse.newBuilder()
                    .setBpm(log.getBpm())
                    .setTimestamp(log.getTimestamp().format(formatter))
                    .setStatus(getStatus(log.getBpm()))
                    .setPatientName(patient.getName())
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void StreamHeartRate(HeartRateRequest request, StreamObserver<HeartRateResponse> responseObserver) {
        int patientId = request.getPatientId();
        for (InMemoryHeartRateRepository.HeartRateLog log : repository.getHeartRateLogs(patientId)) {
            Patient patient = repository.getPatientById(patientId);
            HeartRateResponse response = HeartRateResponse.newBuilder()
                    .setBpm(log.getBpm())
                    .setTimestamp(log.getTimestamp().format(formatter))
                    .setStatus(getStatus(log.getBpm()))
                    .setPatientName(patient != null ? patient.getName() : "")
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void GetAllPatients(Empty request, StreamObserver<PatientResponse> responseObserver) {
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
    public void GetHeartRateHistory(HeartRateRequest request, StreamObserver<HeartRateLogResponse> responseObserver) {
        int patientId = request.getPatientId();
        for (InMemoryHeartRateRepository.HeartRateLog log : repository.getHeartRateLogs(patientId)) {
            HeartRateLogResponse response = HeartRateLogResponse.newBuilder()
                    .setBpm(log.getBpm())
                    .setTimestamp(log.getTimestamp().format(formatter))
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    private String getStatus(int bpm) {
        if (bpm < 60) return "LOW";
        if (bpm > 100) return "HIGH";
        return "OK";
    }
}

