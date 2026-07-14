package com.example.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecureController {


    @GetMapping("/secure")
    public String secure() {

        return "JWT secured endpoint";

    }

}