-- Numeric (수)
-- int 정수형
-- decimal, dec 실수형
CREATE TABLE MyTable04 (
	Col1 INT
);
DESC MyTable04;
INSERT INTO MyTable04 VALUES (33);
INSERT INTO MyTable04 VALUES (3.3); -- 실수형은 소수점 제외하고 들어간 것을 확인할 수 있다
SELECT * FROM MyTable04; 
-- 연습
CREATE TABLE MyTable05 (
	Col1 INT,
    Col2 INT
    -- 최대값 : 2147483648
    -- 최소값 : -2147483648
);
INSERT INTO MyTable05 VALUES (5, 10);
SELECT * FROM MyTable05;

-- DEC 실수형
-- DEC(총길이, 소수점이하길이)
CREATE TABLE MyTable06 (
	Col1 DEC(5, 2), -- 총길이, 소수점 자리 길이
    Col2 DEC(3, 1)
);
INSERT INTO MyTable06 (Col1) VALUES (999.99);   -- ok
INSERT INTO MyTable06 (Col1) VALUES (-999.99); -- ok
INSERT INTO MyTable06 (Col1) VALUES (99.9);     -- ok
INSERT INTO MyTable06 (Col1) VALUES (1000.99);   -- fail
INSERT INTO MyTable06 (Col1) VALUES (9999.9);   -- fail
INSERT INTO MyTable06 (Col1) VALUES (99.999);   -- 반올림이 되네?
SELECT * FROM MyTable06;
DESC MyTable06;

-- MyTable07 만들기, 두개 컬럼 실수형 총길이 소수점이하길이 알아서 작성
CREATE TABLE MyTable07 (
	Col1 DEC(4,4),
    Col2 DEC(2,1)
);
DESC MyTable07;





-- Chatacter(String) 문자형
-- 가장 많이 쓰는 타입이다
-- VARCHAR(길이) : 문자형인데 길이가 가변적이다
CREATE TABLE MyTable02 (
	Col1 VARCHAR(3), -- 길이가 3인 문자열만 넣을 수 있다
    Col2 VARCHAR(5) -- 길이가 5인 문자열만 넣을 수 있따
);
INSERT INTO MyTable02 VALUES ('abc', 'abcde'); -- ok
INSERT INTO MyTable02 VALUES ('ab', 'abcd'); -- 작은 길이의 문자열은 ok
INSERT INTO MyTable02 VALUES ('abcd', 'abcdef'); -- 큰 길이의 문자열은 안되거나 잘라서 들어가기도(옵션에 따라서)한다 일단 얘는 실패

-- 연습
CREATE TABLE MyTable03 (
	Col1 VARCHAR(10),
    Col2 VARCHAR(100),
    Col3 VARCHAR(1000)
);
SELECT * FROM MyTable03;



-- 날짜시간
-- DATE 날짜 (YYYY-MM-DD)ALTER
-- DATETIME 날짜시간 (YYYY-MM-DD hh:mm:ss)
CREATE TABLE MyTable08 (
	Col1 DATE,
    Col2 DATETIME
);
DESC MyTable08;
INSERT INTO MyTable08 (Col1) VALUES ('2023-04-19');
SELECT * FROM MyTable08;
INSERT INTO MyTable08 (Col1) VALUES ('9999-12-31'); -- 최대
INSERT INTO MyTable08 (Col1) VALUES ('1000-01-01'); -- 최소

INSERT INTO MyTable08  (Col2) VALUES ('2023-04-19 11:41:30');
INSERT INTO MyTable08  (Col2) VALUES ('9999-12-31 23:59:59'); -- 최대
INSERT INTO MyTable08  (Col2) VALUES ('1000-01-01 00:00:00'); -- 최소

SELECT now(); -- 오늘 날짜시간을 알고 싶다
INSERT INTO MyTable08 VALUES (now(), now()); 
SELECT * FROM MyTable08;

-- 예시) 반학생들의 정보를 넣고 싶음 MyTable09
-- 학생이름, 성별, 생년월일, 기타정보, 시험성적
CREATE TABLE MyTable09 (
	Name VARCHAR(20),
    Gender VARCHAR(1),
    BirthDate DATE,
    test INT,
    etc VARCHAR(50)
);

-- 데이터 추가하는 코드 복사하기
-- 연습) 내가 가지고 있는 교재정보 저장하는 table
-- 버전에 따라 용어가 조금씩 다를 수 있다 그냥 크게 이런 형태의 타입이 있다

