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

-- 직원별 처리금액 (94년 1월의 판매왕을 조회해봐라)
DESC Employees;
DESC Orders;
DESC OrderDetails;
DESC Products;
SELECT count(*), EmployeeID FROM Orders;
SELECT * FROM Orders;
SELECT count(Orders.EmployeeID) FROM Orders WHERE EmployeeID = 2;

SELECT
	e.EmployeeID,
    e.FirstName,
    e.LastName,
    d.Quantity * p.Price 매출
FROM Employees e JOIN Orders o ON e.EmployeeID = o.EmployeeID
				JOIN OrderDetails d ON o.OrderID = d.OrderID
                JOIN Products p ON p.ProductID = d.ProductID
WHERE o.OrderDate BETWEEN '1997-01-01' AND '1997-01-31'
GROUP BY EmployeeID
ORDER BY 매출 DESC;





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
DESC Products;
SELECT * FROM Products;
DESC Categories;
DESC Orders;
DESC OrderDetails;
SELECT CategoryID FROM Products;


SELECT Price, count(c.CategoryID)
FROM
	Products p JOIN Categories c ON p.CategoryID = c.CategoryID;
    

    
	



-- 고객별 소비금액	
