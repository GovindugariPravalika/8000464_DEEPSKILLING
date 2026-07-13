package com.example.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Pagination
    @GetMapping("/page")
    public Page<Employee> getEmployees(
            @RequestParam int page,
            @RequestParam int size) {

        return employeeService.getEmployees(page, size);
    }

    // Sorting
    @GetMapping("/sort")
    public Iterable<Employee> sortEmployees(
            @RequestParam String field) {

        return employeeService.getEmployeesSorted(field);
    }

    // Pagination + Sorting
    @GetMapping("/page-sort")
    public Page<Employee> pageAndSort(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String field) {

        return employeeService.getEmployees(page, size, field);
    }
}