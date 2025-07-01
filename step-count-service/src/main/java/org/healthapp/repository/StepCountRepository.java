package org.healthapp.repository;

import org.healthapp.entity.StepCountLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StepCountRepository extends JpaRepository<StepCountLog, Integer > {

    List<StepCountLog> findByPatientPatientIdOrderByTimestampAsc(int patientId);

    StepCountLog findTopByPatientPatientIdOrderByTimestampDesc(int patientId);
}
