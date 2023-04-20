package com.example.demo.comtroller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.sql.*;
import java.sql.Date;
import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub19")
public class Controller19 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	
	@RequestMapping("link1")
	public void method1() throws Exception {
		String sql = """
				INSERT INTO MyTable30 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);				
				) {
			pstmt.setInt(1, 99);
			pstmt.setString(2, "hello");
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행 추가됨");
		}
		
	}
	
	@RequestMapping("link2")
	public void method2() throws Exception {
		//sql안에 넣는 값은 타입에 엄청 민감하지 않음 그냥 변환될 수 있는거면 변환이 되어서 들어간다
		String sql = """
				INSERT INTO MyTable30 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);				
				) {
//			pstmt.setInt(1, 99);
//			pstmt.setString(2, "hello");
			pstmt.setString(1, "888");
			pstmt.setInt(2, 52);
			//타입을 반대로 했는데 된다
			//그냥 setString으로 맞춰도 되겠지만 수업에서는 타입을 맞춰서 쓰도록 하겠다
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행 추가됨");
		}
	}
	
	
	@RequestMapping("link3")
	public void method3() throws Exception {
		//sql안에 넣는 값은 타입에 엄청 민감하지 않음 그냥 변환될 수 있는거면 변환이 되어서 들어간다
		String sql = """
				INSERT INTO MyTable31 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);				
				) {
			pstmt.setString(1, "1923-09-01");
			pstmt.setString(2, "1811-11-12 23:56:45");
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행 추가됨");
		}
	}

	
	@RequestMapping("link4")
	public void method4() throws Exception {
		//sql안에 넣는 값은 타입에 엄청 민감하지 않음 그냥 변환될 수 있는거면 변환이 되어서 들어간다
		String sql = """
				INSERT INTO MyTable31 (Col1, Col2)
				VALUES (?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);				
				) {
//			pstmt.setString(1, "1923-09-01");
//			pstmt.setString(2, "1811-11-12 23:56:45");
			//타입을 굳이 맞춰주자면
			pstmt.setDate(1, Date.valueOf("2023-03-01"));
			pstmt.setTimestamp(2, Timestamp.valueOf("1811-11-12 23:56:45"));
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행 추가됨");
		}
	}
	
	@RequestMapping("link5")
	public void method5() throws Exception {
		String sql = """
				INSERT INTO MyTable32
				VALUES
				(?, ?, ?, ?, ?)
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);				
				) {
			pstmt.setString(1, "kang");
			pstmt.setInt(2, 85);
			pstmt.setDouble(3, 800.00);
			pstmt.setDate(4,Date.valueOf("2202-07-30"));
			pstmt.setTimestamp(5, Timestamp.valueOf("2202-07-18 15:14:46"));
			
			int count = pstmt.executeUpdate();
			System.out.println(count);			
		}
		
	}
	
	@RequestMapping("link6")
	public void method6() {
		// forward to form
	}
	
	@RequestMapping("link7")
	public void method7(
			String name,
			int age,
			double price,
			String birth,
			String inserted
			) throws Exception {
		//내가 쓴거 선생님 8번메소드랑 비교하기
		//내가 타입을 맞춰서 쓴 것
		// 타입 비교해보기
		String sql = """
				INSERT INTO MyTable32
				VALUES
				(?,?,?,?,?)
				""";
		
		try(
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, price);
			pstmt.setDate(4, Date.valueOf(birth));
			pstmt.setString(5, inserted);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 성공");
			
		}
	}
	
	@RequestMapping("link8")
	public void method8 () {
		// 이건 선생님 7번 메소드 복붙하기
		// 타입을 안맞춘 7번 메소드
	}
	
	@RequestMapping("link9")
	public void method9(MyTable33 myTable33) throws Exception {
		// forward method10
		
	}
	
	
	@RequestMapping("link10")
	public void method10(MyTable33 myTable33) throws Exception {
		// forward method10
		String sql = """
				INSERT INTO MyTable33 
				VALUES 
				(?,?,?,?,?)
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setString(1, myTable33.getTitle());
			pstmt.setDate(2, Date.valueOf(myTable33.getPublished()));
			pstmt.setDouble(3, myTable33.getPrice());
			pstmt.setTimestamp(4, Timestamp.valueOf(myTable33.getUpdated()));
			pstmt.setDouble(5, myTable33.getWeight());
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 입력 성공");
			
		}
	}
	
	@RequestMapping("link11")
	public void method11 () throws Exception {
		String sql = """
				SELECT *
				FROM MyTable33
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);				
				) {
			if(rs.next()) {
				String title = rs.getString(1);
				String published = rs.getString(2);
				String price = rs.getString(3);
				String updated = rs.getString(4);
				String weight = rs.getString(5);
				
				System.out.println(title);
				System.out.println(published);
				System.out.println(price);
				System.out.println(updated);
				System.out.println(weight);
			}
			
		}
	}
	
	@RequestMapping("link12")
	public void method12 () throws Exception {
		String sql = """
				SELECT *
				FROM MyTable33
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);				
				) {
			if(rs.next()) {
				// 선생님 타입 코드 복사
				String title = rs.getString(1);
				LocalDate published = rs.getDate("published").toLocalDate();
				Integer price = rs.getInt(3);
				LocalDateTime updated = rs.getTimestamp(4).toLocalDateTime();
				Double weight = rs.getDouble(5);
				
				System.out.println(title);
				System.out.println(published);
				System.out.println(price);
				System.out.println(updated);
				System.out.println(weight);
			}
			
		}
	}
	
	
	@RequestMapping("link13")
	public void method13 () throws Exception {
		String sql = """
				SELECT * FROM MyTable33
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				) {
			if(rs.next()) {
				String title = rs.getString(1);
				LocalDate published = rs.getDate(2).toLocalDate();
				double price = rs.getDouble(3);
				LocalDateTime updated = rs.getTimestamp(4).toLocalDateTime();
				double weight = rs.getDouble(5);
				
				System.out.println(title);
				System.out.println(published);
				System.out.println(price);
				System.out.println(updated);
				System.out.println(weight);
			}
			
		}
	}
	
	
	@RequestMapping("link14")
	public void method14 (Model model) throws Exception {
		String sql = """
				SELECT Name, Age, Price, Birth, Inserted
				FROM MyTable32
				""";
		List<Dto05> list = new ArrayList<>();
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				Dto05 o = new Dto05();
				o.setName(rs.getString(1));
				o.setAge(rs.getInt(2));
				o.setPrice(rs.getDouble(3));
				o.setBirth(rs.getDate(4).toLocalDate());
				o.setInserted(rs.getTimestamp(5).toLocalDateTime());
				
				list.add(o);
			}	
		}
		model.addAttribute("memberList", list);
	}
	
	
	@RequestMapping("link15")
	public void method15 (Model model) throws Exception {
		String sql = """
				SELECT * FROM MyTable33
				""";
		List<Dto06> list = new ArrayList<>();
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				) {
			while (rs.next()) {
				Dto06 o = new Dto06();
				o.setTitle(rs.getString(1));
				o.setPublished(rs.getDate(2).toLocalDate());
				o.setPrice(rs.getDouble(3));
				o.setUpdated(rs.getTimestamp(4).toLocalDateTime());
				o.setWeight(rs.getDouble(5));
				
				list.add(o);
			}
		}
		model.addAttribute("lists", list);
	}
	
	
	
	
	
}
