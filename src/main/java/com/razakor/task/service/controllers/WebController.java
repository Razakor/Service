package com.razakor.task.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @GetMapping()
    public String main(Model model) {
        model.addAttribute("msg", "Hello world");
        return "main";
    }
}