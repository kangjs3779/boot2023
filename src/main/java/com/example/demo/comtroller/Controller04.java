package com.example.demo.comtroller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub4")
public class Controller04 {
	//method argument(parameter) 
	
		//요청 경로 : /sub4/link1
		@RequestMapping("link1")
		public void method01(HttpServletRequest request) {
		//1. requrst parameter 수집/가공
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
			
		}
		
		//코드복사
		
		@RequestMapping("link4")
		public void method03(@RequestParam("age") int age) {
			System.out.println("나이는 " + age);
		}
		
		//2. business logic
		
		//3. add attribute
		
		//4. forward / redirect
}
