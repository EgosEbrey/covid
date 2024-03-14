package Vistas.Vistas_ADM;

import Conexion.TurnoData;

public class Ministerio_Salud extends javax.swing.JFrame {

    private TurnoData tD = new TurnoData();
    public Ministerio_Salud() {
        initComponents();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        INGRESAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ministerio de Salud");
        setMinimumSize(new java.awt.Dimension(800, 628));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 628));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/MINISTERIO DE SALUD-03.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 600));

        jDesktopPane1.setBackground(new java.awt.Color(204, 153, 0));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(550, 600));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(550, 600));

        INGRESAR.setFont(new java.awt.Font("ArianLT-Bold", 2, 14)); // NOI18N
        INGRESAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INGRESAR_01-05.png"))); // NOI18N
        INGRESAR.setPreferredSize(new java.awt.Dimension(98, 34));
        INGRESAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INGRESAR_02-05.png"))); // NOI18N
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });
        jDesktopPane1.add(INGRESAR);
        INGRESAR.setBounds(220, 460, 98, 34);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/FONDO_MINISTERIO DE SALUD-04.png"))); // NOI18N
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(0, 0, 551, 601);
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
            Administrador_Centros aC = new Administrador_Centros(tD);
            jDesktopPane1.add(aC);
            aC.setVisible(true);
                   
    }//GEN-LAST:event_INGRESARActionPerformed

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
            java.util.logging.Logger.getLogger(Ministerio_Salud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ministerio_Salud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ministerio_Salud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ministerio_Salud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ministerio_Salud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INGRESAR;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
