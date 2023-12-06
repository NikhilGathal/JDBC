package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdateupdate {

	public static void main(String[] args) throws Exception {
		// load and register driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// establish connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "nikhil77");

		// create a statement

		Statement statement = connection.createStatement();

		// execute a query

		int value = statement.executeUpdate("update user set name = 'durgasoft' where id = 2 ");
		
		System.out.println(value);
		
		// close the connection

		connection.close();

		System.out.println("Data updated successfully");
	}

}
