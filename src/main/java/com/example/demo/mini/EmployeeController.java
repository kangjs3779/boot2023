package com.example.demo.mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Employee;

@Controller
@RequestMapping("minipro")
public class EmployeeController {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;
	
	@RequestMapping("home")
	public void method1() {
		//search employee forward
		
	}
	
	@RequestMapping("searchResult")
	public void method2(Employee employee) throws Exception{
		//search result
		String sql = """
				SELECT * FROM Employees WHERE EmployeeID = ?;
				""";
		try(
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setInt(1, employee.getEmployeeId());
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				employee.setEmployeeId(rs.getInt(1));
				employee.setLastName(rs.getNString(2));
				employee.setFirstName(rs.getString(3));
				employee.setBirthDate(rs.getString(4));
				employee.setPhoto(rs.getBoolean(5));
				employee.setNote(rs.getString(6));
			}
		}
	}
			
	@RequestMapping("join")
	public void method3() throws Exception{
		//add employee forward
		
	}
	
	@RequestMapping("joinSuccess")
	public void method4 (Employee employee) throws Exception {
		String sql = """
				INSERT INTO Employees
					(employeeId,
					lastName,
					firstName,
					birthDate,
					notes)
				VALUES
				(?, ?, ?, ?, ?)					
				""";
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setInt(1, employee.getEmployeeId());
			pstmt.setString(2, employee.getLastName());
			pstmt.setString(3, employee.getFirstName());
			pstmt.setString(4, employee.getBirthDate());
			pstmt.setString(5, employee.getNote());
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 추가완료");
		} 
	}
			
	@RequestMapping("change")
	public void method5() {
		//change employee forward
		
	}
	
	@RequestMapping("changeForm")
	public void method6(Employee employee) throws Exception{
		String sql = """
				UPDATE Employees
				SET
					lastName = ?,
					firstName = ?,
					birthDate = ?,
					notes = ?
				WHERE
					EmployeeID = ?
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				
				) {
			
		}
	}
//			
//	@RequestMapping("delete")
//	public void method4() {
//		//delete employee
//	}
		
}


