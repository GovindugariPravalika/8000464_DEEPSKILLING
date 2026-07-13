package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionThrowerTest {

    @Test
    public void testThrowException() {

        // Arrange
        ExceptionThrower exceptionThrower = new ExceptionThrower();

        // Act
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> exceptionThrower.throwException()
        );

        // Assert
        assertEquals("Invalid input", exception.getMessage());

    }

}