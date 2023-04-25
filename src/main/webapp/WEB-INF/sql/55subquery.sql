SELECT * FROM Products;
SELECT ProductName, CategoryID FROM Products;
SELECT ProductName, 
	(SELECT CategoryName 
    FROM Categories
    WHERE CategoryId = Products.CategoryId) categoryName
FROM Products;

-- ex) 상품명, 상품을 공급하는 공급자명
SELECT * FROM Products;
SELECT * FROM Suppliers
WHERE SupplierID = Products.SupplierID;

-- subquery를 통해서
SELECT ProductName, (SELECT SupplierName FROM Suppliers
					 WHERE SupplierID = Products.SupplierID) supplierName 
FROM Products;

-- join을 통해서
SELECT ProductName, s.SupplierName
FROM Products p JOIN Suppliers s ON p.SupplierID = s.SupplierID;
