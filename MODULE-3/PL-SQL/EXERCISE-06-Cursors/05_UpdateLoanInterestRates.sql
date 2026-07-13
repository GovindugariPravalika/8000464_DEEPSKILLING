SET SERVEROUTPUT ON;

DECLARE

CURSOR UpdateLoanInterestRates IS

SELECT loan_id,
interest_rate

FROM loans_ex6

FOR UPDATE;

v_loan UpdateLoanInterestRates%ROWTYPE;

BEGIN

OPEN UpdateLoanInterestRates;

LOOP

FETCH UpdateLoanInterestRates
INTO v_loan;

EXIT WHEN UpdateLoanInterestRates%NOTFOUND;

IF v_loan.interest_rate>9 THEN

UPDATE loans_ex6

SET interest_rate=
interest_rate-0.5

WHERE CURRENT OF UpdateLoanInterestRates;

ELSE

UPDATE loans_ex6

SET interest_rate=
interest_rate+0.25

WHERE CURRENT OF UpdateLoanInterestRates;

END IF;

DBMS_OUTPUT.PUT_LINE(
'Loan Updated : '
||v_loan.loan_id);

END LOOP;

CLOSE UpdateLoanInterestRates;

COMMIT;

END;
/