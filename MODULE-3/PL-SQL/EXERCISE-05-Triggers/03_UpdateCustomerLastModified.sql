CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE
ON customers_ex5
FOR EACH ROW

BEGIN

    :NEW.last_modified := SYSDATE;

END;
/