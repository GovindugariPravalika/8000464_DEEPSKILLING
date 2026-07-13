SET SERVEROUTPUT ON;

BEGIN

    FOR cust IN (
        SELECT customer_id,
               balance
        FROM customers
    )
    LOOP

        IF cust.balance > 10000 THEN

            UPDATE customers
            SET isvip='Y'
            WHERE customer_id=cust.customer_id;

            DBMS_OUTPUT.PUT_LINE(
                'VIP Customer : '
                || cust.customer_id
            );

        END IF;

    END LOOP;

    COMMIT;

END;
/
