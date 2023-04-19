SELECT * FROM Shippers;
SELECT * FROM Suppliers;
SELECT * FROM OrderDetails;


SELECT OrderID 
FROM OrderDetails 
WHERE Quantity < 30 
AND Quantity > 25
ORDER BY OrderID DESC ;

SELECT * FROM Employees;
SELECT BirthDate, FirstName 
FROM Employees
WHERE BirthDate >= '1950-01-01' 
AND BirthDate <= '1959-12-31'
ORDER BY BirthDate DESC;

SELECT * FROM Orders;

SELECT OrderID, OrderDate 
FROM Orders 
ORDER BY OrderDate DESC 
LIMIT 4, 3;

SELECT OrderID, OrderDate 
FROM Orders 
ORDER BY OrderDate DESC 
LIMIT 3;

SELECT OrderID, OrderDate FROM Orders ORDER BY OrderDate DESC;
SELECT * FROM Customers;

SELECT CustomerID, CustomerName FROM Customers ORDER BY 1;

SELECT * FROM Employees;

SELECT * FROM Shippers;

SELECT * FROM Products;

SELECT SUM(Price) FROM Products;
SELECT COUNT(ProductName) FROM Products;
SELECT AVG(Price) FROM Products;
SELECT MAX(Price) FROM Products;
SELECT MIN(Price) FROM Products;

SELECT * FROM Customers;
SELECT City FROM Customers;
SELECT DISTINCT City FROM Customers;

SELECT * FROM Customers;
SELECT Country, COUNT(CustomerID)
FROM Customers
GROUP BY Country
ORDER BY CustomerID DESC;

SELECT * FROM Employees;
SELECT COUNT(BirthDate) employeeOld,
		COUNT(BirthDate) employeeYoung
FROM Employees
HAVING employeeOld >= '1950-01-01' AND employeeOld <= '1959-12-31' OR
employeeYoung >= '1960-01-01' AND employeeYoung <= '1969-12-31';

SELECT * FROM Customers;
SELECT DISTINCT Country, City FROM Customers;

SELECT * FROM Products;
SELECT count(DISTINCT SupplierID) SupplierID FROM Suppliers; 

SELECT CustomerID AS ID, ContactName AS contact, CustomerName AS `name` FROM Customers;
SELECT CustomerID ID, ContactName contact, CustomerName `name` FROM Customers;

SELECT COUNT(CustomerName) countName FROM Customers;

SELECT * FROM Suppliers;
SELECT Country, COUNT(SupplierName) countSupplier
FROM Suppliers
GROUP BY Country;

SELECT * FROM Products;
SELECT CategoryID, AVG(Price) average
FROM Products
GROUP BY CategoryID
ORDER BY average DESC;

SELECT * FROM Products;
SELECT CategoryID, COUNT(CategoryID) countNumber
FROM Products
GROUP BY CategoryID
HAVING COUNT(countNumber) > 10;

SELECT AVG(Price) dollar, AVG(Price * 1300)  won
FROM Products
GROUP BY CategoryID
HAVING won > 30000 AND dollar > 30;

SELECT * FROM Employees;
SELECT CONCAT(LastName, " ", FirstName) fullName FROM Employees;