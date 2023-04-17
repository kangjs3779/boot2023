SELECT * FROM Customers;
INSERT INTO Customers
(CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES
(92, '박지성', '두개의 심장', 'London', 'Seoul', '123457', 'Korea');
-- 모든 열에 값을 넣으면 컬럼명 생략 가능
SELECT * FROM Customers ORDER BY CustomerID DESC;

INSERT INTO Customers
VALUES (93, '차범근', '차붐', '프랑크푸르트', '서울', '123456', '한국');

-- 특정 컬럼에만 값을 넣을 떄 컬러명 작성해야 함
INSERT INTO Customers
(CustomerID, CustomerName, City, Country)
VALUES
(94, '송태섭', '도쿄', '일본');

SELECT * FROM Customers;

-- Supplier 테이블에 30번째 공급자 추가(모든 열)
SELECT * FROM Suppliers;
INSERT INTO Suppliers
VALUES
(30, 'kang', 'test', '김포', '경기도', '123456', '한국', '123456789');

-- supplier 테이블에 31번째 공급자 추가
-- SupplierID, SupplierName, City, Country
INSERT INTO Suppliers
(SupplierID, SupplierName, City, Country)
VALUES
('31', 'jiii', '김포라', '대한민국');

SELECT * FROM Suppliers ORDER BY 1 
DESC;




