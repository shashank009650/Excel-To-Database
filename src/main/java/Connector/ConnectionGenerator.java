package Connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionGenerator {

	static Connection con;

	public static Connection CreateConnection() {

		try {
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create the connection
			String user = "root";
			String password = "shashank@123";
			String url = "jdbc:mysql://localhost:3306/excelreader";
			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
