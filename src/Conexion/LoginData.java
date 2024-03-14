package Conexion;

import Entidades.Ciudadano;
import Entidades.LogIN;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoginData {

    private int categoriaResultado;
    private Connection con = Conectar.getConectar();
  

    public boolean logIN(int usuario, String clave_in) {
        String sql = "SELECT * FROM login WHERE usuario LIKE (?)";
        PreparedStatement ps = null;
        boolean ingreso = false;
        ResultSet rs = null;
               try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(usuario));
            rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getString("Clave").equals(clave_in) && rs.getInt("estado") == 0) {
                    ingresosReseteo(usuario);
                    ingreso = true;
                } else if (rs.getInt("estado") == 1) {
                    JOptionPane.showMessageDialog(null, "Usuario Bloqueado");
                } else if (!rs.getString("Clave").equals(clave_in)) {
                    ingresoFallido(usuario);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario inexistente");
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Usuario inexistente");
        }
        return ingreso;
    }

    public int modificarClave(String clave_in, String clave_n, int usuario) {
        String clave_usuario = null;
        String sql = "SELECT Clave FROM login WHERE Usuario LIKE (?)";
        PreparedStatement ps = null;
        String clave_nueva = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(usuario));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                clave_usuario = rs.getString("Clave");
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        if (clave_in.equals(clave_usuario)) {
            clave_nueva = clave_n;
            String sq1 = "UPDATE login SET Clave = ? WHERE Usuario LIKE ?";
            ps = null;

            try {
                ps = con.prepareStatement(sq1);
                ps.setString(1, clave_n);
                ps.setInt(2, usuario);

                int rowsAffected = ps.executeUpdate();
                if (rowsAffected == 1) {
                    JOptionPane.showMessageDialog(null, "La clave ha sido actualizada con éxito.");
                    return 0;
                }

            } catch (SQLException sqlE) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "La clave no ha sido actualizada.");
            return 1;
        }
        return 3;

    }
 
    public String buscarClave(int usuario) {
        String resultado = null;
        String sql = "SELECT Clave FROM logIN WHERE Usuario LIKE (?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.toString(usuario));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                resultado = rs.getString("clave");
            } else {
                JOptionPane.showMessageDialog(null, "sos un queso");
            }

        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return resultado;
    }

    public void ingresoFallido(int usuario) {
        int ingreso_n;
        String sql = "SELECT * FROM login WHERE Usuario = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                if (rs.getInt("ingresos") < 2 && rs.getInt("estado") == 0) {
                    JOptionPane.showMessageDialog(null, "La cuenta o la contraseña es incorrecta");
                    ingreso_n = rs.getInt("ingresos") + 1;
                    String sql2 = "UPDATE login SET ingresos = ? WHERE Usuario = ?";
                    PreparedStatement ps2 = null;

                    try {
                        ps2 = con.prepareStatement(sql2);
                        ps2.setInt(1, ingreso_n);
                        ps2.setInt(2, usuario);

                        int resultado = ps2.executeUpdate();

                    } catch (SQLException sqlE) {
                        JOptionPane.showMessageDialog(null, "Error en la actualización");
                    }
                } else if (rs.getInt("ingresos") >= 2) {
                    String sql3 = "UPDATE login SET estado = ?, ingresos = ? WHERE Usuario = ?";
                    PreparedStatement ps3 = null;

                    try {
                        ps3 = con.prepareStatement(sql3);
                        ps3.setInt(1, 1);
                        ps3.setInt(2, 0);
                        ps3.setInt(3, usuario);

                        int resultado2 = ps3.executeUpdate();

                        if (resultado2 == 1) {
                            JOptionPane.showMessageDialog(null, "Usuario Bloquead. Comuniquese con la oficina de Daniel Vidaurre");
                        }
                    } catch (SQLException sqlE) {
                        JOptionPane.showMessageDialog(null, "Error");
                    }
                }
            }
        } catch (SQLException sqlE) {
        }
    }

    private void ingresosReseteo(int usuario) {
        String sql2 = "UPDATE login SET ingresos = ? WHERE usuario = ?";
        PreparedStatement ps2 = null;
        try {
            ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, 0);
            ps2.setInt(2, usuario);
            int resultado = ps2.executeUpdate();
        } catch (SQLException sqlE) {
        }
    }

    public int reactivarLogINusuario(int usuario) {
        int resultado = 1;
        String sql = "SELECT estado FROM login WHERE Usuario = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, (usuario));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                resultado = rs.getInt("estado");
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error busqueda");
        }
        return resultado;
    }

    public ArrayList<LogIN> cuentasA_Recordar() {
        ArrayList<LogIN> logIN_array = new ArrayList<>();
        LogIN log;
        String sql = "SELECT clave,usuario FROM login WHERE recordar = 1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                log = new LogIN();
                log.setClave(rs.getString("Clave"));
                log.setUsuario(rs.getInt("Usuario"));
                logIN_array.add(log);
            }
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog(null, "Error base datos de LogIN");
        }
        return logIN_array;
    }

    public void actualizarRecordar(int num, int usuario) {
        String sql2 = "UPDATE login SET recordar = ? WHERE usuario = ?";
        PreparedStatement ps2 = null;
        try {
            ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, num);
            ps2.setInt(2, usuario);
            int resultado = ps2.executeUpdate();
        } catch (SQLException sqlE) {
        }
    }
    
    public void modificarLogIN(int dni_nuevo, int dni_viejo){
        String sql2 = "UPDATE login SET usuario = ? WHERE usuario = ?";
        PreparedStatement ps2 = null;
        try {
            ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, dni_nuevo);
            ps2.setInt(2, dni_viejo);
            int resultado = ps2.executeUpdate();
            if (resultado >0)
                JOptionPane.showMessageDialog(null, "Usuario de logIN modificado correctamente");
            } catch (SQLException sqlE) {
        }
    }
       
    public boolean analisisFaseIngreso(int dni){
        PreparedStatement ps;
        boolean resultado = true;
        String sql = "SELECT etapa_ingreso FROM login WHERE usuario = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
              resultado = rs.getBoolean("etapa_ingreso");
            }
        } catch (SQLException e){}
        
        return resultado;
    }
    
      
    public void armarClavesRandom(int dni){
        PreparedStatement ps;
        String sql = "INSERT INTO login (`usuario`,`clave`) VALUES (?,?)";

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder clave = new StringBuilder();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 9; i++) {
            int indice = random.nextInt(caracteres.length());
            clave.append(caracteres.charAt(indice));
        } 
        try {
            ps = con.prepareStatement(sql);
            ps.setString(2, clave.toString());
            ps.setInt(1,dni);
            
            int update = ps.executeUpdate();
            
        } catch (SQLException e){}
    }

    public void actualizarFaseIngreso(Ciudadano c1){
        PreparedStatement ps;
        
        String sql = "UPDATE login SET etapa_ingreso = ? WHERE usuario = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, true);
            ps.setInt(2, c1.getDNI());
            
            int resultado = ps.executeUpdate();
        }catch (SQLException e){}
    }
    
    public ArrayList<LogIN> listarUsuarios(){
       PreparedStatement ps; 
       ArrayList<LogIN> usuarios = new ArrayList<>();
       LogIN lg;
       String sql = "SELECT * FROM login";
       
       try {
           ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()){
               lg = new LogIN();
               lg.setUsuario(rs.getInt("Usuario"));
               lg.setClave(rs.getString("Clave"));
               lg.setEstado(rs.getInt("Estado"));
               lg.setRecordar(rs.getInt("recordar"));
               usuarios.add(lg);
           }
           
       } catch (SQLException e){}
       return usuarios;
    }
}
