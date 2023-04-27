package com.example.demo.comtroller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub26")
public class Controller26 {

	@Autowired
	private Mapper06 mapper;
	
	// /sub26/link1 --> 1페이지
	// /sub26/link1?page=1 --> 1페이지
	// /sub26/link1?page=3 --> 3페이지
	@GetMapping("link1")
	public String method1(@RequestParam(value="page", defaultValue="1") Integer page, Model model) {
		//param에 값이 두개가 들어가니까 생략할 수 없어서 다 써줌..?
		// if(page == null { page = 1} 이걸 줄여서 defaultValue로 써준다
		System.out.println(page);
		
		Integer startIndex = (page - 1) * 20;
		
		List<Customer> list = mapper.listCustomer(startIndex);
		
		model.addAttribute("customerList", list);
		
		return "/sub13/link1";
	}
}
