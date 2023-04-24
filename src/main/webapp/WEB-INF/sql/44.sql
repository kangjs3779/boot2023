SELECT CustomerName, ContactName
FROM Customers
WHERE CustomerID = 3;

-- 오늘
SELECT CustomerName
FROM Customers;

SELECT * FROM Products;
DESC Products;

SELECT * FROM Customers;

CREATE TABLE MyTable34 (
	Col1 INT,
    Col2 VARCHAR(30)
);

DESC MyTable34;

INSERT INTO MyTable34 (Col1, Col2)
VALUES(99, 'hello');

SELECT * FROM MyTable34;

CREATE TABLE MyTable35 (
	Col1 DEC,
    Col2 VARCHAR(30)
);

DESC MyTable35;
SELECT * FROM MyTable35;

CREATE TABLE MyTable36
(
	Col1 INT,
    Co12 VARCHAR(30),
    Col3 DEC
);
INSERT INTO MyTable36
VALUE (22, 'hoello', 3.14);
SELECT * FROM MyTable36;

CREATE TABLE MyTable37 (
	Age INT,
    Name VARCHAR(10),
    Score DEC(4,2)
);

SELECT * FROM MyTable37;

CREATE TABLE MyTavle38
(
	col1 INT,
    col2 INT,
    col3 VARCHAR(30),
    col4 VARCHAR(50),
    col5 DEC,
    col6 DEC
); 
SELECT * FROM MyTavle38;

CREATE TABLE MyTable39(
	Col1 INT PRIMARY KEY AUTO_INCREMENT,
    Col2 VARCHAR(300),
    Col3 INT
);

DESC MyTable39;
INSERT INTO MyTable39 (Col2,Col3)
VALUES ('hello', 99);
SELECT * FROM MyTable39;

CREATE TABLE MyTable40 (
	Id INT PRIMARY KEY AUTO_INCREMENT,
    Age INT,
    Name VARCHAR(30),
    Score DEC(10, 3)
);

SELECT * FROM MyTable39;
DELETE FROM MyTable40;

SELECT * FROM Customers;
SELECT * FROM Employees;

DROP DATABASE MoiveInfo;

CREATE DATABASE MovieDiary;
USE MovieDiary;
DROP TABLE MovieInfo;
CREATE TABLE MovieInfo (
	MovieIndex INT AUTO_INCREMENT PRIMARY KEY,
	Title VARCHAR(50),
    ReleaseDate DATE,
    Director VARCHAR(50),
    Note LONGTEXT
);

DESC MovieInfo;

ALTER TABLE MovieInfo
MODIFY COLUMN Title VARCHAR(50) NOT NULL;