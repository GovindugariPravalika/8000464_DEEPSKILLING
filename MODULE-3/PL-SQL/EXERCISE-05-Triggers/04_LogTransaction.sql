CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT
ON transactions_ex5
FOR EACH ROW

BEGIN

    INSERT INTO audit_log_ex5
    (
        transaction_id,
        log_message,
        log_date
    )

    VALUES
    (
        :NEW.transaction_id,
        'Transaction Inserted',
        SYSDATE
    );

END;
/