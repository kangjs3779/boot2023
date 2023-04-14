SELECT * FROM Customers;
SELECT * FROM Customers WHERE Country = 'Germany';
SELECT * FROM Customers WHERE not Country = 'Germany';

SELECT * FROM Customers WHERE not Country = 'London';
SELECT * FROM Employees WHERE not (BirthDate >= '1950-01-01' AND BirthDate <= '1959-12-31');


SELECT * FROM Products WHERE NOT (CategoryID = 1 OR CategoryID = 2);