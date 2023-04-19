-- 이미 있는 테이블에 제약사항을 추가하는 방법
CREATE TABLE MyTable28 (
	col1 INT,
    col2 INT,
    col3 INT,
    col4 INT
);
DESC MyTable28;

ALTER TABLE MyTable28
MODIFY COLUMN col1 INT UNIQUE;

ALTER TABLE MyTable28
MODIFY COLUMN col2 INT NOT NULL;

ALTER TABLE MyTable28
MODIFY COLUMN col3 INT DEFAULT 0;

ALTER TABLE MyTable28
MODIFY COLUMN col4 INT PRIMARY KEY;

-- add primary key : primary key 추가
CREATE TABLE MyTable29 (
	col1 INT,
    col2 INT,
    col3 INT
);

ALTER TABLE MyTable29
ADD PRIMARY KEY (col1, col2);
DESC MyTable29;
-- 테이블 설명을 볼때 pri가 여러개 있으면 아 조합된거구나 해야함 중복으로 사용할 수는 없으니까
-- 이미 제약사항을 어기고 있는 데이터가 있을 떄 추가하면 안된다
-- 데이터를 정제하고 나서 추가를 해야 한다
