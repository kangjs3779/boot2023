-- where : 특정 레코드를 선택하는 조건절

-- 4번 라인은 모든 필드라는 뜻
SELECT * FROM Customers WHERE Country = 'Mexico';

-- 문자열은 작은 따옴표
SELECT * FROM Customers WHERE Country = 'UK';

-- 수 필드값은 따옴표 생략 가능 써도 되고 안써도 된다
SELECT * FROM Customers WHERE CustomerID = 3;

SELECT * FROM Customers WHERE Country = 'france'; -- 대소문자 구분 안함

SELECT CustomerName FROM Customers WHERE Country = 'France';

-- Country가 USA인 공급자
-- 이름(SupplierName)과 주소(Address)
-- 를 공급자 테이블에서 조회
SELECT SupplierName, Address FROM Suppliers WHERE Country = 'USA';
