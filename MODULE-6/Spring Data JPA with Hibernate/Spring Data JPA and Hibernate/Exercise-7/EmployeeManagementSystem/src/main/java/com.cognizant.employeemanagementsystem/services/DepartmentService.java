package com.example.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.model.Department;
import com.example.employeemanagementsystem.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartment(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Long id, Department department) {

        Department existing = departmentRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(department.getName());
            return departmentRepository.save(existing);
        }

        return null;
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}