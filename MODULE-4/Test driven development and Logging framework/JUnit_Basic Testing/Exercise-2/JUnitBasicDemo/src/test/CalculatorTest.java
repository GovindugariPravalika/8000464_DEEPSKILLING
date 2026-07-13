package com.cognizant;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {

        // Create Calculator object
        Calculator calculator = new Calculator();

        // Call add() method
        int result = calculator.add(10, 20);

        // Check expected result
        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {

        Calculator calculator = new Calculator();

        int result = calculator.subtract(20, 5);

        assertEquals(15, result);
    }

    @Test
    public void testMultiplication() {

        Calculator calculator = new Calculator();

        int result = calculator.multiply(5, 6);

        assertEquals(30, result);
    }
}