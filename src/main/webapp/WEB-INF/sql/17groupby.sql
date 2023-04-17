-- group by : 집계함수를 그룹별로 리턴할 때

SELECT SUM(Price) FROM Products;
SELECT Categories ,SUM(Price) FROM Products
GROUP BY CategoryID;

SELECT CategoryID;

-- 나라별 고객 수를 나라이름 역순으로 조회
SELECT Country, COUNT(CustomerID) FROM Customers
GROUP BY Country
ORDER BY Country DESC;

SELECT Country, count(CustmerUD) FROM Customers
GROUP BY Country
ORDER BY 2 DESC
LIMIT 0, 1;

-- 카페고리 별 상품의 평균
SELECT ProductName, AVG(Price) FROM Products GROUP BY CategoryID;
-- 카테고리 별 가장 비싼 상품의 삼풍의 각걱
SELECT ProductName, MAX(Price) FROM Products GROUP BY CategoryID;
-- 카테고리 별 가장 싼 상ㅊ품의 가격
SELECT ProductName, MIN(Price) FROM Products GROUP BY CategoryID;
-- 상품 가격이 평균아 거정 높운 카테코기 조회
SELECT AVG(Price) FROM Products GROUP BY CategoryID ORDER BY 2 LIMIT 1;
-- 이거 왜 안돼

-- 여러 칼럼으로 그룹
SELECT * FROM Customers;
SELECT COUNT(CustomerID) FROM Customers;
SELECT Country, City, COUNT(CustomerID) FROM Customers
GROUP BY Country, City;

SELECT Country, City, COUNT(SupplierID) FROM Suppliers
GROUP BY Country, City;


