package com.example.demo.comtroller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub28")
public class Controller28 {
	
	@Autowired
	private Mapper08 mapper;
	
	// path : /sub28/link1?keyword=%ell% (x)
	// path : /sub28/link1?keyword=ell (o)
	@GetMapping("link1")
	public String method1(
			@RequestParam(value = "keyword", defaultValue = "") String keyword,
			Model model) {
		List<Customer> list = mapper.sql1(keyword);
		
		model.addAttribute("customerList", list);
		return "/sub13/link1";
	}
	
	@GetMapping("link2")
	public void method2(
			@RequestParam(value = "search", defaultValue = "") String search,
			Model model) {
		List<Employee> list1 = mapper.sql2(search);
		
		model.addAttribute("list1", list1);
		
		List<Employee> list2 = mapper.sql3("%" + search + "%");
		
		model.addAttribute("list2", list2);
		
	}
}
