package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Selectemployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// load and register driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// establish connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "nikhil77");

		// create a statement

		Statement statement = connection.createStatement();

		// execute a query

		//ResultSet rs = statement.executeQuery("select * from user");
		
		boolean bool = statement.execute("select * from user");
		
		System.out.println(bool);
		
		ResultSet rs = statement.getResultSet();

		while (rs.next()) {
			System.out.print(rs.getInt(1) + " ");
			System.out.print(rs.getNString(2) + " ");
			System.out.print(rs.getNString(3) + " ");
			System.out.println();
		}

		// close the connection

		connection.close();

		System.out.println("Data retrieved successfully");

	}

}
