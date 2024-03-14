package Vistas.Vistas_Centros;

import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Entidades.Vacunatorio;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Centro_Principal extends javax.swing.JFrame {

    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private VacunatorioData vD = new VacunatorioData();
    private CiudadanoData cD = new CiudadanoData();
    private TurnoData tD = new TurnoData();
    private boolean ingresoEnProgreso = false;
      
        public Centro_Principal() {
        initComponents();
        jList1.setModel(listModel);
    }
        
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img_Centro = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        img_Pantalla_Centro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Centro de Salud");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 628));
        setSize(new java.awt.Dimension(800, 628));

        img_Centro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CENTRO-03.png"))); // NOI18N
        img_Centro.setMaximumSize(new java.awt.Dimension(250, 600));
        img_Centro.setMinimumSize(new java.awt.Dimension(250, 600));
        img_Centro.setPreferredSize(new java.awt.Dimension(250, 600));

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(550, 600));

        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(85, 106, 124));
        jScrollPane2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jList1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jList1.setForeground(new java.awt.Color(85, 106, 124));
        jScrollPane2.setViewportView(jList1);

        jDesktopPane1.add(jScrollPane2);
        jScrollPane2.setBounds(120, 380, 310, 130);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(85, 106, 124));
        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jDesktopPane1.add(jTextField1);
        jTextField1.setBounds(120, 290, 320, 20);

        img_Pantalla_Centro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/FONDO_CENTRO-04.png"))); // NOI18N
        jDesktopPane1.add(img_Pantalla_Centro);
        img_Pantalla_Centro.setBounds(0, 0, 550, 601);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(img_Centro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_Centro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try {
            String inputText = jTextField1.getText();
            if (!inputText.isEmpty()) {
                if (Character.isLetter(inputText.charAt(0))) {
                    armarTabla(inputText, 0);
                } else if (Character.isDigit(inputText.charAt(0))) {
                    armarTabla(null, Integer.parseInt(inputText));
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código Incorrecto");
        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(Centro_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Centro_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Centro_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Centro_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Centro_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_Centro;
    private javax.swing.JLabel img_Pantalla_Centro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables



    public void armarTabla(String centro, int idCentro) {
        listModel.clear(); // Limpiar la lista antes de llenarla nuevamente

        if (centro != null) {
            for (Vacunatorio centros : vD.listarVacunatorioNombre(centro)) {
                listModel.addElement(centros.getNombre() + " - " + centros.getIdVacunatorio());
            }
        } else if (centro == null) {
            Vacunatorio centros = vD.buscarVacunatorio(idCentro);
            if (centros != null) {
                listModel.addElement(centros.getNombre() + " - " + centros.getIdVacunatorio());
            }
        }

        JFrame frame = new JFrame("Ingreso a centro");
       
    jList1.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2 && !ingresoEnProgreso) {
            ingresoEnProgreso = true; 
            int indice = jList1.getSelectedIndex();
            if (indice != -1) {
                String selectedValue = jList1.getModel().getElementAt(indice);
                String[] partesLista = selectedValue.split(" - ");
                if (partesLista.length == 2) {
                    int idCentro = Integer.parseInt(partesLista[1]);
                    Object[] options = {"Ingresar", "Cerrar"};
                    int result = JOptionPane.showOptionDialog(frame,
                            "Ingresar a " + selectedValue,
                            "Mensaje",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            options,
                            options[0]);

                    if (result == JOptionPane.YES_OPTION) {
                        Administrador aD = new Administrador(cD, tD, vD.buscarVacunatorio(idCentro));
                        jDesktopPane1.add(aD);
                        aD.setVisible(true);
                    }
                }
            }
            ingresoEnProgreso = false; 
        }
    }
});
        
    }






}
