package com.example.employee.main;


import com.example.employee.dao.EmployeeDAO;
import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeBatchService;



public class EmployeeManagementApp {


    public static void main(String args[]){



        EmployeeDAO dao=new EmployeeDAO();



        Employee emp =
        new Employee(
            "Rahul",
            "Java",
            60000
        );



        dao.saveEmployee(emp);



        EmployeeBatchService service =
        new EmployeeBatchService();


        service.insertEmployees();



        System.out.println("Application Completed");

    }

}