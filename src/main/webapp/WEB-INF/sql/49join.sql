SELECT COUNT(*) FROM Products; -- 77
SELECT * FROM Products;
SELECT COUNT(*) FROM Categories; -- 8
SELECT COUNT(*) FROM Suppliers; -- 29
DESC Products; -- 6개 열
DESC Categories; -- 3개 열
DESC Suppliers; -- 8개 열

SELECT count(*) FROM Products JOIN Categories JOIN Suppliers; -- 17864, 17열

SELECT * FROM 
Products p JOIN Categories c ON p.CategoryID = c.CategoryID
		   JOIN Suppliers s ON p.SupplierID = s.SupplierID; -- 77개 행

SELECT * FROM 
Products p JOIN Categories c ON p.CategoryID = c.CategoryID;
-- 9개의 열, 
           
-- 예) 1번 상품의 상품명, 카테고리명, 공급자명
SELECT * FROM Products;
SELECT * FROM Categories;
SELECT * FROM Suppliers;
DESC Products;
DESC Categories;
DESC Suppliers;

SELECT ProductName, CategoryName, SupplierName
FROM
	Products p JOIN Categories c ON p.CategoryID = c.CategoryID
				JOIN Suppliers s ON p.SupplierID = s.SupplierID
WHERE p.ProductID = 1;
-- 선생님 답
SELECT p.ProductName, c.CategoryName, s.SupplierName
FROM Products p JOIN Categories c ON p.CategoryID = c.CategoryID
				JOIN Suppliers s ON p.SupplierID = s.SupplierID
WHERE p.ProductID = 1;
			
-- ex) 1996-07-04에 주문한 상품명 조회
DESC Products;
DESC OrderDetails;
DESC Orders;

SELECT ProductName
FROM 
	OrderDetails d JOIN Products p ON p.ProductID = d.ProductID
					JOIN Orders o ON d.OrderID = o.OrderID
WHERE o.OrderDate = '1996-07-04';
-- 선생님꺼
DESC Orders;
DESC OrderDetails;
DESC Products;

SELECT ProductName 
FROM 
Orders o JOIN OrderDetails d ON o.OrderID = d.OrderID
		 JOIN Products p ON d.ProductID = p.ProductID
WHERE o.OrderDate = '1996-07-04';



-- '1996-07-04'의 매출 조회
SELECT SUM(od.Quantity * p.Price) 매출
FROM OrderDetails od JOIN Products p ON od.ProductID = p.ProductID
					JOIN Orders o ON od.OrderID = o.OrderID
WHERE o.OrderDate = '1996-07-04';			

-- 일별 매출 조회(날짜 순으로 결과 조회)	
SELECT o.OrderDate, SUM(od.Quantity * p.Price) 매출
FROM OrderDetails od JOIN Products p ON od.ProductID = p.ProductID
					JOIN Orders o ON od.OrderID = o.OrderID
WHERE o.OrderDate = '1996-07-04'
GROUP BY o.OrderDate
ORDER BY o.OrderDate ASC;

-- 직원별 처리금액 (97년 1월의 판매왕을 조회해봐라)
SELECT * FROM Employees; -- employeeID
SELECT * FROM Orders; -- orderID customerID employeeID
SELECT * FROM OrderDetails; -- orderID productID quantity
SELECT * FROM Products; -- productID price
-- 나 ----------------------------------------------------------
SELECT e.EmployeeID, 
		concat(e.FirstName, e.LastName) FullName, 
        SUM(p.price * od.Quantity) 판매금액
FROM Employees e JOIN Orders o ON e.EmployeeID = o.EmployeeID
				JOIN OrderDetails od ON o.OrderID = od.OrderID
				JOIN Products p ON od.ProductID = p.ProductID
WHERE o.OrderDate BETWEEN '1997-01-01' AND '1997-01-31'
GROUP BY FullName
ORDER BY 판매금액 DESC;
-- 선생님 ---------------------------------------
SELECT
 e.EmployeeID,
 e.LastName,
 e.FirstName,
 SUM(p.Price * od.Quantity) 매출 
FROM Orders o JOIN Employees e ON o.EmployeeID = e.EmployeeID
              JOIN OrderDetails od ON o.OrderID = od.OrderID
              JOIN Products p ON od.ProductID = p.ProductID
WHERE o.OrderDate BETWEEN '1997-01-01' AND '1997-01-31'
GROUP BY e.EmployeeID
ORDER BY 매출 DESC;

	
-- 상품별 판매금액

SELECT * FROM Products; -- productID categoryID price
SELECT * FROM OrderDetails; -- orderID productID quantity
SELECT * FROM Orders; -- orderID customerID
-- 나 --------------------------------------------------------
SELECT p.ProductId, p.ProductName, SUM(p.price * od.Quantity) 판매금액
FROM 
	Products p JOIN OrderDetails od ON p.ProductID = od.ProductID
GROUP BY p.ProductID
ORDER BY 판매금액 DESC;
-- 선생님-----------------------------------------------------
SELECT p.ProductID, p.ProductName, SUM(od.Quantity * p.Price) 판매금액 
FROM 
	Orders o JOIN OrderDetails od ON o.OrderID = od.OrderID
             JOIN Products p ON od.ProductID = p.ProductID
GROUP BY p.ProductID
ORDER BY 판매금액 DESC;
-- --------------------------------------------------------------

-- 고객별 소비금액	
SELECT * FROM Customers; -- customerID
SELECT * FROM Products; -- ProductID, Price
SELECT * FROM OrderDetails; -- quantity orderID, productID
SELECT * FROM Orders; -- customerID orderID

-- 나 ----------------------------------------------------------------------
SELECT CustomerName, SUM(p.Price * od.Quantity) sum
FROM
	Customers c JOIN Orders o ON c.CustomerID = o.CustomerID
				JOIN OrderDetails od ON o.OrderID = od.OrderID
                JOIN Products p ON p.ProductID = od.ProductID
GROUP BY c.CustomerID
ORDER BY sum DESC;
	
-- 선생님 -----------------------------------------------------------------------
SELECT c.CustomerID, c.CustomerName, SUM(p.Price * od.Quantity) 구매금액 
FROM
	Orders o JOIN OrderDetails od ON o.OrderID = od.OrderID
		     JOIN Customers c ON o.CustomerID = c.CustomerID
             JOIN Products p ON od.ProductID = p.ProductID
GROUP BY c.CustomerID
ORDER BY 구매금액 DESC;

--
