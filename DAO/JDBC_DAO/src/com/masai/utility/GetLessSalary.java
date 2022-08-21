package com.masai.utility;

import java.util.List;

import com.masai.dao.employeedao;
import com.masai.daoimpl.employeedaoimp;
import com.masai.employee.Employee;

public class GetLessSalary {
	
	public static void main(String[] args) {
		
		employeedao emp=new employeedaoimp();
		
		List<Employee> list=emp.getLess();
		
		list.forEach(e->System.out.println(e));
	}

}
