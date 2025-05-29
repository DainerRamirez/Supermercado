package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_rh";
    private static final String USUARIO = "root"; // Cambia si tienes otro usuario
    private static final String CLAVE = "admin"; // Si tienes contraseña, agrégala aquí

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CLAVE);
    }
}
