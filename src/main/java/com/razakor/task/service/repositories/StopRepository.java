package com.razakor.task.service.repositories;

import com.razakor.task.service.model.Stops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopRepository extends JpaRepository<Stops, String> {
}
