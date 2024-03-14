package Conexion;

import Entidades.Coordenadas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class geoData {

    private Connection con = Conectar.getConectar();

    public ArrayList<Coordenadas> buscarCiudad(String busqueda) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Coordenadas> ArrayCoor = new ArrayList<>();
        Coordenadas coordenadas;

        String sql = "SELECT * FROM geo WHERE nombre LIKE (?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, '%' + busqueda + '%');

            rs = ps.executeQuery();

            while (rs.next()) {
                coordenadas = new Coordenadas(rs.getString("nombre"),
                        rs.getFloat("latitud"),
                        rs.getFloat("longitud"));
                ArrayCoor.add(coordenadas);
           }
        } catch (SQLException ex) {
        } finally {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
        }
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {         
        }
    }
        return ArrayCoor;

    }

}
