package org.healthapp.repository;

import org.healthapp.entity.StepCountLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StepCountRepository extends JpaRepository<StepCountLog, Integer > {

    List<StepCountLog> findByPatientPatientIdOrderByTimestampAsc(int patientId);

    StepCountLog findTopByPatientPatientIdOrderByTimestampDesc(int patientId);
}
