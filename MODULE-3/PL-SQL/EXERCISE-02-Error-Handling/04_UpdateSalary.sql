SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE UpdateSalary
(
    p_employee_id NUMBER,
    p_percentage NUMBER
)
IS
BEGIN

    UPDATE employees
    SET salary = salary + (salary*p_percentage/100)
    WHERE employee_id = p_employee_id;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(-20002,'Employee Not Found');
    END IF;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Salary Updated');

EXCEPTION

    WHEN OTHERS THEN

        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE(SQLERRM);

END;
/