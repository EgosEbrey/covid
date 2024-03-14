package Vistas.Vistas_Ciudadano;

import Conexion.CiudadanoData;
import Conexion.LoginData;
import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.geoData;
import Entidades.Ciudadano;
import Entidades.Coordenadas;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.CustomWaypoint;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.table.DefaultTableModel;
import org.jxmapviewer.JXMapKit;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;

public class Inscripcion extends javax.swing.JInternalFrame {

    private geoData gD;
    private VacunatorioData vD;
    private TurnoData tD;
    private LoginData lD;
    private CiudadanoData cD;
    private Coordenadas dtaCorda = new Coordenadas();
    private Ciudadano c1 = new Ciudadano();
    private Turno turno1 = new Turno();
    private Vacunatorio masCercano;
    private Point localizacion;
    private Dimension tamanio;

    public Inscripcion(geoData gD, VacunatorioData vD, TurnoData tD, LoginData lD, CiudadanoData cD, int usuario, Point localizacion, Dimension tamanio) {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.c1 = cD.buscarCiudadanos(usuario, "DNI").get(0);
        this.gD = gD;
        this.vD = vD;
        this.cD = cD;
        this.tD = tD;
        this.lD = lD;
        initComponents();
        armarElementos();
        this.localizacion = localizacion;
        this.tamanio = tamanio;
        jSolapasTurno.setBorder(null);
        jSolapasTurno.setLocation(localizacion);
        jSolapasTurno.setSize(tamanio);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSolapasTurno = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextoApellido = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        TextoDni = new javax.swing.JTextField();
        jTexto_email = new javax.swing.JTextField();
        jCB_ambitoTrabajo = new javax.swing.JComboBox<>();
        jTexto_celular = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton_Siguiente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton_Siguiente1 = new javax.swing.JButton();
        jButton_Siguiente2 = new javax.swing.JButton();
        jDC_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        FONDO_INSCR_DATOS_PERSONALES = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        Diabetes2 = new javax.swing.JLabel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton_siguiente2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        otras_Patologias = new javax.swing.JTextField();
        scrollPane1 = new java.awt.ScrollPane();
        Anterior = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDC_dosis = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Actualizar_3 = new javax.swing.JButton();
        jText_nombreVacunatorio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadio_si = new javax.swing.JRadioButton();
        jRadio_no = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jDC_covid = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadio_altaMedicaSi = new javax.swing.JRadioButton();
        jRadio_altaMedicaNo = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jText_direccionVac = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(550, 600));
        setMinimumSize(new java.awt.Dimension(550, 600));
        setPreferredSize(new java.awt.Dimension(550, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(150, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(150, 34));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextoApellido.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jTextoApellido.setForeground(new java.awt.Color(85, 106, 124));
        jTextoApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextoApellido.setBorder(null);
        jTextoApellido.setOpaque(false);
        jTextoApellido.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 200, 30));

