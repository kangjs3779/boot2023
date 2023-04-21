package com.example.demo.comtroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub24")
public class Controller24 {
	
	@Autowired
	private Mapper05 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int count = mapper.sql1();
		System.out.println(count);
	}
	
	@RequestMapping("link2")
	public void method2() {
		int count = mapper.sql2(3, "마이바티스", 98765);
		System.out.println(count + "개 행 변경됨");
	}
	
	@RequestMapping("link3")
	public void method3() {
		int count = mapper.sql3(10, "새로운 고객명", "대한민국");
		System.out.println(count + "개 행 변경됨");
	}
	
	@RequestMapping("link4")
	public void method4() {
		Customer customer = new Customer();
		customer.setId(9);
		customer.setCity("서울");
		customer.setCountry("대한민국");
		customer.setContactName("강백호");
		customer.setPostalCode("3333");
		
		int count = mapper.sql4(customer);
	}
	
	@RequestMapping("link5")
	public void method5(Customer customer) {
		int count = mapper.sql4(customer);
		System.out.println(count + "개 행 수정됨");
	}
	
	@RequestMapping("link6")
	public void method6(int id, Model model) {
		Customer customer = mapper.sql5(id);
		model.addAttribute("customer", customer);
	}
	
	@RequestMapping("link7")
	public void method7(int id, Model model) {
		//여기서 조회
		Employee employee = mapper.sql6(id);
		model.addAttribute("employee", employee);
	}
	
	@RequestMapping("link8")
	public void method8(Employee employee) {
		//여기서 변경
		int count = mapper.sql7(employee);
		System.out.println(count + " 변경 성공");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
