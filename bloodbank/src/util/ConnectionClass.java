package util;


import java.sql.Connection;
import java.sql.DriverManager;

//singleton pattern class
public class ConnectionClass{

	private ConnectionClass() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() {

		Connection con = null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","BLOODBANK","ROHITH1997");
		} catch (Exception e) {
			System.out.println("Error Registration Connection: " + e);
		}
		return con;

	}
}