CREATE DATABASE leetcode181;
USE leetcode181;
CREATE TABLE Employee(
	id INT PRIMARY KEY,
    name VARCHAR(200),
    salary INT,
    managerId INT
);

INSERT INTO Employee VALUES (1, 'Joe', 70000, 3);
INSERT INTO Employee VALUES (2, 'Henry', 80000, 4);
INSERT INTO Employee VALUES (3, 'Sam', 60000, NULL);
INSERT INTO Employee VALUES (4, 'Max', 90000, NULL);

SELECT * FROM Employee;

-- 매니저보다 연봉이 많은 직원 조회
SELECT e1.name Employee
FROM 
	Employee e1  JOIN Employee e2 ON e1.managerid = e2.id
WHERE e2.salary < e1.salary;

SELECT *
FROM 
	Employee e1 JOIN Employee e2 ON e1.managerid = e2.id
WHERE e2.salary < e1.salary;

-- 서브 쿼리
SELECT name
FROM Employee e1
WHERE salary > (SELECT salary
				FROM Employee e2
                WHERE e2.id = e1.managerId);
