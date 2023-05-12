package com.example.demo.comtroller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("sub37")
public class Controller37 {
	
	@GetMapping("view")
	public void method() {
	
	}
	
	@PostMapping("link1")
	public void method1(@RequestBody Dto1 map) {
		System.out.println(map.getName());
		System.out.println(map.getAge());
	}
	
	@Data
	static class Dto1 {
		private String name;
		private Integer age;
	}
	
	@Data
	static class Dto2 {
		private String name;
		private String email;
		private Double score;
		private Boolean married;
	}
	
	@PostMapping("link2")
	public void method2(@RequestBody Dto2 dto) {
		System.out.println(dto);
	}
	
	@PostMapping("link3")
	public void method3(@RequestBody Dto3 dto) {
		System.out.println(dto);
	}
	
	@Data
	static class Dto3 {
		private String name;
		private List<String> hobby;
	}
	
	@PostMapping("link4")
	public void method4(@RequestBody Dto4 dto) {
		System.out.println(dto.getPhone().get(2));
	}
	
	@Data
	static class Dto4 {
		private String name;
		private List<String> Phone;
	}
	
	@PostMapping("link5")
	public void method5(@RequestBody Dto5 dto) {
		System.out.println(dto);
	}
	
	@Data
	static class Dto5 {
		private String title;
		private String publisher;
//		private Map<String, Object> writer; map으로 받거나
		private Dto1 writer; //빈으로 받거나
	}
	
	@PostMapping("link6")
	public void method6(@RequestBody Dto6 dto) {
		System.out.println(dto);
		System.out.println(dto.getEtc().getName());
	}
	
	@Data
	static class Dto6 {
		private String city;
		private Integer price;
		private Dto2 etc;
	}
	
	@PostMapping("link7")
	public void method7(@RequestBody List<Dto1> dto) {
		dto.forEach(e -> System.out.println(e));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
