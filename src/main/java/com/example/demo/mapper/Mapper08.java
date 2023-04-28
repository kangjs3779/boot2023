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
}
