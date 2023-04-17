-- LIMIT m : 키워드는 위에서 부터 m개

-- LIMIT n, m : n번부터 m개

SELECT * FROM Customers ORDER BY CustomerID;
SELECT * FROM Customers ORDER BY CustomerID LIMIT 3;
SELECT * FROM customers ORDER BY customerID LIMIT 3, 2;
-- record는 0번부터 시작
-- record는 3번부터 시작

-- 두번째로 나이가 많은 직원으 조회
SELECT * FROM Employees ORDER BY BirthDate DESC LIMIT 1, 1;

-- 2번 카테고리 상품 중 두번째로 가격이 비싼 상품 조회
SELECT * from Products WHERE CategoryID = 2 ORDER BY Price DESC LIMIT 1,1;
