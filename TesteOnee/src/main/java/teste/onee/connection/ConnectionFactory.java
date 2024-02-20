package teste.onee.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String FILE = "src/main/resources/mydatabase.db";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:sqlite:" + FILE);
	}
}
