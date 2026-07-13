CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment
(
    p_loan_amount NUMBER,
    p_interest_rate NUMBER,
    p_duration NUMBER
)

RETURN NUMBER

IS

    v_interest NUMBER;

    v_total NUMBER;

BEGIN

    v_interest :=
        p_loan_amount *
        p_interest_rate *
        p_duration
        /100;

    v_total :=
        p_loan_amount +
        v_interest;

    RETURN ROUND(v_total/(p_duration*12),2);

END;
/