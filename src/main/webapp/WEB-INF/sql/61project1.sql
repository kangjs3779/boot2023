use Board;

DESC Board;
-- 파일 컬럼을 추가하는 것이 좋은가? -> 제1정규화를 만족하지 않게 된다(원자성을 만족하지 않음)
-- 그럼 파일마다 컬럼을 만드는 것이 좋은가? -> 제1정규화를 만족하지 않게 된다(같은 역할을 하는 여러 커럼이 있으면 안된다)
-- 그럼 새로운 테이블을 만들어야 하는구나~

CREATE TABLE FileNames (
	id INT PRIMARY KEY AUTO_INCREMENT,
	boardId INT NOT NULL, -- 어떤 게시글의, 외래키가 기본키 될 수 없음
	fileName VARCHAR(300) NOT NULL, -- 어떤 파일인가
    -- 기보키를 추가해야 하는데 둘이 조합을 하면 안된다 파일명이 변경될 수도 있으니까
    FOREIGN KEY (boardId) REFERENCES Board(id)
);

DESC FileNames;

SELECT * FROM FileNames;
SELECT * FROM Board b LEFT JOIN FileNames f
ON b.id = f.boardId
WHERE b.id = 65567;
-- file이 있어서 잘 나옴
-- file이 없는 게시물도 조회를 해야 하니까 left 키워드를 적어준다

SELECT 
	c.CategoryId id,
    c.CategoryName name,
    c.Description,
    p.ProductName
FROM Categories c JOIN Products p
ON c.CategoryID = p.CategoryID
WHERE c.CategoryId = 1;

SELECT * FROM Suppliers s JOIN Products p
			ON s.SupplierID = p.SupplierID
WHERE s.SupplierID = 1;

SELECT  
				s.SupplierId,
				s.SupplierName,
				s.contactName,
				s.address,
				s.city,
				s.postalCode,
				s.country,
				s.phone,
				p.productName,
				p.Price
			FROM Suppliers s JOIN Products p
									  ON s.SupplierID = p.SupplierID
			WHERE s.SupplierID = 1;
            
SELECT * , COUNT(f.id) fileCount
FROM Board b LEFT JOIN FileNames f ON b.id = f.boardId
GROUP BY b.id
ORDER BY b.id DESC
LIMIT 0,5;

65576
65575
65574
65573
65572;




SELECT 
	b.id,
	b.title,
	b.body,
	b.inserted,
	b.writer,
	f.fileName
FROM Board b LEFT JOIN FileNames f ON b.id = f.boardId
WHERE b.id = 65580;
            
SELECT * FROM Board ORDER BY id DESC;
SELECT * FROM FileNames;
SELECT fileName FROM FileNames WHERE boardId = 65575;
SELECT * FROM Board WHERE id = 65576;


