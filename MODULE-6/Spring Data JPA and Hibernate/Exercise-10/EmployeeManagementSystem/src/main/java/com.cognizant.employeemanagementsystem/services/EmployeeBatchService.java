package com.example.employee.service;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.employee.entity.Employee;
import com.example.employee.util.HibernateUtil;



public class EmployeeBatchService {



    public void insertEmployees(){


        Session session =
        HibernateUtil.getSessionFactory()
        .openSession();



        Transaction tx=session.beginTransaction();



        for(int i=1;i<=500;i++){


            Employee employee =
            new Employee(
                "Employee "+i,
                "IT",
                30000+i
            );


            session.persist(employee);



            if(i%50==0){


                session.flush();

                session.clear();

            }

        }



        tx.commit();


        session.close();


        System.out.println("Batch Insert Completed");

    }

}