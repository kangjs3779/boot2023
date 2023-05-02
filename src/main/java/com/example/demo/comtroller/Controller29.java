package com.example.demo.comtroller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub29")
public class Controller29 {
	
	@Autowired
	private Mapper10 mapper;
	
	@GetMapping("link1")
	public void method1() {
		mapper.sql1(List.of("UK", "USA"));
	}
	
	@GetMapping("link2")
	public void method2() {
		List<Supplier> list1 = mapper.sql2(List.of("UK", "USA", "Japan"));
		list1.forEach(e -> System.out.println(e));
		
		List<Supplier> list2 = mapper.sql2(List.of("Brazil", "Germany"));
		list2.forEach(e -> System.out.println(e));
	}
	
	@GetMapping("link3")
	public void method3() {
		
	}
	
	@GetMapping("link4")
	public void method4(@RequestParam(value = "country", required = false) List<String> country) {
		System.out.println(country);
		// List<String> country라고 파라미터를 적으면 오류가 난다
			mapper.sql2(country).forEach (e -> System.out.println(e));			
		
	}
	
	
}
