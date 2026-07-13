package com.example.employee.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name="employees")

@DynamicInsert
@DynamicUpdate
@BatchSize(size = 20)

public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name="employee_name")
    private String name;


    private String department;


    private double salary;


    public Employee(){

    }


    public Employee(String name,String department,double salary){

        this.name=name;
        this.department=department;
        this.salary=salary;

    }


    public int getId(){
        return id;
    }


    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name=name;
    }


    public String getDepartment(){
        return department;
    }


    public void setDepartment(String department){
        this.department=department;
    }


    public double getSalary(){
        return salary;
    }


    public void setSalary(double salary){
        this.salary=salary;
    }


    @Override
    public String toString(){

        return id+" "+name+" "+department+" "+salary;

    }
}