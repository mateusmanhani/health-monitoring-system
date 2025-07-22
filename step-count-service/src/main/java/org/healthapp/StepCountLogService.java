package org.healthapp;

import org.healthapp.entity.Patient;
import org.healthapp.entity.StepCountLog;
import org.healthapp.repository.PatientRepository;
import org.healthapp.repository.StepCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class StepCountLogService {

    @Autowired
    StepCountRepository stepCountRepository;

    @Autowired
    PatientRepository patientRepository;

    public void saveStepCount(int patientId, int stepCount) {
        // Try and fetch the patient with id passed or else thrown an exception
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new IllegalArgumentException("Patient not found with ID: " + patientId));

        // create a new StepCountLog object and save it to the repository
        StepCountLog log = new StepCountLog();
        log.setSteps(stepCount);
        log.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        log.setPatient(patient);
        stepCountRepository.save(log);

    }

    public StepCountLog getLatest(int patientId) {
        // Fetch the latest step count log for the given patient ID
        return stepCountRepository.findTopByPatientPatientIdOrderByTimestampDesc(patientId);
    }

    public List<StepCountLog> getHistory(int patientId) {
        // Fetch all step count logs for the given patient ID, ordered by timestamp
        return stepCountRepository.findByPatientPatientIdOrderByTimestampAsc(patientId);
    }
}
