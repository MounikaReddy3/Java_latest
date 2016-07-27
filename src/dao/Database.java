package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public Connection getConnection() throws Exception {
		try {
			String connectionURL = "jdbc:mysql://http://107.180.44.145:3306/Kohedb";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "satish093", "google");
			return connection;
		} catch (Exception e) {
			throw e;
		}

	}

}
