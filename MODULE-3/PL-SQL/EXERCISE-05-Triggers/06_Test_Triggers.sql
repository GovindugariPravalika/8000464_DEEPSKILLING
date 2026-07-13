UPDATE customers_ex5
SET balance = 60000
WHERE customer_id = 101;

INSERT INTO transactions_ex5
VALUES
(
    2,
    102,
    'DEPOSIT',
    10000
);

SELECT * FROM audit_log_ex5;
INSERT INTO transactions_ex5
VALUES
(
    3,
    101,
    'WITHDRAWAL',
    10000
);
INSERT INTO transactions_ex5
VALUES
(
    4,
    103,
    'WITHDRAWAL',
    50000
);
INSERT INTO transactions_ex5
VALUES
(
    5,
    101,
    'DEPOSIT',
    -500
);
SELECT * FROM customers_ex5;