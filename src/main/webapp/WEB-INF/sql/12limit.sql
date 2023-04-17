-- limit 특정 record의 개수를 지정하는 것

SELECT * FROM Customers
LIMIT 5;
-- 5개 레코드만 나온다

SELECT * FROM Products
LIMIT 3;

-- 높은 가격 3개 조회
SELECT * FROM Products
ORDER BY Price DESC
LIMIT 3;

-- 2번 카테고리 상품 중 비싼거 세개
SELECT * FROM Products
WHERE CategoryID = 2
ORDER BY Price DESC
LIMIT 3;


-- 나이 많은 직원 3명 조회
SELECT * FROM Employees ORDER BY BirthDate DESC;

-- 브라질 고객 중 아무나 3명 조회
SELECT * FROM Customers WHERE Country='Brazil' LIMIT 3;

-- 3번 카페고리 상품 중 가격이 싼 상품 2개 조회
SELECT * FROM Products ORDER BY Price ASC LIMIT 2;

