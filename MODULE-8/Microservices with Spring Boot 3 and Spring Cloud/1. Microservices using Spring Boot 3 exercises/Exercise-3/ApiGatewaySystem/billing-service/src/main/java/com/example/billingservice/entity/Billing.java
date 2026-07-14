package com.example.billingservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Billing {

    @Id
    private Long id;

    private Long customerId;

    private double amount;

    public Billing() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}