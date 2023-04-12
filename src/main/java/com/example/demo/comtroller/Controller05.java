package com.example.demo.comtroller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub5")
public class Controller05 {
	
	// 경로 : /sub5/link1?name=강백호&age=33&score=33.3
	//이건 get방식임 post방식은 form을 만들어야 함
	@RequestMapping("link1")
	public void method1(@RequestParam("name") String name,
						@RequestParam("age") int age,
						@RequestParam("score") double score) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
	}
	
	@RequestMapping("link2")
	public void method2(String name, int age, double score) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
	}
	
	@RequestMapping("link3")
	public void method3(String address, double height, double width) {
		//컨트롤러가 하는 일
		//1. request param 얻기/ 가공
		//2. business logic 실행
		//3. add attribute
		//4. forward/ redirect
		System.out.println(address);
		System.out.println(height);
		System.out.println(width);
	}
}
