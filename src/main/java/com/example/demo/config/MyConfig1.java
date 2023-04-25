package com.example.demo.config;

import org.springframework.context.annotation.*;

import com.example.demo.component.*;
import com.example.demo.domain.*;

@Configuration
public class MyConfig1 {
	
	//여기에 스프링이 관리하는 객체를 적어주면 되겠다
	// 스프링이 이 메소드를 사용해서 객체를 만듦
	//스프링 빈 - 스프링이 관리하는 객체
	// 빈의 이름은 메소드의 이름과 같음
	//이걸 만들어서 어디에 넣어놓느냐 -> 
	@Bean
	public Object bean1() {
		return new Object();
	}
	
	@Bean
	public Employee employee() {
		return new Employee();
		//이런 이름의 이런 타입의 스프링 객체가 만들어져서 스프링 빈에 담김
	}
	
	@Bean
	public ComponentA bean2() {
		ComponentA o = new ComponentA(bean3());
		
		return o;
		
	}
	
	@Bean
	public ComponentB bean3() {
		return new ComponentB();
	}
	
	
	
	@Bean
	public ComponentC bean4() {
		ComponentC o = new ComponentC();
		o.setCom(bean3());
		return o;
	}
}
