package com.razakor.task.service.repositories;

import com.razakor.task.service.model.Minutes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MinuteRepository extends JpaRepository<Minutes, String> {
}
