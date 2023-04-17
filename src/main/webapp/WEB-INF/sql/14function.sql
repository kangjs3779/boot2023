-- 내장 함수
-- count : record 수 리턴
SELECT * FROM Customers;
SELECT count(CustomerID) FROM Customers;
SELECT count(DISTINCT Country) FROM Customers; -- 중복제거한 고객들의 국가 개수
SELECT count(CustomerID) FROM Customers
WHERE Country = 'Brazil';

-- DISTINCT : 중복제거
SELECT Country From Customers;
SELECT DISTINCT Country From Customers;

-- 전체 직원 수
SELECT count(Employees) FROM Employees;
-- 상파울로에 사는 고객 수
SELECT count(CustomerID) FROM Customers WHERE City = 'São Paulo';
-- 공급자가 있는 나라 수
SELECT count(DISTINCT Country) FROM Suppliers;
