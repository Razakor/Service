package com.razakor.task.service.repositories;

import com.razakor.task.service.model.Hours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HourRepository extends JpaRepository<Hours, String> {
}
