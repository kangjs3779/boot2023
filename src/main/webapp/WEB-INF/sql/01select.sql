-- SELECT
-- 데이터 읽기(가져오기)

-- table (행, 열)
-- 행(row, record)
-- 열(colum, field, attribute)

-- SELECT 열 목록을 나열
-- FROM 테이블
-- 쿼리끝에 ; 작성

-- Customers 테이블에서
-- 모든 레코드(행)와 모든 필드(열)을 가져와라(읽어라)
SELECT * FROM Customers;

-- 문제1) Employees 테이블에서 모든 행과 열을 읽어라
SELECT * FROM Employees;

SELECT * FROM Orders;
SELECT * FROM OrferDetails;
SELECT * FROM Categoties;

-- 작성 관습
-- 키워드는 대문자 테이블명, 컬럼명은 소문자 근데 엄격하지는 않음
-- sql은 대소문자 구분안함 - 구분하는 곳도 있긴 한데
-- 우리가 사용하고 있는 mariadb는 앞글자만 대문자 뒤에는 소문자로 적는다

select * from Orders; -- ok
SELECT * FROM orders; -- x












