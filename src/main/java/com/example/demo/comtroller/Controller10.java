package com.example.demo.comtroller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub10")
public class Controller10 {
	
	@RequestMapping("link1")
	public void method1(@RequestParam String name) {
//		String name = request.getParameter("name"); 이게 생략된거임
		
	}
	
//	public void method1(String name) {
//	  이것과 같음	
//	}
	
	@RequestMapping("link2")
	public void method2(@ModelAttribute("value") Dto04 dto) {
//		Dto04 dto = new Dto04();
//		dto.setName(request.getParameter("name"));
//		dto.setAge(request.getParameter("age"));
//		
//		request.setAttribute("ato04", dto);
		
		//위 네줄이 생략된 것이다
		//요청서에서 name이라는 파라미터의 값을 꺼내서 프로퍼티에 세팅을 한 것이다
	}
	
	@RequestMapping("link3")
	public void method3(String model, double price, Dto04 obj) {
		// /sub10/link3?model=ray&price=3.14&name=son&age=22
		//model과 price는 requestParam 취급을 받고 하지만 모델에 추가하지 않았음
		//name과 age는 ModelAttribute 취급을 받아서 model에 붙어있음
	}
	
	//model을 통해서 꺼내보고 싶다면
	@RequestMapping("link4")
	public void method4(
						String model,
						double price,
						Dto04 obj,
						Model modelMap
						) {
		modelMap.addAttribute("model", model);
		modelMap.addAttribute("price", price);
		
	}
	
	@RequestMapping("link5")
	public void method5() {
		//1. request param 수집 가공
		
		//2. business logic
		//data 생성(create), 읽기(read), 수정(update), 삭제(delete)
		//crud
		
		
		//3. add attribute
		
		//4. forward
	}
	
	
}
