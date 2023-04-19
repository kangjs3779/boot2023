-- 컬럼의 값이 여러 행에서 중복 허용 안함
-- UNIQUE
CREATE TABLE MyTable21 (
	col1 INT,
    con2 INT UNIQUE
);

DESC MyTable21;
INSERT INTO MyTable21 (col1, con2)
VALUES (1, 1); -- ok

INSERT INTO MyTable21 (col1, con2)
VALUES (2, 2); -- ok

INSERT INTO MyTable21 (col1, con2)
VALUES (2, 3); -- ok

INSERT INTO MyTable21 (col1, con2)
VALUES (2, 3); -- fail

INSERT INTO MyTable21 (col1, con2)
VALUES (5, null); -- ok

INSERT INTO MyTable21 (col1, con2)
VALUES (5, null); -- ok

SELECT * FROM MyTable21;

-- 각 행에 서로 다른 값을 가지고 있는 컬럼 unique컬럼 = key

CREATE TABLE MyTable22 (
	ssn VARCHAR(13) UNIQUE, -- 이걸 key라고 한다
    name VARCHAR(20)
);

DESC MyTable22; -- 유니크라고 해서 null을 허락하지 않는 것은 아니다

DESC MyTable22;
INSERT INTO MyTable22 (ssn, name) 
VALUES ('1', '정대만');
INSERT INTO MyTable22 (ssn, name)
VALUES ('1', '송태섭'); -- fail
INSERT INTO MyTable22 (ssn, name)
VALUES (NULL, '채소연'); -- ok
INSERT INTO MyTable22 (ssn, name)
VALUES (NULL, '강백호'); -- ok
SELECT * FROM MyTable22;
-- null은 여러개가 들어갈 수 있다, 값이 없는 것이라서 중복의 개념으로 보면 안되나 보다

CREATE TABLE MyTable23 (
	Col1 VARCHAR(20) NOT NULL UNIQUE DEFAULT 'r'
);

DESC MyTable23;

-- NOT NULL UNIQUE = PRIMARY KEY 이게 PRI이라고 표시가 된다








