package com.example.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.employeemanagementsystem.dto.EmployeeDTO;
import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.projection.EmployeeView;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Interface-based Projection
    List<EmployeeView> findAllProjectedBy();

    // Class-based Projection
    @Query("SELECT new com.example.employeemanagementsystem.dto.EmployeeDTO(e.name, e.email) FROM Employee e")
    List<EmployeeDTO> getEmployeeDTO();

}