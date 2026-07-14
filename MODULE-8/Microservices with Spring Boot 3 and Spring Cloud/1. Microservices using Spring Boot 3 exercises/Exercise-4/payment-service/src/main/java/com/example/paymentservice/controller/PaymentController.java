package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paymentservice.service.PaymentService;

@RestController
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {

        this.service = service;

    }

    @GetMapping("/payment")
    public String payment() throws InterruptedException {

        return service.processPayment();

    }

}