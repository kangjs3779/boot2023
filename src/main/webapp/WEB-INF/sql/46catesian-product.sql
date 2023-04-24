-- catesian product (곱집합) 카테시안 곱
SELECT COUNT(*) FROM Products; -- 77
SELECT COUNT(*) FROM Categories; -- 8

SELECT COUNT(*) FROM Products JOIN Categories; -- 616 = 77 * 8

SELECT * FROM Products JOIN Categories;
-- for문이라고 생각하면 중첩 for문과 비슷함
-- for(productID) {
--		for(categoryId) {}
-- }

-- 이렇게 중첩된 for문이라고 생각하면 된다

-- ON : 조인 조건
SELECT * FROM Products JOIN Categories ON Products.CategoryId = Categories.CategoryID;

-- 조인 후 컬럼 수 : 왼쪽테이블 컬럼 수 + 오른쪽 테이블 컬럼 수
DESC Products; -- 6개
DESC Categories; -- 3개
SELECT * FROM Products JOIN Categories
ON Products.CategoryID = Categories.CategoryID;
-- 필드는 더하고 레코드는 곱한다

-- 관심있는 컬럼만 뽑고 싶다
SELECT ProductName, CategoryName
FROM Products JOIN Categories
ON Products.CategoryID = Categories.CategoryId;

--
SELECT * FROM Products;
SELECT * FROM Suppliers;
-- 상품명, 그 상품을 공급하는 공급자명
SELECT ProductName, SupplierName 
FROM Products JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID;

-- alias 사용으로 코드 줄이기
SELECT CustomerName AS Name FROM Customers;

SELECT ProductName, SupplierName
FROM Products AS p JOIN Suppliers AS s
ON p.SupplierID = s.SupplierID;

SELECT ProductName, SupplierName
FROM Products p JOIN Suppliers s
ON p.SupplierID = s.SupplierID;

SELECT p.SupplierId, s.SupplierID FROM Products p JOIN Suppliers s
ON P.supplierID = s.SupplierID;







