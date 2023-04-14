SELECT * FROM Customers WHERE CustomerName LIKE 'A%'; -- 'a%'도 된다 대소문자 구별X
SELECT * FROM Customers WHERE CustomerName LIKE '%a';
SELECT * FROM Customers WHERE CustomerName LIKE '%a%';
SELECT * FROM Customers WHERE CustomerName LIKE '_L%';
SELECT * FROM Customers WHERE CustomerName LIKE 'a%e';

-- 고객명(customerName), 계약명(contactName) 에 or이 포함된 고객들 조회
SELECT * FROM Customers WHERE CustomerName LIKE '%or%' AND ContactName LIKE '%or%';
