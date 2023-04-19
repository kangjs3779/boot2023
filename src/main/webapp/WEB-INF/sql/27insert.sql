SELECT * FROM Employees ORDER BY 1 DESC;

INSERT INTO Employees (LastName, FirstName)
VALUES('박지성', '두개의 심장');
-- EmployeeID는 직접 넣어주지 않아도 된다, 자동으로 증가하는 column이다
-- table에 자동으로 증가하는 colum이 있다
-- 자동으로 증가하는지 어떻게 알지? 테이블 정보 보기
DESC Employees; -- desciption의 약자
-- 부가정보에 auto_increment라고 적혀있으니까 값을 꼭 넣지 않아도 된다

DESC Customers;
INSERT INTO Customers (CustomerName, ContactName) VALUES ('전대만', 'deaman');
SELECT * FROM Customers;
-- CustomerID가 자동으로 넣어진 것을 확인할 수 있다

SELECT * FROM Suppliers;
-- 문제1) 새 공급자 데이터 추가 (SupplierName, City)
-- 자동증가 컬럼은 직접 값을 넣지 않고 
DESC Suppliers;
INSERT INTO Suppliers (City, Country) VALUES ('seoul', 'korea');

SELECT * FROM Customers WHERE CustomerID = 80;
SELECT * FROM Employees;
SELECT * FROM Suppliers;


