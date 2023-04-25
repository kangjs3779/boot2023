package com.example.demo.component;

public class ComponentC {
	private ComponentB com;
	
	public void setCom(ComponentB com) {
		this.com = com;
	}
	
	public ComponentB getCom() {
		return com;
	}
	//이것의 객체를 만들기 위해서 config에 빈을 만듦
}
