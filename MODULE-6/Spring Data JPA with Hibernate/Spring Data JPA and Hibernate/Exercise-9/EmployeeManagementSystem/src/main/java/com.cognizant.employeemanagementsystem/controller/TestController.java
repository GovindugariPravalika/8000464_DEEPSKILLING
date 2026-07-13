package com.example.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagementsystem.config.AppProperties;

@RestController
public class AppController {

    @Autowired
    private AppProperties properties;

    @GetMapping("/company")
    public String company() {

        return properties.getName() + " - " + properties.getLocation();

    }

}