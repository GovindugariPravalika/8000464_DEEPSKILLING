package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String username = "John";

        int age = 25;

        logger.info("User Name : {}", username);

        logger.info("User Age : {}", age);

        logger.info("User {} is {} years old.", username, age);

    }

}