        TextoNombre.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        TextoNombre.setForeground(new java.awt.Color(85, 106, 124));
        TextoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoNombre.setBorder(null);
        TextoNombre.setOpaque(false);
        TextoNombre.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 200, 30));

        TextoDni.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        TextoDni.setForeground(new java.awt.Color(85, 106, 124));
        TextoDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoDni.setBorder(null);
        TextoDni.setOpaque(false);
        TextoDni.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(TextoDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, 30));

        jTexto_email.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jTexto_email.setForeground(new java.awt.Color(85, 106, 124));
        jTexto_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_email.setBorder(null);
        jTexto_email.setOpaque(false);
        jTexto_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTexto_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTexto_emailFocusLost(evt);
            }
        });
        jPanel1.add(jTexto_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 240, 30));

        jCB_ambitoTrabajo.setBorder(null);
        jCB_ambitoTrabajo.setOpaque(false);
        jCB_ambitoTrabajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCB_ambitoTrabajoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCB_ambitoTrabajoFocusLost(evt);
            }
        });
        jPanel1.add(jCB_ambitoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 255, 340, 30));

        jTexto_celular.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jTexto_celular.setForeground(new java.awt.Color(85, 106, 124));
        jTexto_celular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexto_celular.setBorder(null);
        jTexto_celular.setOpaque(false);
        jTexto_celular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTexto_celularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTexto_celularFocusLost(evt);
            }
        });
        jPanel1.add(jTexto_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, 30));

        jButton1.setFont(new java.awt.Font("ArianLT-Bold", 1, 12)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jButton_Siguiente.setFont(new java.awt.Font("ArianLT-Bold", 1, 12)); // NOI18N
        jButton_Siguiente.setText("Siguiente");
        jButton_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        jButton2.setText("Buscar Domicilio");
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton2FocusGained(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 337, 154, -1));

        jButton_Siguiente1.setFont(new java.awt.Font("ArianLT-Bold", 1, 12)); // NOI18N
        jButton_Siguiente1.setText("Actualizar Datos");
        jButton_Siguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Siguiente1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Siguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jButton_Siguiente2.setFont(new java.awt.Font("ArianLT-Bold", 1, 12)); // NOI18N
        jButton_Siguiente2.setText("Actualizar Clave");
        jButton_Siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Siguiente2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        jDC_fechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jDC_fechaNacimiento.setForeground(new java.awt.Color(85, 106, 124));
        jDC_fechaNacimiento.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jDC_fechaNacimiento.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jDC_fechaNacimiento.setOpaque(false);
        jDC_fechaNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDC_fechaNacimientoFocusGained(evt);
            }
        });
        jDC_fechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDC_fechaNacimientoPropertyChange(evt);
            }
        });
        jPanel1.add(jDC_fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 140, 30));

        FONDO_INSCR_DATOS_PERSONALES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_FONDO_DATOS.png"))); // NOI18N
        FONDO_INSCR_DATOS_PERSONALES.setText("jLabel5");
        jPanel1.add(FONDO_INSCR_DATOS_PERSONALES, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 440));

        jSolapasTurno.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_DATOS_PER_01.png")), jPanel1); // NOI18N

        jPanel2.setMaximumSize(new java.awt.Dimension(150, 34));
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 34));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 34));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(550, 440));

        jPanel4.setPreferredSize(new java.awt.Dimension(550, 700));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton11.setText("Si");
        jPanel4.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 199, -1, -1));

        jRadioButton12.setText("No");
        jPanel4.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 199, -1, -1));

        jRadioButton13.setText("Si");
        jPanel4.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 232, -1, -1));

        Diabetes2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Diabetes2.setText("Diabetes");
        jPanel4.add(Diabetes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 137, 28));

        jRadioButton14.setText("No");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 232, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setText("Enfermedades Cardiovasculares");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 37, 225, 28));

        jRadioButton15.setText("Si");
        jPanel4.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 265, -1, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setText("Enfermedades Respiratorias Crónicas");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 103, 208, 28));

        jRadioButton16.setText("No");
        jPanel4.add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 265, -1, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setText("Obesidad");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 164, 137, 28));

        jRadioButton17.setText("Si");
        jPanel4.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 296, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setText("Enfermedades Renales Crónicas");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 197, 208, 28));

        jRadioButton18.setText("No");
        jPanel4.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 296, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setText("Embarazo");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 137, 28));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setText("Otros");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 326, 57, 24));

        jButton_siguiente2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_siguiente2.setText("SIGUIENTE");
        jButton_siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_siguiente2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 112, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setText("Inmunosupresion");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 139, 137, 20));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setText("Enfermedades Hepáticas");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 263, 208, 28));

        jRadioButton1.setText("Si");
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 39, -1, -1));

        jRadioButton2.setText("No");
        jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 39, 41, -1));

        jRadioButton3.setText("Si");
        jPanel4.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 72, -1, -1));

        jRadioButton4.setText("No");
        jPanel4.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 72, -1, -1));

        jRadioButton5.setText("Si");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 105, -1, -1));

        jRadioButton6.setText("No");
        jPanel4.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 105, -1, -1));

        jRadioButton7.setText("Si");
        jPanel4.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 136, -1, -1));

        jRadioButton8.setText("No");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 136, -1, -1));

        jRadioButton9.setText("Si");
        jPanel4.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 166, -1, -1));

        jRadioButton10.setText("No");
        jPanel4.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 166, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setText("Enfermedades Neurológicas");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 296, 208, 25));

        otras_Patologias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otras_PatologiasActionPerformed(evt);
            }
        });
        jPanel4.add(otras_Patologias, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 328, 289, 22));

        scrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPane1.setVisible(false);
        jPanel4.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 0, 0));

        Anterior.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Anterior.setText("ANTERIOR");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });
        jPanel4.add(Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("El suscripto declara bajo juramento que la información precedentemente suministrada \nes auténtica y toma conocimiento de que cualquier falsedad, omisión o inexactitud en \nla misma, deliberada o no,  invalidará la asignacion del cronograma de vacunacion e \nincurrira a la aplicas sanciones administrativas y/o acciones judiciales. ");
        jScrollPane2.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 470, 86));
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 13, -1, -1));

        jCheckBox1.setText("Acepto");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        jCheckBox2.setText("No Acepto");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, -1));

        jLabel19.setBackground(new java.awt.Color(0, 204, 51));
        jLabel19.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" Declaracion jurada de patologias preexistentes:");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel19.setOpaque(true);
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 528, 19));

        jScrollPane1.setViewportView(jPanel4);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 440));

        jSolapasTurno.addTab("         Patologias Previas        ", jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(110, 34));
        jPanel3.setMinimumSize(new java.awt.Dimension(110, 34));
        jPanel3.setPreferredSize(new java.awt.Dimension(110, 34));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setMaximumSize(new java.awt.Dimension(550, 440));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(550, 440));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(550, 440));

        jPanel5.setMaximumSize(new java.awt.Dimension(550, 515));
        jPanel5.setMinimumSize(new java.awt.Dimension(550, 515));
        jPanel5.setPreferredSize(new java.awt.Dimension(550, 515));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(0, 204, 51));
        jLabel21.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Declaracion sintomas COVID-19:");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel21.setOpaque(true);
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 547, -1));

        jPanel5.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 420, 119, -1));

        jDC_dosis.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDC_dosisPropertyChange(evt);
            }
        });
        jPanel5.add(jDC_dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 420, 142, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("1° Dosis");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 420, 71, 22));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Direccion:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 359, 83, 29));

        Actualizar_3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Actualizar_3.setText("Tomar Turno");
        Actualizar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_3ActionPerformed(evt);
            }
        });
        jPanel5.add(Actualizar_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 188, -1));
        jPanel5.add(jText_nombreVacunatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 304, 365, 36));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("¿Fuiste diagnosticado con COVID-19 en los últimos 60 días? ");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, -1, -1));

        jRadio_si.setText("Si");
        jRadio_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_siActionPerformed(evt);
            }
        });
        jPanel5.add(jRadio_si, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));

        jRadio_no.setText("No");
        jRadio_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_noActionPerformed(evt);
            }
        });
        jPanel5.add(jRadio_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 76, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("¿Recibiste el alta medica?");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, -1, -1));

        jDC_covid.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDC_covidPropertyChange(evt);
            }
        });
        jPanel5.add(jDC_covid, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 137, 123, -1));

        jLabel13.setText("Fecha");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 138, -1, -1));
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 489, -1, -1));

        jRadio_altaMedicaSi.setText("Si");
        jRadio_altaMedicaSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_altaMedicaSiActionPerformed(evt);
            }
        });
        jPanel5.add(jRadio_altaMedicaSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, -1, -1));

        jRadio_altaMedicaNo.setText("No");
        jRadio_altaMedicaNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_altaMedicaNoActionPerformed(evt);
            }
        });
        jPanel5.add(jRadio_altaMedicaNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 134, -1, -1));
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 400, -1, -1));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("*En caso de tener alta medica, colocar la fecha del a misma.\n*En caso de tener no tener alta medica, colocar la fecha en la que comenzaste con \nlos sintomas");
        jScrollPane3.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 168, 490, 70));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("¿Cuando?");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 117, -1, -1));

        jLabel22.setBackground(new java.awt.Color(0, 153, 204));
        jLabel22.setFont(new java.awt.Font("ArianLT-Bold", 3, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Asignacion turno vacunacion COVID-19:");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setOpaque(true);
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 269, 545, -1));
        jPanel5.add(jText_direccionVac, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 354, 365, 40));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("Centro Vacunacion:");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 307, 122, 29));

        jScrollPane4.setViewportView(jPanel5);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 440));

        jSolapasTurno.addTab("            Turno           ", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSolapasTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jSolapasTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        armarCoodenadas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SiguienteActionPerformed
        jSolapasTurno.setEnabledAt(1, true);
        armarCiudadano();
        jSolapasTurno.setSelectedIndex(1);
    }//GEN-LAST:event_jButton_SiguienteActionPerformed

    private void jTexto_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTexto_emailFocusLost

    }//GEN-LAST:event_jTexto_emailFocusLost

    private void jTexto_celularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTexto_celularFocusLost

    }//GEN-LAST:event_jTexto_celularFocusLost

    private void jCB_ambitoTrabajoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCB_ambitoTrabajoFocusLost

    }//GEN-LAST:event_jCB_ambitoTrabajoFocusLost

    private void jButton_Siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Siguiente1ActionPerformed
        controlFlujoInfo();
    }//GEN-LAST:event_jButton_Siguiente1ActionPerformed

    private void jButton_Siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Siguiente2ActionPerformed
        ModificarClave mC = new ModificarClave(c1.getDNI());
        mC.setVisible(true);
        mC.setLocation(localizacion);
    }//GEN-LAST:event_jButton_Siguiente2ActionPerformed

    private void jDC_fechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDC_fechaNacimientoPropertyChange
        if (jDC_fechaNacimiento.getDate() != null) {
            jCB_ambitoTrabajo.setEnabled(true);
            armarjDC_ATr(jDC_fechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
    }//GEN-LAST:event_jDC_fechaNacimientoPropertyChange

    private void jCB_ambitoTrabajoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCB_ambitoTrabajoFocusGained
        jButton_Siguiente.setEnabled(false);
    }//GEN-LAST:event_jCB_ambitoTrabajoFocusGained

    private void jRadio_altaMedicaNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_altaMedicaNoActionPerformed
        jDC_covid.setDate(null);
        jDC_covid.setEnabled(true);
        jDC_dosis.setDate(null);
    }//GEN-LAST:event_jRadio_altaMedicaNoActionPerformed

    private void jRadio_altaMedicaSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_altaMedicaSiActionPerformed
        jDC_covid.setDate(null);
        jDC_covid.setEnabled(true);
        jDC_dosis.setDate(null);
    }//GEN-LAST:event_jRadio_altaMedicaSiActionPerformed

    private void jDC_covidPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDC_covidPropertyChange
        if (jDC_covid.getDate() != null) {
            proximo_Turnoslibres(jDC_covid.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

        }
    }//GEN-LAST:event_jDC_covidPropertyChange

    private void jRadio_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_noActionPerformed
        if (jRadio_no.isSelected()) {
            proximo_Turnoslibres(LocalDate.now());
            jDC_covid.setEnabled(false);
            jRadio_altaMedicaSi.setEnabled(false);
            jRadio_altaMedicaNo.setEnabled(false);
        }
    }//GEN-LAST:event_jRadio_noActionPerformed

    private void jRadio_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_siActionPerformed
        if (jRadio_si.isSelected()) {
            jDC_dosis.setDate(null);
            jRadio_altaMedicaNo.setEnabled(true);
            jRadio_altaMedicaSi.setEnabled(true);
        }
    }//GEN-LAST:event_jRadio_siActionPerformed

    private void Actualizar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_3ActionPerformed
        jComboBox2.setEnabled(false);
        cD.cargaNuevosDatosCiudadano(c1);
        patologiaUpdate();
        turno1.setFecha(tD.colocarHora_aFecha(jDC_dosis.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jComboBox2.getSelectedItem().toString()));
        turno1.setVacunatorio(masCercano);
        c1.setTurno(turno1);
        int updates = cD.cargarTurno(c1);
        if (updates > 0) {
            tD.actualizarTurnero_Hora(c1.getTurno());
            lD.actualizarFaseIngreso(c1);
        }
        int opcion = JOptionPane.showConfirmDialog(null, "Inscripcion Finalizada. Desea visiar su perfil", "Abrir", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            if (getParent() instanceof LoginTes) {
                LoginTes loginFrame = (LoginTes) getParent();
                loginFrame.inicioSesion();
            }
            this.dispose();
        } else {
            jComboBox2.setEnabled(true);
            this.dispose();
        }
    }//GEN-LAST:event_Actualizar_3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDC_dosisPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDC_dosisPropertyChange
        try {
            if (jDC_dosis.getDate() != null) {
                Actualizar_3.setEnabled(true);
                jComboBox2.setEnabled(true);
            } else {
                Actualizar_3.setEnabled(false);
                jComboBox2.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jDC_dosisPropertyChange

    private void jTexto_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTexto_emailFocusGained
        jButton_Siguiente.setEnabled(false);
    }//GEN-LAST:event_jTexto_emailFocusGained

    private void jDC_fechaNacimientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDC_fechaNacimientoFocusGained
        jButton_Siguiente.setEnabled(false);
    }//GEN-LAST:event_jDC_fechaNacimientoFocusGained

    private void jTexto_celularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTexto_celularFocusGained
        jButton_Siguiente.setEnabled(false);
    }//GEN-LAST:event_jTexto_celularFocusGained

    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
        jButton_Siguiente.setEnabled(false);
    }//GEN-LAST:event_jButton2FocusGained

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        jButton_siguiente2.setEnabled(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jButton_siguiente2.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        jSolapasTurno.setSelectedIndex(0);
    }//GEN-LAST:event_AnteriorActionPerformed

    private void otras_PatologiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otras_PatologiasActionPerformed

    }//GEN-LAST:event_otras_PatologiasActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton_siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_siguiente2ActionPerformed
        jSolapasTurno.setEnabledAt(2, true);
        armarCiudadano();
        jSolapasTurno.setSelectedIndex(2);
    }//GEN-LAST:event_jButton_siguiente2ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_3;
    private javax.swing.JButton Anterior;
    private javax.swing.JLabel Diabetes2;
    private javax.swing.JLabel FONDO_INSCR_DATOS_PERSONALES;
    private javax.swing.JTextField TextoDni;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Siguiente;
    private javax.swing.JButton jButton_Siguiente1;
    private javax.swing.JButton jButton_Siguiente2;
    private javax.swing.JButton jButton_siguiente2;
    private javax.swing.JComboBox<String> jCB_ambitoTrabajo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDC_covid;
    private com.toedter.calendar.JDateChooser jDC_dosis;
    private com.toedter.calendar.JDateChooser jDC_fechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadio_altaMedicaNo;
    private javax.swing.JRadioButton jRadio_altaMedicaSi;
    private javax.swing.JRadioButton jRadio_no;
    private javax.swing.JRadioButton jRadio_si;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jSolapasTurno;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel jText_direccionVac;
    private javax.swing.JLabel jText_nombreVacunatorio;
    private javax.swing.JTextField jTextoApellido;
    private javax.swing.JTextField jTexto_celular;
    private javax.swing.JTextField jTexto_email;
    private javax.swing.JTextField otras_Patologias;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void armarElementos() {
        jSolapasTurno.setEnabledAt(1, false);
        jSolapasTurno.setEnabledAt(2, false);
        jButton_Siguiente.setEnabled(false);
        jCB_ambitoTrabajo.setEnabled(false);

        modelo.setColumnCount(0);
        modelo.addColumn("Ciudad");
        jDC_dosis.setEnabled(false);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(jRadioButton3);
        buttonGroup2.add(jRadioButton4);
        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(jRadioButton5);
        buttonGroup3.add(jRadioButton6);
        ButtonGroup buttonGroup4 = new ButtonGroup();
        buttonGroup4.add(jRadioButton7);
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
        ButtonGroup buttonGroup10 = new ButtonGroup();
        buttonGroup10.add(jRadio_si);
        buttonGroup10.add(jRadio_no);
        ButtonGroup buttonGroup11 = new ButtonGroup();
        buttonGroup11.add(jCheckBox1);
        buttonGroup11.add(jCheckBox2);

        ButtonGroup buttonGroup12 = new ButtonGroup();
        buttonGroup12.add(jRadio_altaMedicaNo);
        buttonGroup12.add(jRadio_altaMedicaSi);

        jCheckBox2.setSelected(true);
        jRadioButton2.setSelected(true);
        jRadioButton4.setSelected(true);
        jRadioButton6.setSelected(true);
        jRadioButton8.setSelected(true);
        jRadioButton10.setSelected(true);
        jRadioButton12.setSelected(true);
        jRadioButton14.setSelected(true);
        jRadioButton16.setSelected(true);
        jRadioButton18.setSelected(true);

        jDC_covid.setEnabled(false);

        jTextoApellido.setText(c1.getApellido());
        jTextoApellido.setEditable(false);
        TextoNombre.setText(c1.getNombre());
        TextoNombre.setEditable(false);
        TextoDni.setText(Integer.toString(c1.getDNI()));
        TextoDni.setEditable(false);
        jPanel2.setEnabled(false);
        jPanel3.setEnabled(false);
        jButton_siguiente2.setEnabled(false);
        jRadio_altaMedicaNo.setEnabled(false);
        jRadio_altaMedicaSi.setEnabled(false);

        jDC_fechaNacimiento.setMaxSelectableDate(Date.from((LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant())));
        jDC_fechaNacimiento.setMinSelectableDate(Date.from((LocalDate.now().minusYears(100).atStartOfDay(ZoneId.systemDefault()).toInstant())));
        jDC_covid.setMaxSelectableDate(Date.from((LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant())));
        jDC_covid.setMinSelectableDate(Date.from((LocalDate.now().minusDays(75).atStartOfDay(ZoneId.systemDefault()).toInstant())));
        
        Actualizar_3.setEnabled(false);
                
        //EDICION DE PESTAÑAS
         // Define los colores personalizados
        Color selectedTabColor = new Color(255, 220, 0); // Color de fondo de la solapa seleccionada
        Color unselectedTabColor = new Color(85, 106, 124); // Color de fondo de las solapas no seleccionadas

        // Personaliza el fondo de las pestañas
        jSolapasTurno.setUI(new BasicTabbedPaneUI() {
            @Override
            protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
                Graphics2D g2 = (Graphics2D) g;

                if (isSelected) {
                    g2.setColor(selectedTabColor);
                    jSolapasTurno.setForeground(new Color(85, 106, 124));

                } else {
                    g2.setColor(unselectedTabColor);
                    jSolapasTurno.setForeground(new Color(255, 255, 255));
                }
                g2.fillRect(x, y, w, h);
            }
        });
        
        JLabel p0 = new JLabel();
        JLabel p1 = new JLabel();
        JLabel p2 = new JLabel();
        

        jSolapasTurno.setTabComponentAt(0, p0);
        jSolapasTurno.getTabComponentAt(0).setPreferredSize(new Dimension(150, 40));
        p0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_DATOS_PER_02.png")));

        jSolapasTurno.setTabComponentAt(1, p1);
        jSolapasTurno.getTabComponentAt(1).setPreferredSize(new Dimension(150, 40));
        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_PATOLOGIAS_01.png")));

        jSolapasTurno.setTabComponentAt(2, p2);
        jSolapasTurno.getTabComponentAt(2).setPreferredSize(new Dimension(118, 40));
        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_TURNOS_01.png")));

        jSolapasTurno.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedTabIndex = jSolapasTurno.getSelectedIndex();

                if (selectedTabIndex == 0) {
                    p0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_DATOS_PER_02.png")));
                } else {
                    p0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_DATOS_PER_01.png")));
                }

                if (selectedTabIndex == 1) {
                    p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_PATOLOGIAS_02.png")));
                } else {
                    p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_PATOLOGIAS_01.png")));
                }

                if (selectedTabIndex == 2) {
                    p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_TURNOS_02.png")));
                } else {
                    p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/INSC_TURNOS_01.png")));
                }

            }
        });
        
    }

    public void armarCoodenadas() {
        JXMapKit mapKit = new JXMapKit();

        JPanel panel_busqueda = new JPanel();
        panel_busqueda.setLayout(new FlowLayout());
        JTextField texto_busqueda = new JTextField(20);
        JButton buscar = new JButton("Buscar");
        JButton salir = new JButton("Salir");

        buscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Coordenadas cord = gD.buscarCiudad(texto_busqueda.getText()).get(0);
                GeoPosition posicion_inicioMapa = new GeoPosition(cord.getLatitud(), cord.getLongitud());
                mapKit.setCenterPosition(posicion_inicioMapa);
                mapKit.setZoom(50);
            }
        });
       
        panel_busqueda.add(texto_busqueda);
        panel_busqueda.add(buscar);
        panel_busqueda.add(salir);

        mapKit.setDefaultProvider(JXMapKit.DefaultProviders.OpenStreetMaps);

        GeoPosition posicion_inicioMapa = new GeoPosition(-33.300653, -66.3209224);
        mapKit.setCenterPosition(posicion_inicioMapa);
        mapKit.setZoom(50);

        JFrame frame = new JFrame("Mapa");
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(tamanio);
        frame.add(panel_busqueda, BorderLayout.SOUTH);
        frame.setLocation(localizacion);
        
        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
                
        WaypointPainter<Waypoint> punto_referencia = new WaypointPainter<Waypoint>();
        mapKit.getMainMap().setOverlayPainter(punto_referencia);

        CustomWaypoint waypoint;
        ArrayList<CustomWaypoint> lista_waypoints = new ArrayList<>();

        for (Vacunatorio centro : vD.listarVacunatorio()) {
            waypoint = new CustomWaypoint(centro.getUbicacion().getLatitud(), centro.getUbicacion().getLongitud(), null);
            lista_waypoints.add(waypoint);
        }
        WaypointPainter<CustomWaypoint> waypointPainter = new WaypointPainter<>();

        waypointPainter.setWaypoints(new HashSet<>(lista_waypoints));
        mapKit.getMainMap().setOverlayPainter(waypointPainter);

        JDialog dialog = null;

        mapKit.getMainMap().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (dialog != null) {
                    return;
                }
                Point point = e.getPoint();
                GeoPosition coordenadas1 = mapKit.getMainMap().convertPointToGeoPosition(point);
                Waypoint waypoint = new DefaultWaypoint(coordenadas1);
                punto_referencia.setWaypoints(Collections.singleton(waypoint));

                mapKit.getMainMap().setOverlayPainter(punto_referencia);

                JDialog dialog = new JDialog();
                dialog.setTitle("Confirmar ubicación");
                dialog.setSize(300, 100);
                dialog.setLocation(jSolapasTurno.getLocationOnScreen());

                JPanel panel = new JPanel();

                panel.setLayout(new FlowLayout(FlowLayout.CENTER));
                panel.add(new JLabel("¿El marcador coincide con su domicilio?"));
                JPanel buttonPanel = new JPanel();
                JButton aceptar = new JButton("SI");
                JButton rechazar = new JButton("NO");
                buttonPanel.add(aceptar);
                buttonPanel.add(rechazar);
                panel.add(buttonPanel);

                aceptar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dtaCorda.setLatitud(coordenadas1.getLatitude());
                        dtaCorda.setLongitud(coordenadas1.getLongitude());
                        vacunatorioCercano();
                        dialog.dispose();
                        frame.setVisible(false);
                    }
                });

                rechazar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        punto_referencia.setWaypoints(Collections.emptySet());
                        dialog.dispose();
                    }
                });

                panel.add(aceptar);
                panel.add(rechazar);
                dialog.add(panel);
                dialog.setVisible(true);
            }
        });
        frame.getContentPane().add(mapKit);
        frame.setVisible(true);
        c1.setCordenadas(dtaCorda);

    }

    private void armarCiudadano() {
        c1.setEmail(jTexto_email.getText());
        c1.setCelular(Long.parseLong(jTexto_celular.getText()));
        c1.setAmbitoTrabajo(jCB_ambitoTrabajo.getSelectedItem().toString());
        c1.setDosisAplicadas(0);
        c1.setFechaNacimiento(jDC_fechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
    }

    private void patologiaUpdate() {
        cD.cargarPatologia(c1,
                jRadioButton1.isSelected(),
                jRadioButton3.isSelected(),
                jRadioButton5.isSelected(),
                jRadioButton7.isSelected(),
                jRadioButton9.isSelected(),
                jRadioButton11.isSelected(),
                jRadioButton13.isSelected(),
                jRadioButton15.isSelected(),
                jRadioButton17.isSelected(),
                otras_Patologias.getText());
    }

    private void proximo_Turnoslibres(LocalDate fecha) {
        LocalDate fecha1 = null;
        if (jRadio_no.isSelected()) {
            fecha1 = fecha;
        } else if (jRadio_altaMedicaSi.isSelected() && ChronoUnit.DAYS.between(fecha, LocalDate.now()) >= 14) {
            fecha1 = LocalDate.now();
        } else if (jRadio_altaMedicaSi.isSelected() && ChronoUnit.DAYS.between(fecha, LocalDate.now()) < 14) {
            fecha1 = fecha.plusDays(14);
        } else if (jRadio_altaMedicaNo.isSelected() && ChronoUnit.DAYS.between(fecha, LocalDate.now()) >= 28) {
            fecha1 = LocalDate.now();
        } else if (jRadio_altaMedicaNo.isSelected() && ChronoUnit.DAYS.between(fecha, LocalDate.now()) < 28) {
            fecha1 = fecha.plusDays(28);
        }
        if (fecha1.isEqual(LocalDate.now())) {
            fecha1 = fecha1.plusDays(1);
        }

        if (c1.getAmbitoTrabajo().equals("Educación") || c1.getAmbitoTrabajo().equals("Sanidad y Medicina")) {
            jDC_dosis.setDate(java.sql.Date.valueOf(fecha1));
            buscarHorariosLibres(jDC_dosis.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } else if (!c1.getAmbitoTrabajo().equals("Educación") && !c1.getAmbitoTrabajo().equals("Sanidad y Medicina")) {
            int turnos_libres;
            do {
                turnos_libres = tD.buscarTurnoLibre_porTurnosLibres(fecha1, masCercano);
                fecha1 = fecha1.plusDays(1);
            } while (turnos_libres <= 0);
            jDC_dosis.setDate(java.sql.Date.valueOf(fecha1.minusDays(1)));
            buscarHorariosLibres(jDC_dosis.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
    }

    private void buscarHorariosLibres(LocalDate date) {
        if (c1.getAmbitoTrabajo().equals("Educación") || c1.getAmbitoTrabajo().equals("Sanidad y Medicina")) {
            String[] horarios = {"8 a 9", "9 a 10", "10 a 11", "11 a 12", "12 a 13", "13 a 14", "14 a 15", "15 a 16", "16 a 17"};
            DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>(horarios);
            jComboBox2.setModel(cbModel);
        } else if (!c1.getAmbitoTrabajo().equals("Educación") && !c1.getAmbitoTrabajo().equals("Sanidad y Medicina")) {
            ArrayList<String> turnos = tD.armarArrayHorariosLibres(date, masCercano);
            DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>(turnos.toArray(new String[0]));
            jComboBox2.setModel(cbModel);
        }
    }

    public void vacunatorioCercano() {
        double distancia;
        double min;
        ArrayList<Vacunatorio> listaCentros = vD.listarVacunatorio();

        Vacunatorio vac1 = listaCentros.get(0);
        min = Math.sqrt(((vac1.getUbicacion().getLatitud() - dtaCorda.getLatitud()) * (vac1.getUbicacion().getLatitud() - dtaCorda.getLatitud())) + ((vac1.getUbicacion().getLongitud() - dtaCorda.getLongitud()) * (vac1.getUbicacion().getLongitud() - dtaCorda.getLongitud())));

        for (Vacunatorio vacunatorio : listaCentros) {
            distancia = Math.sqrt(((vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud()) * (vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud())) + ((vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud()) * (vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud())));
            if (min > distancia) {
                min = distancia;
            }
        }
        for (Vacunatorio vacunatorio : listaCentros) {
            distancia = Math.sqrt(((vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud()) * (vacunatorio.getUbicacion().getLatitud() - dtaCorda.getLatitud())) + ((vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud()) * (vacunatorio.getUbicacion().getLongitud() - dtaCorda.getLongitud())));
            if (distancia == min) {
                masCercano = vacunatorio;
                jText_nombreVacunatorio.setText(masCercano.getNombre());
                jText_direccionVac.setText(masCercano.getDireccion());
            }
        }
    }

    private void controlFlujoInfo() {
        if (jDC_fechaNacimiento.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Formato de fecha nacimiento incorrecto");
        } else {
            try {
                if (!jTexto_email.getText().contains("@") || !jTexto_email.getText().contains(".com")) {
                    JOptionPane.showMessageDialog(null, "Formato de E-mail incorrecto");
                } else {
                    Long.parseLong(jTexto_celular.getText());
                    if (!jTexto_email.getText().isEmpty() && !jTexto_celular.getText().isEmpty() && jCB_ambitoTrabajo.getSelectedItem() != null && masCercano != null) {
                        jButton_Siguiente.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Complete todos los datos");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Formato de telefono incorrecto");
            }
        }
    }

    private void armarjDC_ATr(LocalDate fechaNacmiento) {
        DefaultComboBoxModel ambitos;
        String[] trabajos;
        if (ChronoUnit.YEARS.between(fechaNacmiento, LocalDate.now()) > 17) {
            trabajos = new String[]{"Sanidad y Medicina", "Educación", "Estudiante", "Servicios Financieros", "Gobierno y Administración Pública", "Arte y Entretenimiento", "Agricultura y Agroindustria", "Construcción y Arquitectura", "Monotributista", "Trabajo Informal", "Privado", "Estudiante Java", "Desempleado", "Otro"};;
            //jLabel17.setText("Ámbito de Trabajo");
            ambitos = new DefaultComboBoxModel(trabajos);
        } else {
            //jLabel17.setText("Ciclo educacion");
            trabajos = new String[]{"Estudiante Inicial", "Estudiante Primaria", "Educacion Secundaria", "Otro", "Abandono"};
            ambitos = new DefaultComboBoxModel(trabajos);
        }
        jCB_ambitoTrabajo.setModel(ambitos);
    }
}
