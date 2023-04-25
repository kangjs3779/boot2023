SELECT Country FROM Suppliers;
SELECT DISTINCT Country FROM Suppliers;
SELECT * FROM Customers
WHERE Country = (SELECT DISTINCT Country FROM Suppliers);
-- 서브쿼리의 값이 여러개의 레코드라서 등호가 적용되지 않는다

SELECT * FROM Customers
WHERE Country IN (SELECT DISTINCT Country FROM Suppliers);
-- 공급자가 있는 나라들에 살고 있는 고객들의 정보를 조회하라

-- '1996-07-04'에 주문한 상품명 조회
SELECT * FROM Orders;
SELECT * FROM OrderDetails;
SELECT * FROM Products;

-- subquery
SELECT OrderID FROM Orders WHERE OrderDate = '1996-07-04';
SELECT * FROM OrderDetails WHERE OrderID = 10248;

SELECT ProductName FROM Products
WHERE ProductID IN (SELECT ProductID 
					FROM OrderDetails 
                    WHERE OrderID IN (SELECT OrderID 
									  FROM Orders 
                                      WHERE OrderDate = '1996-07-04'));
                                      
-- join이 더 빠르긴함

-- 주문한 적없는 고객의 이름 조회
SELECT * FROM Customers;
SELECT customerId FROM Orders GROUP BY customerId;			
SELECT * FROM Orders;
SELECT * FROM OrderDetails;

SELECT CustomerName 
FROM Customers
WHERE CustomerID NOT IN (SELECT customerId 
						FROM Orders);
