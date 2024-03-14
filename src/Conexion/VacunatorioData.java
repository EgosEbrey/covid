package Conexion;

import Entidades.Pedidos;
import Entidades.Ciudadano;
import Entidades.Coordenadas;
import Entidades.Vacunatorio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VacunatorioData {

    private Connection con = Conectar.getConectar();
    private ArrayList<Vacunatorio> arrayVacunatorios;
       
    public ArrayList<Vacunatorio> listarVacunatorio() {
        arrayVacunatorios = new ArrayList<>();
        PreparedStatement ps = null;ResultSet rs = null;
        Vacunatorio vac;
        Coordenadas cord1;
        String sql = "SELECT * FROM vacunatorio";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                vac = new Vacunatorio();
                    vac.setIdVacunatorio(rs.getInt("idCentro"));
                    vac.setNombre(rs.getString("Nombre"));
                        cord1 = new Coordenadas();
                        cord1.setLatitud(rs.getDouble("latitud"));
                        cord1.setLongitud(rs.getDouble("longitud"));
                    vac.setUbicacion(cord1);
                    vac.setDireccion(rs.getString("direccion"));
                
                arrayVacunatorios.add(vac);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
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
        return arrayVacunatorios;
    }
    
    public Vacunatorio buscarVacunatorio(int idVacunatorio) {
        PreparedStatement ps = null; ResultSet rs = null;
        Vacunatorio vac = null;
        String sql = "SELECT * FROM vacunatorio WHERE idCentro = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idVacunatorio);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
               vac = new Vacunatorio();
               vac.setNombre(rs.getString("nombre"));
               vac.setDireccion(rs.getString("direccion"));
               vac.setEstado(rs.getBoolean("estado"));
               vac.setIdVacunatorio(rs.getInt("idCentro"));    
               Coordenadas cor1 = new Coordenadas();
               cor1.setLatitud(rs.getInt("latitud"));
               cor1.setLongitud(rs.getInt("longitud"));
               vac.setUbicacion(cor1);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
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
        return vac;
    }
    
    public Vacunatorio buscarVacunatorio_xCiudadano(int DNI) {
        PreparedStatement ps = null; ResultSet rs = null;
        Vacunatorio vac = null;
        String sql = "SELECT idCentro FROM turno WHERE DNI = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, DNI);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
               vac = new Vacunatorio();
               vac.setIdVacunatorio(rs.getInt("idCentro"));
                }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
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
        return vac;
    }

    public Vacunatorio vacunatorioCercano(Ciudadano c1) {
        double distancia;
        double min;
        Vacunatorio vac = new Vacunatorio();

        Vacunatorio vac1 = listarVacunatorio().get(0);
        min = Math.sqrt(((vac1.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud()) * (vac1.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud())) + ((vac1.getUbicacion().getLongitud() - c1.getCordenadas().getLongitud()) * (vac1.getUbicacion().getLongitud() -  c1.getCordenadas().getLongitud())));

        for (Vacunatorio vacunatorio : listarVacunatorio()) {
            distancia = Math.sqrt(((vacunatorio.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud()) * (vacunatorio.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud())) + ((vacunatorio.getUbicacion().getLongitud() - c1.getCordenadas().getLongitud()) * (vacunatorio.getUbicacion().getLongitud() - c1.getCordenadas().getLongitud())));
            if (min > distancia) {
                min = distancia;
            }
        }
        for (Vacunatorio vacunatorio : listarVacunatorio()) {
            distancia = Math.sqrt(((vacunatorio.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud()) * (vacunatorio.getUbicacion().getLatitud() - c1.getCordenadas().getLatitud())) + ((vacunatorio.getUbicacion().getLongitud() - c1.getCordenadas().getLongitud()) * (vacunatorio.getUbicacion().getLongitud() - c1.getCordenadas().getLongitud())));
            if (distancia == min) {
                vac = vacunatorio; 
             }
        }
        return vac;
    }
    
    public ArrayList<Vacunatorio> listarVacunatorioNombre(String nombre){
        arrayVacunatorios = new ArrayList<>();
        PreparedStatement ps = null; ResultSet rs = null;
        Vacunatorio vac;
        Coordenadas cord1;
        String sql = "SELECT * FROM vacunatorio WHERE Nombre LIKE ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,'%' + nombre + '%');
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
                vac = new Vacunatorio();
                vac.setIdVacunatorio(rs.getInt("idCentro"));
                vac.setNombre(rs.getString("Nombre"));
                    cord1 = new Coordenadas();
                    cord1.setLatitud(rs.getDouble("latitud"));
                    cord1.setLongitud(rs.getDouble("longitud"));
                vac.setUbicacion(cord1);
                vac.setDireccion(rs.getString("direccion"));
                arrayVacunatorios.add(vac);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
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
        return arrayVacunatorios;
    }
     
    public void pedirStocks(Vacunatorio vac, int Spu, boolean SpuB, int Jhon, boolean JhonB, int Syno, boolean SynoB, int Astra, boolean AstraB, int Pfi, boolean PfiB){
        int exito = 0, comas = 0, sqlPosicion = 1;
        String sql = "INSERT INTO pedidosstocks (idCentro";        
        
        if (SpuB) {sql += ", Sputnik";comas++;}
        if (JhonB) {sql += ", Johnson_Johnson";comas++;}
        if (SynoB) {sql += ", Sinopharm_Sinovac";comas++;}
        if (AstraB) {sql += ", AstraZeneca";comas++;}
        if (PfiB) {sql += ", Pfizer";comas++;}
       
        sql += ", fecha, estado) VALUES (";
        if (comas!=0){sql +="?,";
        for (int i = 0; i <= comas; i++) {
            sql += "?,";
                }
            }
        sql += "?)";
        
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, vac.getIdVacunatorio());
            
            boolean[] valores_booleano = {SpuB, JhonB, SynoB, AstraB, PfiB};
            int[] valores_stock = {Spu, Jhon, Syno, Astra, Pfi};
            for (int i = 1; i < valores_booleano.length; i++) {
                if (valores_booleano[i] != false) {
                    sqlPosicion++;
                    ps.setInt(sqlPosicion, valores_stock[i]);
                                 }
            }
            ps.setDate(sqlPosicion+1, Date.valueOf(LocalDate.now()));
            ps.setString(sqlPosicion+2, "Pendiente");
            
       
            exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pedido Cargado.");
            } 

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
            } 
            finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e){}
    }
    }
    
    public ArrayList<Pedidos> listarPedidos(String estado){
        ArrayList arrayPedidos = new ArrayList<>();
        PreparedStatement ps = null; ResultSet rs = null;
        Pedidos pedido;
        
        String sql = "SELECT * FROM pedidosstocks WHERE estado = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            
            rs = ps.executeQuery();
            
            while (rs.next()){
                pedido = new Pedidos();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setCentro(buscarVacunatorio(rs.getInt("idCentro")));
                pedido.setAstra(rs.getInt("AstraZeneca"));
                pedido.setJhon(rs.getInt("Johnson_Johnson"));
                pedido.setSyno(rs.getInt("Sinopharm_Sinovac"));
                pedido.setSpuk(rs.getInt("Sputnik"));
                pedido.setPf(rs.getInt("Pfizer"));
                pedido.setEstado(rs.getString("estado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                arrayPedidos.add(pedido);                   
            }
        } catch (SQLException e){}
            return arrayPedidos;
     }
}
    

    

