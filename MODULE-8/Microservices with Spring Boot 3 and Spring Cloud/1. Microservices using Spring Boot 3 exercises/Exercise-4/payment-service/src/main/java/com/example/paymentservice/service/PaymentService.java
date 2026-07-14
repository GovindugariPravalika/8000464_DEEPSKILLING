package com.example.paymentservice.service;

import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class PaymentService {

    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallbackPayment")
    public String processPayment() throws InterruptedException {

        Thread.sleep(5000);

        throw new RuntimeException("Third-party payment service is unavailable");

    }

    public String fallbackPayment(Exception exception) {

        System.out.println("Fallback Method Executed");

        return "Payment service is temporarily unavailable. Please try again later.";

    }

}