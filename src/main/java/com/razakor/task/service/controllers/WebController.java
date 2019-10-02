package com.razakor.task.service.controllers;

import com.razakor.task.service.model.Data;
import com.razakor.task.service.model.Trolleybuses;
import com.razakor.task.service.repositories.TrolleybusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class WebController {

    @GetMapping()
    public String main() {
        return "main";
    }

    @PostMapping()
    public String add(@RequestParam String firstStop, @RequestParam String secondStop, Model model) {
        List<Trolleybuses> trolleybuses = Data.trolleybuses;

        trolleybuses = trolleybuses.stream().filter(trolleybus -> {
            return trolleybus.getStops().stream().anyMatch(stop -> stop.getName().equals(firstStop)) &&
            trolleybus.getStops().stream().anyMatch(stop -> stop.getName().equals(secondStop));
        }).collect(Collectors.toList());

        model.addAttribute("trolleybuses", trolleybuses);
        return "main";
    }
}
