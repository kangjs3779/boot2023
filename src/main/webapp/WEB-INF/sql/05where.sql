SELECT * FROM Customers;
SELECT * FROM w3schools.Customers; -- 다른 db의 테이블 조회
SELECT LastName FROM Employees;

SELECT ShipperName FROM Shippers;
SELECT * FROM Customers;
SELECT EmployeeId, LastName, FirstName FROM Employees;

USE w3schools;
use test;


-- <= : 작거나 같다
-- >= : 크거나 같다

SELECT * FROM Products WHERE price >= 10.00;

SELECT lastName FROM Employees WHERE EmployeeId = 3;