SET SERVEROUTPUT ON;

BEGIN

    FOR loan_rec IN (

        SELECT c.customer_name,
               l.loan_id,
               l.due_date

        FROM customers c

        JOIN loans l

        ON c.customer_id=l.customer_id

        WHERE l.due_date
        BETWEEN SYSDATE
        AND SYSDATE+30

    )

    LOOP

        DBMS_OUTPUT.PUT_LINE(

            'Reminder : '
            || loan_rec.customer_name
            || ' Loan ID '
            || loan_rec.loan_id
            || ' Due on '
            || TO_CHAR(
                loan_rec.due_date,
                'DD-MON-YYYY'
            )

        );

    END LOOP;

END;
/
