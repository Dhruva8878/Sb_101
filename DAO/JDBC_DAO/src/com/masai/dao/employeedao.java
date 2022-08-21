package com.masai.dao;

import java.util.List;

import com.masai.employee.Employee;
import com.masai.employee.EmployeeNotFound;

public interface employeedao {

	public Employee getSalaryOfEmployee(int eid) throws EmployeeNotFound; 
	
	public List<Employee> getAllEmployee();
	
	public  String updateSalaryOfEmployees() throws EmployeeNotFound;
	
	public String insertDetails(Employee employee)throws EmployeeNotFound;
	
	public List<Employee> getLess();
	
}

