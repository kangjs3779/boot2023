package com.example.demo.domain;

import lombok.*;

@Data
public class Employee {
	private int employeeId;
	private String lastName;
	private String firstName;
	private String birthDate;
	private boolean photo;
	private String notes;
	
}
