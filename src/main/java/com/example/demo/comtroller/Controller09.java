package com.example.demo.comtroller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub9")
public class Controller09 {
	
	@RequestMapping("link1")
	public String method01(HttpServletRequest req, Model model) {
		//1. request parameter 수집 가공
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		//파라미터의 값을 뽑아서 int로 변환해서 프로퍼티 age로 넣어준 것이다
		
		Dto04 obj = new Dto04();
		obj.setName(name);
		obj.setAge(age);
		
		//2. business logic
		
		//3. add attribute
		model.addAttribute("value", obj);
		
		//4. forward / redirect
		// /WEB-INF/views/sub9/link1.jsp로 포워드
		return "/sub9/link1";
	}
	
	
	@RequestMapping("link2")
	public String method02(@ModelAttribute("value") Dto04 obj) {
		//따로 set으로 값을 할당해주지 않아도 쿼리 스트링을 적는 것만으로도
		//값을 할당해주는 것과 같은 일을 한다
		// /sub9/link2?name=park&age=18
		
		return "/sub9/link1";
	}
	
	@RequestMapping("link3")
	public void method3(@ModelAttribute("attr") Dto04 dto) {
		// /sub9/link3?name=choi&age=80
		//1. request param 수집 가공
		//Dto04 객체 만듦
		//name 요청 파라미터를 위 객체에 셋팅
		//age 요청 파라미터를 위 객체에 셋팅
		//simple property일 경우에는 requestParameter로 간주한다
		//기본타입 String은 requestPatameter로 간주되고 그렇지 않으면 model attribute로 간주 된다
		
		//3. add attribute 추가
		//위 객체를 attr 이름으로 model 추가
		
		//4. forward / redirect
		// /WEB-INF/views/sub9/link3.jsp로 포워드
	}
	
	
	@RequestMapping("link4")
	public void method4(String name, Model model) {
		// /WEB-INF/views/sub9/link4.jsp로 포워드
		// 객체를 dot04라는 이름으로 model 추가
		model.addAttribute("name1", name);
		//원래는 http~~덕분에 컨트롤러에서 jsp로 바로 보여주는 기능을 함
		//2번은 요청서에 name이라는 속성이름을 붙여주고 그 값으로 쿼리 스트링으로 넣어줌
		//1번은 model을 통해서 접근을 한 것임
		//컨트롤러가 요청서를 받았고 그 요청서에는 name이라는 속성이 붙어있음
		//모델에도 이걸 붙여줘야 view한테 보여줄 수 있음
		//그래서 model이라는 객체를 만들어서 객체를 통해 name이라는 속성을 또 만들어서 그안에 name값을 넣어줌
		//1번은 그래서 model을 통해 접근한 name값이 되는 것임
		//근데 왜 ${param.name }이라고 적어야 하느냐?? 원래는 http를 써서 그게 param을 쓰지 않아도 요청서에 있는 name의 값을 출력하도록 했는데
		//http타입이 아니기 때문에 param을 적어줘야 하는 것이다
	}
	
	@RequestMapping("link5")
	public void method5(Dto02 dto) {
		// 경로 = /sub9/link5?model=ipad&price=300&company=apple
		//jsp 작성
		
	}
}
