SELECT * FROM Customers WHERE CustomerID >= 10 AND CustomerID <= 20;
SELECT * FROM Customers WHERE CustomerID BETWEEN 10 AND 20; 
-- 지정된 값이 포함된다

-- 50년대생 직원들 조회
SELECT * FROM Employees WHERE BirthDate BETWEEN '1950-01-01' AND '1959-12-31';