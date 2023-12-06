package mavenjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Executeconcept {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//				// load and register driver
//		
//				Class.forName("com.mysql.cj.jdbc.Driver");
//				
//				// establish connection 
//				
//				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit","root","nikhil77");
//
//				// create a statement 
//				
//				Statement statement = connection.createStatement();
//				
//				// execute a query
//				
//				boolean value = statement.execute("insert into employee values (500,'anib',5000,'delhi')");
//				
//				System.out.println(value);
//				
//				// close the connection
//				
//				connection.close();
//				
//				System.out.println("Data inserted successfully");

		// load and register driver

//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		// establish connection
//
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit", "root", "nikhil77");
//
//		// create a statement
//
//		Statement statement = connection.createStatement();
//
//		// execute a query
//
//		boolean value = statement.execute("update employee set empname = 'sunnyleony' where empno = 200 ");
//
//		System.out.println(value);
//		
//		// close the connection
//
//		connection.close();
//
//		System.out.println("Data updated successfully");
		
		// load and register driver
		
//					Class.forName("com.mysql.cj.jdbc.Driver");
//					
//					// establish connection 
//					
//					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit","root","nikhil77");
//
//					// create a statement 
//					
//					Statement statement = connection.createStatement();
//					
//					// execute a query
//					
//					boolean value = statement.execute("delete from employee where empno = 500");
//					
//					System.out.println(value);
//					
//					// close the connection
//					
//					connection.close();
//					
//					System.out.println("Data deleted successfully");
		
		
		// load and register driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// establish connection 
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit","root","nikhil77");

		// create a statement 
		
		Statement statement = connection.createStatement();
		
		// execute a query
		
		boolean value = statement.execute("select * from employee");
		
		System.out.println(value);
		
		// close the connection
		
		connection.close();
		
		System.out.println("Data retrieved successfully");
	}
}
