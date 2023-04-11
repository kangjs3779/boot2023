package com.example.demo.comtroller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub3")
public class Controller03 {
	
	//spring mvc request handler method
	
	
	@RequestMapping("link1")
	public void method01() {
		System.out.println("경로03-01이다ㅏㅏㅏ");
	}
	
	@RequestMapping("link2")
	public void method02() {
		System.out.println("경로03-02이다ㅏㅏㅏ");
	}
}
