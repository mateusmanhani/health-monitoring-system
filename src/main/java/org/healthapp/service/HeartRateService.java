package org.healthapp.service;

import org.healthapp.entity.HeartRateLog;
import org.healthapp.repository.HeartRateRepository;
import org.healthapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Random;

@Service
public class HeartRateService {
    @Autowired
    HeartRateRepository heartRateRepository;

    @Autowired
    PatientRepository patientRepository;

    @Scheduled(fixedRate = 5000)
    public void simulateHeartRate() {
        Random rand = new Random();
        int bpm = 50 + rand.nextInt(71); // 50–120
        HeartRateLog log = new HeartRateLog(1,bpm, Timestamp.valueOf(LocalDateTime.now()));
        heartRateRepository.save(log);

        if (bpm < 55 || bpm > 110) {
            System.out.println("⚠️ Alert: Abnormal heart rate for " +  ": " + bpm);
            // Add gRPC call to notify GUI if needed
        }
    }

    // Get last heartRateLog of a patient

    // Get Patient by id

    // Create patient

    // log patient heart rate

}
