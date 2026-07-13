package com.example.employeemanagementsystem.repository;

import java.util.List;

import com.example.employeemanagementsystem.model.Employee;

public interface EmployeeRepositoryCustom {

    List<Employee> getEmployeesByDept(Long deptId);

    List<Employee> getEmployeesByEmployeeName(String name);

}