Create table If Not Exists Customers (id int, name varchar(255));
Create table If Not Exists Orders (id int, customerId int);
Truncate table Customers;
insert into Customers (id, name) values ('1', 'Joe');
insert into Customers (id, name) values ('2', 'Henry');
insert into Customers (id, name) values ('3', 'Sam');
insert into Customers (id, name) values ('4', 'Max');
Truncate table Orders;
insert into Orders (id, customerId) values ('1', '3');
insert into Orders (id, customerId) values ('2', '1');

SELECT * FROM Customers;
SELECT * FROM Orders;

SELECT name customers
FROM 
	Customers LEFT JOIN Orders 
    ON Customers.id = Orders.customerid    
WHERE Orders.id IS NULL;
    
-- subquery로 풀기
SELECT name FROM Customers
WHERE id NOT IN (SELECT customerId FROM Orders);
    
    
    
    
    
    
    
    
    
    
    
    
    
    