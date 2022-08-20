package p2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.Connection.Demo;

public class Q_2 {
	
	public static void main(String[] args){
		
		
		try(Connection conn=Demo.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from employee");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int id=rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				System.out.println("Employee id -"+id);
				System.out.println("Employee name -"+n);
				System.out.println("Employee address -"+a);
				System.out.println("Employee salary -"+s);
				System.out.println("----------------------");
				
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
