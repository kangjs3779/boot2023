package com.example.demo.comtroller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub22")
public class Controller22 {
	
	@Autowired
	private Mapper03 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int count1 = mapper.spl1(77, "java");
		int count2 = mapper.spl1(5, "gtg");
		int count3 = mapper.spl1(8, "eee");
		
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		
	}
	
	@RequestMapping("link2")
	public void method2() {
		int count1 = mapper.sql2(3.15, "a");
		int count2 = mapper.sql2(2.55, "b");
	}
	
	@RequestMapping("link3")
	public void method3(double val1, String val2) {
		System.out.println(mapper.sql2(val1, val2));
	}
	
	@RequestMapping("link4")
	public void method4() {
		Dto09 dto = new Dto09();
		dto.setProp1(300);
		dto.setProp2("gkgk");
		dto.setProp3(3.14);
		
		int count = mapper.sql3(dto);
		System.out.println(count);
	}
	
	@RequestMapping("link5")
	public void method5(int age, String name, double score) {
		Dto10 dto = new Dto10();
		dto.setAge(age);
		dto.setName(name);
		dto.setScore(score);
		
		int count = mapper.sql4(dto);
		System.out.println(count);
	}
	
	@RequestMapping("link6")
	public void method6(Dto10 dto) {
		int count = mapper.sql4(dto);
		System.out.println(count);	
	}
	
	@RequestMapping("link7")
	public void method7(Dto09 dto) {
		int count = mapper.sql3(dto);
		System.out.println(count + "개 행 입력됨");
	}
	
	@RequestMapping("link8")
	public void method8() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setProp1(345);
		dto2.setName("라");
		dto1.setProp3(3.14);
		int cnt = mapper.sql5(dto1, dto2);
		System.out.println(cnt + "행 추가됨");
	}
	
	@RequestMapping("link9")
	public void method9() {
		Dto09 dto1 = new Dto09();
		dto1.setProp1(5);
		dto1.setProp2("gkgkgk");
		dto1.setProp3(5.55);
		Dto10 dto2 = new Dto10();
		dto2.setName("choi");
		dto2.setAge(88);
		dto2.setScore(7.254);
		
		int count = mapper.sql6(dto1, dto2);
		
		System.out.println(count);
		
	}
	
	//link10?prop1=1&prop2=lunch&prop3=3.14&age=8&name=ka&score=8.9
	@RequestMapping("link10")
	public void method10(Dto09 p1, Dto10 p2) {
		int count = mapper.sql6(p1, p2);
		System.out.println(count + "행 입력");
		
	}
	
	@RequestMapping("link11")
	@ResponseBody
	public String method11 (Dto11 dto) {
		System.out.println("prop1 : " + dto.getProp1());
		int count = mapper.sql7(dto);
		System.out.println(count + "행 입력 완료");
		System.out.println("prop1 : " + dto.getProp1());
		
		return dto.getProp1() + "번째 데이터 입력완료";
		//자동으로 증가하는 키값덕분에 아무리 같이 데이터를 입력을 해도 
		//중복 되지 않는다
	}
	
	//link12?age=40&name=son&score=9.9
	@RequestMapping("link12")
	public void method12 (Dto12 o) {
		System.out.println("auto id : " + o.getId());
		int count = mapper.sql8(o);
		System.out.println(count + "개 행 입력됨, auto id : " + o.getId());
	}
	
	
	
	
	
	
	
	
	
	
	
}
