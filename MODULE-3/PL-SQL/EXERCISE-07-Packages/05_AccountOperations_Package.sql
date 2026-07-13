CREATE OR REPLACE PACKAGE AccountOperations AS

    PROCEDURE OpenAccount(
        p_account NUMBER,
        p_customer NUMBER,
        p_type VARCHAR2,
        p_balance NUMBER
    );

    PROCEDURE CloseAccount(
        p_account NUMBER
    );

    FUNCTION TotalBalance(
        p_customer NUMBER
    ) RETURN NUMBER;

END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS

    PROCEDURE OpenAccount(
        p_account NUMBER,
        p_customer NUMBER,
        p_type VARCHAR2,
        p_balance NUMBER
    )
    IS
    BEGIN
        INSERT INTO accounts_ex7
        VALUES (
            p_account,
            p_customer,
            p_type,
            p_balance,
            SYSDATE
        );
    END OpenAccount;

    PROCEDURE CloseAccount(
        p_account NUMBER
    )
    IS
    BEGIN
        DELETE FROM accounts_ex7
        WHERE account_id = p_account;
    END CloseAccount;

    FUNCTION TotalBalance(
        p_customer NUMBER
    ) RETURN NUMBER
    IS
        v_total NUMBER;
    BEGIN
        SELECT NVL(SUM(balance),0)
        INTO v_total
        FROM accounts_ex7
        WHERE customer_id = p_customer;

        RETURN v_total;
    END TotalBalance;

END AccountOperations;
/