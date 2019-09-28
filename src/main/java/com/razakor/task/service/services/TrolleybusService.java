package com.razakor.task.service.services;

import com.razakor.task.service.model.Trolleybus;

import java.util.List;

public interface TrolleybusService {

    Trolleybus findTrolleybusByNumber(String number);

    List<Trolleybus> findAllTrolleybuses();
}
