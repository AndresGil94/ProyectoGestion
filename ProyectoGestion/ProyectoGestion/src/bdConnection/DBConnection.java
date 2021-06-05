package bdConnection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;


public class DBConnection {

	private final String base = "bdzoo";
	private final String user = "root";
	private final String password = "";
	private final String url = "jdbc:mysql://localhost:3306/" + base + "useSSL=false";
	private Connection con = null;
	

	// Funcion para conectar
	
	public Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");// conector antiguo
			con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);

		} catch (SQLException e) {
			System.err.println(e);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
		}
		return con;
	}
}
