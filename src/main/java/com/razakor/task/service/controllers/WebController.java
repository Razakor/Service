package com.razakor.task.service.controllers;

import com.razakor.task.service.model.Trolleybuses;
import com.razakor.task.service.repositories.TrolleybusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    private TrolleybusRepository trolleybusRepository;

    @GetMapping()
    public String main(Model model) {
        model.addAttribute("msg", "Hello world");
        return "main";
    }

    @PostMapping()
    public String add(@RequestParam String firstStop, @RequestParam String secondStop, Model model) {
        List<Trolleybuses> trolleybuses = trolleybusRepository.findAll();
        model.addAttribute("trolleybuses", trolleybuses);
        return "main";
    }
}
