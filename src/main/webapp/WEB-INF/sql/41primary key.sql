-- PRIMARY KEY : NOT NULL + UNIQUE
CREATE TABLE MyTable24 (
	Col1 INT PRIMARY KEY -- not null + unique
);

DESC MyTable24;

CREATE TABLE MyTable25 (
	col1 INT,
    PRIMARY KEY (col1)
);
DESC MyTable25;

CREATE TABLE MyTable26 (
	col1 INT,
    col2 INT,
    PRIMARY KEY (col1, col2) -- 조합해서 중복이 안되도록 한 것이다
);

DESC MyTable26;

INSERT INTO MyTable26 (col1, col2)
VALUES (1, 1); -- ok

INSERT INTO MyTable26 (col1, col2)
VALUES (2, 2); -- ok

INSERT INTO MyTable26 (col1, col2)
VALUES (2, 1); -- ok 조합해서 중복이 안되는 것이라서 이건 된다

INSERT INTO MyTable26 (col1, col2)
VALUES (2, 1); -- fail

INSERT INTO MyTable26 (col1, col2)
VALUES (null, 1); -- fail
SELECT * FROM MyTable26;

CREATE TABLE MyTable27 (
	Col1 INT,
    Col2 INT,
    PRIMARY KEY (Col1),
    PRIMARY KEY (Col2)
); 
-- PRIMARY KEY이걸 두개 이상 쓰면 안된다 한 테이블당 하나만 사용가능 하다 하지만 없는 건 가능

-- 제약 사항 (constraints)
-- default, unique, not null, primary key


