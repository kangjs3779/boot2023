-- 학생명, 전화번호(여러개 있을 수 있다)
CREATE TABLE Student (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Name VARCHAR(50)

);

-- 한 명의 학생이 여러개의 전화번호를 가질 수 있게 되었다
CREATE TABLE StudentPhone (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	StudentId INT, 
    -- student table에 있는 id값에 속해 있어야 한다 - foreign key(외래키 참조키))
    -- 한 학생이 여러 전화번호를 가지고 있으면 그 전화번호들이 그 학생것이라는 표시가 필요함
    -- id컬럼은 필요없긴함 studentid와 phone으로 합성키를 만들 수 있S음
    FOREIGN KEY (StudentId) REFERENCES Student(Id),
	Phone VARCHAR(50)
);
CREATE TABLE StudentPhone1 (
	StudentId INT,
    Phone VARCHAR(50),
    PRIMARY KEY(StudentId, Phone)
    -- 이렇게 합성키를 만들 수 있으나 전화번호는 변경될 수 있는데 기본키는 변경되면 안되니까 그냥 id컬럼을 따로 만드는 것이 좋다
);

DESC Student;
DESC StudentPhone;

-- 데이터 입력
INSERT INTO Student (Name) VALUES ('손흥민');
INSERT INTO Student (Name) VALUES ('박지성');
SELECT * FROM Student;

INSERT INTO StudentPhone (StudentId, Phone) 
VALUES (1, '010-9999-8888');

INSERT INTO StudentPhone (StudentId, Phone) 
VALUES (2, '010-5555-7777');
SELECT * FROM StudentPhone;

INSERT INTO StudentPhone (StudentId, Phone) 
VALUES (3, '010-4444-7777');
-- 입력이 안되는 것을 확인할 수 있다

INSERT INTO StudentPhone (StudentId, Phone)
VALUES (NULL, '010-5555-7777'); -- ok 
INSERT INTO StudentPhone (StudentId, Phone)
VALUES (NULL, '010-3333-7777');
-- null은 중복과 상관없이 들어가니까 주의해야 한다

-- 아예 처음 만들 때 not null을 넣었을 것이다
CREATE TABLE StudentPhone (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	StudentId INT NOT NULL, -- 이런식으로
    FOREIGN KEY (StudentId) REFERENCES Student(Id),
	Phone VARCHAR(50)
);

-- NOt NULL을 추가해보겠음
-- 근데 제약사항을 추가할 때는 제약사항에 위반되는 데이터를 지우고(데이터를 정제하고) 추가한다
DELETE FROM StudentPhone WHERE StudentId IS NULL;
ALTER TABLE StudentPhone
MODIFY COLUMN StudentId INT NOT NULL;
INSERT INTO StudentPhone (StudentId, Phone)
VALUES (1, '010-777-5555');

DELETE FROM Student
WHERE ID = 2; 
-- fail : id 2번을 참조하고 있는 table이 있기 때문에 삭제가 안된다
-- 외래키 제약사항이 있느 테이블의 데이터를 먼저 지원야 함
DELETE FROM StudentPhone
WHERE StudentId = 2;
DELETE FROM Student
WHERE Id = 2;
-- 이렇게 차례대로 지워야 지워진다 한꺼번에 지우는 쿼리도 있긴한데 위험하니까 그냥 쓰지마라
-- 실제로는 데이터자체를 잘 지우지 않고 업데이트를 위주로 한다 잘 안쓰는 쿼리임


-- 테이블이 여러군데에 나눠져 있는데 이걸 어떻게 조합을 하는가??
-- 한개의 쿼리로 데이터를 얻는 방법에 대해서
