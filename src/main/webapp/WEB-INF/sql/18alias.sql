-- alias : 별칭
SELECT  * FROM Customers;
SELECT CustomerID, CustomerName FROM Customers;
SELECT CustomerID AS id, CustomerName AS name
FROM Customers;

-- AS 생략 가능
SELECT CustomerID id,
	   CustomerName name
FROM Customers;

SELECT CustomerID id, CustomerName name FROM Customers ORDER BY CustomerID;
SELECT CustomerID id, CustomerName name FROM Customers ORDER BY id;
SELECT CustomerID id, CustomerName name FROM Customers ORDER BY 1;
-- 셋 다 된다

SELECT Country, COUNT(CustomerID)
FROM Customers
GROUP BY Country;

SELECT Country c, COUNT(CustomerID) NumOfCustomer
FROM Customers
GROUP BY Country ORDER BY NumOfCustomer;

-- keyword 사용시 backtick
SELECT Country AS `FROM`, CustomerName FROM Customers;
-- 가능하면 사용하지 마라,, 정말 어쩔 수 없이 키워드가 별칭이 되어야 한다면 이렇게 사용해라
SELECT `Country` AS `FROM`, `CustomerName` FROM `Customers`;
-- 이렇게 다 사용하는 경우도 있는데 그냥 그렇구나 해라


