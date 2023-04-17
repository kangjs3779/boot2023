-- DELETE : 테이블의 record 지우기

-- 매우 주의!!
-- 데이터는 모두 돈이라서 많이 고민을 하고 실행을 시켜야 한다
-- 검증하는 방법
SELECT * FROM Customers WHERE CustomerID = 94;
-- 같은 테이블명과 같은 필드명을 가지고 select를 해보고 지울 데이터가 맞는지 확인을 하고 지워야 한다
-- 항상 지우기 전에 이렇게 확인을 하고 지워야 한다
-- 데이터는 돈이다~~~

DELETE 
FROM Customers -- 지울 테이블 명
WHERE CustomerID = 94; -- 지울 레코드명


-- delede  93번 고객 지우기
SELECT * FROM Customers WHERE CustomerID = 93;
DELETE FROM Customers WHERE CustomerID= 93;

-- 78번 상품 지우기
SELECT * FROM Products WHERE ProductID = 78;
SELECT * FROM Products WHERE ProductID = 79;
DELETE FROM Products WHERE ProductID = 78;
DELETE FROM Products WHERE ProductID = 79;

SELECT * FROM Products;
DELETE FROM Products; -- 모든 record가 사라진다

-- 문제 고객 테이블에서 usa에 사는 고객들 지우기
SELECT * FROM Customers WHERE Country = 'USA';
DELETE FROM Customers WHERE Country = 'USA';

-- 모든 직원 지우기
DELETE 
FROM Employees;







