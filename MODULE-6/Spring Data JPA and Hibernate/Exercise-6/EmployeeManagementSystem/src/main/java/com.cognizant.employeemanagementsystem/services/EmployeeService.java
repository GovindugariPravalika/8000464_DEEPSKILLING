package com.example.employeemanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Pagination
    public Page<Employee> getEmployees(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return employeeRepository.findAll(pageable);
    }

    // Sorting
    public Iterable<Employee> getEmployeesSorted(String field) {
        return employeeRepository.findAll(Sort.by(field));
    }

    // Pagination + Sorting
    public Page<Employee> getEmployees(int page, int size, String field) {
        Pageable pageable =
                PageRequest.of(page, size, Sort.by(field).ascending());

        return employeeRepository.findAll(pageable);
    }
}