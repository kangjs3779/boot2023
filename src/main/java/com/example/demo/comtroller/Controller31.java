package com.example.demo.comtroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub31")
public class Controller31 {
	
	@Autowired
	private Mapper11 mapper;
	
	@GetMapping("link1")
	public void method1() {
		// A고객의 돈 500원 차감
		mapper.minusA();
		// B고객의 돈 500원 증가
		mapper.plusB();
		
	}
	
	@GetMapping("link2")
	public void method2() {
		mapper.minusA();
		
		int a = 3 / 0; //예외 발생(runtime exception)
		
		mapper.plusB();
	}
	
	@GetMapping("link3")
	@Transactional
	public void method3() {
		mapper.minusA();
		
		int a = 3 / 0; //예외 발생(runtime exception)
		
		mapper.plusB();
	}
	
	@GetMapping("link4")
	@Transactional(rollbackFor = Exception.class)
	public void method4() throws Exception {
		mapper.minusA();
		
		Class.forName("java.lang.String2"); //checked exception
		
		mapper.plusB();
	}
}
