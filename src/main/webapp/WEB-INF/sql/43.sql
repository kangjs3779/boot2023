DESC MyTable30;
CREATE TABLE MyTable30 (
	Col1 INT,
    Col2 VARCHAR(30)
);

INSERT INTO MyTable30 (Col1, Col2)
VALUES (30, '가나다');

INSERT INTO MyTable30 (Col1, Col2)
VALUES ('33', 33); 
-- int타입이어도 들어간다 그렇게 엄격하지 않음

INSERT INTO MyTable30 (Col1)
VALUES ('Three'); 
-- 진짜 문자가 들어가는 건 안된다

INSERT INTO MyTable30 (Col2)
VALUES (77); 
-- 변경 될 수 있다면 변경이 자동으로 되어서 들어간다

SELECT * FROM MyTable30;

-- 데이터 설계 자체를 그냥 vachar로 하는 경우도 있음

CREATE TABLE MyTable31 (
	Col1 DATE,
    Col2 DATETIME
);

-- date : yyyy-mm-dd
-- datetime : yyyy-mm-dd hh:mm:ss
INSERT INTO MyTable31 (Col1, Col2)
VALUES ('2023-04-20', '2023-04-20 09:29:12');

SELECT * FROM MyTable31;

CREATE TABLE MyTable32 (
	Name VARCHAR(30),
    Age INT,
    Price DEC,
    Birth DATE,
    Inserted DATETIME
);
SELECT * FROM MyTable32;

