CREATE TABLE customers_ex6 (
    customer_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(50)
);

CREATE TABLE accounts_ex6 (
    account_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    balance NUMBER(12,2)
);

CREATE TABLE loans_ex6 (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    loan_amount NUMBER(12,2),
    interest_rate NUMBER(5,2)
);

CREATE TABLE transactions_ex6 (
    transaction_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    transaction_date DATE,
    transaction_type VARCHAR2(20),
    amount NUMBER(12,2)
);