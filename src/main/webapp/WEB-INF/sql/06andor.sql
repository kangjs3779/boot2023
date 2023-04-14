SELECT * FROM Customers WHERE CustomerID > 4 AND Country = 'Germany';
SELECT * FROM Customers WHERE CustomerID < 4 OR Country = 'Germany';

-- 카테고리 아이디가 2이고 가격이 20.00 이상인 상품들 조회
SELECT * FROM Products;
SELECT * FROM Products WHERE CategoryID = 2 AND Price >= 20.00;

SELECT * FROM Employees;
SELECT * FROM Employees WHERE BirthDate > '1950-01-01' AND BirthDate < '1959-12-31';
SELECT * FROM Products WHERE Price BETWEEN 10.00 AND 19.99;
