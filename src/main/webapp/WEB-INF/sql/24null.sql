-- null 과의 연산은 모두 false
SELECT * FROM Products WHERE CategoryID = 2;
SELECT * FROM Products
WHERE CategoryID = 2
	AND Price >= 25.00;
    
SELECT * FROM Products
	WHERE CategoryID = 2
		AND IFNULL(Price, 10) < 25.00);
    
    -- null과의 연산은 모두 false이다

SELECT 8 FROM Products
	WHERE CategoryID = 2
    AND Price IS NULL;
    
SELECT ProductName, price * 1300 FROM Products
WHERE CategoryID = 2;
SELECT ProductName, IFNULL(Price, 0) * 1300 FROM Products
WHERE CategoryID = 2;
//산ㅅ눌 연산 코드 복사