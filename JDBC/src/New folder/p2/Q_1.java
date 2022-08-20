package p2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.masai.Connection.Demo;


public class Q_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of employee to get salary");
		int id=sc.nextInt();
		
	       try(Connection conn=Demo.provideConnection()){	
	
			PreparedStatement ps=conn.prepareStatement("select salary from employee where eid = ? ");
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				int r= rs.getInt("salary");
				
				System.out.println("Salary is =" +r);
				System.out.println("===========");
			}
			else {
				System.out.println("Employee is not exist");
			}
			
			
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
