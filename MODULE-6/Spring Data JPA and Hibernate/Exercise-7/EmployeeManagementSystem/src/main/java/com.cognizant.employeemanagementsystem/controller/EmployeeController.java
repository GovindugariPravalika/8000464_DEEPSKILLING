package com.example.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.employeemanagementsystem.dto.EmployeeDTO;
import com.example.employeemanagementsystem.projection.EmployeeView;
import com.example.employeemanagementsystem.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Interface Projection
    @GetMapping("/projection")
    public List<EmployeeView> projection() {
        return employeeService.getEmployeeProjection();
    }

    // DTO Projection
    @GetMapping("/dto")
    public List<EmployeeDTO> dto() {
        return employeeService.getEmployeeDTO();
    }

}