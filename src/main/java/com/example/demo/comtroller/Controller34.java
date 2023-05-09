package com.example.demo.comtroller;

import org.springframework.security.core.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sub34")
public class Controller34 {
	
	@GetMapping("mylogin")
	public void loginForm() {
		
	}
	
	@GetMapping("loginSuccess")
	public void loginSuccess() {
		
	}
	
	@GetMapping("viewAuth")
	public void viewAuth(Authentication authentication) {
		
		System.out.println("로그인 정보 확인하기");
		System.out.println(authentication.getName());
	}
}
