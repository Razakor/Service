package com.razakor.task.service.bootstrap;

import com.razakor.task.service.repositories.HourRepository;
import com.razakor.task.service.repositories.MinuteRepository;
import com.razakor.task.service.repositories.StopRepository;
import com.razakor.task.service.repositories.TrolleybusRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements ApplicationRunner {

    private final TrolleybusRepository trolleybusRepository;
    private final StopRepository stopRepository;
    private final HourRepository hourRepository;
    private final MinuteRepository minuteRepository;


    public BootStrapData(
            TrolleybusRepository trolleybusRepository,
            StopRepository stopRepository,
            HourRepository hourRepository,
            MinuteRepository minuteRepository
    ) {
        this.trolleybusRepository = trolleybusRepository;
        this.stopRepository = stopRepository;
        this.hourRepository = hourRepository;
        this.minuteRepository = minuteRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Loading Data");
        System.out.println("Trolleybuses Saved: " + trolleybusRepository.count());
        System.out.println("Stops Saved: " + stopRepository.count());
        System.out.println("Hours Saved: " + hourRepository.count());
        System.out.println("Minutes Saved: " + minuteRepository.count());
    }
}