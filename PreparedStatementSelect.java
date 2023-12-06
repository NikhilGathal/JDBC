package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementSelect {

	public static void main(String[] args) throws Exception {

		// load and register driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// establish connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "nikhil77");

		// create a statement

		PreparedStatement preparedStatement = connection.prepareStatement("select * from user where id = ?");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your id");
		int id = sc.nextInt();

		preparedStatement.setInt(1, id);

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			System.out.print(rs.getInt(1) + " ");
			System.out.print(rs.getNString(2) + " ");
			System.out.print(rs.getNString(3) + " ");
			System.out.println();
		}

		// close the connection

		connection.close();

		System.out.println("Data Retrieved successfully with preparedStatement");
	}

}
