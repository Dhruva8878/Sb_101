package com.masai.utility;

import java.util.Scanner;

import com.masai.dao.employeedao;
import com.masai.daoimpl.employeedaoimp;
import com.masai.employee.Employee;
import com.masai.employee.EmployeeNotFound;

public class InsertDetails {
	
	public static void main(String[] args) throws EmployeeNotFound {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String n=sc.next();
		System.out.println("Enter salary");
		int sal=sc.nextInt();
		
		
		
		employeedao emp=new employeedaoimp();
		
		Employee employee=new Employee();
		employee.setEid(id);
		employee.setName(n);
		employee.setSalary(sal);
		
		
		String ans=emp.insertDetails(employee);
		
		System.out.println(ans);
	}

}
