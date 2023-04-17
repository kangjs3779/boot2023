-- +, -, *, /, %
SELECT * FROM Products;
SELECT ProductName, Price * 1300 FROM Products;
SELECT ProductName, Price * 1300 AS wonPrice FROM Products;
SELECT ProductName, Price * 1300 wonPrice FROM Products;

SELECT ProductName, Price / 100 FROM Products;
SELECT ProductName, Price + 100 FROM Products;
SELECT ProductName, Price - 100 FROM Products;

-- 문자열 연결
SELECT City + Country FROM Customers; -- 안된다
SELECT concat(City, Country) FROM Customers; -- 된다
-- concat은 여러 파라미터를 넣어줄 수 있다
SELECT concat(City, ", ", Country) FROM Customers;
SELECT concat(City, ", ", Country) cityOfCountry FROM Customers;

-- 직원이름 firstName, LastName 형식으로 조회
SELECT concat(FirstName, " " , LastName) `name` FROM Employees;

-- 원화(* 1300)로 10만원 이상인 상품들 조회
SELECT ProductName, Price * 1300 wonPrice 
FROM Products 
WHERE Price * 1300 >= 100000;

-- 부분 문자열 : substring
SELECT substring('hello world', 3, 3);
-- index가 1번 부터 시작한다
-- 첫번째 파라미터 : 원본 문자열
-- 두번째 파라미터 : 시작 인덱스
-- 세번째 파라미터 : 길이

SELECT CustomerName FROM Customers;
SELECT substring(CustomerName, 1, 3) FROM Customers;

-- 고객 테이블에서 고객명, 나라이름(앞 3글자만) 조회
SELECT substring(CustomerName, 1, 3), substring(Country, 1, 3) FROM Customers;
