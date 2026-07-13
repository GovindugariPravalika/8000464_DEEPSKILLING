package com.cognizant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @After
    public void tearDown() {
        System.out.println("Test completed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int firstNumber = 10;
        int secondNumber = 20;

        // Act
        int result = calculator.add(firstNumber, secondNumber);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {

        // Arrange
        int firstNumber = 20;
        int secondNumber = 5;

        // Act
        int result = calculator.subtract(firstNumber, secondNumber);

        // Assert
        assertEquals(15, result);
    }
}