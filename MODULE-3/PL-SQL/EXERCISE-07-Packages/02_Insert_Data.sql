INSERT INTO customers_ex7
VALUES
(1,'John Doe',
TO_DATE('1985-05-15','YYYY-MM-DD'),
1000,
SYSDATE);

INSERT INTO customers_ex7
VALUES
(2,'Jane Smith',
TO_DATE('1990-07-20','YYYY-MM-DD'),
1500,
SYSDATE);

INSERT INTO accounts_ex7
VALUES
(1,1,'Savings',1000,SYSDATE);

INSERT INTO accounts_ex7
VALUES
(2,2,'Checking',1500,SYSDATE);

INSERT INTO transactions_ex7
VALUES
(1,1,SYSDATE,200,'Deposit');

INSERT INTO transactions_ex7
VALUES
(2,2,SYSDATE,300,'Withdrawal');

INSERT INTO loans_ex7
VALUES
(
1,
1,
5000,
5,
SYSDATE,
ADD_MONTHS(SYSDATE,60)
);

INSERT INTO employees_ex7
VALUES
(
1,
'Alice Johnson',
'Manager',
70000,
'HR',
TO_DATE('2015-06-15','YYYY-MM-DD')
);

INSERT INTO employees_ex7
VALUES
(
2,
'Bob Brown',
'Developer',
60000,
'IT',
TO_DATE('2017-03-20','YYYY-MM-DD')
);

COMMIT;