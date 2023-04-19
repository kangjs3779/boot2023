-- 테이블 삭제 : DROP TABLE
-- 주의!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

DESC MyTable01;

DROP TABLE MyTable01;

-- 연습 : MyTable02 drop
DROP TABLE MyTable12; 

-- TRUNCATE : 테이블 유지 데이터 삭제
-- 복구가 안되니까 없는 코드라고 생각하면 된다
SELECT * FROM MyTable04;
TRUNCATE MyTable04; -- 데이터만 삭제되고 테이블은 유지가 된 것을 확인할 수 있음
