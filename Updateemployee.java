package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


public class Updateemployee {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
				// load and register driver
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// establish connection 
				
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","nikhil77");

				// create a statement 
				
				Statement statement = connection.createStatement();
				
				// execute a query
				
				boolean bool = statement.execute("update user set name = 'durgasoft2' where id = 2 ");
				
				System.out.println(bool);
				
				// close the connection
				
				connection.close();
				
				System.out.println("Data updated successfully");
	}

}
