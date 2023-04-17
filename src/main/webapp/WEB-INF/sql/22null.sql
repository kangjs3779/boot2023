-- null : 값이 없음
-- null vs '' : 데이터베이스 마다 다름
-- 같을 수도 있고 다를 수도 있다

-- IS NULL :  값이 null 인가? 
SELECT * FROM Suppliers
WHERE ContactName = '';

SELECT * FROM Suppliers
WHERE ContactName IS NULL;
-- MySQL에서는 다르다

-- IS NOT NULL : 값이 null 아닌 컬럼 조회
SELECT * FROM Suppliers
WHERE NOT ContactName IS NULL
ORDER BY 1 DESC;

SELECT * FROM Customers;

SELECT * FROM Customers
WHERE Address IS NULL
ORDER BY CustomerID DESC;

SELECT * FROM Customers
WHERE Address IS NOT NULL
ORDER BY CustomerID DESC;

-- 집계함수에서 null 제외
SELECT COUNT(CustomerID) FROM Customers;
SELECT COUNT(Address) FROM Customers;
-- 개수가 다름을 확인할 수 있다
SELECT COUNT(*) FROM Customers;
-- null인 컬럼이 있어도 다른 컬럼에 값이 있다면 센다

-- 공급자 테이블에서 SupplierID칼럼의 값 수 구하기
SELECT COUNT(SupplierID) FROM Suppliers;

-- 공급자 테이블에서 ContactName컬럼의 값 수 구하기
SELECT COUNT(ContactName) FROM Suppliers;

SELECT COUNT(*) FROM Suppliers;

SELECT * FROM Products ORDER BY 1 DESC;
INSERT INTO Products
VALUES
(78, 'Cake', 12, 2, '조각', null);
INSERT INTO Products
(ProductID, ProductName, SupplierID, CategoryID, Unit)
VALUES
(79, 'Pizaa', 12, 2, '조각');

SELECT * FROM Products WHERE CategoryID = 2 ORDER BY 1 DESC;
-- 14

SELECT SUM(Price) FROM Products WHERE CategoryID = 2;
-- 276.75

SELECT AVG(Price) FROM Products WHERE CategoryID = 2;
-- null은 제외해서 14로 나누지 않고 12로 나눔