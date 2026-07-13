CREATE TABLE customers_ex4 (
    customer_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(50),
    date_of_birth DATE
);

CREATE TABLE loans_ex4 (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    loan_amount NUMBER(12,2),
    interest_rate NUMBER(5,2),
    duration_years NUMBER
);

CREATE TABLE accounts_ex4 (
    account_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(50),
    balance NUMBER(12,2)
);