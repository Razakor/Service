package com.razakor.task.service.services;

import com.razakor.task.service.model.Trolleybus;
import com.razakor.task.service.repositories.TrolleybusRepository;

import java.util.List;

public class TrolleybusServiceImpl implements TrolleybusService {

    private final TrolleybusRepository trolleybusRepository;

    public TrolleybusServiceImpl(TrolleybusRepository trolleybusRepository) {
        this.trolleybusRepository = trolleybusRepository;
    }

    @Override
    public Trolleybus findTrolleybusByNumber(String number) {
        return trolleybusRepository.findById(number).get();
    }

    @Override
    public List<Trolleybus> findAllTrolleybuses() {
        return trolleybusRepository.findAll();
    }
}
