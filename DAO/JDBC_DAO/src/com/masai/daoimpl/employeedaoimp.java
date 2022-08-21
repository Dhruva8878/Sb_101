package com.masai.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import com.masai.Connection.Demo;
import com.masai.dao.employeedao;
import com.masai.employee.Employee;
import com.masai.employee.EmployeeNotFound;


public class employeedaoimp implements employeedao {
    

	@Override
	public Employee getSalaryOfEmployee(int eid) throws EmployeeNotFound {
			
			Employee res=null;
			
			try(Connection conn=Demo.provideConnection()){
				
				PreparedStatement ps=conn.prepareStatement("select * from employee where eid=? ");
				
				ps.setInt(1, eid);
				
				ResultSet rs=ps.executeQuery();
				
				if(rs.next()) {
					int id=rs.getInt("eid");
					String n=rs.getString("name");
					String a=rs.getString("address");
					int s=rs.getInt("salary");
					
					res=new Employee(id,n,a,s);
					
				}
				else {
					throw new EmployeeNotFound("Employee is not found ");
				}
					
			}
			catch(SQLException e) {
				throw new EmployeeNotFound(e.getMessage());
			}
			
			return res;
				
		
	}

	@Override
	public List<Employee> getAllEmployee() {


		List<Employee> emp=new ArrayList<>();
		
		try(Connection conn=Demo.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from employee");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				int id=rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				
				 emp.add(new Employee(id,n,a,s));
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return emp;
	}
	

	@Override
	

	public String updateSalaryOfEmployees() throws EmployeeNotFound {
		String res="Not inserted...";
		
		try(Connection conn=Demo.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("update employee set salary=salary+500");
			
			int n=ps.executeUpdate();
			
			if(n>0) {
				res="Updated successfully";
			}
			else {
				throw new EmployeeNotFound("Syntax error");
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return res;
	}

	
	@Override
	public String insertDetails(Employee employee) throws EmployeeNotFound {
		
		String res="Not inserted...";
		
	
		
		try(Connection conn=Demo.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into employee(eid,name,salary) values(?,?,?)");
		    
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getName());
			ps.setInt(3,employee.getSalary());
			
			int n=ps.executeUpdate();
			if(n>0) {
				res="Inserted successfully";
			}
			else {
				throw new EmployeeNotFound("Please check Query");
			}
			
			
		
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return res;
	}

	
	@Override
	public List<Employee> getLess() {
		
		List<Employee> list=new ArrayList<>();
		
		try(Connection conn=Demo.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from employee where salary<80000");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				
				Employee emp=new Employee(id,n,a,s);
				list.add(emp);
				
			}
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}

	

}
