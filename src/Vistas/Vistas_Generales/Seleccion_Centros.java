package Vistas.Vistas_Generales;

import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Entidades.Vacunatorio;
import Vistas.Vistas_Centros.Administrador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Seleccion_Centros extends javax.swing.JInternalFrame {

    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private VacunatorioData vD = new VacunatorioData();
    private CiudadanoData cD = new CiudadanoData();
    private TurnoData tD = new TurnoData();

    public Seleccion_Centros() {
        initComponents();
        jList1.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setText("Nombre Centro:");

        jScrollPane2.setViewportView(jList1);

        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
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
            boolean entrada = false;
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && !entrada) {
                entrada = true;
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
            }}
        });
        
    }
}
