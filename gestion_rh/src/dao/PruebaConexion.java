package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) {
        try {
            Connection con = Conexion.obtenerConexion();
            if (con != null) {
                System.out.println("✅ Conexión exitosa con MySQL!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }
    }
}