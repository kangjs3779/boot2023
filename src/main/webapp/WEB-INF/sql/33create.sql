DESC MyTable05;

-- SHOW CREATE TABLE :  테이블 생성 명령 보기
SHOW CREATE TABLE MyTable05;
-- 복사해서 사용하면 된다 그리고 테이블이름만 원하는데로 바꿔주고 쿼리 던지면 된다
CREATE TABLE `MyTable11` (
   `Col1` int(11) DEFAULT NULL,
   `Col2` int(11) DEFAULT NULL
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
 
 -- 같은 컬럼명 타입으로 새로운 테이블 만들기 근데 완벽하게 똑같은 것은 아니다
CREATE TABLE MyTable12 AS SELECT * FROM MyTable05;