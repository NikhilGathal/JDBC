package mavenjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableUpdate {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "nikhil77");

		CallableStatement callableStatement = connection.prepareCall("call updateUser(11,'Mangesh')");

		callableStatement.execute();

		connection.close();
		System.out.println("Data Updated Successfully with callable");
	}

}
