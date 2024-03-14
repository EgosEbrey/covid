
package Vistas.Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Conexion.Conectar;
import Conexion.LoginData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.geoData;
import Entidades.LogIN;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class LoginTes extends javax.swing.JFrame {

    private Connection con = Conectar.getConectar();
    private ArrayList<LogIN> logIN = new ArrayList();
    private LoginData lD = new LoginData();
    private TurnoData tD = new TurnoData();
    private CiudadanoData cD = new CiudadanoData();
    private VacunatorioData vD = new VacunatorioData();
    private geoData gD = new geoData();
   
    
    public LoginTes() {
       initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img_Ciudadano = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jText_usuLIN = new javax.swing.JTextField();
        jPas_logIN = new javax.swing.JPasswordField();
        INGRESAR = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        showPass = new javax.swing.JToggleButton();
        img_Pantalla_Ciudadano = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ciudadano");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 628));

        img_Ciudadano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CIUDADANO.png"))); // NOI18N
        img_Ciudadano.setMaximumSize(new java.awt.Dimension(250, 600));
        img_Ciudadano.setMinimumSize(new java.awt.Dimension(250, 600));
        img_Ciudadano.setPreferredSize(new java.awt.Dimension(250, 600));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(550, 600));

        jText_usuLIN.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jText_usuLIN.setForeground(new java.awt.Color(85, 106, 124));
        jText_usuLIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_usuLIN.setBorder(null);
        jText_usuLIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jText_usuLINFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_usuLINFocusLost(evt);
            }
        });
        jDesktopPane1.add(jText_usuLIN);
        jText_usuLIN.setBounds(140, 288, 272, 22);

        jPas_logIN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPas_logIN.setForeground(new java.awt.Color(85, 106, 124));
        jPas_logIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPas_logIN.setBorder(null);
        jDesktopPane1.add(jPas_logIN);
        jPas_logIN.setBounds(140, 362, 272, 22);

        INGRESAR.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        INGRESAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INGRESAR_01-05.png"))); // NOI18N
        INGRESAR.setBorder(null);
        INGRESAR.setBorderPainted(false);
        INGRESAR.setPreferredSize(new java.awt.Dimension(98, 34));
        INGRESAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INGRESAR_02-05.png"))); // NOI18N
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });
        jDesktopPane1.add(INGRESAR);
        INGRESAR.setBounds(330, 425, 98, 34);

        jCheckBox1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFocusPainted(false);
        jCheckBox1.setFocusable(false);
        jCheckBox1.setOpaque(false);
        jDesktopPane1.add(jCheckBox1);
        jCheckBox1.setBounds(140, 433, 21, 21);

        showPass.setBackground(new java.awt.Color(255, 255, 255));
        showPass.setForeground(new java.awt.Color(255, 255, 255));
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/OJO 01-05.png"))); // NOI18N
        showPass.setBorder(null);
        showPass.setBorderPainted(false);
        showPass.setContentAreaFilled(false);
        showPass.setDisabledIcon(null);
        showPass.setFocusPainted(false);
        showPass.setFocusable(false);
        showPass.setPreferredSize(new java.awt.Dimension(34, 34));
        showPass.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/OJO 02-05.png"))); // NOI18N
        showPass.setRolloverEnabled(false);
        showPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/OJO 02-05.png"))); // NOI18N
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        jDesktopPane1.add(showPass);
        showPass.setBounds(430, 357, 40, 34);

        img_Pantalla_Ciudadano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/FONDO_LOGIN-04.png"))); // NOI18N
        img_Pantalla_Ciudadano.setPreferredSize(new java.awt.Dimension(550, 600));
        jDesktopPane1.add(img_Pantalla_Ciudadano);
        img_Pantalla_Ciudadano.setBounds(0, 0, 551, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img_Ciudadano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_Ciudadano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jText_usuLINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_usuLINFocusGained
        logIN = lD.cuentasA_Recordar();
    }//GEN-LAST:event_jText_usuLINFocusGained

    private void jText_usuLINFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_usuLINFocusLost
        for (int i = 0; i < logIN.size(); i++) {
            if (Integer.toString(logIN.get(i).getUsuario()).equals(jText_usuLIN.getText())){
                jPas_logIN.setText(logIN.get(i).getClave());
                jCheckBox1.setSelected(true);
            }
        }
    }//GEN-LAST:event_jText_usuLINFocusLost

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
       inicioSesion();
    }//GEN-LAST:event_INGRESARActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        
        if (showPass.isSelected()) {
            // Mostrar caracteres de la contraseña
            jPas_logIN.setEchoChar((char) 0); // Esto quita el carácter oculto
        } else {
            // Ocultar caracteres de la contraseña
            jPas_logIN.setEchoChar('•');
        }
    }//GEN-LAST:event_showPassActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INGRESAR;
    private javax.swing.JLabel img_Ciudadano;
    private javax.swing.JLabel img_Pantalla_Ciudadano;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPasswordField jPas_logIN;
    private javax.swing.JTextField jText_usuLIN;
    private javax.swing.JToggleButton showPass;
    // End of variables declaration//GEN-END:variables

public void inicioSesion() {
        try {
            int usuario = Integer.parseInt(jText_usuLIN.getText());
            String clave = String.valueOf(jPas_logIN.getPassword());
          
            if (lD.logIN(usuario, clave)) {
                boolean data = lD.analisisFaseIngreso(usuario);
                if (!data) {
                            if (!jCheckBox1.isSelected()){
                            lD.actualizarRecordar(0, usuario);
                            logIN = lD.cuentasA_Recordar();
                            } else if (jCheckBox1.isSelected()){
                            lD.actualizarRecordar(1, usuario);
                            logIN = lD.cuentasA_Recordar();    
                            }

                            Inscripcion admin = new Inscripcion(gD, vD, tD, lD, cD, usuario,img_Pantalla_Ciudadano.getLocationOnScreen(),img_Pantalla_Ciudadano.getSize());
                            jDesktopPane1.add(admin);
                            admin.setVisible(true);
                            jDesktopPane1.moveToFront(admin);
                            
                    } else if (data){
                    
                if (!jCheckBox1.isSelected()) {
                    lD.actualizarRecordar(0, usuario);
                    logIN = lD.cuentasA_Recordar();
                    } else if (jCheckBox1.isSelected()){
                    lD.actualizarRecordar(1, usuario);
                    logIN = lD.cuentasA_Recordar();    
                    }
                    Cuenta_Ciudadano dC = new Cuenta_Ciudadano(cD, tD, usuario,img_Pantalla_Ciudadano.getLocationOnScreen(),img_Pantalla_Ciudadano.getSize());
                    jDesktopPane1.add(dC);
                    dC.setVisible(true);
                    jDesktopPane1.moveToFront(dC);
                
                    jPas_logIN.setText("");
                    jText_usuLIN.setText("");
                    jCheckBox1.setSelected(false);
                } 
                
            }
        } catch (NumberFormatException ex) {
            jText_usuLIN.setText("");
            jPas_logIN.setText("");
            jCheckBox1.setSelected(false);
            
            JOptionPane.showMessageDialog(null, "Usurio Incorrecto");
        }
    }
}

