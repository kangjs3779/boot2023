DROP DATABASE w3schools;

USE w3schools;
SELECT * FROM Products;
DESC Products;
SELECT * FROM Categories;
DESC Categories;

ALTER TABLE Products
ADD FOREIGN KEY (CategoryId) 
REFERENCES Categories(CategoryId);

DESC Products;

ALTER TABLE Products
ADD FOREIGN KEY (SupplierId)
REFERENCES Suppliers(SupplierId);

ALTER TABLE OrderDetails
ADD FOREIGN KEY (OrderId) 
REFERENCES Orders(OrderId);

ALTER TABLE OrderDetails
ADD FOREIGN KEY (ProductId) 
REFERENCES Products(ProductId);

DESC Orders;

ALTER TABLE Orders
ADD FOREIGN KEY (CustomerID)
REFERENCES Customers(CustomerId);

ALTER TABLE Orders
ADD FOREIGN KEY (ShipperId)
REFERENCES Shippers(ShipperId);

ALTER TABLE Orders
ADD FOREIGN KEY (EmployeeID)
REFERENCES Employees(EmployeeID);
DESC Orders;

SELECT * FROM Products
WHERE ProductID = 1;
SELECT * FROM Categories
WHERE CategoryId = 1;

SELECT * 
FROM Products 
JOIN Categories ON
Products.CategoryId = Categories.CategoryId
WHERE Products.ProductId = 1;