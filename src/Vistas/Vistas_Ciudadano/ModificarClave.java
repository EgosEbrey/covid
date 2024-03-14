package Vistas.Vistas_Ciudadano;

import Conexion.LoginData;

public class ModificarClave extends javax.swing.JFrame {

    private LoginData lD = new LoginData();
    private static int usuario;
    private String clave_nueva;
      
    public ModificarClave(int usuario) {
       this.usuario = usuario;
        initComponents();
        jLabel5.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jP_cV = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jP_cN1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jP_cN2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        showPass = new javax.swing.JToggleButton();
        showPass1 = new javax.swing.JToggleButton();
        showPass2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setBackground(new java.awt.Color(255, 51, 102));
        jLabel4.setFont(new java.awt.Font("ArianLT-Bold", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CAMBIAR CONTRASEÑA");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jLabel1.setText("Clave antigüa");

        jP_cV.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jLabel2.setText("Clave nueva");

        jP_cN1.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        jP_cN1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jP_cN1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("ArianLT-Demi", 3, 18)); // NOI18N
        jLabel3.setText("Repetir clave");

        jP_cN2.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        jP_cN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP_cN2MouseExited(evt);
            }
        });
        jP_cN2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jP_cN2KeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("ArianLT-Demi", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Las contraseñas no coinciden");
        jLabel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel5ComponentShown(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton2.setText("CERRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 3, 14)); // NOI18N
        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        showPass.setBackground(new java.awt.Color(0, 102, 0));
        showPass.setForeground(new java.awt.Color(255, 102, 0));
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/OJO 02-05.png"))); // NOI18N
        showPass.setToolTipText("");
        showPass.setBorder(null);
        showPass.setBorderPainted(false);
        showPass.setContentAreaFilled(false);
        showPass.setFocusPainted(false);
        showPass.setFocusable(false);
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        showPass1.setBackground(new java.awt.Color(0, 102, 0));
        showPass1.setForeground(new java.awt.Color(255, 102, 0));
        showPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/OJO 02-05.png"))); // NOI18N
        showPass1.setToolTipText("");
        showPass1.setBorder(null);
        showPass1.setBorderPainted(false);
        showPass1.setContentAreaFilled(false);
        showPass1.setFocusPainted(false);
        showPass1.setFocusable(false);
        showPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPass1ActionPerformed(evt);
            }
        });

        showPass2.setBackground(new java.awt.Color(0, 102, 0));
        showPass2.setForeground(new java.awt.Color(255, 102, 0));
        showPass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/OJO 02-05.png"))); // NOI18N
        showPass2.setToolTipText("");
        showPass2.setBorder(null);
        showPass2.setBorderPainted(false);
        showPass2.setContentAreaFilled(false);
        showPass2.setFocusPainted(false);
        showPass2.setFocusable(false);
        showPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPass2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jP_cN2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jP_cN1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jP_cV, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP_cV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(showPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP_cN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jP_cN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(showPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jP_cN1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP_cN1KeyReleased
        jLabel5.setVisible(false);
    }//GEN-LAST:event_jP_cN1KeyReleased

    private void jP_cN2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_cN2MouseExited

    }//GEN-LAST:event_jP_cN2MouseExited

    private void jP_cN2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jP_cN2KeyReleased
        jLabel5.setVisible(false);
    }//GEN-LAST:event_jP_cN2KeyReleased

    private void jLabel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel5ComponentShown

    }//GEN-LAST:event_jLabel5ComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!(jP_cN1.getText().equals(jP_cN2.getText()))){
            jLabel5.setVisible(true);
        } else if ((jP_cN1.getText().equals(jP_cN2.getText())) && (!(jP_cV.equals("")))){
            String contraseniaVieja = jP_cV.getText();
            String contraseniaN1 = jP_cN1.getText();
            int ret = lD.modificarClave(contraseniaVieja, contraseniaN1, usuario);
            if (ret == 0)
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if (showPass.isSelected()) {
            // Mostrar caracteres de la contraseña
            jP_cV.setEchoChar((char) 0); // Esto quita el carácter oculto
        } else {
            // Ocultar caracteres de la contraseña
            jP_cV.setEchoChar('•');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void showPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPass1ActionPerformed

        if (showPass1.isSelected()) {
            // Mostrar caracteres de la contraseña
            jP_cN1.setEchoChar((char) 0); // Esto quita el carácter oculto
        } else {
            // Ocultar caracteres de la contraseña
            jP_cN1.setEchoChar('•');
        }
    }//GEN-LAST:event_showPass1ActionPerformed

    private void showPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPass2ActionPerformed
        if (showPass2.isSelected()) {
            // Mostrar caracteres de la contraseña
            jP_cN2.setEchoChar((char) 0); // Esto quita el carácter oculto
        } else {
            // Ocultar caracteres de la contraseña
            jP_cN2.setEchoChar('•');
        }
    }//GEN-LAST:event_showPass2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ModificarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarClave(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jP_cN1;
    private javax.swing.JPasswordField jP_cN2;
    private javax.swing.JPasswordField jP_cV;
    private javax.swing.JToggleButton showPass;
    private javax.swing.JToggleButton showPass1;
    private javax.swing.JToggleButton showPass2;
    // End of variables declaration//GEN-END:variables
}
