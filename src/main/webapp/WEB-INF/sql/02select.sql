-- 모든 필드
SELECT * FROM Customers;

-- CustomerName 필드만 가져오고 싶다면??
-- select 옆에 필드 이름을 나열하면 된다
SELECT CustomerName FROM Customers;
SELECT ContactName FROM Customers;
SELECT Country FROM Customers;
SELECT CustomerName, ContactName FROM Customers;
SELECT CustomerName, ContactName, Country FROM Customers;
-- 내가 작성한 순서대로 필드가 출력된다
SELECT Country, ContactName, CustomerName FROM Customers;

-- 문제 1) Employees 테이블에서 BirthDate, FirstName, LastName을 조회ALTER
SELECT BirthDate, FirstName, LastName FROM Employees;
-- 테이블 명만 대소문자 구분하면 되고 필드의 이름은 딱히 구분안해도 된다
