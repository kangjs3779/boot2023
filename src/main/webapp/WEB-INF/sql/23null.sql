SELECT * FROM Products ORDER BY 1 DESC;

-- IFNULL : null이면 다른 값으로 변경
SELECT IFNULL(0, 100);
SELECT IFNULL('kim', 'lee');
-- 첫번쨰 값이 null이면 두번째 값으로 바뀐다
-- 근데 위 두개는 첫번째가 null이 아니라서 첫번째 값이 나온다
SELECT IFNULL(NULL, 100);
SELECT IFNULL(NULL, 'kim');

SELECT ProductID, 
		ProductName, 
        SupplierID, 
        CategoryID, 
        Unit, 
        IFNULL(Price, 0) Price 
FROM Products ORDER BY 1 DESC;
 -- null인 것을 다른 값으로 바꾸고 싶다면 이렇게 쓰면 된다

SELECT AVG(IFNULL(Price, 0)) AS Average 
FROM Products
WHERE CategoryID = 2;

-- 문제 : 고객테이블에서 CustomerID, CustomerName, ContactName, Address 조회
-- ContactName이 NULL이면 'Anonymous'로
-- Address가 NULL이면 'Homeless'로 조회

SELECT CustomerID, 
		CustomerName, 
        IFNULL(ContactName, 'Anonymous') ContacName,
        IFNULL(Address, 'Homeless') Address
FROM Customers
ORDER BY 1 DESC;
-- 실제 데이터가 바뀌는 것이 아니라 조회할 때 ㅇ이렇게 변경이 되어서 바뀌는 것이;다
