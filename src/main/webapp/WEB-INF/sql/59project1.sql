use Board;

DESC Board;

INSERT INTO Board (title, body, writer)
SELECT title, body, writer 
FROM Board;

SELECT count(*) FROM Board;

