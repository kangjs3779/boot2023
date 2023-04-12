package com.example.demo.comtroller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub8")
public class Controller08 {
	
	@RequestMapping("link1")
	public String method1(@ModelAttribute("val") Dto04 dto04) {
		dto04.setName("채소연");
		dto04.setAge(52); 
		return "/sub7/link10";
	}
	
	@RequestMapping("link2")
	public void method2(@ModelAttribute("product") Dto02 obj) {
		obj.setCompany("apple");
		obj.setModel("ipad");
		obj.setPrice(300);
	}
	
	@RequestMapping("link3")
	public void method3(Model model) {
		Dto02 dto02 = new Dto02();
		Dto03 dto03 = new Dto03();
		model.addAttribute("product", dto02);
		model.addAttribute("member", dto03);
		
	}
	
	@RequestMapping("link4")
	public void method4(@ModelAttribute("product") Dto02 dto02,
						@ModelAttribute("member") Dto03 dto03) {
		//add attribute
		//forward
		//이 두개가 모두 된 것이다
		dto02.setCompany("애플");
		dto03.setName("강");
		
	}
	
	
	@RequestMapping("link5")
	public void method5(@ModelAttribute Dto02 dto02,
						@ModelAttribute Dto03 dto03) {
		//model attribute의 이름을 생략하면 클래스이름이 lowerCamelCase로 속성의 이름이 된다
		//자바빈의 이름이 CompanyName이었으면 attribute의 이름은 companyName이 된다
		dto02.setCompany("microsoft");
		dto03.setName("bill gates");
	}
}
