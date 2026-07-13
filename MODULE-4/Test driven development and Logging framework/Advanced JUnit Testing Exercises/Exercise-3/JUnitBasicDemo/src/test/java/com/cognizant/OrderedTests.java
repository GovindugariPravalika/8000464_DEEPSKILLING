package com.cognizant;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    public void firstTest() {
        System.out.println("This is the first test.");
    }

    @Test
    @Order(2)
    public void secondTest() {
        System.out.println("This is the second test.");
    }

    @Test
    @Order(3)
    public void thirdTest() {
        System.out.println("This is the third test.");
    }
}