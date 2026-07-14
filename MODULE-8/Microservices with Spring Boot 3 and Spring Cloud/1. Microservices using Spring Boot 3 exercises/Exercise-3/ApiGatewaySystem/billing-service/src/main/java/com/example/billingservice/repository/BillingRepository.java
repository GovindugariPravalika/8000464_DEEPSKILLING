package com.example.billingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billingservice.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}