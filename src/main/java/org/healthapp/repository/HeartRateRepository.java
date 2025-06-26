package org.healthapp.repository;

import org.healthapp.entity.HeartRateLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HeartRateRepository extends JpaRepository<HeartRateLog, Long> {

    Optional<HeartRateLog> findById(Long id);
}
