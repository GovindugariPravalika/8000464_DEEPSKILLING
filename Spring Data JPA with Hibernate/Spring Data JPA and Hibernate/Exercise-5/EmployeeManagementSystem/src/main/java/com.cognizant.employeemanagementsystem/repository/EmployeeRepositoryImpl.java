package com.example.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.employeemanagementsystem.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployeesByDept(Long deptId) {

        return entityManager
                .createNamedQuery("Employee.findByDepartment", Employee.class)
                .setParameter("deptId", deptId)
                .getResultList();
    }

    @Override
    public List<Employee> getEmployeesByEmployeeName(String name) {

        return entityManager
                .createNamedQuery("Employee.findByName", Employee.class)
                .setParameter("name", name)
                .getResultList();
    }
}