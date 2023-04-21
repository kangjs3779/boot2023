package com.example.demo.comtroller;

import java.time.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;


@Controller
@RequestMapping("sub20")
public class Controller20 {
	@Autowired
	private Mapper01 mapper;
	//값할당은 스프링이 해준다
	
	@RequestMapping("link1")
	public void method1() {
		//mapper에 쿼리만 잘 넣어주면 다른 것들은 다 알아서 해준다
		//mybatis가 거의 다 알아서 해준다
		String name = mapper.method1();
		System.out.println(name);
		System.out.println(mapper.method2());
	}
	
	@RequestMapping("link2")
	public void method2() {
		
		//1번 공급자의 공급자명 출력
		System.out.println(mapper.method3());
	}
	
	@RequestMapping("link3")
	public void method3() {
		System.out.println(mapper.method4(3));
		// id가 3번인 고객의 이름이 출력되는 것을 확인할 수 있다
	}
	
	@RequestMapping("link4")
	public void method4(int customerId) {
		String name = mapper.method4(customerId);
		System.out.println(name);
		//쿼리스트링으로 customerid파라미터를 넣어주면 된다
	}
	
	@RequestMapping("link5")
	public void method5(int id) {
		System.out.println(mapper.method5(id));
	}

	@RequestMapping("link6")
	public void method6() {
		Integer price = mapper.method6();
		System.out.println(price);
		
		// mapper01 에  method7 작성
		// 하나의 row의 weight 컬럼의 값 리턴
		Double weight = mapper.method7();
		System.out.println(weight);
		
		LocalDate published = mapper.method8();
		System.out.println(published);
		
		LocalDateTime updated = mapper.method9();
		System.out.println(updated);
	}
	
	@RequestMapping("link7")
	public void method() {
		Dto06 res = mapper.method10();
		System.out.println(res);
	}
	
	@RequestMapping("link8")
	public void method8() {
		Dto05 res = mapper.method11();
		System.out.println(res);
	}
	//----------------------------------- 선생님 코드 복사
	
	@RequestMapping("link9")
	public void method9() {
		Customer cus = mapper.method12();
		System.out.println(cus);
	}
	
	@RequestMapping("link10")
	public void method10() {
		Supplier sup = mapper.method13();
		System.out.println(sup);
	}
	
	@RequestMapping("link11")
	public void method11() {
		Employee em = mapper.method14();
		System.out.println(em);
	}
}
