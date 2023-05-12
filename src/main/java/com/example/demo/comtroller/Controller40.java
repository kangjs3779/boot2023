package com.example.demo.comtroller;

import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub40")
public class Controller40 {

	@GetMapping("view")
	public void view() {
		
	}
	
	@GetMapping("link1")
	@ResponseBody
	public String method1() {
		return "hello ajax";
	}
	
	@GetMapping("link2")
	@ResponseBody
	public ResponseEntity method2() {
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("link3")
	public ResponseEntity method3() {
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("link4")
	public ResponseEntity method4() {
		return ResponseEntity.internalServerError().build();
	}
	
	/*
	@GetMapping("link5")
	public ResponseEntity method5() {
		boolean ok = service.method();
		if (ok) {
			return ResponseEntity.ok();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	*/
	
	@GetMapping("link9")
	@ResponseBody
	public String method9() {
		return "hello ajax!";
	}
	
	@GetMapping("link10")
	@ResponseBody
	public LocalTime method10() {
		LocalTime time = LocalTime.now();
		return time;
	}
	
	@GetMapping("link11")
	@ResponseBody
	public Map<String, Object> method11() {
		return Map.of("name", "채소연", "age", 22);
	}
	
	@GetMapping("link12")
	@ResponseBody
	public Map<String, Object> method12() {
		return Map.of("address","korea","city","seoul","phone","1010101");
	}
	
	@GetMapping("link13")
	@ResponseBody
	public List<String> method13() {
		return List.of("강백호","채치주","송태섭");
	}
	
	@Autowired
	private Mapper02 mapper02;
	
	@GetMapping("link14")
	@ResponseBody
	public List<Dto08> method14(Integer cid) {
		return mapper02.sql7(cid);
	}
	
}









