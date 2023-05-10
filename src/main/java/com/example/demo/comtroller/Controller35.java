package com.example.demo.comtroller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

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
}
