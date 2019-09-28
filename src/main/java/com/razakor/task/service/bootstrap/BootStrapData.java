package com.razakor.task.service.bootstrap;

import com.razakor.task.service.model.Trolleybus;
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

        Trolleybus t1 = new Trolleybus();
        t1.setNumber("1");
        t1.setName("№1");
        trolleybusRepository.save(t1);

        Trolleybus t2 = new Trolleybus();
        t2.setNumber("2");
        t2.setName("№2");
        trolleybusRepository.save(t2);

        System.out.println("Trolleybuses Saved: " + trolleybusRepository.count());
    }
}