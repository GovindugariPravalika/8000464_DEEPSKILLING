CREATE OR REPLACE FUNCTION HasSufficientBalance
(
    p_account_id NUMBER,
    p_amount NUMBER
)

RETURN VARCHAR2

IS

    v_balance NUMBER;

BEGIN

    SELECT balance
    INTO v_balance
    FROM accounts_ex4
    WHERE account_id=p_account_id;

    IF v_balance>=p_amount THEN

        RETURN 'TRUE';

    ELSE

        RETURN 'FALSE';

    END IF;

END;
/