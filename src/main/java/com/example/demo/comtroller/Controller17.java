package com.example.demo.comtroller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub17")
public class Controller17 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	// ?id=65&name=서태웅
	@RequestMapping("link1")
	public void method1(int id, String name) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET
					SupplierName = ?
				WHERE SupplierId = ?
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, name);
			pstmt.setInt(2, id);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 수정됨");

		}

	}

	// /sub17/link2?id=62&address=seoul
	// supplierid 가 62번인 공급자 주소(address)를 seoul로 바꾸는 메소드
	@RequestMapping("link2")
	public void method2(int id, String address) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET
					Address = ?
				WHERE SupplierId = ?
				""";

		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, address);
			pstmt.setInt(2, id);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 수정됨");

		}

	}

	@RequestMapping("link3")
	public void method3(Supplier supplier) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET
					SupplierName = ?,
					ContactName = ?,
					Address = ?,
					City = ?,
					PostalCode = ?,
					Country = ?,
					Phone = ?
				WHERE
					SupplierId = ?
				""";

		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, supplier.getName());
			pstmt.setString(2, supplier.getContactName());
			pstmt.setString(3, supplier.getAddress());
			pstmt.setString(4, supplier.getCity());
			pstmt.setString(5, supplier.getPostalCode());
			pstmt.setString(6, supplier.getCountry());
			pstmt.setString(7, supplier.getPhone());
			pstmt.setInt(8, supplier.getId());

			int cnt = pstmt.executeUpdate();
			System.out.println(supplier.getId() + "번 공급자 수정됨");

		}

	}

	// /sub17/link4?id=65
	@RequestMapping("link4")
	public void method4(int id, Model model) throws Exception {
		String sql = """
				SELECT
					SupplierId,
					SupplierName,
					ContactName,
					Address,
					City,
					PostalCode,
					Country,
					Phone
				FROM Suppliers
				WHERE SupplierId = ?
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setInt(1, id);
			try (ResultSet rs = pstmt.executeQuery();) {
				if (rs.next()) {
					Supplier supplier = new Supplier();
					supplier.setId(rs.getInt("supplierId"));
					supplier.setName(rs.getString("supplierName"));
					supplier.setContactName(rs.getString("contactName"));
					supplier.setAddress(rs.getString("address"));
					supplier.setCity(rs.getString("city"));
					supplier.setPostalCode(rs.getString("postalCode"));
					supplier.setCountry(rs.getString("country"));
					supplier.setPhone(rs.getString("phone"));
					model.addAttribute("supplier", supplier);
				}

			}

		}
	}
	
	//고객 조회
	@RequestMapping("link5")
	public void method5 (int id, Model model) throws Exception{
		String sql = """
				SELECT * FROM Customers WHERE CustomerID = ?
				""";
		
		try(
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setInt(1, id);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					Customer customer = new Customer();
					customer.setCustomerId(rs.getInt(1));
					customer.setCustomerName(rs.getString(2));
					customer.setContactName(rs.getString(3));
					customer.setAddress(rs.getString(4));
					customer.setCity(rs.getString(5));
					customer.setPostalCode(rs.getString(6));
					customer.setCountry(rs.getString(7));
					model.addAttribute("attr", customer);
				}
			}
			
		}
		
	}
	
	// 고객 정보 수정
	@RequestMapping("link6")
	public void method6(Customer customer) throws Exception {
		String sql = """
				UPDATE Customers
				SET
					CustomerId = ?,
					CustomerName = ?,
					ContactName = ?,
					Address = ?,
					City = ?,
					PostalCode = ?,
					Country = ?
				WHERE CustomerId = ?
				""";
		try(
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setInt(1, customer.getCustomerId());
			pstmt.setString(2, customer.getCustomerName());
			pstmt.setString(3, customer.getContactName());
			pstmt.setString(4, customer.getAddress());
			pstmt.setString(5, customer.getCity());
			pstmt.setString(6, customer.getPostalCode());
			pstmt.setString(7, customer.getCountry());
			pstmt.setInt(8, customer.getCustomerId());
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "수정완료");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
