USE w3schools;

INSERT INTO Customers
(CustomerName, ContactName, Address, City, Country)
SELECT CustomerName, ContactName, Address, City, Country
FROM Customers;

SELECT count(*) FROM Customers;

SELECT * FROM Customers ORDER BY CustomerID DESC;
-- 1페이지 
-- 페이지당 20개를 보여주도록 함
SELECT * FROM Customers
ORDER BY CustomerId
LIMIT 0, 20; 
-- 1페이지

SELECT * FROM Customers
ORDER BY CustomerId
LIMIT 20, 20; 

SELECT * FROM Customers
ORDER BY CustomerId DESC
LIMIT 20, 20; 

SELECT * FROM Customers
ORDER BY CustomerId DESC
LIMIT 40, 20;
SELECT* FROM Products;
SELECT CustomerName name  FROM Customers LIMIT 0, 10;
