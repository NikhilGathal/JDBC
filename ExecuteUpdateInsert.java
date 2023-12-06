package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteUpdateInsert {

	public static void main(String[] args) throws Exception {
		
		// load and register driver
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// establish connection 
				
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","nikhil77");

				// create a statement 
				
				Statement statement = connection.createStatement();
				
				
				// execute a query
				
				int value =  statement.executeUpdate("insert into user values (9,'Ishan','Parli '),(10,'Aditya','Parli ')");
				
				System.out.println(value);
				
				ResultSet rs = statement.executeQuery("select * from user");

				while (rs.next()) {
					System.out.print(rs.getInt(1) + " ");
					System.out.print(rs.getNString(2) + " ");
					System.out.print(rs.getNString(3) + " ");
					System.out.println();
				}
				
				// close the connection
				
				connection.close();
				
				System.out.println("Data inserted successfully");

	}

}
