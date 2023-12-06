package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class CallableInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "nikhil77");

		CallableStatement callableStatement = connection.prepareCall("call insertUser(14,'abc','def')");

		callableStatement.execute();

		connection.close();
		System.out.println("Data inserted Successfully with callable");

	}

}
