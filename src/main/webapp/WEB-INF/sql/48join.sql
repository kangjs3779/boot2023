DESC Orders;
DESC Customers;
SELECT * FROM Orders;
SELECT * FROM Customers;
SELECT * FROM Orders o JOIN Customers c
ON o.CustomerID = c.CustomerID; -- 830
SELECT * FROM Orders o RIGHT JOIN Customers c
ON o.CustomerID = c.CustomerID; -- 832
-- 주문한 적이 없는 고객
SELECT * FROM Orders o RIGHT JOIN Customers c
ON o.CustomerID = c.CustomerID
WHERE o.OrderID IS NULL;

-- 주문을 처리한 적 없는 직원 조회
-- 내가 한거
SELECT * 
FROM 
Employees e LEFT JOIN Orders o
ON e.EmployeeID = o.EmployeeID
WHERE o.OrderID IS NULL;
-- 쌤이 한거
DESC Orders;
SELECT * 
FROM Orders o RIGHT JOIN Employees e
ON o.EmployeeID = e.EmployeeID
WHERE o.OrderID IS NULL;

SELECT * FROM Orders;