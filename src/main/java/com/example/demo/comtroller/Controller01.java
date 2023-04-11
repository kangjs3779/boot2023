package com.example.demo.comtroller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controller01 {
	
	//이 경로로 왔을 떄 이 메소드가 작동을 해야 한다
	@RequestMapping("/sub1/link1")
	public void method01() {
		System.out.println("일함!!!!");
	}
	
	@RequestMapping("/sub1/link2")
	public void method02() {
		System.out.println("sub1/link2에서 일을 한다");
	}
	
	@RequestMapping("/sub1/link3")
	public void method13() {
		System.out.println("sub1/link3에서 일을 한다");
	}
}
