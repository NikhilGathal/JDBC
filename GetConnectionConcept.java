package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GetConnectionConcept {

	public static void main(String[] args) throws Exception {

		// load and register driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// establish connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user = root&password=nikhil77");

		// create a statement

		Statement statement = connection.createStatement();

		// execute a query

		statement.execute("insert into user values (9,'hanry','Nagar')");

		// close the connection

		connection.close();

		System.out.println("Data inserted successfully");

	}

}
