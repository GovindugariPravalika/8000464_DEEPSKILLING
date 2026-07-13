package com.example.employee.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.employee.entity.Employee;
import com.example.employee.util.HibernateUtil;


public class EmployeeDAO {


    public void saveEmployee(Employee employee){


        Session session =
        HibernateUtil.getSessionFactory().openSession();


        Transaction tx=session.beginTransaction();


        session.persist(employee);


        tx.commit();


        session.close();

    }



    public void deleteEmployee(int id){


        Session session =
        HibernateUtil.getSessionFactory().openSession();


        Transaction tx=session.beginTransaction();


        Employee emp=session.get(Employee.class,id);


        if(emp!=null){

            session.remove(emp);

        }


        tx.commit();

        session.close();

    }

}