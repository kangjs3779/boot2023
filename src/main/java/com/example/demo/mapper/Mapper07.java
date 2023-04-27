package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper07 {
	
	@Select("""
			SELECT
				CustomerName name,
				Address
			FROM Customers
			LIMIT 0, 20
			""")
	List<Customer> selectAll(Customer customer);
	
}
