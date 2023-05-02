package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper12 {

	@Select("""
			SELECT
				c.CategoryID,
				c.CategoryName,
				c.Description,
				p.ProductName
			FROM Categories c JOIN Products p
			ON c.CategoryId = p.CategoryId
			WHERE c.CategoryId = #{id}
			""")
	@ResultMap("categoryResult")
	Category sql1(int id);
	
	@Select("""
			SELECT
				c.CategoryID,
				c.CategoryName,
				c.Description,
				p.ProductName,
				p.Price
			FROM Categories c JOIN Products p
							  ON c.CategoryId = p.CategoryId
			WHERE c.CategoryId = #{id}
				
			""")
	@ResultMap("categoryResultMap")
	Category sql2(int id);
	
	@Select("""
			SELECT  
				s.SupplierId,
				s.SupplierName,
				s.contactName,
				s.address,
				s.city,
				s.postalCode,
				s.country,
				s.phone,
				p.productName,
				p.Price
			FROM Suppliers s JOIN Products p
									  ON s.SupplierID = p.SupplierID
			WHERE s.SupplierID = #{id}
			""")
	@ResultMap("supplierResultMap")
	Supplier sql3(int id);
	
	
}





