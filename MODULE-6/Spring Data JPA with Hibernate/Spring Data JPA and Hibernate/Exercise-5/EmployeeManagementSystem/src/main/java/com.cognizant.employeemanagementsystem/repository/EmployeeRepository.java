package com.example.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.employeemanagementsystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived Query Methods

    List<Employee> findByName(String name);

    List<Employee> findByEmailContaining(String text);

    List<Employee> findByDepartmentId(Long departmentId);

    List<Employee> findByNameStartingWith(String prefix);

    List<Employee> findByNameEndingWith(String suffix);

    List<Employee> findByNameContaining(String keyword);

    // @Query Annotation

    @Query("SELECT e FROM Employee e WHERE e.email LIKE %?1%")
    List<Employee> searchByEmail(String keyword);

    @Query("SELECT e FROM Employee e WHERE e.department.name=?1")
    List<Employee> findEmployeesByDepartment(String departmentName);

}