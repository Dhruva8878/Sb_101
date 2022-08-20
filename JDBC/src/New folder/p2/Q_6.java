package p2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.masai.Connection.Demo;

public class Q_6 {
	
public static void main(String[] args) {
		

		
	       try(Connection conn=Demo.provideConnection()){	
	
			PreparedStatement ps=conn.prepareStatement("select * from employee where salary<80000 ");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				int r= rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s= rs.getInt("salary");
				
				System.out.println("Employee id -"+r);
				System.out.println("Employee name -"+n);
				System.out.println("Employee address -"+a);
				System.out.println("Salary is -" +s);
				System.out.println("---------------------");
			}
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
