SELECT lastName, firstName FROM Employees;
-- 이 결과에서 다른 결과를 또 조회하고 싶다면
-- 이름의 첫글자가 d보다 크고 e보다 작은 직원의 이름을 조회하고 싶다면
-- from절에 서브쿼리를 쓸 때에는 별칭을 적어줘야 한다

SELECT lastName, firstName 
FROM (SELECT lastName, firstName FROM Employees) emp
WHERE lastName >= 'd' AND lastName < 'e';

-- 고객별 소비금액의 평균
SELECT AVG(구매금액) FROM
(SELECT c.CustomerID, c.CustomerName, SUM(p.Price * od.Quantity) 구매금액 
FROM
	Orders o JOIN OrderDetails od ON o.OrderID = od.OrderID
		     JOIN Customers c ON o.CustomerID = c.CustomerID
             JOIN Products p ON od.ProductID = p.ProductID
GROUP BY c.CustomerID
ORDER BY 구매금액 DESC) t1;

-- 직원별 매출액 평균
SELECT AVG(매출) FROM
(SELECT
 e.EmployeeID,
 e.LastName,
 e.FirstName,
 SUM(p.Price * od.Quantity) 매출 
FROM Orders o JOIN Employees e ON o.EmployeeID = e.EmployeeID
              JOIN OrderDetails od ON o.OrderID = od.OrderID
              JOIN Products p ON od.ProductID = p.ProductID
GROUP BY e.EmployeeID
ORDER BY 매출 DESC) t1;

-- 카테고리별 평균 상품 가격 조회 (평균상품 가격이 100.00달러 이상인 것만 조회)
SELECT * FROM Products;
SELECT * FROM Categories;

-- subquery
SELECT CategoryID, average
FROM
(SELECT CategoryID, AVG(Price) average
FROM Products
GROUP BY CategoryID) t1
WHERE average >= 30.00;

-- best
SELECT AVG(Price) avg, p.ProductID, p.CategoryID 
FROM Products p JOIN Categories c ON p.CategoryID = c.CategoryID
GROUP BY CategoryID
HAVING AVG(Price) >= 30.00;

-- join
SELECT t1.CategoryID, t1.average, c.CategoryName
FROM
(SELECT CategoryID, AVG(Price) average
FROM Products
GROUP BY CategoryID) t1 JOIN Categories c ON t1.CategoryID = c.CategoryID
WHERE average >= 30.00;
