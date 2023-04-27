package com.example.demo.comtroller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub27")
public class Controller27 {
	
	@Autowired
	private Mapper07 mapper;
	
	@RequestMapping("link1")
	public void method1(Customer customer ,Model model) {
		List<Customer> list = new ArrayList<>();
		
		list = mapper.selectAll(customer);
		
		model.addAttribute("customerList", list);
		
	}
	
	
	
}
