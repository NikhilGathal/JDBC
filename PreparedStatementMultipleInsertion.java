package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementMultipleInsertion {

	public static void main(String[] args) throws Exception {

		// load and register driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// establish connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "nikhil77");

		// create a statement

		// PreparedStatement preparedStatement = connection.prepareStatement("insert
		// into user values (8,'atul','parbhani');");

		PreparedStatement preparedStatement = connection.prepareStatement("insert into user values (?,?,?);");

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter no of entry want to enter ");

		int entry = sc.nextInt();

		int i = 0;

		while (i < entry) {
			System.out.println("Enter Id");
			int id = sc.nextInt();

			System.out.println("Enter your Name");
			String name = sc.next();

			System.out.println("Enter your Add");
			String add = sc.next();

			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, add);

			preparedStatement.execute();
			i++;
		}

		// close the connection

		connection.close();

		System.out.println("Data inserted successfully with preparedStatement");

	}

}
