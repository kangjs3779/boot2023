package com.example.demo.comtroller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub18")
public class Controller18 {
	
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	
	// transaction 없이 모두 실행
	@RequestMapping("link1")
	public void method1 ()  throws Exception{
		String sql1 = "UPDATE Bank SET money = money - 5000 WHERE customerName = '다온'";
		String sql2 = "UPDATE Bank SET money = money + 5000 WHERE customerName = '라온'";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt1 = con.createStatement();
				Statement stmt2 = con.createStatement();
				) {
			stmt1.execute(sql1);
			stmt2.execute(sql2);
			System.out.println("complete");			
		}
	}
	
	
	// transaction 설정없이 중간에 exception 발생
	@RequestMapping("link2")
	public void method2 ()  throws Exception{
		String sql1 = "UPDATE Bank SET money = money - 5000 WHERE customerName = '다온'";
		String sql2 = "UPDATE Bank SET money = money + 5000 WHERE customerName = '라온'";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt1 = con.createStatement();
				Statement stmt2 = con.createStatement();
				) {
			stmt1.execute(sql1);
			
			int a = 3 / 0;
			// exception 발생
			
			stmt2.execute(sql2);
			System.out.println("complete");			
		} catch (Exception e) {
			System.out.println("실패");
			// A의 돈은 빠져 나가고 B은 돈이 추가되지 않음 
			//stmt1은 성공하고 stmt2는 실패함
			//이런 상황을 막고 싶음
		}
	}
	
	//트랜잭션 설정 후 모두 성공
	@RequestMapping("link3")
	public void method3 ()  throws Exception{
		String sql1 = "UPDATE Bank SET money = money - 5000 WHERE customerName = '다온'";
		String sql2 = "UPDATE Bank SET money = money + 5000 WHERE customerName = '라온'";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt1 = con.createStatement();
				Statement stmt2 = con.createStatement();
				) {
			con.setAutoCommit(false); //autocommit disalble
			
			stmt1.execute(sql1);		
			stmt2.execute(sql2);
			
			con.commit();
			System.out.println("complete");			
		} catch (Exception e) {
			System.out.println("실패");
			// A의 돈은 빠져 나가고 B은 돈이 추가되지 않음 
			//stmt1은 성공하고 stmt2는 실패함
			//이런 상황을 막고 싶음
		}
	}
	
	// 트랜잭션 설정 후 모두 실패 (중간에 exception 발생 시)
	@RequestMapping("link4")
	public void method4()  throws Exception{
		String sql1 = "UPDATE Bank SET money = money - 5000 WHERE customerName = '다온'";
		String sql2 = "UPDATE Bank SET money = money + 5000 WHERE customerName = '라온'";

		Connection con = DriverManager.getConnection(url, username, password);				
		try (
				con;
				Statement stmt1 = con.createStatement();
				Statement stmt2 = con.createStatement();
				) {
			con.setAutoCommit(false); //autocommit disalble
			
			stmt1.execute(sql1);
			
			int a = 3 / 0;
			
			stmt2.execute(sql2);
			
			con.commit();
			System.out.println("complete");			
		} catch (Exception e) {
			System.out.println("실패");
			con.rollback();
		}
	}
}
