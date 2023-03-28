package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Db_connection {

	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
		 
		 {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicare", "root", "admin");
		 
		Statement stm = con.createStatement();
		ResultSet result = stm.executeQuery("select * from category");
		 
		while(result.next()) {
		System.out.println(result.getInt("ID"));
		System.out.println(result.getString("name"));
		System.out.println(result.getString("description"));
		System.out.println(result.getString("image_url"));
		System.out.println(result.getInt("is_active"));
	
		}
		
		
		

	}
	
	
	}
}
	

	

	

