package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void additionTest() {

        int result = 10 + 20;

        assertEquals(30, result);

    }

}