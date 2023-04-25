package com.example.demo.comtroller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.*;

@Controller
@RequestMapping("sub25")
public class Controller25 {
	// path = value랑 같은 것임
	@RequestMapping(path = "link1", method = RequestMethod.GET)
	public void method1() {
		System.out.println("link1일함");
	}
	
	//@RequestMapping(value = "link2", method = RequestMethod.GET)
	//@@GetMapping("link2")
	//같을 일을 한다
	@GetMapping("link2")
	public void method2() {
		System.out.println("link2일함");
	}
	
	// @RequestMapping(value = "link3", method = RequestMethod.POST)
	@PostMapping("link3")
	public void method3() {
		System.out.println("link3일함");
	}
	
	// /sub25/link4/abc
	// /sub25/link4/def
	@GetMapping("link4/{var1}")
	public void method4(@PathVariable("var1") String p1) {
		System.out.println("var1 : " + p1);
	} 
	
	// /sub25/link5/abc/55
	@GetMapping("link5/{id}/{age}")
	public void method5(@PathVariable("id") String id,
			@PathVariable("age") int age) {
		System.out.println(id + ", " + age);
	}
	
	// /sub25/link6/id/3/name/son
	@GetMapping("link5/id/{var1}/name/{var2}")
	public void method6(@PathVariable("var1") String id,
			@PathVariable("var2") String name) {
		System.out.println(id + ", " + name);
	}
	
	@GetMapping("link7")
	public String method7(Model model) {
		model.addAttribute("model", "model이 붙어감");
		return "/sub25/hello";
	}
	// /WEB-INF/views/hello.jsp로 포워드 된다
	
	@GetMapping("link8")
	public String method8() {
		return "redirect:/sub25/link7";
	}
	// link8로 요청을 보내면 개발자도구를 켠 상태에서
	// 응답에 link7로 보냈다는 게 뜸
	// 최종 주소창은 linl7이고 hello.jsp를 찾지 못했다는 메세지가 뜬 것을 확인할 수 있다
	
	
	@GetMapping("link9")
	public String method9(Model model) {
		model.addAttribute("attr1", "value1");
		
		return "redirect:link10";
	}
	
	@GetMapping("link10")
	public void method10() {
	}
	// method9에 있는 model을 받아올 수 있는가? 안된다
	// model은 request에 담겨서 전달이 되는데
	//redirect는 새로운 요청으로 보내는 것이라서 전달이 안된다
	// 완전히 다른 요청이기 때문에
	
	@GetMapping("link11")
	public String method11(RedirectAttributes attr) {
		attr.addFlashAttribute("attr1", "rediect attribute");
		// 이렇게 적어주면 새로운 요청으로 보낸다고 해도 이 속성이 같이 건네진다
		// 그냥 model쓰듯이 쓰면 된다
		// 두번째 파라미터가 OBJECT타입이라서 뭐든 들어갈 수 있다
		
		return "redirect:link10";
	}
	
	@GetMapping("link12")
	public String method12(RedirectAttributes re) {
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("hello");
		re.addFlashAttribute("list", list);
		
		return "redirect:link13";
	}
	
	@GetMapping("link13")
	public void method13() {
		
	}
	
	@GetMapping("link14")
	public String method14(RedirectAttributes rttr) {
//		rttr.addFlashAttribute(null, rttr); 
		// 목적지(return에 작성된 경로)의 model attribute로 넘겨주고
		
		rttr.addAttribute("address", "seoul");
		//쿼리스트링으로 붙어서 넘겨준다
		
		return "redirect:link15";
	}
	
	@GetMapping("link15")
	public String method15(RedirectAttributes re) {
		re.addAttribute("email", "kangjs3779@naver.com");
		re.addAttribute("location", "이대중앙");
		
		
		return "redirect:link16";
	}
	
	@GetMapping("link16")
	public void method16(@RequestParam("email") String email,
			@RequestParam("location") String location) {
		System.out.println("email:" + email);
		System.out.println("location:" + location);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
