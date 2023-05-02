package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper10 {

	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			WHERE country IN (

			<foreach collection="elems" item="elem" separator=", ">
				#{elem}
			</foreach>
			)
			</script>
			""")
	public Integer sql1(List<String> elems);

	@Select("""
			<script>
			SELECT
				SupplierName name,
				ContactName,
				address,
				city,
				postalCode,
				Country,
				Phone
			FROM Suppliers
			<where>
			<if test="countryList neq null">
			<foreach collection="country" item="list" separator=", ">
				#{list}
			</foreach>
			</if>
			</where>
			</script>
			""")
	public List<Supplier> sql2(List<String> country);

}
