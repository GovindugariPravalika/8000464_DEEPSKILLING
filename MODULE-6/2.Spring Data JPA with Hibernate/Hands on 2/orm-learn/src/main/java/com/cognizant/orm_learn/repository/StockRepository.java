package com.cognizant.orm_learn.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.orm_learn.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock,Integer>{

    // Facebook stock in September 2019
    List<Stock> findByCodeAndDateBetween(
            String code,
            LocalDate start,
            LocalDate end);

    // Google close price > 1250
    List<Stock> findByCodeAndCloseGreaterThan(
            String code,
            double close);

    // Top 3 highest volume
    List<Stock> findTop3ByOrderByVolumeDesc();

    // Lowest 3 Netflix closing prices
    List<Stock> findTop3ByCodeOrderByCloseAsc(
            String code);

}