CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT
ON transactions_ex5
FOR EACH ROW

DECLARE

    v_balance NUMBER;

BEGIN

    IF :NEW.transaction_type = 'DEPOSIT' THEN

        IF :NEW.amount <= 0 THEN

            RAISE_APPLICATION_ERROR
            (
                -20001,
                'Deposit amount must be positive'
            );

        END IF;

    ELSIF :NEW.transaction_type = 'WITHDRAWAL' THEN

        SELECT balance
        INTO v_balance
        FROM customers_ex5
        WHERE customer_id = :NEW.account_id;

        IF :NEW.amount > v_balance THEN

            RAISE_APPLICATION_ERROR
            (
                -20002,
                'Insufficient Balance'
            );

        END IF;

    END IF;

END;
/