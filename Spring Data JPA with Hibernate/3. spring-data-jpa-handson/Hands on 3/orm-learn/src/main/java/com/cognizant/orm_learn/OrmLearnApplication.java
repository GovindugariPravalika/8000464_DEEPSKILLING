package com.cognizant.orm_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Attempt;
import com.cognizant.orm_learn.model.AttemptOption;
import com.cognizant.orm_learn.model.AttemptQuestion;
import com.cognizant.orm_learn.model.Options;
import com.cognizant.orm_learn.service.AttemptService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static AttemptService attemptService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        attemptService = context.getBean(AttemptService.class);

        testGetAttempt();

    }

    private static void testGetAttempt() {

        LOGGER.info("Start");

        Attempt attempt = attemptService.getAttempt(1, 1);

        System.out.println("User : " + attempt.getUser().getName());
        System.out.println("Date : " + attempt.getDate());

        for (AttemptQuestion aq : attempt.getAttemptQuestions()) {

            System.out.println();
            System.out.println(aq.getQuestion().getText());

            for (Options option : aq.getQuestion().getOptions()) {

                boolean selected = false;

                for (AttemptOption ao : aq.getAttemptOptions()) {

                    if (ao.getOption().getId() == option.getId()) {
                        selected = ao.isSelected();
                        break;
                    }
                }

                System.out.printf("%-30s %-5.1f %-5b%n",
                        option.getText(),
                        option.getScore(),
                        selected);
            }
        }

        LOGGER.info("End");

    }

}