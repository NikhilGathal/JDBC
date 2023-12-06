package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementInsert {

	public static void main(String[] args) throws Exception {
		

		// load and register driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// establish connection 
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","nikhil77");

		// create a statement 
		
		//PreparedStatement preparedStatement = connection.prepareStatement("insert into user values (8,'atul','parbhani');");
		
		PreparedStatement preparedStatement = connection.prepareStatement("insert into user values (?,?,?);");
		
		preparedStatement.setInt(1,8);
		preparedStatement.setString(2,"atul");
		preparedStatement.setString(3,"Parbhani");
		
		preparedStatement.execute();
		
		// close the connection
		
		connection.close();
		
		System.out.println("Data inserted successfully with preparedStatement");

	}

}
