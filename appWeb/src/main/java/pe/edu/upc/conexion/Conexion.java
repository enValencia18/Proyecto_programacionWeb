package pe.edu.upc.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	protected static Connection oCn;

	public static Connection AbrirConexion() {
		if (oCn != null) {
			return oCn;
		}
		try {
			String usuario = "root";
			String password = "admin";
			Class.forName("com.mysql.cj.jdbc.Driver");
			oCn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?useUnicode=true&serverTimezone=UTC",
					usuario, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("error al conectar");
		}

		return oCn;
	}

	public static void CerrarConexion() {
		try {
			if (oCn != null) {
				oCn.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
