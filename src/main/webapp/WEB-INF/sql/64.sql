SELECT * FROM Board;
SELECT * FROM Member;
-- 로그인한 사람만 글을 쓸 수 있으니까 writer에 들어가는 값은 member의 id 중의 하나여야 한다
ALTER TABLE Board
ADD FOREIGN KEY (writer) REFERENCES Member(id);
-- 실패! 지금 들어가 있는 데이터가 참조를 위반한 상태여서 추가할 수 없다
-- 예전에 썼던 board테이블에 writer를 고쳐야 한다
UPDATE Board
SET writer = '7777';
-- 참조를 삽입할 수 있도록 데이터를 규칙에 맞게 정제시켜줘야 한다

select * from Member;

-- 권한 테이블
CREATE TABLE MemberAuthority (
	memberId VARCHAR(20) NOT NULL,
    authority VARCHAR(30) NOT NULL,
    FOREIGN KEY (memberId) REFERENCES Member(id),
    PRIMARY KEY (memberId, authority)
); 

INSERT INTO MemberAuthority
VALUES ('admin0', 'admin');

SELECT * FROM MemberAuthority;
SELECT * FROM Member;
DESC Member;
SELECT * FROM 
	Member m LEFT JOIN MemberAuthority ma 
    ON m.id = ma.memberId
WHERE m.id = '7777';