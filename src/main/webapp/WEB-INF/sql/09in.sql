-- In 특정 값 중에 있으면
SELECT * FROM Customers WHERE Country = 'Germany' OR Country = 'France';
SELECT * FROM Customers WHERE Country IN ('Germany', 'France');

-- 3번 5번 카테고리에 속한 상품들 조회
SELECT * FROM Products WHERE CategoryID IN (3, 5);

-- 1, 3, 5, 7번 카테고리에 속한 상품들 조회
SELECT * FROM Products WHERE CategoryID IN (1, 3, 5, 7);

SELECT * FROM Customers WHERE City IN ('Berlin', 'London', 'Madrid', 'Paris');
SELECT * FROM Customers WHERE NOT City IN ('Berlin', 'London', 'Madrid', 'Paris');
SELECT * FROM Customers WHERE City NOT IN ('Berlin', 'London', 'Madrid', 'Paris');

-- 1, 3, 5, 7 카테고리가 아닌 상품들 조회
SELECT * FROM Products WHERE CategoryID NOT IN (1, 3, 5, 7);

