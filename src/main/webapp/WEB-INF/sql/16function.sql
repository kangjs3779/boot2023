-- AVG(평균) SUM(합계)
SELECT SUM(Price) FROM Products;
SELECT AVG(Price) FROM Products;

-- 5번 카테고리 상품의 합
SELECT SUM(Price) FROM Products WHERE CategoryID = 5;
-- 1번 카테고리 상품의 합
SELECT AVG(Price) FROM Products WHERE CategoryID = 1;
 

