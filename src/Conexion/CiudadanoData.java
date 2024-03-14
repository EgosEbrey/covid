package Conexion;

import Entidades.Ciudadano;
import Entidades.Coordenadas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.time.LocalDate;

public class CiudadanoData{
    
    private Connection con = Conectar.getConectar();
    
    public int cargaNuevosDatosCiudadano(Ciudadano c1){
    int updates = 0;
    PreparedStatement ps = null;
    String sql = "UPDATE ciudadano SET `latitud` = ?,`longitud` = ?, `email` = ?, `celular` = ?, `ambitoTrabajo` = ?, `dosisAplicadas` = ?, fechaNacimiento = ? WHERE DNI = ?";

    try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1,c1.getCordenadas().getLatitud());
            ps.setDouble(2,c1.getCordenadas().getLongitud());
            ps.setString(3, c1.getEmail());
            ps.setLong(4, c1.getCelular());
            ps.setString(5, c1.getAmbitoTrabajo());
            ps.setInt(6,0);
            ps.setDate(7,Date.valueOf(c1.getFechaNacimiento()));
            ps.setInt(8,c1.getDNI());
                                 
            updates = ps.executeUpdate();;
            if (updates > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion Correcta");
                }
            if (updates == 0) {
                JOptionPane.showMessageDialog(null, "No ha podido inscribirse. Reintente.");
            }
        } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El DNI ya se encuentra cargado en la bsae datos.");
            }
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e){} 
            }
    return updates;
    }
    
    public void cargarPatologia(Ciudadano ciudadano, boolean EC, boolean D, boolean EResC, boolean I, boolean O, boolean ERenC, boolean E, boolean EHC, boolean EN, String otra) {
        
        int exito = 0, comas = 0, sqlPosicion = 1;
        String sql = "INSERT INTO patologias (DNI";
            
        if (EC) {sql += ", Cardiovasculares";comas++;}
        if (D) {sql += ", Diabetes";comas++;}
        if (EResC) {sql += ", Respiratorias_cronicas";comas++;}
        if (I) {sql += ", Inmunosupresion";comas++;}
        if (O) {sql += ", Obesidad";comas++;}
        if (ERenC) {sql += ", Renales_cronicas";comas++;}
        if (E) {sql += ", Embarazo";comas++;}
        if (EHC) {sql += ", Hepaticas_cronicas";comas++;}
        if (EN) {sql += ", Neurologicas";comas++;}
        if (!otra.trim().isEmpty()) {sql += ", otra";comas++;}

        sql += ") VALUES (";
        if (comas!=0){sql +="?,";
        for (int i = 1; i < comas; i++) {
            sql += "?,";
        }
        }
        sql += "?)";
        
                PreparedStatement ps = null;
        try {
          
            ps = con.prepareStatement(sql);
            ps.setInt(1, ciudadano.getDNI());
            
            boolean[] valores = {EC, D, EResC, I, O, ERenC, E, EHC, EN};
            for (int i = 2; i < valores.length; i++) {
                if (valores[i] != false) {
                    sqlPosicion++;
                    ps.setBoolean(sqlPosicion, valores[i]);
                }
            }
            if (otra != null) {
                sqlPosicion++;
                ps.setString(sqlPosicion, otra);
            }

            exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Patologias Cargadas.");
            } 

        } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El DNI ya se encuentra cargado en la bsae datos.");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }  finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e){}
    }
    }
       
    public int cargarTurno(Ciudadano ciu){
        int updates = 0;
        String sql = "INSERT INTO turno (DNI,fechaTurno,idCentro,codigoRefuerzo,estado) VALUES (?,?,?,?,?)";
       PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ciu.getDNI());
            ps.setTimestamp(2, Timestamp.valueOf(ciu.getTurno().getFecha()));
            ps.setInt(3, ciu.getTurno().getVacunatorio().getIdVacunatorio());
            ps.setInt(4, ciu.getDosisAplicadas()+1);  
            ps.setString(5,"Pendiente");

            updates = ps.executeUpdate();
            if (updates > 0) {
               // JOptionPane.showMessageDialog(null, "Turno Tomado");                
            }
               } catch (SQLException e) {
            if (e.getSQLState().equals("23000") && e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Turno ya ocupado");
            } else {
                JOptionPane.showMessageDialog(null, "Error, tome un nuevo turno");
            }
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e){}
        }
        return updates;
    }
     
    public ArrayList<Ciudadano> buscarCiudadanos(int dni_ciudadano, String codigo){
     ArrayList<Ciudadano> arrayCiudadano = new ArrayList();
     Ciudadano c1;
     PreparedStatement ps = null;   
     ResultSet rs = null;
     String sql;
     Coordenadas cord;
      
     switch (codigo){
         case "DNI" : sql = "SELECT * FROM ciudadano WHERE DNI = ?"; break;
         case "todos" : sql = "SELECT * FROM ciudadano"; break;
         default : sql = ""; break;
     }
     
     try{
         ps = con.prepareStatement(sql);
         ps.setInt(1,dni_ciudadano);
         
         rs = ps.executeQuery();
        
         while (rs.next()){
             c1 = new Ciudadano();
             c1.setIdCiudadano(rs.getInt("idCiudadano"));
             c1.setApellido(rs.getString("apellido"));
             c1.setNombre(rs.getString("nombre"));
             c1.setDNI(rs.getInt("DNI")); 
             c1.setAmbitoTrabajo(rs.getString("ambitoTrabajo"));
             c1.setDosisAplicadas(rs.getInt("dosisAplicadas"));
             c1.setCelular(rs.getLong("celular"));
             c1.setEmail(rs.getString("email"));
             cord = new Coordenadas();
             cord.setLatitud(rs.getDouble("latitud"));
             cord.setLongitud(rs.getDouble("longitud"));
             c1.setCordenadas(cord);
             if (rs.getDate("fechaNacimiento") != null){
                 c1.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
             } else {
                 c1.setFechaNacimiento(null);
             }
             c1.setPatologias(consultaPatologias(dni_ciudadano));
             arrayCiudadano.add(c1);
         } 
       } catch (SQLException e){
       } finally {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        } 
     return arrayCiudadano;
        
    }
 
    public ArrayList<String> consultaPatologias(int dni_ciudadano){
     ArrayList<String> patologias = new ArrayList();
     PreparedStatement ps = null;   
     ResultSet rs = null;
     String sql = "SELECT * FROM patologias WHERE DNI = ?";
     
     try{
         ps = con.prepareStatement(sql);
         ps.setInt(1,dni_ciudadano);
        
         rs = ps.executeQuery();
         
         if (rs.next()){
             String[] patologiasString = {"Cardiovasculares","Diabetes","Respiratorias_Cronicas","Inmunosupresion","Obesidad","Renales_cronicas","Embarazo","Hepaticas_cronicas","Neurologicas"};
             for (String string : patologiasString) {
                 if (rs.getBoolean(string)){
                  patologias.add(string); 
                }
             }
                if (rs.getString("otra") != null){
                patologias.add(rs.getString("otra"));
             }
          } 
       } catch (SQLException e){
       } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); 
            }
            }
        return patologias;
    }
    
    public void actualizarDatosCiudadano(Ciudadano c1, String apellido, boolean ape, String nombre, boolean nom, String celular, boolean cel, String dosis, boolean dos, String ocupacion, boolean ocup, String email, boolean mail, LocalDate fechaNacimiento, boolean fechaN){
        int comas = 0, sql_p = 1;
        PreparedStatement ps = null;
        
        String sql = "UPDATE ciudadano SET";
        
        if (ape) { sql += " apellido = ? "; comas++;}
        if (nom) {sql += ((comas > 0)? ",":""); sql += " nombre = ? "; comas++;}
        if (cel) { sql += ((comas > 0)? ",":""); sql += " celular = ? "; comas++;}
        if (dos) { sql += ((comas > 0)? ",":""); sql += " dosis = ? "; comas++;}
        if (ocup) { sql += ((comas > 0)? ",":""); sql += " ocupacion = ? "; comas++;}
        if (mail) { sql += ((comas > 0)? ",":""); sql += " email = ? "; comas++;}
        if (fechaN) { sql += ((comas > 0)? ",":""); sql += " fechaNacimiento = ? "; comas++;}
        sql += "WHERE DNI = ?";
            
        try {
            ps = con.prepareStatement(sql);
            
            if (ape) {ps.setString(sql_p, apellido);sql_p++;}
            if (nom) {ps.setString(sql_p, nombre);sql_p++;}
            if (cel) {ps.setString(sql_p, celular);sql_p++;}
            if (dos) {ps.setString(sql_p, dosis);sql_p++;}
            if (ocup) {ps.setString(sql_p,ocupacion); sql_p++;}
            if (mail) {ps.setString(sql_p,email); sql_p++;}
            if (fechaN) {ps.setDate(sql_p,Date.valueOf(fechaNacimiento)); sql_p++;}
            ps.setInt(sql_p, c1.getDNI());
             
            int resultado = ps.executeUpdate();
            
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Error al actualizar la base de datos");
        }  finally {
              try {
                if (ps != null) {
                ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
         }
    }
    
    public void actualiarPatologias(int DNI, ArrayList<String> agregar, ArrayList<String> sacar, String otra){
        int comas = 0, sql_p = 1;
        PreparedStatement ps = null;
        String [] patologias = {"Cardiovasculares","Diabetes","Respiratorias_Cronicas","Inmunosupresion","Obesidad","Renales_Cronicas","Embarazo","Hepaticas_cronicas","Neurologicas"};

        String sql = "UPDATE patologias SET ";
        for (String patologia : patologias) {
            if (agregar.contains(patologia) || sacar.contains(patologia)) {sql += ((comas > 0)? ", ":""); sql +=  patologia + " = ?";comas++;}
            
        }
        sql += " WHERE DNI = ?";
       
        try {
            ps = con.prepareStatement(sql);
            
            
               for (String patologia : patologias) {
                     if (agregar.contains(patologia)) {
                       ps.setBoolean(sql_p,true); sql_p++;
                   } else if (sacar.contains(patologia)){
                   ps.setBoolean(sql_p,false);sql_p++;
                   }
               }    
               
               ps.setInt(sql_p, DNI);
               
        int resultado = ps.executeUpdate();
            
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Error al actualizar la base de datos de patologias");
        }  finally {
              try {
                if (ps != null) {
                ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
         }
        }
    }
