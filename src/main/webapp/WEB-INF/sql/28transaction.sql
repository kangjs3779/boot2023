-- transaction : 하나의 업무 단위
-- 탈퇴를 하면 게시물 정보 카드정보 내정보 등등 다 같이 삭제되어야 한다
-- 하나의 transaction 여러 insert update delete 명령문(DML)으로 구성될 수 있다

-- 이체하는 업무 (A -> B) 5000원
-- A의 돈 -5000 update
-- B의 돈 +5000 update
-- 동시에 성공하거나 동시에 실패하거나 해야 한다

CREATE TABLE Bank (
	customerName VARCHAR(255),
    money INT DEFAULT 0
);

SELECT * FROM Bank;
INSERT INTO Bank VALUES ('A', 100000);
INSERT INTO Bank VALUES ('B', 100000);

-- 이체 5000원 A -> B
UPDATE Bank SET money = money - 5000 WHERE customerName = 'A';
UPDATE Bank SET money = money + 5000 WHERE customerName = 'B';
-- 20번이 이상하면 20번 이전의 상태로 돌아가야 한다
-- rollback, commit을 이용할 것이다

-- commit : 트랜잭션 완료
-- rollback : 트랜잭션 실패 (트랜잭션 시작 이전으로 되돌리기)

-- 자동 커밋 (autocommit)
SET autocommit = 0; -- 자동커밋 비활성화 (disable)
SET autocommit = 1; -- 자동커밋 활성화 (enable)

UPDATE Bank SET money = money - 5000 WHERE customerName = 'A';
UPDATE Bank SET money = money + 5000 WHERE customerName = 'B';
SELECT * FROM Bank;
-- 비활성화 되어 있기 때문에 다른 사람이 보면 아직 95000원 105000원이다
ROLLBACK; -- 마지막 커밋으로 되돌리기
COMMIT; -- 트랜잭션 완료
-- 이것까지 하면 누가봐도 9만원 11만원이 된다

-- 이체 시 오류 (A -> B 5000원)
UPDATE Bank SET money = money - 5000 WHERE customerName = 'A'; -- 실행됨
-- 오류 생겼다고 가정
-- rollback을 꼭 해줘야 한다
SELECT * FROM Bank;
ROLLBACK;
-- 마지막 커밋상태로 되돌려서 데이터를 복구 시켜야 한다

INSERT INTO Bank VALUES ('다온', 100000);
INSERT INTO Bank VALUES ('라온', 100000);
SELECT * FROM Bank;

SET autocommit = 0;
SET autocommit = 1;
UPDATE Bank SET money = money - 5000 WHERE customerName = '다온';
UPDATE Bank SET money = money + 5000 WHERE customerName = '라온';
ROLLBACK;
COMMIT;
SELECT * FROM Bank;

UPDATE Bank SET money = 100000 WHERE customerName = '다온';
UPDATE Bank SET money = 100000 WHERE customerName = '라온';


