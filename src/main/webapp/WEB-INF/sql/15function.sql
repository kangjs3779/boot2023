-- min max

SELECT MIN(CustomerID) FROM Customers;
SELECT MAX(CustomerID) FROM Products;
SELECT MAX(Price) FROM Products;

-- 가장 나이 많은 직원의 생년 월일
SELECT MIN(BirthDate) FROM Employees;
SELECT MAX(BirthDate) FROM Employees;

-- 3번 카테고리에 가장 비싼 상품의 가격
SELECT MAX(Price) FROM Products WHERE CategoryID = 3;
-- 5번 카테고리에 가장 싼 상품의 가격
SELECT MIN(Price) FROM Products WHERE CategoryID = 5;
