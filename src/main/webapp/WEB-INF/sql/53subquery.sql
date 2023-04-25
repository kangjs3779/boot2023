-- 서브쿼리 (쿼리 안의 쿼리)
-- 책 430쪽에 규칙이 있음
-- 1) SELECT문이다.
-- 2) 괄호 안에 있다
-- 3) 세미콜론이 없다

-- 작성가능 한 위치
-- WHERE, SELECT, FROM, HAVING

USE w3schools;
-- 1번 상품의 카테고리 명

SELECT categotyId FROM Products
WHERE ProductId = 1; -- 내부 쿼리
SELECT categoryName FROM Categories
WHERE CategoryId = 1; -- 외부 쿼리

SELECT categoryName FROM Categories
WHERE CategoryId = (SELECT categoryId FROM Products
					WHERE ProductId = 1);
                    
-- 2번 공급자와 같은 나라에 사는 고객 조회
SELECT Country FROM Suppliers
WHERE SupplierId = 2;
SELECT CustomerName FROM Customers
WHERE Country = 'USA';

SELECT CustomerName FROM Customers
WHERE Country = (SELECT Country FROM Suppliers WHERE SupplierID = 2);
                                
-- 문제 ) 평균 가격보다 높은 가격의 상품들 조회
SELECT * FROM Products;
SELECT AVG(Price) avg FROM Products;

SELECT ProductName 
FROM Products
WHERE Price > (SELECT AVG(Price) avg FROM Products);
-- 서브 쿼리의 결과가 값 하나라서 부등호 사용가능 하다


