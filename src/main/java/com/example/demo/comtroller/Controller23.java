package com.example.demo.comtroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub23")
public class Controller23 {
	
	@Autowired
	private Mapper04 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int count = mapper.sql1();
		System.out.println(count);
	}
	
	@RequestMapping("link2")
	public void method2() {
		int count = mapper.sql2(5);
		System.out.println(count + "개 행 삭제됨");
	}
	
	@RequestMapping("link3")
	public void method3(int key) {
		int count = mapper.sql3(key);
		System.out.println(count + "개 행 삭제했다고!!");
	}
}
