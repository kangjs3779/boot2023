package com.example.demo.domain;

import java.time.*;

public class Dto05 {
	private String name;
	private int age;
	private double price;
	private LocalDate birth;
	private LocalDateTime inserted;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public LocalDateTime getInserted() {
		return inserted;
	}
	public void setInserted(LocalDateTime inserted) {
		this.inserted = inserted;
	}
	
	
	
}
