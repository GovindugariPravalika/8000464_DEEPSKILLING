package com.cognizant.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.employeemanagementsystem.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Find department by name
    Department findByName(String name);

    // Find departments whose name starts with given text
    List<Department> findByNameStartingWith(String prefix);

}