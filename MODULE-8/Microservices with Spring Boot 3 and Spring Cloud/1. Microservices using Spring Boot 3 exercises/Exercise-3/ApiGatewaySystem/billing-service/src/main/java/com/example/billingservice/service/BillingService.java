package com.example.billingservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.billingservice.entity.Billing;
import com.example.billingservice.repository.BillingRepository;

@Service
public class BillingService {

    private final BillingRepository repository;

    public BillingService(BillingRepository repository) {
        this.repository = repository;
    }

    public List<Billing> getBills() {
        return repository.findAll();
    }

    public Billing saveBill(Billing billing) {
        return repository.save(billing);
    }

}