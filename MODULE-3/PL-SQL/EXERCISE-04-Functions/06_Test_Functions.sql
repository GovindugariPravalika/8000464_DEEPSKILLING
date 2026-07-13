SELECT
customer_name,
CalculateAge(date_of_birth)
AS AGE
FROM customers_ex4;

SELECT
loan_id,
CalculateMonthlyInstallment(
loan_amount,
interest_rate,
duration_years)
AS EMI
FROM loans_ex4;

SELECT
account_id,
HasSufficientBalance(account_id,10000)
AS STATUS
FROM accounts_ex4;