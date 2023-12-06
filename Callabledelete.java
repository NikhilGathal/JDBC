package mavenjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Callabledelete {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "nikhil77");

		CallableStatement callableStatement = connection.prepareCall("call deleteUser(13)");

		callableStatement.execute();

		connection.close();
		System.out.println("Data Deleted Successfully with callable");
	}

}
