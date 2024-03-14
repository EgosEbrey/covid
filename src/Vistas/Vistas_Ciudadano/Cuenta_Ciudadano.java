package Vistas.Vistas_Ciudadano;

import Conexion.Certificado;
import Conexion.CiudadanoData;
import Conexion.TurnoData;
import Entidades.Ciudadano;
import Entidades.Turno;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Cuenta_Ciudadano extends javax.swing.JInternalFrame {

    private Certificado cF = new Certificado();
    private TurnoData tD;
    private Ciudadano c1;
    private Turno turno_new;
    private ArrayList<Turno> arrayTurnos;
    private Turno turno1 = null;
    private Turno turno2 = null;
    private Turno turno3 = null;

    public Cuenta_Ciudadano(CiudadanoData cD, TurnoData tD, int dni_usuario, Point localizacion, Dimension tamanio) {
        this.c1 = cD.buscarCiudadanos(dni_usuario, "DNI").get(0);
        c1.setPatologias(cD.consultaPatologias(dni_usuario));
        this.arrayTurnos = tD.listar_Turnos(null, null, "DNI", null, dni_usuario);
        this.tD = tD;
        initComponents();
        armadoDosis();
        armadoTextos(dni_usuario);
        armadoVistas(localizacion, tamanio);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jText_Nombre_Apellido = new javax.swing.JTextField();
        jText_DNI = new javax.swing.JTextField();
        jText_DosisAplicadas = new javax.swing.JTextField();
        jText_Email = new javax.swing.JTextField();
        jText_Celular = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jText_Celular1 = new javax.swing.JTextField();
        FONDO = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jText_FechaD1 = new javax.swing.JTextField();
        jText_MarcaD1 = new javax.swing.JTextField();
        jText_NumeroD1 = new javax.swing.JTextField();
        jText_AntigenoD1 = new javax.swing.JTextField();
        jText_FechaVencimientoD1 = new javax.swing.JTextField();
        jText_CentroD1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        FONDO_1raDOSIS = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jText_FechaD2 = new javax.swing.JTextField();
        jText_MarcaD2 = new javax.swing.JTextField();
        jText_NumeroD2 = new javax.swing.JTextField();
        jText_AntigenoD2 = new javax.swing.JTextField();
        jText_FechaVencimientoD2 = new javax.swing.JTextField();
        jText_CentroD2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        FONDO_2daDOSIS = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jText_FechaD3 = new javax.swing.JTextField();
        jText_MarcaD3 = new javax.swing.JTextField();
        jText_NumeroD3 = new javax.swing.JTextField();
        jText_AntigenoD3 = new javax.swing.JTextField();
        jText_FechaVencimientoD3 = new javax.swing.JTextField();
        jText_CentroD3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        FONDO_3raDOSIS = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jText_FechaPT = new javax.swing.JTextField();
        jText_CentroPT = new javax.swing.JTextField();
        jText_Centro_DirPT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jText_DosisPT = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jText_HorarioPT = new javax.swing.JTextField();
        FONDO_Turno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(550, 600));
        setMinimumSize(new java.awt.Dimension(550, 600));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(550, 600));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(85, 106, 124));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Proxima Nova Alt Rg", 0, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(550, 600));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(550, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(550, 600));
        jTabbedPane1.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(20, 30, 40, 50), null));
        jPanel1.setMaximumSize(new java.awt.Dimension(550, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 440));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 440));
        jPanel1.setLayout(null);

        jText_Nombre_Apellido.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_Nombre_Apellido.setForeground(new java.awt.Color(85, 106, 124));
        jText_Nombre_Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_Nombre_Apellido.setBorder(null);
        jText_Nombre_Apellido.setOpaque(false);
        jPanel1.add(jText_Nombre_Apellido);
        jText_Nombre_Apellido.setBounds(50, 50, 270, 30);

        jText_DNI.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_DNI.setForeground(new java.awt.Color(85, 106, 124));
        jText_DNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_DNI.setBorder(null);
        jText_DNI.setOpaque(false);
        jPanel1.add(jText_DNI);
        jText_DNI.setBounds(340, 50, 170, 30);

        jText_DosisAplicadas.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_DosisAplicadas.setForeground(new java.awt.Color(85, 106, 124));
        jText_DosisAplicadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_DosisAplicadas.setBorder(null);
        jText_DosisAplicadas.setOpaque(false);
        jPanel1.add(jText_DosisAplicadas);
        jText_DosisAplicadas.setBounds(50, 315, 210, 30);

        jText_Email.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_Email.setForeground(new java.awt.Color(85, 106, 124));
        jText_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_Email.setBorder(null);
        jText_Email.setOpaque(false);
        jPanel1.add(jText_Email);
        jText_Email.setBounds(280, 140, 230, 30);

        jText_Celular.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_Celular.setForeground(new java.awt.Color(85, 106, 124));
        jText_Celular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_Celular.setBorder(null);
        jText_Celular.setOpaque(false);
        jPanel1.add(jText_Celular);
        jText_Celular.setBounds(50, 225, 210, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/GENERAR CERTIFICADO_01-05.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setMaximumSize(new java.awt.Dimension(158, 34));
        jButton5.setMinimumSize(new java.awt.Dimension(158, 34));
        jButton5.setPreferredSize(new java.awt.Dimension(158, 34));
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/GENERAR CERTIFICADO_02-05.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(330, 380, 160, 34);

        jList1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jList1.setForeground(new java.awt.Color(85, 106, 124));
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(300, 230, 200, 110);

        jText_Celular1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 16)); // NOI18N
        jText_Celular1.setForeground(new java.awt.Color(85, 106, 124));
        jText_Celular1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_Celular1.setBorder(null);
        jText_Celular1.setOpaque(false);
        jPanel1.add(jText_Celular1);
        jText_Celular1.setBounds(50, 140, 210, 30);

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CIUDADANO_DATOS.png"))); // NOI18N
        FONDO.setToolTipText("");
        FONDO.setMaximumSize(new java.awt.Dimension(550, 440));
        FONDO.setMinimumSize(new java.awt.Dimension(550, 440));
        FONDO.setName(""); // NOI18N
        FONDO.setPreferredSize(new java.awt.Dimension(550, 440));
        jPanel1.add(FONDO);
        FONDO.setBounds(0, 0, 550, 440);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DATOS PERSONALES 02.png")), jPanel1); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jText_FechaD1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_FechaD1.setForeground(new java.awt.Color(85, 106, 124));
        jText_FechaD1.setBorder(null);
        jText_FechaD1.setOpaque(false);
        jText_FechaD1.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(jText_FechaD1);
        jText_FechaD1.setBounds(240, 350, 250, 20);

        jText_MarcaD1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_MarcaD1.setForeground(new java.awt.Color(85, 106, 124));
        jText_MarcaD1.setBorder(null);
        jText_MarcaD1.setOpaque(false);
        jText_MarcaD1.setPreferredSize(new java.awt.Dimension(0, 20));
        jText_MarcaD1.setRequestFocusEnabled(false);
        jPanel2.add(jText_MarcaD1);
        jText_MarcaD1.setBounds(180, 140, 310, 20);

        jText_NumeroD1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_NumeroD1.setForeground(new java.awt.Color(85, 106, 124));
        jText_NumeroD1.setBorder(null);
        jText_NumeroD1.setOpaque(false);
        jText_NumeroD1.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(jText_NumeroD1);
        jText_NumeroD1.setBounds(180, 182, 310, 20);

        jText_AntigenoD1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_AntigenoD1.setForeground(new java.awt.Color(85, 106, 124));
        jText_AntigenoD1.setBorder(null);
        jText_AntigenoD1.setOpaque(false);
        jText_AntigenoD1.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(jText_AntigenoD1);
        jText_AntigenoD1.setBounds(180, 224, 310, 20);

        jText_FechaVencimientoD1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_FechaVencimientoD1.setForeground(new java.awt.Color(85, 106, 124));
        jText_FechaVencimientoD1.setBorder(null);
        jText_FechaVencimientoD1.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jText_FechaVencimientoD1.setMinimumSize(new java.awt.Dimension(0, 20));
        jText_FechaVencimientoD1.setOpaque(false);
        jText_FechaVencimientoD1.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel2.add(jText_FechaVencimientoD1);
        jText_FechaVencimientoD1.setBounds(190, 266, 300, 20);

        jText_CentroD1.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_CentroD1.setForeground(new java.awt.Color(85, 106, 124));
        jText_CentroD1.setBorder(null);
        jText_CentroD1.setOpaque(false);
        jText_CentroD1.setPreferredSize(new java.awt.Dimension(350, 20));
        jPanel2.add(jText_CentroD1);
        jText_CentroD1.setBounds(130, 310, 350, 20);

        jLabel10.setText("-1° dosis sin aplicar-");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(370, 90, 116, 16);
        jPanel2.add(jLabel19);
        jLabel19.setBounds(455, 87, 259, 20);

        FONDO_1raDOSIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DOSIS PRIMERA.png"))); // NOI18N
        FONDO_1raDOSIS.setMaximumSize(new java.awt.Dimension(550, 440));
        FONDO_1raDOSIS.setMinimumSize(new java.awt.Dimension(550, 440));
        FONDO_1raDOSIS.setPreferredSize(new java.awt.Dimension(550, 440));
        jPanel2.add(FONDO_1raDOSIS);
        FONDO_1raDOSIS.setBounds(0, 0, 550, 440);

        jTabbedPane1.addTab("  1° Dosis  ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jText_FechaD2.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_FechaD2.setForeground(new java.awt.Color(85, 106, 124));
        jText_FechaD2.setBorder(null);
        jText_FechaD2.setOpaque(false);
        jPanel3.add(jText_FechaD2);
        jText_FechaD2.setBounds(240, 350, 250, 20);

        jText_MarcaD2.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_MarcaD2.setForeground(new java.awt.Color(85, 106, 124));
        jText_MarcaD2.setBorder(null);
        jText_MarcaD2.setOpaque(false);
        jPanel3.add(jText_MarcaD2);
        jText_MarcaD2.setBounds(180, 140, 310, 20);

        jText_NumeroD2.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_NumeroD2.setForeground(new java.awt.Color(85, 106, 124));
        jText_NumeroD2.setBorder(null);
        jText_NumeroD2.setOpaque(false);
        jPanel3.add(jText_NumeroD2);
        jText_NumeroD2.setBounds(180, 182, 310, 20);

        jText_AntigenoD2.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_AntigenoD2.setForeground(new java.awt.Color(85, 106, 124));
        jText_AntigenoD2.setBorder(null);
        jText_AntigenoD2.setOpaque(false);
        jPanel3.add(jText_AntigenoD2);
        jText_AntigenoD2.setBounds(180, 224, 310, 20);

        jText_FechaVencimientoD2.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_FechaVencimientoD2.setForeground(new java.awt.Color(85, 106, 124));
        jText_FechaVencimientoD2.setBorder(null);
        jText_FechaVencimientoD2.setOpaque(false);
        jPanel3.add(jText_FechaVencimientoD2);
        jText_FechaVencimientoD2.setBounds(200, 266, 290, 20);

        jText_CentroD2.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_CentroD2.setForeground(new java.awt.Color(85, 106, 124));
        jText_CentroD2.setBorder(null);
        jText_CentroD2.setOpaque(false);
        jPanel3.add(jText_CentroD2);
        jText_CentroD2.setBounds(130, 308, 360, 20);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("-2° dosis sin aplicar-");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(380, 90, 110, 16);

        FONDO_2daDOSIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DOSIS SEGUNDA.png"))); // NOI18N
        FONDO_2daDOSIS.setMaximumSize(new java.awt.Dimension(550, 440));
        FONDO_2daDOSIS.setMinimumSize(new java.awt.Dimension(550, 440));
        FONDO_2daDOSIS.setPreferredSize(new java.awt.Dimension(550, 440));
        jPanel3.add(FONDO_2daDOSIS);
        FONDO_2daDOSIS.setBounds(0, 0, 550, 440);

        jTabbedPane1.addTab("  2° Dosis  ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jText_FechaD3.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_FechaD3.setForeground(new java.awt.Color(85, 106, 124));
        jText_FechaD3.setBorder(null);
        jText_FechaD3.setOpaque(false);
        jPanel4.add(jText_FechaD3);
        jText_FechaD3.setBounds(240, 350, 250, 20);

        jText_MarcaD3.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_MarcaD3.setForeground(new java.awt.Color(85, 106, 124));
        jText_MarcaD3.setBorder(null);
        jText_MarcaD3.setOpaque(false);
        jPanel4.add(jText_MarcaD3);
        jText_MarcaD3.setBounds(180, 142, 310, 20);

        jText_NumeroD3.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_NumeroD3.setForeground(new java.awt.Color(85, 106, 124));
        jText_NumeroD3.setBorder(null);
        jText_NumeroD3.setOpaque(false);
        jPanel4.add(jText_NumeroD3);
        jText_NumeroD3.setBounds(179, 182, 310, 20);

        jText_AntigenoD3.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_AntigenoD3.setForeground(new java.awt.Color(85, 106, 124));
        jText_AntigenoD3.setBorder(null);
        jText_AntigenoD3.setOpaque(false);
        jPanel4.add(jText_AntigenoD3);
        jText_AntigenoD3.setBounds(180, 224, 310, 20);

        jText_FechaVencimientoD3.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_FechaVencimientoD3.setForeground(new java.awt.Color(85, 106, 124));
        jText_FechaVencimientoD3.setBorder(null);
        jText_FechaVencimientoD3.setOpaque(false);
        jPanel4.add(jText_FechaVencimientoD3);
        jText_FechaVencimientoD3.setBounds(190, 266, 300, 20);

        jText_CentroD3.setFont(new java.awt.Font("Proxima Nova Rg", 0, 14)); // NOI18N
        jText_CentroD3.setForeground(new java.awt.Color(85, 106, 124));
        jText_CentroD3.setBorder(null);
        jText_CentroD3.setOpaque(false);
        jPanel4.add(jText_CentroD3);
        jText_CentroD3.setBounds(130, 310, 360, 20);

        jLabel18.setText("- 3° dosis sin aplicar -");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(380, 90, 110, 16);

        FONDO_3raDOSIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DOSIS TERCERA.png"))); // NOI18N
        jPanel4.add(FONDO_3raDOSIS);
        FONDO_3raDOSIS.setBounds(0, 0, 550, 440);

        jTabbedPane1.addTab("  3° Dosis  ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jText_FechaPT.setFont(new java.awt.Font("Proxima Nova Rg", 0, 18)); // NOI18N
        jText_FechaPT.setForeground(new java.awt.Color(85, 106, 124));
        jText_FechaPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_FechaPT.setBorder(null);
        jText_FechaPT.setOpaque(false);
        jPanel5.add(jText_FechaPT);
        jText_FechaPT.setBounds(130, 150, 298, 40);

        jText_CentroPT.setFont(new java.awt.Font("Proxima Nova Rg", 0, 17)); // NOI18N
        jText_CentroPT.setForeground(new java.awt.Color(85, 106, 124));
        jText_CentroPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_CentroPT.setBorder(null);
        jText_CentroPT.setOpaque(false);
        jPanel5.add(jText_CentroPT);
        jText_CentroPT.setBounds(120, 310, 310, 30);

        jText_Centro_DirPT.setFont(new java.awt.Font("Proxima Nova Rg", 0, 17)); // NOI18N
        jText_Centro_DirPT.setForeground(new java.awt.Color(85, 106, 124));
        jText_Centro_DirPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_Centro_DirPT.setBorder(null);
        jText_Centro_DirPT.setOpaque(false);
        jPanel5.add(jText_Centro_DirPT);
        jText_Centro_DirPT.setBounds(120, 340, 310, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CANCELAR TURNO 01.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(118, 34));
        jButton1.setMinimumSize(new java.awt.Dimension(118, 34));
        jButton1.setPreferredSize(new java.awt.Dimension(118, 34));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CANCELAR TURNO 02.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(320, 380, 118, 34);

        jText_DosisPT.setFont(new java.awt.Font("Proxima Nova Rg", 0, 18)); // NOI18N
        jText_DosisPT.setForeground(new java.awt.Color(85, 106, 124));
        jText_DosisPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_DosisPT.setBorder(null);
        jText_DosisPT.setOpaque(false);
        jPanel5.add(jText_DosisPT);
        jText_DosisPT.setBounds(130, 70, 298, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/ASIGNAR HORARIO 01.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/ASIGNAR HORARIO 02.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(110, 380, 126, 34);

        jText_HorarioPT.setFont(new java.awt.Font("Proxima Nova Rg", 0, 18)); // NOI18N
        jText_HorarioPT.setForeground(new java.awt.Color(85, 106, 124));
        jText_HorarioPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_HorarioPT.setBorder(null);
        jText_HorarioPT.setOpaque(false);
        jPanel5.add(jText_HorarioPT);
        jText_HorarioPT.setBounds(130, 230, 300, 40);

        FONDO_Turno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/PROXIMO TURNO-06.png"))); // NOI18N
        FONDO_Turno.setMaximumSize(new java.awt.Dimension(550, 440));
        FONDO_Turno.setMinimumSize(new java.awt.Dimension(550, 440));
        FONDO_Turno.setName(""); // NOI18N
        FONDO_Turno.setPreferredSize(new java.awt.Dimension(550, 440));
        jPanel5.add(FONDO_Turno);
        FONDO_Turno.setBounds(0, 0, 550, 440);

        jTabbedPane1.addTab("  Proximo Turno  ", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, -1, 490));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/CIUDADANO_FONDO.png"))); // NOI18N
        jLabel4.setText("12");
        jLabel4.setMaximumSize(new java.awt.Dimension(550, 600));
        jLabel4.setMinimumSize(new java.awt.Dimension(550, 600));
        jLabel4.setName(""); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(550, 600));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cancelarTurno();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (c1.getDosisAplicadas() != 0) {
            try {
                cF.ArmarCertificado(c1, turno1, turno2, turno3);
            } catch (IOException ex) {
                Logger.getLogger(Cuenta_Ciudadano.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No posee dosis aplicadas aún. Vacunate Bagre!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (Turno turno : arrayTurnos) {
            if (turno.getFecha().getHour() == 00 && turno.isEstado().equals("Pendiente")) {
                asignarHoraTurno(turno);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel FONDO_1raDOSIS;
    private javax.swing.JLabel FONDO_2daDOSIS;
    private javax.swing.JLabel FONDO_3raDOSIS;
    private javax.swing.JLabel FONDO_Turno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jText_AntigenoD1;
    private javax.swing.JTextField jText_AntigenoD2;
    private javax.swing.JTextField jText_AntigenoD3;
    private javax.swing.JTextField jText_Celular;
    private javax.swing.JTextField jText_Celular1;
    private javax.swing.JTextField jText_CentroD1;
    private javax.swing.JTextField jText_CentroD2;
    private javax.swing.JTextField jText_CentroD3;
    private javax.swing.JTextField jText_CentroPT;
    private javax.swing.JTextField jText_Centro_DirPT;
    private javax.swing.JTextField jText_DNI;
    private javax.swing.JTextField jText_DosisAplicadas;
    private javax.swing.JTextField jText_DosisPT;
    private javax.swing.JTextField jText_Email;
    private javax.swing.JTextField jText_FechaD1;
    private javax.swing.JTextField jText_FechaD2;
    private javax.swing.JTextField jText_FechaD3;
    private javax.swing.JTextField jText_FechaPT;
    private javax.swing.JTextField jText_FechaVencimientoD1;
    private javax.swing.JTextField jText_FechaVencimientoD2;
    private javax.swing.JTextField jText_FechaVencimientoD3;
    private javax.swing.JTextField jText_HorarioPT;
    private javax.swing.JTextField jText_MarcaD1;
    private javax.swing.JTextField jText_MarcaD2;
    private javax.swing.JTextField jText_MarcaD3;
    private javax.swing.JTextField jText_Nombre_Apellido;
    private javax.swing.JTextField jText_NumeroD1;
    private javax.swing.JTextField jText_NumeroD2;
    private javax.swing.JTextField jText_NumeroD3;
    // End of variables declaration//GEN-END:variables

    private void armadoTextos(int dni_usuario) {
        jButton2.setVisible(false);
        jLabel10.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jText_Nombre_Apellido.setEditable(false);
        jText_DNI.setEditable(false);
        jText_Celular1.setEditable(false);
        jText_Email.setEditable(false);
        jText_Celular.setEditable(false);
        jText_DosisAplicadas.setEditable(false);
        jText_DosisPT.setEditable(false);
        jText_FechaPT.setEditable(false);
        jText_HorarioPT.setEditable(false);
        jText_CentroPT.setEditable(false);
        
        jText_Nombre_Apellido.setText(c1.getApellido() + " " + c1.getNombre());
        jText_DosisAplicadas.setText(Integer.toString(c1.getDosisAplicadas()));
        jText_DNI.setText(Integer.toString(c1.getDNI()));
        jText_Celular.setText(Long.toString(c1.getCelular()));
        jText_Email.setText(c1.getEmail());
        if (c1.getFechaNacimiento() != null){
        jText_Celular1.setText(c1.getFechaNacimiento().toString());
        } else {
            jText_Celular1.setText("-");
        }

        DefaultListModel<String> listaPatologias = new DefaultListModel<>();
        for (String patologias : c1.getPatologias()) {
            listaPatologias.addElement(patologias);  
        }
        if (c1.getPatologias().isEmpty()) {
            listaPatologias.addElement("Sin patologias declaradas");
        }
        jList1.setModel(listaPatologias);
        jList1.setBorder(null);    
        jScrollPane2.setBorder(null);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                for (Turno turno : arrayTurnos) {
                    if (turno.getFecha().getHour() == 00 && turno.isEstado().equals("Pendiente")) {
                        asignarHoraTurno(turno);
                    }
                }
                for (Turno turnos : tD.listar_Turnos(null, null, "DNI", null, dni_usuario)) {
                    if (turnos.isEstado().equals("Pendiente")) {
                        if (turnos.getFecha().getHour() == 0) {
                            jText_FechaPT.setText("Asignar horario.");
                            jButton2.setVisible(true);
                        } else {
                            jText_FechaPT.setText(turnos.getFecha().toLocalDate().toString());
                            jText_HorarioPT.setText(turnos.getFecha().getHour() + "hs.");
                        }
                        jText_DosisPT.setText(Integer.toString(turnos.getCodigoRefuerzo()) + " dosis");
                        jText_CentroPT.setText(turnos.getVacunatorio().getNombre());
                        jText_Centro_DirPT.setText(turnos.getVacunatorio().getDireccion());
                    }
                }
            }
        });
    }

    private void armadoDosis() {
        jButton5.setEnabled(false);
        for (Turno turno : arrayTurnos) {
            if (turno.getCodigoRefuerzo() == 1 && turno.isEstado().equals("completo")) {
                turno1 = turno;
            } else if (turno.getCodigoRefuerzo() == 2 && turno.isEstado().equals("completo")) {
                turno2 = turno;
            } else if (turno.getCodigoRefuerzo() == 3 && turno.isEstado().equals("completo")) {
                turno3 = turno;
            }
        }

        if (turno1 != null) {
            if (turno1.getCodigoRefuerzo() == 1) {
                jText_CentroD1.setText(turno1.getVacunatorio().getNombre());
                if (turno1.getVial() != null && turno1.isEstado().equals("completo")) {
                    jText_FechaD1.setText((turno1.getVial().getFechaColocacion()).toString());
                    jText_FechaVencimientoD1.setText(turno1.getVial().getFechaVencimiento().toString());
                    jText_MarcaD1.setText(turno1.getVial().getMarca());
                    jText_AntigenoD1.setText(turno1.getVial().getAntigeno());
                    jText_NumeroD1.setText(Integer.toString(turno1.getVial().getNumeroSerie()));
                    jButton5.setEnabled(true);
                } else if (turno1.getVial() == null || turno1.isEstado().equals("Pendiente")) {
                    jLabel10.setVisible(true);
                    jLabel19.setText(turno1.getFecha().toString());
                    jText_FechaD1.setText("Sin Datos");
                    jText_FechaVencimientoD1.setText("Sin Datos");
                    jText_MarcaD1.setText("Sin Datos");
                    jText_AntigenoD1.setText("Sin Datos");
                    jText_NumeroD1.setText("Sin Datos");
                    jText_CentroD1.setText("Sin Datos");
                }
            }
        }
        if (turno2 != null) {
            if (turno2.getCodigoRefuerzo() == 2) {
                jText_CentroD2.setText(turno2.getVacunatorio().getNombre());
                if (turno2.getVial() != null && turno2.isEstado().equals("completo")) {
                    jText_MarcaD2.setText(turno2.getVial().getMarca());
                    jText_NumeroD2.setText(Integer.toString(turno2.getVial().getNumeroSerie()));
                    jText_AntigenoD2.setText(turno2.getVial().getAntigeno());
                    jText_FechaD2.setText((turno2.getVial().getFechaColocacion()).toString());
                    jText_FechaVencimientoD2.setText(turno2.getVial().getFechaVencimiento().toString());
                } else if (turno2.getVial() == null || turno2.isEstado().equals("Pendiente")) {
                    jText_MarcaD2.setText("Sin Datos");
                    jText_NumeroD2.setText("Sin Datos");
                    jText_AntigenoD2.setText("Sin Datos");
                    jText_FechaD2.setText("Sin Datos");
                    jText_FechaVencimientoD2.setText("Sin Datos");
                    jText_CentroD2.setText("Sin Datos");
                    jLabel17.setVisible(true);
                }
            }
        }
        if (turno3 != null) {
            if (turno3.getCodigoRefuerzo() == 3) {
                jText_CentroD3.setText(turno3.getVacunatorio().getNombre());
                if (turno3.getVial() != null && turno3.isEstado().equals("completo")) {
                    jText_MarcaD3.setText(turno3.getVial().getMarca());
                    jText_NumeroD3.setText(Integer.toString(turno3.getVial().getNumeroSerie()));
                    jText_AntigenoD3.setText(turno3.getVial().getAntigeno());
                    jText_FechaD3.setText((turno3.getVial().getFechaColocacion()).toString());
                    jText_FechaVencimientoD3.setText(turno3.getVial().getFechaVencimiento().toString());
                } else if (turno3.getVial() == null && turno3.isEstado().equals("Pendiente")) {
                    jText_MarcaD3.setText("Sin Datos");
                    jText_NumeroD3.setText("Sin Datos");
                    jText_AntigenoD3.setText("Sin Datos");
                    jText_FechaD3.setText("Sin Datos");
                    jText_FechaVencimientoD3.setText("Sin Datos");
                    jText_CentroD3.setText("Sin Datos");
                    jLabel18.setVisible(true);
                }
            }
        }
    }

    private void cancelarTurno() {
        for (Turno turnos : arrayTurnos) {
            if (turnos.isEstado().equalsIgnoreCase("Pendiente")) {
                tD.cancelarTurno(turnos.getIdTurno());
            }
        }
    }

    private void asignarHoraTurno(Turno turno) {
        this.turno_new = turno;
        ArrayList<String> horarios_libres = tD.armarArrayHorariosLibres(turno.getFecha().toLocalDate(), turno.getVacunatorio());
        DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>(horarios_libres.toArray(new String[0]));
        JComboBox<String> comboBox = new JComboBox<>(cbModel);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JLabel label = new JLabel("Su turno del día " + turno.getFecha().toLocalDate() + " no cuenta con un horario asignado.");
        JPanel comboBoxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        comboBoxPanel.add(new JLabel("Asignar horario: "));
        comboBoxPanel.add(comboBox);

        panel.add(label);
        panel.add(comboBoxPanel);

        int resultado = JOptionPane.showConfirmDialog(null, panel, "Aginacion de horario para la colocacion de la " + turno.getCodigoRefuerzo() + " dosis.", JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            tomarHorario(comboBox.getSelectedItem().toString());
            jButton2.setVisible(false);
            jText_FechaPT.setText("Fecha: " + turno_new.getFecha().toLocalDate().toString() + " - Horario: " + turno_new.getFecha().getHour() + "hs.");

        }
    }

    private void tomarHorario(String horario) {
        LocalDateTime fecha_turno = tD.colocarHora_aFecha(turno_new.getFecha().toLocalDate(), horario);
        turno_new.setFecha(fecha_turno);
        tD.actualizarTurnero_Hora(turno_new);
        tD.actualizarHora_Turno(turno_new);
    }

    private void armadoVistas(Point localizacion, Dimension tamanio) {
        jTabbedPane1.setBorder(null);
        jTabbedPane1.setLocation(localizacion);
        jTabbedPane1.setSize(tamanio);

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        // Define los colores personalizados
        Color selectedTabColor = new Color(255, 220, 0); // Color de fondo de la solapa seleccionada
        Color unselectedTabColor = new Color(85, 106, 124); // Color de fondo de las solapas no seleccionadas

        // Personaliza el fondo de las pestañas
        jTabbedPane1.setUI(new BasicTabbedPaneUI() {
            @Override
            protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
                Graphics2D g2 = (Graphics2D) g;

                if (isSelected) {
                    g2.setColor(selectedTabColor);
                    jTabbedPane1.setForeground(new Color(85, 106, 124));

                } else {
                    g2.setColor(unselectedTabColor);
                    jTabbedPane1.setForeground(new Color(255, 255, 255));
                }
                g2.fillRect(x, y, w, h);
            }
        });

        JLabel p0 = new JLabel();
        JLabel p1 = new JLabel();
        JLabel p2 = new JLabel();
        JLabel p3 = new JLabel();
        JLabel p4 = new JLabel();

        jTabbedPane1.setTabComponentAt(0, p0);
        jTabbedPane1.getTabComponentAt(0).setPreferredSize(new Dimension(110, 40));
        p0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DATOS PERSONALES 02.png")));

        jTabbedPane1.setTabComponentAt(1, p1);
        jTabbedPane1.getTabComponentAt(1).setPreferredSize(new Dimension(73, 40));
        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/1ra DOSIS 01.png")));

        jTabbedPane1.setTabComponentAt(2, p2);
        jTabbedPane1.getTabComponentAt(2).setPreferredSize(new Dimension(73, 40));
        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/2da DOSIS 01.png")));

        jTabbedPane1.setTabComponentAt(3, p3);
        jTabbedPane1.getTabComponentAt(3).setPreferredSize(new Dimension(73, 40));
        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/3ra DOSIS 01.png")));

        jTabbedPane1.setTabComponentAt(4, p4);
        jTabbedPane1.getTabComponentAt(4).setPreferredSize(new Dimension(110, 40));
        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/PROX TURNO 01.png")));

        jTabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedTabIndex = jTabbedPane1.getSelectedIndex();

                if (selectedTabIndex == 0) {
                    p0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DATOS PERSONALES 02.png")));
                } else {
                    p0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/DATOS PERSONALES 01.png")));
                }

                if (selectedTabIndex == 1) {
                    p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/1ra DOSIS 02.png")));
                } else {
                    p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/1ra DOSIS 01.png")));
                }

                if (selectedTabIndex == 2) {
                    p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/2da DOSIS 02.png")));
                } else {
                    p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/2da DOSIS 01.png")));
                }

                if (selectedTabIndex == 3) {
                    p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/3ra DOSIS 02.png")));
                } else {
                    p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/3ra DOSIS 01.png")));
                }

                if (selectedTabIndex == 4) {
                    p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/PROX TURNO 02.png")));
                } else {
                    p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/PROX TURNO 01.png")));
                }

            }
        });

        if (c1.getDosisAplicadas() == 0) {
            jTabbedPane1.setEnabledAt(1, false);
            
            jTabbedPane1.setEnabledAt(2, false);
            
            jTabbedPane1.setEnabledAt(3, false);
            

        } else if (c1.getDosisAplicadas() == 1) {
            jTabbedPane1.setEnabledAt(2, false);
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(1, true);

        } else if (c1.getDosisAplicadas() == 2) {
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, true);
        }
    }

}
