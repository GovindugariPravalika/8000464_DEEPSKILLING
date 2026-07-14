package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.exception.EmployeeNotFoundException;
import com.cognizant.springlearn.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ArrayList<Employee> getAllEmployees() {

        LOGGER.info("START");

        ArrayList<Employee> employeeList =
                employeeService.getAllEmployees();

        LOGGER.debug("Employees : {}", employeeList);

        LOGGER.info("END");

        return employeeList;

    }

    @PutMapping
    public void updateEmployee(@RequestBody @Valid Employee employee)
            throws EmployeeNotFoundException {

        LOGGER.info("START");

        LOGGER.debug("Employee : {}", employee);

        employeeService.updateEmployee(employee);

        LOGGER.info("END");

    }
    @DeleteMapping("/{id}")
public void deleteEmployee(@PathVariable int id)
        throws EmployeeNotFoundException {

    LOGGER.info("START");

    LOGGER.debug("Deleting Employee Id : {}", id);

    employeeService.deleteEmployee(id);

    LOGGER.info("END");

}

}