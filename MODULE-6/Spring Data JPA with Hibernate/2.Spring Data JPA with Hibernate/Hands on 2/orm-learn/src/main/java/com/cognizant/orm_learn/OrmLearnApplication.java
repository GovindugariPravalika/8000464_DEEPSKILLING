package com.cognizant.orm_learn;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.repository.StockRepository;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static StockRepository stockRepository;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class,args);

        stockRepository =
                context.getBean(StockRepository.class);

        testFacebookSeptember();

        testGoogleGreaterThan1250();

        testTop3Volume();

        testNetflixLowest();

    }

    private static void testFacebookSeptember(){

        LOGGER.info("Facebook September 2019");

        stockRepository.findByCodeAndDateBetween(
                "FB",
                LocalDate.of(2019,9,1),
                LocalDate.of(2019,9,30))
                .forEach(System.out::println);

    }

    private static void testGoogleGreaterThan1250(){

        LOGGER.info("Google Close >1250");

        stockRepository.findByCodeAndCloseGreaterThan(
                "GOOGL",
                1250)
                .forEach(System.out::println);

    }

    private static void testTop3Volume(){

        LOGGER.info("Top 3 Highest Volume");

        stockRepository.findTop3ByOrderByVolumeDesc()
                .forEach(System.out::println);

    }

    private static void testNetflixLowest(){

        LOGGER.info("Netflix Lowest 3");

        stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX")
                .forEach(System.out::println);

    }

}