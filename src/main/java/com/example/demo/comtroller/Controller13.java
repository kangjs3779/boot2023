package com.example.demo.comtroller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub13")
public class Controller13 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1(Model model) {
		String sql = "SELECT CustomerID, CustomerName FROM Customers WHERE CustomerID < 4";
		List<Customer> o = new ArrayList<>();
		// 1. request collect

		// 2. business logic
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				int id = rs.getInt("CustomerID");
				String name = rs.getString("CustomerName");
				System.out.println(id + " : " + name);

				Customer customer = new Customer();
				customer.setName(name);
				customer.setId(id);
				o.add(customer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 3. add attribute
		model.addAttribute("customers", o);

		// 4. forward /redirect
	}
	
	
	@RequestMapping("link2")
	public void method2 (Model model) {
		String sql = "SELECT EmployeeId, LastName, FirstName FROM Employees";
		List<Employee> list = new ArrayList<>();
		
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				) {
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String lastName = rs.getString(2);
				String firstName = rs.getString(3);
				
				Employee employee = new Employee();
				employee.setId(id);
				employee.setLastName(lastName);
				employee.setFirstName(firstName);
				
				list.add(employee);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("lists", list);
		
	}
	
	//고객 주소 추가
	//jsp에서 테이블 형식으로 보여주기
	//전체 고객의 정보가 나오도록 하기
	@RequestMapping("link3")
	public void method3(Model model) {
		String sql = "SELECT CustomerID, CustomerName, Address FROM Customers";
		List<Customer> o = new ArrayList<>();
		// 1. request collect

		// 2. business logic
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				int id = rs.getInt("CustomerID");
				String name = rs.getString("CustomerName");
				String address = rs.getString("Address");
				System.out.println(id + " : " + name);

				Customer customer = new Customer();
				customer.setName(name);
				customer.setId(id);
				customer.setAddress(address);
				o.add(customer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 3. add attribute
		model.addAttribute("customers", o);

		// 4. forward /redirect
	}
	
	//특정 아이디를 검색을 하면 특정 아이디를 가진 고객의 정보가 나오도록 함
	//경로 : /sub13/link4?id=
	//선생님 코드랑 비교 할 것
	//선생님 코드 복붙하고 내가 따로 파일 만들어보기
	@RequestMapping("link4")
	public void method4 (@RequestParam int id) {
		String sql = "SELECT CustomerId, CustomerName, Address FROM Customers WHERE CustomerId = ";
		sql += id;
		//이렇게 연결 연산자로 쓰면 위험한 코드가 된다
		//sql injection공격이라고 한다
		List<Customer> list = new ArrayList<>();
		
		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				) {
			while(rs.next()) {
				String customerName = rs.getString(2);
				String address = rs.getString(3);
				
				Customer customer = new Customer();
				customer.setName(customerName);
				customer.setAddress(address);
				
				list.add(customer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	//이부분 코드 복사
	@RequestMapping("link5")
	public String method5(@RequestParam String id, Model model) throws Exception {
		List<Customer> list = new ArrayList<>();
		String sql = """
				SELECT CustomerId, CustomerName, Address
				FROM Customers
				WHERE CustomerId = ? """;

		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, id);
		
		ResultSet rs = stmt.executeQuery();

		try (con; stmt; rs;) {
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt("customerid"));
				customer.setAddress(rs.getString("address"));
				customer.setName(rs.getString("customerName"));

				list.add(customer);
			}

		}

		model.addAttribute("customerList", list);

		return "/sub13/link1";
	}
	
	//코드복사
	@RequestMapping("link6")
	public String method6(@RequestParam String id, Model model) throws Exception {
		String sql = "SELECT EmployeeId, lastName, firstName FROM Employees WHERE EmployeeId=?";
		List<Employee> list = new ArrayList<>();
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		try(con; stmt; rs;) {
			Employee employee = new Employee();
			employee.setLastName();
		}
		
		return "/sub13/link2";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
