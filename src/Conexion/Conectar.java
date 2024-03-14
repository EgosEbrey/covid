package Conexion;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectar {

    private static Connection conexion;

    public static Connection getConectar() {
        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/vacunas", "root", "");
            } catch (ClassNotFoundException csfE) {
                JOptionPane.showMessageDialog(null, "Error en drivers");
            } catch (SQLException sqlE) {
                JOptionPane.showMessageDialog(null, "Error en conexión");
            }
        }
        return conexion;
    }
}
