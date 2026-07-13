package com.cognizant;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class PerformanceTesterTest {

    @Test
    public void testPerformTask() {

        // Arrange
        PerformanceTester tester = new PerformanceTester();

        // Act & Assert
        assertTimeout(Duration.ofSeconds(1), () -> {
            tester.performTask();
        });

    }

}