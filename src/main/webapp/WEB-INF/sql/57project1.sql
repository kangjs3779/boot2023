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