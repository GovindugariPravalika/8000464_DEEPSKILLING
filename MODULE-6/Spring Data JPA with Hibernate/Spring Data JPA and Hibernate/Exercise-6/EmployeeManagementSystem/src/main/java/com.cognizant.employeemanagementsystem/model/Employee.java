package com.example.employeemanagementsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")

@NamedQueries({
    @NamedQuery(
        name = "Employee.findByDepartment",
        query = "SELECT e FROM Employee e WHERE e.department.id = :deptId"
    ),
    @NamedQuery(
        name = "Employee.findByName",
        query = "SELECT e FROM Employee e WHERE e.name = :name"
    )
})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Constructors

    public Employee() {
    }

    public Employee(String name, String email, Department department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    // Getters and Setters
}