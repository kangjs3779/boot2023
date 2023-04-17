-- HAVING : 집계함수의 조건 설정
SELECT Country, COUNT(CustomerID) FROM Customers GROUP BY Country;

-- 5명 이상의 고객이 있는 나라 조회
SELECT Country, COUNT(CustomerID) numOfCustomer 
FROM Customers 
WHERE numOfCustomer >= 5 -- record를 거르는 조건, 개별 행 조건
GROUP BY Country;

SELECT Country, COUNT(CustomerID) numOfCustomer 
FROM Customers 
GROUP BY Country
HAVING numOfCustomer >= 5; -- 그룹함수의 조건

SELECT Country, COUNT(CustomerID) numOfCustomer 
FROM Customers 
GROUP BY Country
HAVING COUNT(CustomerID) >= 5;

-- 상품의 평균 가격이 30 달러 이상인 카테고리 조회
SELECT ProductName, CategoryID ,AVG(Price) avgPrice
FROM Products 
GROUP BY CategoryID 
HAVING avgPrice >= 30;
-- 카페고리별 상품의 최고 가격이 100달러 이상인 카테고리
SELECT ProductName, CategoryID, MAX(Price) maxPrice 
FROM Products
GROUP BY CategoryID
HAVING maxPrice > 100;