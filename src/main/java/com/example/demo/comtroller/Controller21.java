package com.example.demo.comtroller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.util.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub21")
public class Controller21 {
	
	@Autowired
	private Mapper02 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		String sql = """
				SELECT CustomerName FROM Customers
				""";
		List<String> list = mapper.sql1();
		System.out.println(list);
		list.forEach(e -> System.out.println(e));
		//list를 만들어서 resultSet에 있는 데이터를 while문으로 돌려서 그 값을
		//list에 저장하는 이 과정을 mapper가 다해준다
	}
	
	@RequestMapping("link2")
	public void method2() {
		List<String> list = mapper.sql2();
		list.forEach(e -> System.out.println(e));
	}
	
	
	@RequestMapping("link3")
	public void method3() {
		List<Dto07> o = mapper.sql3();
		o.forEach(e -> System.out.println(e));
	}
	
	@RequestMapping("link4")
	public void method4() {
		List<Dto08> list = mapper.sql4();
		list.forEach(e -> System.out.println(e));
	}
	
	@RequestMapping("link5")
	public void method5(int cid) {
		List<String> list = mapper.sql5(cid);
		System.out.println(list);
	}
	
	@RequestMapping("link6")
	public void method6(String country) {
		List<String> list = mapper.sql6(country);
		System.out.println(list);
	}
	
	@RequestMapping("link7")
	public void method7(int cid) {
		List<Dto08> list = mapper.sql7(cid);
		list.forEach(e -> System.out.println(e));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
