CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_id NUMBER,
        p_name VARCHAR2,
        p_position VARCHAR2,
        p_salary NUMBER,
        p_department VARCHAR2
    )
    IS
    BEGIN
        INSERT INTO employees_ex7
        VALUES (
            p_id,
            p_name,
            p_position,
            p_salary,
            p_department,
            SYSDATE
        );
    END HireEmployee;

    PROCEDURE UpdateSalary(
        p_id NUMBER,
        p_salary NUMBER
    )
    IS
    BEGIN
        UPDATE employees_ex7
        SET salary = p_salary
        WHERE employee_id = p_id;
    END UpdateSalary;

    FUNCTION AnnualSalary(
        p_id NUMBER
    )
    RETURN NUMBER
    IS
        v_salary NUMBER;
    BEGIN
        SELECT salary
        INTO v_salary
        FROM employees_ex7
        WHERE employee_id = p_id;

        RETURN v_salary * 12;
    END AnnualSalary;

END EmployeeManagement;
/