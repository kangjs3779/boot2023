use w3schools;

-- order by : 결과의 순서를 정할 때 사용

SELECT CustomerID, CustomerName, ContactName	 -- columna 이름
FROM Customers                   				-- table
WHERE											-- 선택할 record의 조건
	CustomerID < 10
ORDER BY ContactName ASC;						 -- column 이름을 적고 오름차순 정렬
-- asc은 생략 가능 하다

SELECT CustomerID, customerName, contactName
FROM Customers
WHERE
	CustomerID < 10
ORDER BY ContactName DESC;

SELECT * FROM Customers
ORDER BY CustomerName DESC;

SELECT * FROM Customers
ORDER BY CustomerName ASC;

SELECT * FROM Customers
ORDER BY CustomerName;

-- 모든 상품을 가격 순으로 조회 ( 낮은 가격이 먼저 조회)
SELECT * FROM Products
ORDER BY Price;

-- 모든 직원을 생년월일순 조회(어린 직원이 먼저 조회)
SELECT * FROM Employees
ORDER BY BirthDate DESC;

-- 컬럼 index도 사용 가능 하다
SELECT * FROM Products ORDER BY Price;
SELECT * FROM Products ORDER BY 6;

SELECT * FROM Products ORDER BY 6 DESC;

-- 컬럼 index 사용해서 고객을 도시 이름 순 정렬 조회
SELECT * FROM Customers ORDER BY City;

SELECT * FROM Customers ORDER BY 5; 
-- column index를 사용할 때에는 주의해야 한다, 모든 열을 사용하는 것이 아닐 수도 있기 때문에
-- 컬럼 인덱스 사용시 select절에 맞게 사용해야 한다

-- 여러 컬럼 기준 정렬 가능
SELECT * FROM Customers ORDER BY Country, City; -- 첫번째 먼저 정렬하고 그 다음 city를 정렬한다
SELECT * FROM Customers ORDER BY 7, 5; -- index로도 사용가능 하다
SELECT customerID, CustomerName, Country, City
FROM Customers
ORDER BY Country, City;

SELECT customerID, CustomerName, Country, City
FROM Customers
ORDER BY 3, 4;
-- 여러 컬럼 기준으로 정렬ㅈ시 컬럼당 오름차순, 내림차순 지정 가능

SELECT * FROM Customers ORDER BY Country ASC, City DESC;
SELECT * FROM Customers ORDER BY Country DESC, City ASC;
-- 인덱스도 가능하다

-- 상품을 카테고리(오름차순) 가격(내림차순)으로 정렬 조회
SELECT * FROM Products ORDER BY CategoryID, Price DESC;

