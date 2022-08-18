package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String src="jdbc:mysql://localhost:3306/db1";
		
		try {
			Connection conn=DriverManager.getConnection(src, "root", "rootroot");
			
			if(conn !=null) {
				System.out.println("Connected.....");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
