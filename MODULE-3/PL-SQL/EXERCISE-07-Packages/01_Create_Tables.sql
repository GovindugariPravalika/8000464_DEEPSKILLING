CREATE TABLE customers_ex7 (
    customer_id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    dob DATE,
    balance NUMBER,
    last_modified DATE
);

CREATE TABLE accounts_ex7 (
    account_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    account_type VARCHAR2(20),
    balance NUMBER,
    last_modified DATE,
    FOREIGN KEY(customer_id)
    REFERENCES customers_ex7(customer_id)
);

CREATE TABLE transactions_ex7 (
    transaction_id NUMBER PRIMARY KEY,
    account_id NUMBER,
    transaction_date DATE,
    amount NUMBER,
    transaction_type VARCHAR2(20),
    FOREIGN KEY(account_id)
    REFERENCES accounts_ex7(account_id)
);

CREATE TABLE loans_ex7 (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    loan_amount NUMBER,
    interest_rate NUMBER,
    start_date DATE,
    end_date DATE,
    FOREIGN KEY(customer_id)
    REFERENCES customers_ex7(customer_id)
);

CREATE TABLE employees_ex7 (
    employee_id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    position VARCHAR2(50),
    salary NUMBER,
    department VARCHAR2(50),
    hire_date DATE
);