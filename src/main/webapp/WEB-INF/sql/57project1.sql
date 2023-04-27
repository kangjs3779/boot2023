CREATE DATABASE Board;
USE Board;

-- table name : UpperCamelCase
-- column name : lowerCamelCase

CREATE TABLE Board (
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
    body VARCHAR(1000) NOT NULL,
    writer VARCHAR(20),
    inserted DATETIME DEFAULT now()
); 

DESC Board;

INSERT INTO Board (title, body, writer)
VALUES
	('sample title', 'sample body', 'user00');
    
SELECT * FROM Board;