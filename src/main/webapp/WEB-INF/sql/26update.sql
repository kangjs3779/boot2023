-- delete와 마찬가지로 아주 주의 해서 작성을 해야 하는 키워드이다
-- update : 레코드 수정

SELECT * FROM Customers WHERE CustomerID = 1;
-- 이름 변경
UPDATE Customers				-- 테이블 명
SET CustomerName = '서태웅'		-- 변경할 컬럼과 값
WHERE CustomerID = 1;			--  변경할 레코드의 조건
-- 실행시키기전에 꼭 SELECT 확인 할 것
-- action output도 확인해야 함

-- 여러 컬럼을 변경하고 싶다
UPDATE Customers
SET
	 CustomerName = '전대만',
     City = 'seoul',
     Country = 'korea'
WHERE CustomerID = 1;

-- 문제 1번 공급자 이름, 도시, 나라 변경
SELECT * FROM Suppliers WHERE SupplierID = 1;
UPDATE Suppliers
SET
	SupplierName = 'kang',
    City = 'seoul',
    Country = 'USA'
WHERE SupplierID = 1;

SELECT * FROM Suppliers
WHERE Country = 'USA';

UPDATE Suppliers
SET SupplierName = '채치수',
	Country = 'France'
WHERE Country = 'USA';
SELECT * FROM Suppliers WHERE Country = 'France';
UPDATE Suppliers
SET ContactName = '북산',
	City ='seoul';
SELECT * FROM Suppliers;

UPDATE Suppliers 
SET 
	PostalCode = CONCAT('J', PostalCode)
WHERE Country = 'Japan';

SELECT * FROM Suppliers WHERE Country = 'Japan';

SELECT * FROM Products;
INSERT INTO Products
VALUES(1, 'cake', null, null, null, 300);

INSERT INTO Products
VALUES(2, 'pizza', null, null, null, 100);

UPDATE Products
SET Price = Price * 1300;

