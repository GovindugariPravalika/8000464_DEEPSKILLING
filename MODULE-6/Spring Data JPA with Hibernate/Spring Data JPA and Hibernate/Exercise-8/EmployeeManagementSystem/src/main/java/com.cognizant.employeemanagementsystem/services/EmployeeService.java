package com.example.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.dto.EmployeeDTO;
import com.example.employeemanagementsystem.projection.EmployeeView;
import com.example.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeView> getEmployeeProjection() {
        return employeeRepository.findAllProjectedBy();
    }

    public List<EmployeeDTO> getEmployeeDTO() {
        return employeeRepository.getEmployeeDTO();
    }

}