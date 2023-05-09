package com.example.demo.comtroller;

import org.springframework.security.access.prepost.*;
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
	
	@GetMapping("customCheck")
	@PreAuthorize("@securityUtil.checkBoardWriter(authentication, #id)")
	public void customCheck(String id) {
		System.out.println("custom 실행 중");
	}
}
