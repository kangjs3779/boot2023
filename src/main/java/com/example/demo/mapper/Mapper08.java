package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper08 {

	@Select("""
			<script>
			<bind name="pattern" value="'%' + keyword + '%'" />
			SELECT
				customerID id,
				customerName name,
				contactName,
				address
			FROM
				Customers
			WHERE
				CustomerName LIKE #{pattern}
			ORDER BY id DESC
			</script>
			""")
	List<Customer> sql1(String keyword);
	// 우리는 %ell%을 원함

	@Select("""
			<script>
			<bind name="pattern" value="'%' + search + '%'" />
			SELECT 
				lastName, 
				firstName
			FROM Employees
			WHERE LastName LIKE #{pattern}
				OR FirstName LIKE #{pattern}
			</script>
						""")
	List<Employee> sql2(String search);
	
	@Select("""
			SELECT
				lastName,
				FirstName
			FROM Employees
			WHERE LastName LIKE #{search}
				OR FirstName LIKE #{search}
			""")
	List<Employee> sql3(String search);

	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			
			<if test="false">
			WHERE CustomerID = 10
			</if>
			</script>
			""")
	Integer sql4();
	
	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			
			<if test="keyword neq null">
				<bind name="pattern" value="'%' + keyword + '%'" />
				WHERE CustomerName LIKE #{pattern}
			</if>
			</script>
			
			""")
	Integer sql5(String keyword);

	@Select("""
			<script>
			SELECT AVG(Price)
			FROM Products
			
			<if test="i gt 0">
			WHERE CategoryId = #{i}
			</if>
			</script>
			""")
	Double sql6(int i);
}
