package com.example.billingservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.billingservice.entity.Billing;
import com.example.billingservice.service.BillingService;

@RestController
@RequestMapping("/billing")
public class BillingController {

    private final BillingService service;

    public BillingController(BillingService service) {
        this.service = service;
    }

    @GetMapping
    public List<Billing> getBills() {
        return service.getBills();
    }

    @PostMapping
    public Billing addBill(@RequestBody Billing billing) {
        return service.saveBill(billing);
    }

}