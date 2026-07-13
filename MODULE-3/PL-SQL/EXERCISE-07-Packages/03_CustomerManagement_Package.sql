CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

PROCEDURE AddCustomer(
    p_id NUMBER,
    p_name VARCHAR2,
    p_dob DATE,
    p_balance NUMBER
)
IS
BEGIN
    INSERT INTO customers_ex7
    VALUES
    (
        p_id,
        p_name,
        p_dob,
        p_balance,
        SYSDATE
    );
END AddCustomer;

PROCEDURE UpdateCustomer(
    p_id NUMBER,
    p_balance NUMBER
)
IS
BEGIN
    UPDATE customers_ex7
    SET balance = p_balance,
        last_modified = SYSDATE
    WHERE customer_id = p_id;
END UpdateCustomer;

FUNCTION GetBalance(
    p_id NUMBER
)
RETURN NUMBER
IS
    v_balance NUMBER;
BEGIN
    SELECT balance
    INTO v_balance
    FROM customers_ex7
    WHERE customer_id = p_id;

    RETURN v_balance;
END GetBalance;

END CustomerManagement;
/