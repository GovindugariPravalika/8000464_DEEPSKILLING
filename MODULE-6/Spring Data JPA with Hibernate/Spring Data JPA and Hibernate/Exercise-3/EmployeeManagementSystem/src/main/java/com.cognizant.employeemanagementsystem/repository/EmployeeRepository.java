package com.cognizant.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.employeemanagementsystem.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Find employee by email
    Employee findByEmail(String email);

    // Find employees by name
    List<Employee> findByName(String name);

    // Find employees whose name contains text
    List<Employee> findByNameContaining(String keyword);

}