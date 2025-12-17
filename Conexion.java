package pedidos.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/java_pedidos_nombre";
	private static final String USER = "root";
	private static final String PASS = "root";
	
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conexion correcta");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
