SET SERVEROUTPUT ON;

DECLARE

CURSOR ApplyAnnualFee IS

SELECT account_id,balance

FROM accounts_ex6

FOR UPDATE;

v_account ApplyAnnualFee%ROWTYPE;

v_fee NUMBER:=500;

BEGIN

OPEN ApplyAnnualFee;

LOOP

FETCH ApplyAnnualFee
INTO v_account;

EXIT WHEN ApplyAnnualFee%NOTFOUND;

UPDATE accounts_ex6

SET balance=balance-v_fee

WHERE CURRENT OF ApplyAnnualFee;

DBMS_OUTPUT.PUT_LINE(
'Annual Fee Applied to Account '
||v_account.account_id);

END LOOP;

CLOSE ApplyAnnualFee;

COMMIT;

END;
/