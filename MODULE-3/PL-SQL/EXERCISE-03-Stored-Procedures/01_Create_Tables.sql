CREATE TABLE accounts_ex3 (
    account_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(50),
    account_type VARCHAR2(20),
    balance NUMBER(12,2)
);

CREATE TABLE employees_ex3 (
    employee_id NUMBER PRIMARY KEY,
    employee_name VARCHAR2(50),
    department VARCHAR2(30),
    salary NUMBER(12,2)
);