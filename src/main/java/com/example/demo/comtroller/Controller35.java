package com.example.demo.comtroller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("sub35")
public class Controller35 {
	
	@GetMapping("ajax1")
	public void ajax1() {
		System.out.println("hello ajaxdmdkdkdkdk");
	}
	
	@GetMapping("link1")
	@ResponseBody //예전에는 view로 해석이 되었는데 응답의 body로 해석이 된다
	public String method1() {
		System.out.println("hello ajax");
		return "첫번째 응답 데이터";
	}
	
	@GetMapping("link2")
	public void method2() {
		System.out.println("get 요청 link2");
	}
	
	@GetMapping("link3")
	public void method3(@RequestParam("name") String name) {
		System.out.println("link3 working");
		System.out.println(name);
	}
	
	@GetMapping("link4")
	public void method4(String address) {
		System.out.println("link4 working");
		System.out.println("address : " + address);
	}
	
	@GetMapping("link5")
	public void method5(String name, Integer age) {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
	@GetMapping("link6")
	public void method6(String food, double price) {
		System.out.println("food: " + food);
		System.out.println("price: " + price);
	}
	
	@GetMapping("link7")
	public void method7(Dto1 dto) {
		System.out.println(dto);
	}
	
	@Data
	static class Dto1 {
		private String address;
		private String name;
		private Integer age;
	}
	
	@Data
	static class Dto2 {
		private Double price;
		private String product;
		private String category;
	}
	
	@GetMapping("link8")
	public void method8(Dto2 dto) {
		System.out.println(dto);
//		service.add(dto);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
