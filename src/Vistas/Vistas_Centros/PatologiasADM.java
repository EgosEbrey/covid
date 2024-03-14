package Vistas.Vistas_Centros;

import Conexion.CiudadanoData;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class PatologiasADM extends javax.swing.JFrame {

    private static int DNI;
    private ArrayList<String> patologias = new ArrayList();
    private static CiudadanoData cD;
    
    public PatologiasADM(int DNI, CiudadanoData cD) {
        initComponents();
        this.cD = cD;
        this.DNI = DNI;
        initComponents();
        this.patologias = cD.consultaPatologias(DNI);
        armadoComponentes();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Actualizar_2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        diSi = new javax.swing.JRadioButton();
        diNo = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        pepe1 = new javax.swing.JRadioButton();
        Diabetes2 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        otras_Patologias = new javax.swing.JTextField();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        ecSi = new javax.swing.JRadioButton();
        ecNo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Actualizar_2.setText("Actualizar Datos");
        Actualizar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_2ActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel30.setText("Otros");
        jLabel30.setToolTipText("");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel31.setText("Inmunosupresion");
        jLabel31.setToolTipText("");
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel32.setText("Enfermedades Hepáticas");
        jLabel32.setToolTipText("");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        diSi.setText("Si");

        diNo.setText("No");

        jRadioButton11.setText("Si");

        jRadioButton5.setText("Si");

        jRadioButton12.setText("No");

        jRadioButton6.setText("No");

        jRadioButton13.setText("Si");

        pepe1.setText("Si");

        Diabetes2.setText("Diabetes");
        Diabetes2.setToolTipText("");
        Diabetes2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jRadioButton8.setText("No");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton14.setText("No");

        jLabel25.setText("Enfermedades Cardiovasculares");
        jLabel25.setToolTipText("");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jRadioButton9.setText("Si");

        jRadioButton10.setText("No");

        jLabel33.setText("Enfermedades Neurológicas");
        jLabel33.setToolTipText("");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        otras_Patologias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otras_PatologiasActionPerformed(evt);
            }
        });

        jRadioButton15.setText("Si");

        jLabel26.setText("Enfermedades Respiratorias");
        jLabel26.setToolTipText("");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jRadioButton16.setText("No");

        jLabel27.setText("Obesidad");
        jLabel27.setToolTipText("");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jRadioButton17.setText("Si");

        jLabel28.setText("Enfermedades Renales Crónicas");
        jLabel28.setToolTipText("");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jRadioButton18.setText("No");

        jLabel29.setText("Embarazo");
        jLabel29.setToolTipText("");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ecSi.setText("Si");

        ecNo.setText("No");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Diabetes2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diSi)
                                    .addComponent(jRadioButton5)
                                    .addComponent(pepe1)
                                    .addComponent(jRadioButton9)
                                    .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton13)
                                    .addComponent(jRadioButton15)
                                    .addComponent(jRadioButton17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(diNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ecSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ecNo))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Actualizar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(otras_Patologias, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ecSi)
                    .addComponent(ecNo))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(diNo)
                    .addComponent(diSi)
                    .addComponent(Diabetes2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pepe1)
                    .addComponent(jRadioButton8)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otras_Patologias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Actualizar_2)
                    .addComponent(jButton1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Actualizar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_2ActionPerformed
        actualizarDatosModificados();
        JOptionPane.showMessageDialog(null, "Base de datos de patologias actualizadas");
    }//GEN-LAST:event_Actualizar_2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void otras_PatologiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otras_PatologiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otras_PatologiasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatologiasADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatologiasADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatologiasADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatologiasADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatologiasADM(DNI, cD).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_2;
    private javax.swing.JLabel Diabetes2;
    private javax.swing.JRadioButton diNo;
    private javax.swing.JRadioButton diSi;
    private javax.swing.JRadioButton ecNo;
    private javax.swing.JRadioButton ecSi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField otras_Patologias;
    private javax.swing.JRadioButton pepe1;
    // End of variables declaration//GEN-END:variables

    private void armadoComponentes(){
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(ecSi);
        buttonGroup1.add(ecNo);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(diSi);
        buttonGroup2.add(diNo);
        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(jRadioButton5);
        buttonGroup3.add(jRadioButton6);
        ButtonGroup buttonGroup4 = new ButtonGroup();
        buttonGroup4.add(pepe1);
        buttonGroup4.add(jRadioButton8);
        ButtonGroup buttonGroup5 = new ButtonGroup();
        buttonGroup5.add(jRadioButton9);
        buttonGroup5.add(jRadioButton10);
        ButtonGroup buttonGroup6 = new ButtonGroup();
        buttonGroup6.add(jRadioButton11);
        buttonGroup6.add(jRadioButton12);
        ButtonGroup buttonGroup7 = new ButtonGroup();
        buttonGroup7.add(jRadioButton13);
        buttonGroup7.add(jRadioButton14);
        ButtonGroup buttonGroup8 = new ButtonGroup();
        buttonGroup8.add(jRadioButton15);
        buttonGroup8.add(jRadioButton16);
        ButtonGroup buttonGroup9 = new ButtonGroup();
        buttonGroup9.add(jRadioButton17);
        buttonGroup9.add(jRadioButton18);
            
        ecNo.setSelected(true);
        diNo.setSelected(true);
        jRadioButton6.setSelected(true);
        jRadioButton8.setSelected(true);
        jRadioButton10.setSelected(true);
        jRadioButton12.setSelected(true);
        jRadioButton14.setSelected(true);
        jRadioButton16.setSelected(true);
        jRadioButton18.setSelected(true);

        if (patologias.contains("Cardiovasculares")){ecSi.setSelected(true);}
        if (patologias.contains("Diabetes")){diSi.setSelected(true);}
        if (patologias.contains("Respiratorias_Cronicas")){jRadioButton5.setSelected(true);}  
        if (patologias.contains("Inmunosupresion")){pepe1.setSelected(true);}  
        if (patologias.contains("Obesidad")){jRadioButton9.setSelected(true);}  
        if (patologias.contains("Renales_Cronicas")){jRadioButton11.setSelected(true);} 
        if (patologias.contains("Embarazo")){jRadioButton13.setSelected(true);}  
        if (patologias.contains("Hepaticas_cronicas")){jRadioButton15.setSelected(true);}  
        if (patologias.contains("Neurologicas")){jRadioButton17.setSelected(true);}  
    }

    
    private void actualizarDatosModificados(){
        ArrayList <String> nuevasPatologias = new ArrayList();
        ArrayList <String> patologias_Agregar = new ArrayList();
        ArrayList <String> patologias_Sacar = new ArrayList();
        
       if (ecSi.isSelected()){nuevasPatologias.add("Cardiovasculares");}
       if (diSi.isSelected()){nuevasPatologias.add("Diabetes");}
       if (jRadioButton5.isSelected()){nuevasPatologias.add("Respiratorias_Cronicas");}
       if (pepe1.isSelected()){nuevasPatologias.add("Inmunosupresion");}
       if (jRadioButton9.isSelected()){nuevasPatologias.add("Obesidad");}
       if (jRadioButton11.isSelected()){nuevasPatologias.add("Renales_Cronicas");}
       if (jRadioButton13.isSelected()){nuevasPatologias.add("Embarazo");}
       if (jRadioButton15.isSelected()){nuevasPatologias.add("Hepaticas_cronicas");}
       if (jRadioButton17.isSelected()){nuevasPatologias.add("Neurologicas");}
       
        for (String patologia : nuevasPatologias) {
            if(!patologias.contains(patologia)){
                patologias_Agregar.add(patologia);
            }
        }
       
        for (String patologia : patologias) {
            if (!nuevasPatologias.contains(patologia)){
                patologias_Sacar.add(patologia);
            }
        }
       
        cD.actualiarPatologias(DNI, patologias_Agregar, patologias_Sacar, otras_Patologias.getText());
        
      }
        
}
        
        

