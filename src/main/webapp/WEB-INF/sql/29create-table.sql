-- CREATE TABLE : 새로운 테이블 만들기
-- TABLE 이름 : 작성규칙은 회바회~
-- 우리 과정에서는 UpperCamelCase

CREATE TABLE MyTable01 (
	-- 컬럼 정의
    -- 컬럼 값의 type, ...
    -- 컬럼명 작성규칙(회바회)
    -- 우리과정에서는 UpplerCamelcase(대소문자 구분 안함)
    Col1 INT,
    Col2 VARCHAR(255)
);

SELECT * FROM MyTable01; -- record들을 보기 위한 select
DESC MyTable01; -- table의 구조를 보기 위한 DESC
INSERT INTO MyTable01 (col1, col2)
VALUES (30, '가나다');

-- 타입이 결정이 되면 타입에 맞는 값만 넣을 수 있다

CREATE TABLE MyTable10 (
	Col1 INT,
    Col2 VARCHAR(50)
);
