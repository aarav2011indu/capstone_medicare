package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert extends Db_connection {
		// TODO Auto-generated method stub
		public static void main1(String[] args) throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/medicare", "root", "admin");

			Statement stm = con.createStatement();
			stm.executeUpdate("INSERT into category(id,name,description,image_url,is_active)values('4','cat_4','This is category 4','null','1'");
		// TODO Auto-generated method stub
					ResultSet result = stm.executeQuery("select * from eproduct");
					while(result.next()) {
						System.out.println(result.getInt("ID"));
						System.out.println(result.getString("name"));
						System.out.println(result.getString("description"));
						System.out.println(result.getString("image_url"));
						System.out.println(result.getInt("is_active"));
					
					
						
						}		

	}

}

