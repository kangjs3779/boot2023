-- DB만들고 사용
CREATE DATABASE leetcode175;
USE leetcode175;

-- Person table 만듦
CREATE TABLE Person (
	personId INT PRIMARY KEY,
    lastName VARCHAR(200),
    firstName VARCHAR(200)
);

-- table에 레코드을 넣음
INSERT INTO Person
VALUES (1, 'wang', 'Allen');
INSERT INTO Person
VALUES (2, 'Alice', 'Bob');

-- 레코드 확인함
SELECT * FROM Person;

-- Address table 만듦
CREATE TABLE Address (
	addressId INT PRIMARY KEY,
    personId INT,
    city VARCHAR(200),
    state VARCHAR(200)
);

INSERT INTO Address VALUES (1, 2, 'New York City', 'New York');
INSERT INTO Address VALUES (2, 4, 'Leetcode', 'California');
SELECT * FROM Address;
SELECT personId FROM Person;

-- 문제 firstName, lastName, city, state를 조회하는 쿼리 작성, 주소가 없으면 city, state에 null로 나오도록 하기
SELECT firstName, lastName, city, state 
FROM 
	Person LEFT JOIN Address 
    ON Person.personId = Address.personId
ORDER BY firstName;

SELECT city, state FROM Address WHERE Address.personId = Person.personId;
    
SELECT firstName, 
	   lastName, 
       (SELECT city 
		FROM Address 
		WHERE Person.personId = Address.personId) city, 
	   (SELECT state
		FROM Address
		WHERE Person.personId = Address.personId)state
FROM Person;

    
    
    
    
    
    
    