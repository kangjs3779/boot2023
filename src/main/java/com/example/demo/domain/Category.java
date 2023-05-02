package com.example.demo.domain;

import java.util.*;

import lombok.*;

@Data
public class Category {
	
	private Integer id;
	private String name;
	private String description;
	
	private List<String> products1;
	
	private List<Product> products2;
	//두개의 필드(컬럼)을 받아야 하니까 타입은 자바빈
}
