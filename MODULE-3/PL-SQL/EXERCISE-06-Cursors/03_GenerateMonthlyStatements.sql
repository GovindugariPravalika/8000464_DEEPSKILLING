SET SERVEROUTPUT ON;

DECLARE

CURSOR GenerateMonthlyStatements IS

SELECT
c.customer_name,
t.transaction_type,
t.amount,
t.transaction_date

FROM customers_ex6 c

JOIN transactions_ex6 t

ON c.customer_id=t.customer_id

WHERE EXTRACT(MONTH FROM t.transaction_date)=EXTRACT(MONTH FROM SYSDATE)
AND EXTRACT(YEAR FROM t.transaction_date)=EXTRACT(YEAR FROM SYSDATE);

v_record GenerateMonthlyStatements%ROWTYPE;

BEGIN

OPEN GenerateMonthlyStatements;

LOOP

FETCH GenerateMonthlyStatements
INTO v_record;

EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

DBMS_OUTPUT.PUT_LINE(
'Customer : '
||v_record.customer_name
||' | '
||v_record.transaction_type
||' | '
||v_record.amount
||' | '
||TO_CHAR(v_record.transaction_date,'DD-MON-YYYY'));

END LOOP;

CLOSE GenerateMonthlyStatements;

END;
/