package com.razakor.task.service.services;

import com.razakor.task.service.model.Trolleybuses;

import java.util.List;

public interface TrolleybusService {

    Trolleybuses findTrolleybusByNumber(String number);

    List<Trolleybuses> findAllTrolleybuses();
}
