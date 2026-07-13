SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_from NUMBER,
    p_to NUMBER,
    p_amount NUMBER
)
IS

    v_balance NUMBER;

BEGIN

    SELECT balance
    INTO v_balance
    FROM accounts_ex3
    WHERE account_id = p_from;

    IF v_balance >= p_amount THEN

        UPDATE accounts_ex3
        SET balance = balance - p_amount
        WHERE account_id = p_from;

        UPDATE accounts_ex3
        SET balance = balance + p_amount
        WHERE account_id = p_to;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Transfer Successful');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');

    END IF;

END;
/