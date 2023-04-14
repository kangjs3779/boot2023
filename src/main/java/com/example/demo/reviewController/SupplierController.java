package com.example.demo.reviewController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.reviewName.Supplier;

@Controller
@RequestMapping("review1")
public class SupplierController {
	
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;
	
	//아이디, 이름, 국적, 주소, 번호, 계약 이름이 표시되고
	//계약이름은 파란색으로 표시하도록 한다 
	@RequestMapping("SuppliersSearch")
	public void method1 () {
		
//		return "/review1/SuppliersINFO";
	}
	
	
	@RequestMapping("SuppliersINFO")
	public void method2 (@RequestParam String id, Model model) throws Exception {
		String sql = "SELECT SupplierID, SupplierName, Country, Address, Phone, ContactName "
				+ "FROM Suppliers " + "WHERE SupplierID = ?";
		List<Supplier> supplierList = new ArrayList<>();
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Supplier supplier = new Supplier();
			supplier.setSupplierID(rs.getString(1));
			supplier.setSupplierName(rs.getString(2));
			supplier.setCountry(rs.getString(3));
			supplier.setAddress(rs.getString(4));
			supplier.setPhone(rs.getString(5));
			supplier.setContactName(rs.getString(6));
			
			supplierList.add(supplier);
		}
		
		model.addAttribute("suppliers", supplierList);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
