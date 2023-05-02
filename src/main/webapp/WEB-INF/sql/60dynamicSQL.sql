USE w3schools;
SELECT * FROM Customers
WHERE CustomerName LIKE '%ell%';

SELECT * FROM Employees
WHERE LastName LIKE '%eve%' 
	OR FirstName LIKE '%eve%';

CREATE DATABASE BoardPro02;

CREATE TABLE Board (
	Id INT PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR(20) NOT NULL, 
    Body VARCHAR(2000) NOT NULL,
    Writer VARCHAR(15) NOT NULL,
    Inserted DATETIME DEFAULT now()
);

DESC Board;

INSERT INTO Board 
	(title, body, writer)
VALUES
	('짱구는 못말려', '짱구입니다', '짱구');
    
INSERT INTO Board 
	(title, body, writer)
VALUES
	('맹구는 못말려', '맹구입니다', '맹구');
    
SELECT * FROM Board;

INSERT INTO Board
	(title, body, writer)
SELECT
	title, body, writer
FROM Board;

ALTER TABLE Board
ALTER COLUMN  Title VARCHAR(20) NOT NULL;
DROP TABLE Board;

SELECT *
FROM Board
WHERE 
	title LIKE '%keyword%'
	OR body LIKE '%keyword%'
    OR writer LIKE '%keyword%';