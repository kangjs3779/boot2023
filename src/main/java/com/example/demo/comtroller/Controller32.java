package com.example.demo.comtroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub32")
public class Controller32 {
	
	@Autowired
	private Mapper12 mapper;
	
	@GetMapping("link1")
	public void method1(int id) {
		// 1번 카테고리 정보
		Category category = mapper.sql1(id);
		System.out.println(category);
		category.getProducts1().forEach(e -> System.out.println(e));
	}
	
	@GetMapping("link2")
	public void method2(int id) {
		Category category = mapper.sql2(id);
		System.out.println(category);
		category.getProducts2().forEach(e -> System.out.println(e));
	}
	
	
	@GetMapping("link3")
	public void method3(int id) {
		Supplier supplier = mapper.sql3(id);
		
		System.out.println(supplier);
		supplier.getProducts().forEach(e -> System.out.println(e));
	}
}






