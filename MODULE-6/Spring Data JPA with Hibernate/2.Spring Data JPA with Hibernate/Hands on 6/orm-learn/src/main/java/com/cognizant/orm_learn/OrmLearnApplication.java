package com.cognizant.orm_learn;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.model.Skill;
import com.cognizant.orm_learn.service.DepartmentService;
import com.cognizant.orm_learn.service.EmployeeService;
import com.cognizant.orm_learn.service.SkillService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService = context.getBean(SkillService.class);

        // Uncomment ONE test at a time

        //testGetEmployee();

        testAddSkillToEmployee();

    }

    private static void testGetEmployee() {

        LOGGER.info("Start");

        Employee employee = employeeService.get(1);

        LOGGER.debug("Employee : {}", employee);

        LOGGER.debug("Department : {}", employee.getDepartment());

        LOGGER.debug("Skills : {}", employee.getSkillList());

        LOGGER.info("End");
    }

    private static void testAddSkillToEmployee() {

        LOGGER.info("Start");

        Employee employee = employeeService.get(1);

        Skill skill = skillService.get(3);

        Set<Skill> skills = employee.getSkillList();

        skills.add(skill);

        employee.setSkillList(skills);

        employeeService.save(employee);

        LOGGER.debug("Employee : {}", employee);

        LOGGER.info("End");
    }

}