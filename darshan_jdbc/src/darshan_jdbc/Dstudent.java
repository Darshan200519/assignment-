package darshan_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dstudent {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/darshan","root","root");
		Statement s = c.createStatement();
		int checked = s.executeUpdate("insert into student(id,name,city)values(524,'ram','shirdi')");
		
		if(checked >0 ) {
			System.out.println("Inserted");
			
		}else {
			System.out.println("Not Inserted");
		}
		
	}

}
