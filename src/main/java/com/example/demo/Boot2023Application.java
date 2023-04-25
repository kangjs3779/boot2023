package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;

import com.example.demo.component.*;

@SpringBootApplication
public class Boot2023Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot2023Application.class, args);
		Object o = context.getBean("bean1");
		System.out.println(o);
		
		// 자바 파일로 설정 파일을 만들어준다
		// 설정 파일이 어딨느냐 -> 보통 com.example.demo의 하위 패키지 안에 만드는데
		// 보통 config라고 한다
		//run메소드가 실행하면 ApplicationContext타입을 리턴한다
		Object o2 = context.getBean("employee");
		Object o3 = context.getBean("employee");
		System.out.println(System.identityHashCode(o2));
		System.out.println(System.identityHashCode(o3));
		//객체는 하나만 만들어진다
		//해시코드가 같은 것을 확인 할 수 있다
		Object o4 =  context.getBean("bean2");
		Object o5 =  context.getBean("bean3");
		
		System.out.println(o4);
		System.out.println(o5);
		
		ComponentA c1 = (ComponentA) o4;
		System.out.println(c1.getComp());
		// 여러번 사용을 해도 객체는 하나만 만들어진다

		ComponentC c3 = (ComponentC) context.getBean("bean4");
		System.out.println(c3.getCom());
		
		Object c4 = context.getBean("componentD");
		System.out.println(c4);
		//따로 메소드를 만들지 않았는데도 객체가 만들어진 것을 확인할 수 있다
		
		ComponentE c5 = (ComponentE) context.getBean("componentE");
		System.out.println(c5.getComp());
		
	}
	
	// 우리가 객체를 직접 만들 때
	public void legacy() {
		Object 0 = new o Object(); // 직접 만든 객체
		Employee e = new Employee(); // 직접 만든 객체
		
		e.setEmployeeId(100); //프로퍼티 직접 할당
		
		
		
		
	}
}
