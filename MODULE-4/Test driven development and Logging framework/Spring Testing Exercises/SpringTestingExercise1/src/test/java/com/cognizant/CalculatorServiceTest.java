package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @Test
    void testAdd() {

        CalculatorService service = new CalculatorService();

        int result = service.add(10, 20);

        assertEquals(30, result);
    }
}