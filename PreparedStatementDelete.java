package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDelete {

	public static void main(String[] args) throws Exception {

		// load and register driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// establish connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "nikhil77");

		// create a statement

		PreparedStatement preparedStatement = connection.prepareStatement("delete from user where id = ?;");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your id");
		int id = sc.nextInt();

		preparedStatement.setInt(1, id);

		preparedStatement.execute();

		// close the connection

		connection.close();

		System.out.println("Data Deleted successfully with preparedStatement");

	}

}
