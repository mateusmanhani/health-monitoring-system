package org.healthapp.repository;

import org.healthapp.entity.HeartRateLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HeartRateRepository extends JpaRepository<HeartRateLog, Integer> {

    // Find the latest heart rate for a patient
    HeartRateLog findTopByPatientIdOrderByTimestampDesc(int patientId);

    // Optionally find all logs for a patient
    List<HeartRateLog> findByPatientId(int patientId);

    List<HeartRateLog> findByPatientIdOrderByTimestampAsc(int patientId);
}
