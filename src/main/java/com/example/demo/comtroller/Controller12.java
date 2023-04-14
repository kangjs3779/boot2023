package com.example.demo.comtroller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub12")
public class Controller12 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() {
		String sql = "SELECT LastName FROM Employees";

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				// true가 나오다가 아홉번이 지나고 10번 째에 false가 나올 것이다
				System.out.println(rs.next()); // 이때 커서가 옮겨진다
//				해당행의 특정 결과를 가지고 오는 메소드들이 있음 대부분 get블라블라 메소드
				// 커서를 옮겨서 데이터를 가지고 오는 것
				String name1 = rs.getString("lastName");
				System.out.println(name1);
				// 특정 행으로 커서를 옮겨서 next, 값을 가져오고 getString

				System.out.println(rs.next());
				System.out.println(rs.next());
				System.out.println(rs.next());
				System.out.println(rs.next());
				System.out.println(rs.next());
				System.out.println(rs.next());
				System.out.println(rs.next());
				System.out.println(rs.next());
				System.out.println(rs.next());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("link2")
	public void method2() {
		String sql = "SELECT LastName FROM Employees";

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {

				while (rs.next()) {
					System.out.println(rs.getString("lastName"));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link3")
	public void method3(Model model) {
		String sql = "SELECT ShipperName FROM Shippers";
		List<String> list = new ArrayList<>();

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			while (rs.next()) {
				list.add(rs.getString("ShipperName"));

				model.addAttribute("Names", list);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link4")
	public void method4() {
		String sql = "SELECT * FROM Customers";

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			rs.next(); // 다음 행을 선택
			System.out.println(rs.getString("customerName")); // 특정 열을 선택
			System.out.println(rs.getString("contactName")); // 특정 다른 열을 선택
			System.out.println(rs.getString("country"));

			rs.next();
			System.out.println(rs.getString("customerName")); // 특정 열을 선택
			System.out.println(rs.getString("contactName")); // 특정 다른 열을 선택
			System.out.println(rs.getString("country"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("link5")
	public void method5() {
		String sql = "SELECT * FROM Customers";

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			while (rs.next()) {
				System.out.println(rs.getString("customerName")); // 특정 열을 선택
				System.out.println(rs.getString("contactName")); // 특정 다른 열을 선택
				System.out.println(rs.getString("country"));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link6")
	public void method6() {
		String sql = "SELECT * FROM Products WHERE ProductID <= 3";

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				System.out.println(rs.getString("ProductID"));
				System.out.println(rs.getInt("ProductID"));
				System.out.println(rs.getString("Price"));
				System.out.println(rs.getString("price"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link7")
	public void method7(Model model) {
		String sql = "SELECT * FROM Customers WHERE CustomerID < 4";
		Map<String, Integer> info = new HashMap<>();

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				String customerName = rs.getString("CustomerName");
				int customerID = rs.getInt("CustomerID");
				info.put(customerName, customerID);

				model.addAttribute("customers", info);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("link8")
	public void method8(Model model) {
		String sql = "SELECT * FROM Customers WHERE CustomerID < 4";
		Map<String, Integer> info = new HashMap<>();

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				String customerName = rs.getString(2);
				int customerID = rs.getInt(1);
				// 테이블의 인덱스를 가지고 올 수도 있다
				// 7번 메소드와 같은 것임
				info.put(customerName, customerID);

				model.addAttribute("customers", info);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("link9")
	public void method9() {
		String sql = "SELECT LastName, FirstName FROM Employees WHERE EmployeeID < 4";

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				String lastName = rs.getString(1);
				String firstName = rs.getString(2);
				// 인덱스를 통해 데이터 뽑기
				// 내가 select할 때 순서가 last, fist 순으로 했으니까 1번이 last, 2번이 first인 것이다
				// 근데 반대로 적었으면 인덱스도 반대가 되었을 것이다

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@RequestMapping("link10")
	public void method10() {
		String sql = "SELECT CustomerID, CustomerName, Country FROM Customers ";

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			while (rs.next()) {
				int customerID = rs.getInt(1);
				String customerName = rs.getString(2);
				String country = rs.getString(3);
				System.out.println(customerID + ", " + customerName + ", " + country);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


}
