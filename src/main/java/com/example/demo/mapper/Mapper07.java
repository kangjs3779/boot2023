package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper07 {
	
	@Select("""
			SELECT
				CustomerID id,
				CustomerName name,
				Address
			FROM Customers
			LIMIT #{startIndex}, 10
			""")
	List<Customer> selectAll(Customer customer);

	void slectPage(Integer page);
	
}
