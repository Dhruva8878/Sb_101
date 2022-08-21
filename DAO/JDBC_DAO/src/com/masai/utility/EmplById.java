package com.masai.utility;


import java.util.Scanner;

import com.masai.dao.employeedao;
import com.masai.daoimpl.employeedaoimp;
import com.masai.employee.Employee;
import com.masai.employee.EmployeeNotFound;

public class EmplById {
	
	public static void main(String[] args) throws EmployeeNotFound {
		
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		
		employeedao emp=new employeedaoimp();
		
		Employee employee=emp.getSalaryOfEmployee(id);
		
		System.out.println(employee);
		
		
		
		
	}

}
