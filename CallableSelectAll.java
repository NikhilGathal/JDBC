package mavenjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableSelectAll {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "nikhil77");

		CallableStatement callableStatement = connection.prepareCall("call selectallUser()");

		ResultSet rs = callableStatement.executeQuery();

		while (rs.next()) {
			System.out.print(rs.getInt(1) + " ");
			System.out.print(rs.getString(2) + " ");
			System.out.print(rs.getString(3) + " ");
			System.out.println();
		}

		connection.close();
		System.out.println("Data Retrieved Successfully with callable");

	}

}
