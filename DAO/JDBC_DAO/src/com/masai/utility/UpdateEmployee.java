package com.masai.utility;

import com.masai.dao.employeedao;
import com.masai.daoimpl.employeedaoimp;
import com.masai.employee.EmployeeNotFound;

public class UpdateEmployee {
	
	public static void main(String[] args) throws EmployeeNotFound {
		
		employeedao emp=new employeedaoimp();
		
		String ans=emp.updateSalaryOfEmployees();
		
		System.out.println(ans);
	}

}
