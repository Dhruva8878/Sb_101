package p2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.masai.Connection.Demo;

public class Q_4 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String n=sc.next();
		System.out.println("Enter salary");
		int s=sc.nextInt();
		
		try (Connection conn=Demo.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into employee(eid,name,salary) values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, n);
			ps.setInt(3, s);
			
			ps.executeQuery();
			
			System.out.println("Insert Successfully");
			
		} catch (SQLException e) {
			e.getStackTrace();
		}
	}

}
