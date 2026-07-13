CREATE TABLE customers_ex5 (
    customer_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(50),
    balance NUMBER(12,2),
    last_modified DATE
);

CREATE TABLE transactions_ex5 (
    transaction_id NUMBER PRIMARY KEY,
    account_id NUMBER,
    transaction_type VARCHAR2(20),
    amount NUMBER(12,2)
);

CREATE TABLE audit_log_ex5 (
    audit_id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    transaction_id NUMBER,
    log_message VARCHAR2(200),
    log_date DATE
);