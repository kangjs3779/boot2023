-- DATABASE(schema - MySQL에서는 이렇게 부름) : 테이블이 있는 곳

--  CREATE  DATABASE : database 만들기
CREATE DATABASE mydb;
use mydb;
CREATE TABLE MyTable11 (
	Title VARCHAR(10),
    Price INT
);

 -- DROP DATABASE : data base 지우기
 -- 주의 주의 주의 코드!!!!!!!
 -- 복구할 수 없음!!!
 DROP DATABASE mydb;
 -- 없는 코드라고 생각해야 함
 
 USE w3schools;
 
 -- mydb1 만들기, ㅔ이블 만들기, 삭제하기
 CREATE DATABASE mydb1;
 USE mydb1;
 CREATE TABLE mytable (
	Col1 VARCHAR(50)
 );
 DROP DATABASE mydb1;
 USE w3schools;
 
 USE test;
 -- 다른 데이터베이스에 있는 table을 불러오고 싶을 때
 SELECT * FROM w3schools.MyTable04;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 