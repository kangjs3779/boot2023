package com.example.demo.component;

public class ComponentA {
	
	private ComponentB comp;
	// 빈을 만드는데 필요한 클래스다
	
	public ComponentA(ComponentB comp) {
		this.comp = comp;
	}
	
	public void setComp(ComponentB comp) {
		this.comp = comp;
	}
	
	public ComponentB getComp() {
		return comp;
	}
}
