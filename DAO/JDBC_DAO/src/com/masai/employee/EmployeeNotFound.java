package com.masai.employee;

public class EmployeeNotFound extends Exception {
	
	public EmployeeNotFound() {
		
	}
	public EmployeeNotFound(String message){
		super(message);
	}

}
