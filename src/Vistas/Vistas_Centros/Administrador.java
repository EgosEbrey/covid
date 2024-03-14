package Vistas.Vistas_Centros;

import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.VialData;
import Entidades.Ciudadano;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.Vial;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Administrador extends javax.swing.JInternalFrame {

    private VacunatorioData vD = new VacunatorioData();
    private CiudadanoData cD;
    private TurnoData tD;
    private Ciudadano c1;
    private Turno turno1;
    private Turno turno_nuevo;
    private ArrayList<Turno> listaTurnos;
    private Vial vial2;
    private Vacunatorio vac;
    private DefaultTableModel modelo_tabla2 = new DefaultTableModel();
    
    private VialData sD = new VialData();

    public Administrador(CiudadanoData cD, TurnoData tD, Vacunatorio vac) {
        this.cD = cD;
        this.tD = tD;
        this.vac = vac;
        initComponents();
        armarComponentesVisuales();
        jButton_ModificarDatos.setEnabled(false);
        jButton4.setEnabled(false);
        Continuar.setEnabled(false);
        jTabbedPane2.setEnabledAt(1, false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox_mail = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox_patologias = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_patologias = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        Edad1 = new javax.swing.JLabel();
        jCheckBox_fechaNac = new javax.swing.JCheckBox();
        jDC_fechaNac = new com.toedter.calendar.JDateChooser();
        jCheckBox_apellido = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox_nombre = new javax.swing.JCheckBox();
        jText_DNI = new javax.swing.JTextField();
        jCheckBox_dosis = new javax.swing.JCheckBox();
        jText_Apellido = new javax.swing.JTextField();
        jCheckBox_ocupacion = new javax.swing.JCheckBox();
        jText_Ocupacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jText_Dosis = new javax.swing.JTextField();
        jText_Celular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox_celular = new javax.swing.JCheckBox();
        jText_Nombre = new javax.swing.JTextField();
        jText_email = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jText_fechaTur = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jText_estadoTur = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jText_centroTur = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton_nuevoTur_cancelado = new javax.swing.JButton();
        Continuar = new javax.swing.JButton();
        jButton_ModificarDatos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Marca3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jText_MarcaVial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jText_numeroVial = new javax.swing.JTextField();
        jText_antigenoVial = new javax.swing.JTextField();
        Marca = new javax.swing.JLabel();
        jText_fechaVencVial = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        Marca4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDC_proximoTur = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jS_Jhon = new javax.swing.JSpinner();
        jS_Astra = new javax.swing.JSpinner();
        jS_Sino = new javax.swing.JSpinner();
        jS_Spuk = new javax.swing.JSpinner();
        jRB_Pfi = new javax.swing.JRadioButton();
        jRB_jhon = new javax.swing.JRadioButton();
        jRB_Astra = new javax.swing.JRadioButton();
        jRB_Sino = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jRB_Spuk = new javax.swing.JRadioButton();
        jS_Pfizer = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        jCheckBox_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_mailActionPerformed(evt);
            }
        });

        jLabel10.setText("E-mail");

        Edad.setText("Dosis Aplicadas");

        jLabel4.setText("Patologias");

        jCheckBox_patologias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_patologiasActionPerformed(evt);
            }
        });

        jList_patologias.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jList_patologiasComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(jList_patologias);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Control Datos Personales");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Edad1.setText("Fecha Nac.");

        jCheckBox_fechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_fechaNacActionPerformed(evt);
            }
        });

        jCheckBox_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_apellidoActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI:");

        jCheckBox_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_nombreActionPerformed(evt);
            }
        });

        jText_DNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_DNIFocusLost(evt);
            }
        });
        jText_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_DNIActionPerformed(evt);
            }
        });

        jCheckBox_dosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_dosisActionPerformed(evt);
            }
        });

        jCheckBox_ocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ocupacionActionPerformed(evt);
            }
        });

        jLabel9.setText("Celular");

        jText_Dosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_DosisActionPerformed(evt);
            }
        });

        jText_Celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_CelularActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido");

        jCheckBox_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_celularActionPerformed(evt);
            }
        });

        Nombre.setText("Nombre");

        jLabel3.setText("Ocupacion");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Control Datos Turno");

        jLabel14.setText("Estado");

        jLabel6.setText("Lugar");

        jText_centroTur.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_centroTurFocusLost(evt);
            }
        });
        jText_centroTur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_centroTurActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha");

        jButton_nuevoTur_cancelado.setText("Nuevo Turno");
        jButton_nuevoTur_cancelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoTur_canceladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton_nuevoTur_cancelado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(143, 143, 143))))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jText_fechaTur, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                                .addComponent(jText_centroTur)))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(jText_estadoTur, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_nuevoTur_cancelado)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jText_estadoTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jText_centroTur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jText_fechaTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Continuar.setText("Continuar");
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });

        jButton_ModificarDatos.setText("Modificar Datos");
        jButton_ModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarDatosActionPerformed(evt);
            }
        });

        jButton4.setText("Actualizar Datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cerrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox_apellido)
                                            .addComponent(jCheckBox_celular))
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(Nombre))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(Edad1)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_Dosis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDC_fechaNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_mail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_patologias, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_fechaNac, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_dosis, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_ocupacion, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(167, 167, 167))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)
                        .addGap(87, 87, 87)
                        .addComponent(jButton_ModificarDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Continuar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Edad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_DNI, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jCheckBox_dosis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_Dosis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCheckBox_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_Nombre)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Edad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_fechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDC_fechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_Celular)
                    .addComponent(jCheckBox_celular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCheckBox_ocupacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_Ocupacion, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCheckBox_mail, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox_patologias, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Continuar)
                    .addComponent(jButton4)
                    .addComponent(jButton_ModificarDatos)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Control Datos", jPanel1);

        jButton8.setText("Cerrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Marca3.setText("Fecha Vencimento");
        Marca3.setDoubleBuffered(true);

        jButton3.setText("Confirmar Turno");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText("Marca:");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setDoubleBuffered(true);

        jLabel12.setText("Numero Serie");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setDoubleBuffered(true);

        Marca.setText("Antigeno");
        Marca.setDoubleBuffered(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_antigenoVial, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_numeroVial, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_MarcaVial, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Marca3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jText_fechaVencVial, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_MarcaVial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_numeroVial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_antigenoVial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_fechaVencVial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marca3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Marca4.setText("Nueva Fecha");

        jButton2.setText("Programar Nuevo Turno");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Marca4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jDC_proximoTur, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDC_proximoTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Marca4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Confirmacion Turno", jPanel2);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel5FocusGained(evt);
            }
        });

        jLabel15.setText("Desde");

        jLabel16.setText("Hasta");

        jButton1.setText("Reprogramar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel18.setText("Reprogramar Turnos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel19.setText("Stocks Disponibles");

        jRB_Pfi.setText("Pfizer");
        jRB_Pfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_PfiActionPerformed(evt);
            }
        });

        jRB_jhon.setText("Johnson Johnson");
        jRB_jhon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_jhonActionPerformed(evt);
            }
        });

        jRB_Astra.setText("AstraZeneca");
        jRB_Astra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_AstraActionPerformed(evt);
            }
        });

        jRB_Sino.setText("Sinopharm y Sinovac");
        jRB_Sino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_SinoActionPerformed(evt);
            }
        });

        jButton6.setText("Pedir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jRB_Spuk.setText("Sputnik V");
        jRB_Spuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_SpukActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel17.setText("Solicitar Stocks de Viales");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRB_jhon)
                    .addComponent(jRB_Pfi)
                    .addComponent(jRB_Astra))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jS_Pfizer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jS_Jhon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jS_Astra, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRB_Sino)
                                    .addComponent(jRB_Spuk))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jS_Spuk, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jS_Sino, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jRB_jhon)
                            .addComponent(jS_Jhon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jRB_Pfi)
                            .addComponent(jS_Pfizer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jRB_Sino)
                            .addComponent(jS_Sino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jRB_Spuk)
                            .addComponent(jS_Spuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jRB_Astra)
                                    .addComponent(jS_Astra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton6)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton10.setText("Cerrar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel19))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Generales", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_centroTurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_centroTurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_centroTurActionPerformed

    private void jText_centroTurFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_centroTurFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_centroTurFocusLost

    private void jText_DosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_DosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_DosisActionPerformed

    private void jText_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_DNIActionPerformed

    private void jText_DNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_DNIFocusLost
       int turnoCA = 0, pendiente = 0;
        try {
            if (!cD.buscarCiudadanos(Integer.parseInt(jText_DNI.getText()), "DNI").isEmpty()) {
                    c1 = cD.buscarCiudadanos(Integer.parseInt(jText_DNI.getText()), "DNI").get(0);
                    if (!tD.listar_Turnos(null, null, "DNI", null, Integer.parseInt(jText_DNI.getText())).isEmpty()) {
                        if (c1.getDosisAplicadas() < 3) {
                            for (Turno listaTurno : tD.listar_Turnos(null, null, "DNI", null, Integer.parseInt(jText_DNI.getText()))) {
                                if (listaTurno.isEstado().equals("Pendiente")) {
                                    buscarTurnosPersona();
                                    pendiente++;
                                } 
                                if (listaTurno.isEstado().equalsIgnoreCase("Ausente") || listaTurno.isEstado().equalsIgnoreCase("cancelado")){
                                   turnoCA++;
                                }
                                } 
                            if (turnoCA>0 || pendiente == 0){
                                 JOptionPane.showMessageDialog(null, "Usuario sin turno pendiente asignado");
                            }
                        } else {
                        JOptionPane.showMessageDialog(null, "Calendario Vacunacion Completo");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario sin turno asignado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario Inexistente");
                }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato DNI incorrecto");
            jText_DNI.setText("");
        }
    }//GEN-LAST:event_jText_DNIFocusLost

    private void jButton_ModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarDatosActionPerformed
        modificarDatosCiudadano();
    }//GEN-LAST:event_jButton_ModificarDatosActionPerformed

    private void jCheckBox_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_apellidoActionPerformed
        if (jCheckBox_apellido.isSelected()) {
            jText_Apellido.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_apellido.isSelected()) {
            jText_Apellido.setEditable(false);
            jText_Apellido.setText(c1.getApellido());
            if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()) {
                jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_apellidoActionPerformed

    private void jCheckBox_dosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_dosisActionPerformed
        if (jCheckBox_dosis.isSelected()) {
            jText_Dosis.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_dosis.isSelected()) {
            jText_Dosis.setEditable(false);
            jText_Dosis.setText(Integer.toString(c1.getDosisAplicadas()));
            if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()) {
                jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_dosisActionPerformed

    private void jCheckBox_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_nombreActionPerformed
        if (jCheckBox_nombre.isSelected()) {
            jText_Nombre.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_nombre.isSelected()) {
            jText_Nombre.setEditable(false);
            jText_Nombre.setText(c1.getNombre());
            if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()) {
                jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_nombreActionPerformed

    private void jCheckBox_ocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ocupacionActionPerformed
        if (jCheckBox_ocupacion.isSelected()) {
            jText_Ocupacion.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_ocupacion.isSelected()) {
            jText_Ocupacion.setEditable(false);
            jText_Ocupacion.setText(c1.getAmbitoTrabajo());
            if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()) {
                jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_ocupacionActionPerformed

    private void jCheckBox_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_celularActionPerformed
        if (jCheckBox_celular.isSelected()) {
            jText_Celular.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_celular.isSelected()) {
            jText_Celular.setEditable(false);
            jText_Celular.setText(Long.toString(c1.getCelular()));
            if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()) {
                jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_celularActionPerformed

    private void jCheckBox_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_mailActionPerformed
        if (jCheckBox_mail.isSelected()) {
            jText_email.setEditable(true);
            jButton4.setEnabled(true);
        } else if (!jCheckBox_mail.isSelected()) {
            jText_email.setEditable(false);
            jText_email.setText(c1.getEmail());
            if (!jCheckBox_apellido.isSelected() && !jCheckBox_nombre.isSelected() && !jCheckBox_celular.isSelected() && !jCheckBox_dosis.isSelected() && !jCheckBox_mail.isSelected() && !jCheckBox_ocupacion.isSelected()) {
                jButton4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jCheckBox_mailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton2.setEnabled(true);
        jButton8.setEnabled(true);
        nuevoTurno();
        jDC_proximoTur.setEnabled(true);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        actualizarDatos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox_patologiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_patologiasActionPerformed
        if (jCheckBox_patologias.isSelected()) {
            PatologiasADM pAD = new PatologiasADM(c1.getDNI(), cD);
            pAD.setVisible(true);
            
        }
    }//GEN-LAST:event_jCheckBox_patologiasActionPerformed

    private void jList_patologiasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jList_patologiasComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jList_patologiasComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tomarNuevoTurno(jDC_proximoTur.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
            this.vial2 = tD.buscar_VialParaAsignar(c1).get(0);
            completarDatosFinales(vial2);
            tD.actualizar_VialFecha_TurnoData(vial2, turno1, c1);
            jTabbedPane2.setEnabledAt(1, true);
            jTabbedPane2.setSelectedIndex(1);
        
    }//GEN-LAST:event_ContinuarActionPerformed

    private void jButton_nuevoTur_canceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoTur_canceladoActionPerformed
        nuevoTurno_turno1Cancelado();
    }//GEN-LAST:event_jButton_nuevoTur_canceladoActionPerformed

    private void jCheckBox_fechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_fechaNacActionPerformed
        if (jCheckBox_patologias.isSelected()) {
            jDC_fechaNac.setEnabled(true);
        } else if (!jCheckBox_patologias.isSelected()) {
            jDC_fechaNac.setEnabled(false);
            jDC_fechaNac.setDate(Date.valueOf(c1.getFechaNacimiento()));
        }
    }//GEN-LAST:event_jCheckBox_fechaNacActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reprogramarTurnos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pedirStocks();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jRB_PfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_PfiActionPerformed
        if (jRB_Pfi.isSelected()) {
            jS_Pfizer.setEnabled(true);
            jButton6.setEnabled(true);
        } else {
            jS_Pfizer.setEnabled(false);
            jButton6.setEnabled(false);
        }
    }//GEN-LAST:event_jRB_PfiActionPerformed

    private void jRB_jhonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_jhonActionPerformed
        if (jRB_jhon.isSelected()) {
            jS_Jhon.setEnabled(true);
            jButton6.setEnabled(true);
        } else {
            jS_Jhon.setEnabled(false);
            jButton6.setEnabled(false);
        }
    }//GEN-LAST:event_jRB_jhonActionPerformed

    private void jRB_AstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_AstraActionPerformed
        if (jRB_Astra.isSelected()) {
            jS_Astra.setEnabled(true);
            jButton6.setEnabled(true);
        } else {
            jS_Astra.setEnabled(false);
            jButton6.setEnabled(false);
        }
    }//GEN-LAST:event_jRB_AstraActionPerformed

    private void jRB_SinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_SinoActionPerformed
        if (jRB_Sino.isSelected()) {
            jS_Sino.setEnabled(true);
            jButton6.setEnabled(true);
        } else {
            jS_Sino.setEnabled(false);
            jButton6.setEnabled(false);
        }
    }//GEN-LAST:event_jRB_SinoActionPerformed

    private void jRB_SpukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_SpukActionPerformed
        if (jRB_Spuk.isSelected()) {
            jS_Spuk.setEnabled(true);
        } else {
            jS_Spuk.setEnabled(false);
            jButton6.setEnabled(false);
        }
    }//GEN-LAST:event_jRB_SpukActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jPanel5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel5FocusGained
        jDateChooser1.setEnabled(true);
        jDateChooser2.setEnabled(true);
        jButton1.setEnabled(true);
        jDateChooser1.setDate(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jDateChooser2.setDate(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }//GEN-LAST:event_jPanel5FocusGained

    private void jText_CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_CelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_CelularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continuar;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Edad1;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Marca3;
    private javax.swing.JLabel Marca4;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton_ModificarDatos;
    private javax.swing.JButton jButton_nuevoTur_cancelado;
    private javax.swing.JCheckBox jCheckBox_apellido;
    private javax.swing.JCheckBox jCheckBox_celular;
    private javax.swing.JCheckBox jCheckBox_dosis;
    private javax.swing.JCheckBox jCheckBox_fechaNac;
    private javax.swing.JCheckBox jCheckBox_mail;
    private javax.swing.JCheckBox jCheckBox_nombre;
    private javax.swing.JCheckBox jCheckBox_ocupacion;
    private javax.swing.JCheckBox jCheckBox_patologias;
    private com.toedter.calendar.JDateChooser jDC_fechaNac;
    private com.toedter.calendar.JDateChooser jDC_proximoTur;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList_patologias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRB_Astra;
    private javax.swing.JRadioButton jRB_Pfi;
    private javax.swing.JRadioButton jRB_Sino;
    private javax.swing.JRadioButton jRB_Spuk;
    private javax.swing.JRadioButton jRB_jhon;
    private javax.swing.JSpinner jS_Astra;
    private javax.swing.JSpinner jS_Jhon;
    private javax.swing.JSpinner jS_Pfizer;
    private javax.swing.JSpinner jS_Sino;
    private javax.swing.JSpinner jS_Spuk;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jText_Apellido;
    private javax.swing.JTextField jText_Celular;
    private javax.swing.JTextField jText_DNI;
    private javax.swing.JTextField jText_Dosis;
    private javax.swing.JTextField jText_MarcaVial;
    private javax.swing.JTextField jText_Nombre;
    private javax.swing.JTextField jText_Ocupacion;
    private javax.swing.JTextField jText_antigenoVial;
    private javax.swing.JTextField jText_centroTur;
    private javax.swing.JTextField jText_email;
    private javax.swing.JTextField jText_estadoTur;
    private javax.swing.JTextField jText_fechaTur;
    private javax.swing.JTextField jText_fechaVencVial;
    private javax.swing.JTextField jText_numeroVial;
    // End of variables declaration//GEN-END:variables

    private void armarComponentesVisuales() {
        jCheckBox_patologias.setVisible(false);
        jText_Apellido.setEditable(false);
        jText_Ocupacion.setEditable(false);
        jText_Dosis.setEditable(false);
        jText_Nombre.setEditable(false);
        jText_Celular.setEditable(false);
        jText_email.setEditable(false);
        jText_centroTur.setEditable(false);
        jText_fechaTur.setEditable(false);
        jCheckBox_apellido.setVisible(false);
        jCheckBox_dosis.setVisible(false);
        jCheckBox_nombre.setVisible(false);
        jCheckBox_ocupacion.setVisible(false);
        jCheckBox_celular.setVisible(false);
        jCheckBox_mail.setVisible(false);
        jButton4.setEnabled(false);
        jButton_ModificarDatos.setEnabled(false);
        jDC_fechaNac.setEnabled(false);
        jButton2.setEnabled(false);
        jS_Pfizer.setEnabled(false);
        jS_Jhon.setEnabled(false);
        jS_Astra.setEnabled(false);
        jS_Sino.setEnabled(false);
        jS_Spuk.setEnabled(false);
        jButton6.setEnabled(false);
        jCheckBox_fechaNac.setVisible(false);
        jDC_proximoTur.setEnabled(false);
        jButton8.setEnabled(false);
        jButton2.setEnabled(false);
        jText_MarcaVial.setEditable(false);
        jText_numeroVial.setEditable(false);
        jText_antigenoVial.setEditable(false);
        jText_fechaVencVial.setEditable(false);
        
        JLabel titleLabel = new JLabel("Stocks");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    
        String[] lista_viales = {"Pfizer", "Johnson", "AstraZeneca", "Sinopharm", "Sputnik V"};
        for (String lista_viale : lista_viales) {
            modelo_tabla2.addColumn(lista_viale);
        }
        jTable2.setModel(modelo_tabla2);
        calcularStocks();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER); 
        for (int i = 0; i < jTable2.getColumnCount(); i++) {
            jTable2.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        JTableHeader header = jTable2.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void buscarTurnosPersona() {
        jButton2.setEnabled(true);
        jButton_nuevoTur_cancelado.setEnabled(true);
        jButton_ModificarDatos.setEnabled(true);
        Continuar.setEnabled(true);
       
        listaTurnos = tD.listar_Turnos(null, null, "DNI", null, Integer.parseInt(jText_DNI.getText()));
        for (Turno listaTurno : listaTurnos) {
            if (listaTurno.isEstado().equals("Pendiente")) {
                if (listaTurno.getVacunatorio().getIdVacunatorio() != vac.getIdVacunatorio()) {
                    JOptionPane.showMessageDialog(null, "El centro de vacunacion no corresponde, su centro es " + listaTurno.getVacunatorio().getNombre());
                    Continuar.setEnabled(false);
                    jButton4.setEnabled(false);
                    jButton_ModificarDatos.setEnabled(false);
                } else {
                    
                }
            }
        }
        jText_Apellido.setText(c1.getApellido());
        jText_Nombre.setText(c1.getNombre());
        jText_Ocupacion.setText(c1.getAmbitoTrabajo());
        jText_Dosis.setText(Integer.toString(c1.getDosisAplicadas()));
        jText_Celular.setText(Long.toString(c1.getCelular()));
        jText_email.setText(c1.getEmail());
        jDC_fechaNac.setDate(Date.valueOf(c1.getFechaNacimiento()));

        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (String patologias : c1.getPatologias()){
            modelo.addElement(patologias);
        }
        if (modelo.getSize() == 0) {
            modelo.addElement("No hay patologias declaradas");
        } 
        
        jList_patologias.setModel(modelo);

        turno1 = listaTurnos.get(0);
        for (Turno turno : listaTurnos) {
            if (turno.getFecha().isAfter(turno1.getFecha())) {
                turno1 = turno;
            }
        }
        jText_estadoTur.setText(turno1.isEstado());
        jText_centroTur.setText(turno1.getVacunatorio().getNombre());
        jText_fechaTur.setText(turno1.getFecha().toLocalDate() + " " + Integer.toString(turno1.getFecha().getHour()) + "hs");
        }

    private void modificarDatosCiudadano() {
        jCheckBox_patologias.setVisible(true);
        jCheckBox_apellido.setVisible(true);
        jCheckBox_dosis.setVisible(true);
        jCheckBox_nombre.setVisible(true);
        jCheckBox_ocupacion.setVisible(true);
        jCheckBox_celular.setVisible(true);
        jCheckBox_mail.setVisible(true);
        jCheckBox_fechaNac.setVisible(true);
    }

    private void actualizarDatos() {
        try {
            if (Pattern.matches("^[a-zA-Z]+$", jText_Apellido.getText()) && Pattern.matches("^[a-zA-Z]+$", jText_Nombre.getText()) && Pattern.matches("^[0-9]+$", jText_Celular.getText())) {
                cD.actualizarDatosCiudadano(c1, jText_Apellido.getText(), jCheckBox_apellido.isSelected(),
                        jText_Nombre.getText(), jCheckBox_nombre.isSelected(),
                        jText_Celular.getText(), jCheckBox_celular.isSelected(),
                        jText_Dosis.getText(), jCheckBox_dosis.isSelected(),
                        jText_Ocupacion.getText(), jCheckBox_ocupacion.isSelected(),
                        jText_email.getText(), jCheckBox_mail.isSelected(),
                        jDC_fechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jCheckBox_fechaNac.isSelected());
            } else {
                JOptionPane.showMessageDialog(null, "Controle los datos");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Controle los datos");
        }
    }

    private void completarDatosFinales(Vial vial) {
        jText_antigenoVial.setText(vial.getAntigeno());
        jText_numeroVial.setText(Integer.toString(vial.getNumeroSerie()));
        jText_MarcaVial.setText(vial.getMarca());
        jText_fechaVencVial.setText(vial.getFechaVencimiento().toString());
    }

    private LocalDate nuevoTurno() {
        if (c1.getDosisAplicadas() < 2) {
            int turnos_libres;
            LocalDate fecha1 = LocalDate.now().plusDays(28);

            do {
                turnos_libres = tD.buscarTurnoLibre_porTurnosLibres(fecha1, turno1.getVacunatorio());
                fecha1 = fecha1.plusDays(1);
            } while (turnos_libres <= 0);

            jDC_proximoTur.setDate(java.sql.Date.valueOf(fecha1.minusDays(1)));
            return fecha1.minusDays(1);
        } else {
            jButton2.setEnabled(false);
            jButton2.setVisible(false);
            jButton_nuevoTur_cancelado.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Calendario Completo");
            return null;
        }
    }

    private void tomarNuevoTurno(LocalDate fecha1) {
        turno_nuevo = new Turno();
        turno_nuevo.setFecha(fecha1.atStartOfDay());
        turno_nuevo.setVacunatorio(turno1.getVacunatorio());
        tD.updateTurno_Libre(turno_nuevo);
        c1.setTurno(turno_nuevo);
        if (!turno1.isEstado().equalsIgnoreCase("Cancelado")) {
            c1.setDosisAplicadas(c1.getDosisAplicadas() + 1);
        } else {
            c1.setDosisAplicadas(c1.getDosisAplicadas());
        }
        int updates = cD.cargarTurno(c1);
        if (updates > 0) {
            tD.actualizarTurnero_Hora(c1.getTurno());
        }
    }

    private void nuevoTurno_turno1Cancelado() {
        int turnos_libres;
        LocalDate fecha1 = LocalDate.now().plusDays(15);

        do {
            turnos_libres = tD.buscarTurnoLibre_porTurnosLibres(fecha1, turno1.getVacunatorio());
            fecha1 = fecha1.plusDays(1);
        } while (turnos_libres <= 0);

        tomarNuevoTurno(fecha1.minusDays(1));
    }

    private void calcularStocks() {
        modelo_tabla2.setRowCount(0);
        int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0, total = 0;
        for (Vial viales : sD.listarViales(0, vac.getIdVacunatorio())) {
            switch (viales.getMarca()) {
                case "Sputnik V":
                    Sputnik++;
                    total++;
                    break;
                case "Pfizer":
                    Pfizer++;
                    total++;
                    break;
                case "Sinopharm y Sinovac":
                    Sinopharm++;
                    total++;
                    break;
                case "Johnson_Johnson":
                    Johnson++;
                    total++;
                    break;
                case "AstraZeneca":
                    AstraZeneca++;
                    total++;
                    break;
            }
        }
        modelo_tabla2.addRow(new Object[]{Pfizer, Johnson, AstraZeneca,Sinopharm,Sputnik});
        }

    private void reprogramarTurnos() {
        for (Turno turno : tD.listar_Turnos(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), vac, "postergar", jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 0)) {
            int turnos_libres = 0;
            LocalDate fecha = LocalDate.now().plusDays(14);
            while (turnos_libres == 0) {
                turnos_libres = tD.buscarTurnoLibre_porTurnosLibres(fecha, vac);
                fecha = fecha.plusDays(1);
            }
            turno.setFecha(fecha.minusDays(1).atStartOfDay());
            tD.updateTurno_Libre(turno);
            tD.actualizarFechaTurno(turno);
        }
    }

    private void pedirStocks() {
        vD.pedirStocks(vac, Integer.parseInt(jS_Spuk.getValue().toString()), jRB_Spuk.isSelected(),
                Integer.parseInt(jS_Jhon.getValue().toString()), jRB_jhon.isSelected(),
                Integer.parseInt(jS_Sino.getValue().toString()), jRB_Sino.isSelected(),
                Integer.parseInt(jS_Astra.getValue().toString()), jRB_Astra.isSelected(),
                Integer.parseInt(jS_Pfizer.getValue().toString()), jRB_Pfi.isSelected());
    }
}
