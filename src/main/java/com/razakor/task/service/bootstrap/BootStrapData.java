package com.razakor.task.service.bootstrap;

import com.razakor.task.service.repositories.TrolleybusRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final TrolleybusRepository trolleybusRepository;

    public BootStrapData(TrolleybusRepository trolleybusRepository) {
        this.trolleybusRepository = trolleybusRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("Loading Data");
        System.out.println("Trolleybuses Saved: " + trolleybusRepository.count());
    }
}