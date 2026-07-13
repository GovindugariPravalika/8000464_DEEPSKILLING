SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE AddNewCustomer
(
    p_customer_id NUMBER,
    p_name VARCHAR2,
    p_age NUMBER,
    p_balance NUMBER
)
IS
BEGIN

    INSERT INTO customers
    VALUES
    (
        p_customer_id,
        p_name,
        p_age,
        p_balance
    );

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Customer Added');

EXCEPTION

    WHEN DUP_VAL_ON_INDEX THEN

        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE('Customer ID Already Exists');

    WHEN OTHERS THEN

        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE(SQLERRM);

END;
/