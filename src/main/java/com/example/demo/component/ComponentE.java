package com.example.demo.component;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component //이 어노테이션으로 인해 자동으로 스프링빈으로 만들어진다
public class ComponentE {
	
	@Autowired
	private ComponentD comp;
	//스프링 빈으로 만들었던 객체를 자동으로 할당을 해준다
	//자동으로 injection해준다
	
	public ComponentD getComp() {
		return comp;
	}
	
	//componentE라는 스프링빈에서 componentD라는 객체를 꺼냈을 떄
	
}
