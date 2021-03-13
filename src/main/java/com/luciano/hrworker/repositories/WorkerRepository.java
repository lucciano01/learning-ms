package com.luciano.hrworker.repositories;

import com.luciano.hrworker.domain.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
