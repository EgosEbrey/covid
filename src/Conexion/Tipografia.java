package Conexion;

import java.awt.Font;
import java.io.InputStream;

public class Tipografia {
   private Font font = null;
   public String AM = "Proxima Nova Bold.ttf";
   
   public Font fuente(String nombre, int estilo, float tamanio){
       try{
           InputStream is = getClass().getResourceAsStream(nombre);
           font = Font.createFont(Font.TRUETYPE_FONT, is);
       } catch (Exception ex){
            font = new Font("Arial",Font.PLAIN, 14);
           }
        Font tfont = font.deriveFont(estilo,tamanio);
       return tfont;
    }
}
