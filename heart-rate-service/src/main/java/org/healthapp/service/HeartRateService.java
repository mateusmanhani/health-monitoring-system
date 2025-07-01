package org.healthapp.service;

import org.healthapp.entity.HeartRateLog;
import org.healthapp.entity.Patient;
import org.healthapp.repository.HeartRateRepository;
import org.healthapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class HeartRateService {
    @Autowired
    HeartRateRepository heartRateRepository;

    @Autowired
    PatientRepository patientRepository;

    // Log heart rate
    public void saveHeartRate(int patientId, int bpm) {
        HeartRateLog log = new HeartRateLog();
        log.setPatient(patientId);
        log.setBpm(bpm);
        log.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        heartRateRepository.save(log);
    }


    // Get last heartRateLog of a patient
    public HeartRateLog getLatestLogForPatient(int patientId){
        return heartRateRepository.findTopByPatientIdOrderByTimestampDesc(patientId);
    }
    // Create patient
    public void addNewPatient(int id, String name, String surname, int age){
        if (!patientRepository.existsById(id)){
            patientRepository.save(new Patient(name, surname, age));
        }
    }

    // Fetch patient
    public Optional<Patient> getPatient(int patientId){
        return patientRepository.findById(patientId);
    }

}
