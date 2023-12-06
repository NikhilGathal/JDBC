package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegisterConcept {

	public static void main(String[] args) throws Exception {

		// load driver

		Driver driver = new Driver();

		// register driver

		DriverManager.registerDriver(driver);

		// establish connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "nikhil77");

		// create a statement

		Statement statement = connection.createStatement();

		// execute a query

		statement.execute("insert into user values (7,'Rohan','Nagar')");

		// close the connection

		connection.close();

		System.out.println("Data inserted successfully");

	}

}
