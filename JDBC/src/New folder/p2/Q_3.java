package p2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.Connection.Demo;

public class Q_3 {

	public static void main(String[] args) {
		
		try(Connection conn=Demo.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement(" update employee set salary=salary+500");
			
			int s=ps.executeUpdate();
			
			if(s>0) {
				System.out.println("updated successfully");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
