package com.masai.utility;

import java.util.List;

import com.masai.dao.employeedao;
import com.masai.daoimpl.employeedaoimp;
import com.masai.employee.Employee;

public class EmplList {
	
	public static void main(String[] args) {
		
		employeedao emp=new employeedaoimp();
		
		List<Employee> employee1=emp.getAllEmployee();
		
		  employee1.forEach(e->System.out.println(e));
			
		
	}

}
