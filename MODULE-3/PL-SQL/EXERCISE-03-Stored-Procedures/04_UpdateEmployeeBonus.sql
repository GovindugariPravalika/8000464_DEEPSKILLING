SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
    p_department VARCHAR2,
    p_bonus NUMBER
)
IS
BEGIN

    UPDATE employees_ex3
    SET salary = salary + (salary * p_bonus/100)
    WHERE department = p_department;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Bonus Updated Successfully');

END;
/