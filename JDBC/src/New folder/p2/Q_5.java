package p2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.masai.Connection.Demo;

public class Q_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of employee to get salary");
		int id=sc.nextInt();
		
	       try(Connection conn=Demo.provideConnection()){	
	
			PreparedStatement ps=conn.prepareStatement("select * from employee where eid = ? ");
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				int r= rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s= rs.getInt("salary");
				
				System.out.println("Employee id -"+r);
				System.out.println("Employee name -"+n);
				System.out.println("Employee address -"+a);
				System.out.println("Salary is -" +s);
			}
			else {
				System.out.println("Employee is not exist");
			}
			
			
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
