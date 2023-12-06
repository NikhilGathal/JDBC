package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deleteemployee {
		public static void main(String[] args)throws ClassNotFoundException, SQLException {
			
			
			// load and register driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish connection 
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit","root","nikhil77");

			// create a statement 
			
			Statement statement = connection.createStatement();
			
			// execute a query
			
			statement.execute("delete from employee where empno = 500");
			
			// close the connection
			
			connection.close();
			
			System.out.println("Data deleted successfully");
		}
}
