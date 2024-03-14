package Vistas.Vistas_ADM;

import Conexion.TurnoData;
import Conexion.VacunatorioData;
import Conexion.VialData;
import Entidades.Pedidos;
import Entidades.Turno;
import Entidades.Vacunatorio;
import Entidades.Vial;
import java.awt.Component;
import java.awt.Font;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Administrador_Centros extends javax.swing.JInternalFrame {

    private VialData sD = new VialData();
    private VacunatorioData vD = new VacunatorioData();
    private TurnoData tD;
    private DefaultTableModel modeloT2 = new DefaultTableModel();
    private DefaultTableModel modeloT3 = new DefaultTableModel();
    private DefaultTableModel modeloT4 = new DefaultTableModel();
    private DefaultTableModel modeloT5 = new DefaultTableModel();
    private DefaultTableModel modeloT6 = new DefaultTableModel();
    private DefaultTableModel modeloT7 = new DefaultTableModel();
    private Pedidos pedido = new Pedidos();
    private ArrayList<Vacunatorio> vacunatorios;
    private int Pfizer = 0;
    private int Johnson = 0;
    private int AstraZeneca = 0;
    private int Sinopharm = 0;
    private int Sputnik = 0;

    public Administrador_Centros(TurnoData tD) {
        this.tD = tD;
        this.vacunatorios = vD.listarVacunatorio();

        initComponents();
        estadoBotones();
        grupoBotones();
        armadoCB();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        jTabbedPane1.setSelectedIndex(0);
        cargarPestania1();
        
        jTabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (jTabbedPane1.getSelectedIndex() + 1 == 1) {
                    cargarPestania1();
                } else if (jTabbedPane1.getSelectedIndex() + 1 == 3) {
                    armadoComponentesStocks();
                    calcularStocks();
                } else {
                    listarDia_S2();
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRB_CitasCumplidas = new javax.swing.JRadioButton();
        jRB_cicasCanceladas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRB_buscarPorCentro = new javax.swing.JRadioButton();
        jRB_buscarTodoslosCentros = new javax.swing.JRadioButton();
        jCB_centros_p1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable0 = new javax.swing.JTable();
        jRB_citasVencidas = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_Totales_Res = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTabla_VialesRes = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabla_Stocks = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        jT_ComprarViales = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTabla_Stocks_inf = new javax.swing.JTable();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(550, 600));
        setMinimumSize(new java.awt.Dimension(550, 600));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(550, 600));

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(550, 600));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(550, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(550, 600));
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(550, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ver citas:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 145, -1, -1));

        jRB_CitasCumplidas.setText("Cumplidas");
        jRB_CitasCumplidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_CitasCumplidasActionPerformed(evt);
            }
        });
        jPanel1.add(jRB_CitasCumplidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jRB_cicasCanceladas.setText("Canceladas");
        jRB_cicasCanceladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_cicasCanceladasActionPerformed(evt);
            }
        });
        jPanel1.add(jRB_cicasCanceladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 343, 474, 180));

        jRB_buscarPorCentro.setText("Por Vacunatorio");
        jRB_buscarPorCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_buscarPorCentroActionPerformed(evt);
            }
        });
        jPanel1.add(jRB_buscarPorCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jRB_buscarTodoslosCentros.setText("Ver estadisticas de todos los vacunatorios");
        jRB_buscarTodoslosCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_buscarTodoslosCentrosActionPerformed(evt);
            }
        });
        jPanel1.add(jRB_buscarTodoslosCentros, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jCB_centros_p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_centros_p1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCB_centros_p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 229, -1));

        jTable0.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable0);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 331, 120));

        jRB_citasVencidas.setText("Vencidas");
        jRB_citasVencidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_citasVencidasActionPerformed(evt);
            }
        });
        jPanel1.add(jRB_citasVencidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jTabbedPane1.addTab("Resumen Citas Mes", jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(550, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(550, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 600));

        jT_Totales_Res.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jT_Totales_Res);

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTabla_VialesRes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(jTabla_VialesRes);

        jButton7.setText("Agregar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Resumen del día", jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(550, 550));
        jPanel3.setMinimumSize(new java.awt.Dimension(550, 550));
        jPanel3.setPreferredSize(new java.awt.Dimension(550, 550));
        jPanel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel3FocusGained(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane6.setMaximumSize(new java.awt.Dimension(550, 600));
        jScrollPane6.setMinimumSize(new java.awt.Dimension(540, 600));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(540, 600));

        jPanel6.setAutoscrolls(true);
        jPanel6.setMaximumSize(new java.awt.Dimension(540, 740));
        jPanel6.setMinimumSize(new java.awt.Dimension(540, 740));
        jPanel6.setPreferredSize(new java.awt.Dimension(540, 740));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("Cumplir pedido");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(jTable3);

        jScrollPane8.setViewportView(jList1);

        jRadioButton7.setText("Pendientes");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("Completos");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jRadioButton7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton8)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(36, 36, 36))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton7)
                        .addComponent(jRadioButton8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jTabla_Stocks.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTabla_Stocks);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 396, 93));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar Centro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Comprar");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Asignar");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("desAsignar");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jT_ComprarViales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jT_ComprarViales);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox1)
                        .addComponent(jCheckBox2))
                    .addComponent(jCheckBox3))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 477, -1));

        jTabla_Stocks_inf.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(jTabla_Stocks_inf);

        jPanel6.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 106));

        jScrollPane6.setViewportView(jPanel6);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 572));

        jTabbedPane1.addTab("Stocks", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jPanel3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel3FocusGained
        calcularStocks();
    }//GEN-LAST:event_jPanel3FocusGained

    private void jRB_citasVencidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_citasVencidasActionPerformed
        armarTablasS1();

    }//GEN-LAST:event_jRB_citasVencidasActionPerformed

    private void jCB_centros_p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_centros_p1ActionPerformed
        armarTablasS1();
        if (jCB_centros_p1.getSelectedItem() != null) {
            jRB_citasVencidas.setEnabled(true);
            jRB_CitasCumplidas.setEnabled(true);
            jRB_cicasCanceladas.setEnabled(true);
        } else {
            jRB_citasVencidas.setEnabled(false);
            jRB_CitasCumplidas.setEnabled(false);
            jRB_cicasCanceladas.setEnabled(false);
        }
    }//GEN-LAST:event_jCB_centros_p1ActionPerformed

    private void jRB_buscarTodoslosCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_buscarTodoslosCentrosActionPerformed
        armarTablasS1();
        if (jRB_buscarTodoslosCentros.isSelected()) {
            jRB_citasVencidas.setEnabled(true);
            jRB_CitasCumplidas.setEnabled(true);
            jRB_cicasCanceladas.setEnabled(true);
            jCB_centros_p1.setEnabled(false);
        } else {
            jCB_centros_p1.setEnabled(true);
        }


    }//GEN-LAST:event_jRB_buscarTodoslosCentrosActionPerformed

    private void jRB_buscarPorCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_buscarPorCentroActionPerformed
        armarTablasS1();
        if (jRB_buscarPorCentro.isSelected())
            jCB_centros_p1.setEnabled(true);
        else {
            jCB_centros_p1.setEnabled(false);
        }
    }//GEN-LAST:event_jRB_buscarPorCentroActionPerformed

    private void jRB_cicasCanceladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_cicasCanceladasActionPerformed
        armarTablasS1();
    }//GEN-LAST:event_jRB_cicasCanceladasActionPerformed

    private void jRB_CitasCumplidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_CitasCumplidasActionPerformed
        armarTablasS1();
    }//GEN-LAST:event_jRB_CitasCumplidasActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        darStocks();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        if (jRadioButton8.isSelected()) {
            armarListasPedidos("Completo");
            jButton8.setEnabled(false);
            modeloT7.setRowCount(0);
        }
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        if (jRadioButton7.isSelected()) {
            armarListasPedidos("Pendiente");
            modeloT7.setRowCount(0);
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!jComboBox1.getSelectedItem().toString().equals("Todos")){
        agregarCentro(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), vD.listarVacunatorioNombre(jComboBox1.getSelectedItem().toString()).get(0));
        } else {
            for (Vacunatorio vacunatorio : vacunatorios) {
                if (!vacunatorio.getNombre().equals("0"))
               agregarCentro(jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), vacunatorio);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        if (jDateChooser1.getDate() == null) {
            jButton7.setEnabled(false);
        } else {
            jButton7.setEnabled(true);
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jDateChooser1.setDate(null);
        if (jComboBox1.getSelectedItem().toString().equals("Todos")){
         modeloT2.setRowCount(0);
         modeloT3.setRowCount(0);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()){
            jButton1.setText("Asignar");
            jT_ComprarViales.setEnabled(true);
            jComboBox3.setEnabled(true);
            armarJCB_VialesStocks();
            modeloT6.setRowCount(0);
            jButton1.setEnabled(false);
            jButton3.setEnabled(false);
            }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jComboBox3.setEnabled(true);
            jT_ComprarViales.setEnabled(true);
            jButton1.setText("Comprar");
            armarJCB_VialesStocks();
            modeloT6.setRowCount(0);
            jButton1.setEnabled(false);
            jButton3.setEnabled(false);
                    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modeloT6.addRow(new Object[]{jComboBox3.getSelectedItem().toString()});
        jComboBox3.removeItem(jComboBox3.getSelectedItem());
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        jButton3.setEnabled(true); 
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (verificarNumerosEnTabla(jT_ComprarViales)) {
            manejoViales();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        modeloT6.setRowCount(0);
        jComboBox3.setEnabled(true);
        jButton1.setText("desAsignar");
        jT_ComprarViales.setEnabled(true);
        armarJCB_VialesStocks();
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jCheckBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jCB_centros_p1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRB_CitasCumplidas;
    private javax.swing.JRadioButton jRB_buscarPorCentro;
    private javax.swing.JRadioButton jRB_buscarTodoslosCentros;
    private javax.swing.JRadioButton jRB_cicasCanceladas;
    private javax.swing.JRadioButton jRB_citasVencidas;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jT_ComprarViales;
    private javax.swing.JTable jT_Totales_Res;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTabla_Stocks;
    private javax.swing.JTable jTabla_Stocks_inf;
    private javax.swing.JTable jTabla_VialesRes;
    private javax.swing.JTable jTable0;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    private void estadoBotones() {
        jButton8.setEnabled(false);
        jRB_citasVencidas.setEnabled(false);
        jRB_CitasCumplidas.setEnabled(false);
        jRB_cicasCanceladas.setEnabled(false);
        jCB_centros_p1.setEnabled(false);
        jComboBox3.setEnabled(false);
        jButton3.setEnabled(false);
        jT_ComprarViales.setEnabled(false);
        jRadioButton7.setSelected(true);
        jButton7.setSelected(false);
        jButton1.setEnabled(false);
               
        jButton1.setVisible(true);
            jButton3.setVisible(true);
            jComboBox3.setVisible(true);
        }
       
    private void grupoBotones() {
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(jRB_buscarPorCentro);
        grupo1.add(jRB_buscarTodoslosCentros);

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(jRB_citasVencidas);
        grupo2.add(jRB_CitasCumplidas);
        grupo2.add(jRB_cicasCanceladas);

        ButtonGroup grupo4 = new ButtonGroup();
        grupo4.add(jCheckBox2);
        grupo4.add(jCheckBox1);
        grupo4.add(jCheckBox3);
        
    
        ButtonGroup grupo6 = new ButtonGroup();
        grupo6.add(jRadioButton7);
        grupo6.add(jRadioButton8);
    }

    private void armadoCB() {
        jComboBox1.addItem("Todos");
        for (Vacunatorio centros : vacunatorios) {
            if (!centros.getNombre().equals("0")) {
            jCB_centros_p1.addItem(centros.getNombre());
            jComboBox1.addItem(centros.getNombre());
            }
        }
        
       }
    
    private void armarJCB_VialesStocks() {
        jComboBox3.removeAllItems();
        for (Vacunatorio centros : vacunatorios) {
            if (jCheckBox1.isSelected()) {
                if (!centros.getNombre().equals("0")){
                jComboBox3.addItem(centros.getNombre());
                } else{
                    jComboBox3.addItem("Gobierno");
                }                
            } else {
                if (!centros.getNombre().equals("0")) {
                    jComboBox3.addItem(centros.getNombre());
                }
            }
        }
    }
 
    private void cargarPestania1() {
        jRB_CitasCumplidas.setEnabled(true);
        jRB_CitasCumplidas.setSelected(true);
        jRB_buscarPorCentro.setSelected(true);
        jCB_centros_p1.setEnabled(true);
        armarTablasS1();
    }

    private void armarTablasS1() {
        DefaultTableModel modelo1 = modelosTablas_noEdit(new String[]{" ", "Aplicadas"}, jTable0);

        String[] columnas;
        if (jRB_CitasCumplidas.isSelected()) {
            columnas = new String[]{"DNI", "Dosis", "Fecha", "Vial", "N° Serie"};
            if (jRB_buscarTodoslosCentros.isSelected()) {
                columnas = new String[]{"DNI", "Dosis", "Fecha", "Vial", "N° Serie", "Centro"};
            }
        } else {
            columnas = new String[]{"DNI", "Dosis", "Fecha"};
            if (jRB_buscarTodoslosCentros.isSelected()) {
                columnas = new String[]{"DNI", "Dosis", "Fecha", "Centro"};
            }
        }
        DefaultTableModel modelo2 = modelosTablas_noEdit(columnas, jTable1);

        Pfizer = 0;
        Johnson = 0;
        AstraZeneca = 0;
        Sinopharm = 0;
        Sputnik = 0;
        if (jRB_buscarTodoslosCentros.isSelected()) {
            for (Vacunatorio centro : vacunatorios) {
                calculos(modelo1, modelo2, centro);
            }
        } else {
            calculos(modelo1, modelo2, vD.listarVacunatorioNombre(jCB_centros_p1.getSelectedItem().toString()).get(0));
        }
    }

    public void calculos(DefaultTableModel modelo1, DefaultTableModel modelo2, Vacunatorio vac) {
        ArrayList<Turno> turnos_centros = new ArrayList();
        String codigo = "";
        if (jRB_CitasCumplidas.isSelected()) {
            codigo = "Completo";
        } else if (jRB_cicasCanceladas.isSelected()) {
            codigo = "Cancelado";
        } else if (jRB_citasVencidas.isSelected()) {
            codigo = "ausente";
        }
        turnos_centros = tD.listar_Turnos(LocalDate.now(), vac, codigo, null, 0);

        if (jRB_buscarPorCentro.isSelected()) {
            modelo2.setRowCount(0);
        }
        if (jRB_buscarTodoslosCentros.isSelected()) {
            modelo1.setRowCount(0);
        }

        for (Turno turno : turnos_centros) {
            if (jRB_CitasCumplidas.isSelected()) {
                if (jRB_buscarTodoslosCentros.isSelected()) {
                    modelo2.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha().toLocalDate(), turno.getVial().getMarca(), turno.getVial().getNumeroSerie(), turno.getVacunatorio().getIdVacunatorio()});
                } else {
                    modelo2.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha().toLocalDate(), turno.getVial().getMarca(), turno.getVial().getNumeroSerie()});
                }
                switch (turno.getVial().getMarca()) {
                    case "Sputnik V":Sputnik++;break;
                    case "Pfizer":Pfizer++;break;
                    case "Sinopharm y Sinovac":Sinopharm++;break;
                    case "Johnson_Johnson":Johnson++; break;
                    case "AstraZeneca":AstraZeneca++;break;
                }
            } else {
                if (jRB_buscarTodoslosCentros.isSelected()) {
                    modelo2.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha().toLocalDate(), turno.getVacunatorio().getIdVacunatorio()});
                } else {
                    modelo2.addRow(new Object[]{turno.getCiudadano().getDNI(), turno.getCodigoRefuerzo(), turno.getFecha().toLocalDate()});
                }
            }
        }
        if (jRB_CitasCumplidas.isSelected()) {
            modelo1.addRow(new Object[]{"Sputnik V", Sputnik});
            modelo1.addRow(new Object[]{"Pfizer", Pfizer});
            modelo1.addRow(new Object[]{"Sinopharm y Sinovac", Sinopharm});
            modelo1.addRow(new Object[]{"Johnson y Johnson", Johnson});
            modelo1.addRow(new Object[]{"AstraZeneca", AstraZeneca});
        }

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < jTable0.getColumnCount(); i++) {
            jTable0.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

    }

    private void armadoComponentesStocks() {
        
        String[] columnas = {"Centro", "Total"};
        String[] columna2 = {"Centro", "Sputnik", "Pfizer", "Sinopharm", "Johnson", "AstraZeneca"};

        modeloT4 = modelosTablas_noEdit(columnas, jTabla_Stocks);
        jTabla_Stocks.getColumnModel().getColumn(0).setPreferredWidth(150);

        modeloT5 = modelosTablas_noEdit(columna2, jTabla_Stocks_inf);
        jTabla_Stocks_inf.getColumnModel().getColumn(0).setPreferredWidth(100);
        
        modeloT6 = modelosTablas_Edit(columna2, jT_ComprarViales);
        
        String[] columna3 = {"Pfizer", "Johnson", "AstraZeneca", "Sinopharm", "Sputnik"};
        modeloT7 = modelosTablas_noEdit(columna3, jTable3);
        
    }

    public void listarDia_S2() {
        String[] lista_tabla2 = new String[]{"idCentro", "Fecha", "Nombre", "Total"};
        modeloT2 = modelosTablas_noEdit(lista_tabla2, jT_Totales_Res);

        String[] lista_tabla3 = new String[]{"idCentro", "Sputnik", "Pfizer", "Sinopharm", "Johnson", "AstraZeneca"};
        modeloT3 = modelosTablas_noEdit(lista_tabla3, jTabla_VialesRes);
    }

    public void agregarCentro(LocalDate fecha, Vacunatorio centro) {
        Pfizer = 0;
        Johnson = 0;
        AstraZeneca = 0;
        Sinopharm = 0;
        Sputnik = 0;
        int total = 0;
        for (Turno turno : tD.listar_Turnos(fecha, centro, "porDia", null, 0)) {
            switch (turno.getVial().getMarca()) {
                case "Sputnik V":Sputnik++;total++;break;
                case "Pfizer":Pfizer++;total++;break;
                case "Sinopharm y Sinovac":Sinopharm++;total++;break;
                case "Johnson_Johnson": Johnson++;total++;break;
                case "AstraZeneca":AstraZeneca++;total++; break;
            }
        }
        modeloT2.addRow(new Object[]{centro.getIdVacunatorio(), fecha.toString(), centro.getNombre(), total});
        modeloT3.addRow(new Object[]{centro.getIdVacunatorio(), Sputnik, Pfizer, Johnson, AstraZeneca, Sinopharm});
    }
  
    private void calcularStocks() {
        modeloT4.setRowCount(0);
        modeloT5.setRowCount(0);
        String nombre;
        int total = 0;
        ArrayList<Object[]> stocks = sD.calculadorStocks();
        for (Vacunatorio centro : vD.listarVacunatorio()){
        for (Object[] stock : stocks) {
            if (stock instanceof Object[]) {
                Object[] row = (Object[]) stock;
                if (centro.getIdVacunatorio()== (int) row[0]){
                    switch((String) row[1]){
                        case "AstraZeneca": AstraZeneca = (int) row[2]; total = total + (int) row[2]; break;
                        case "Sputnik V": Sputnik = (int) row[2];total = total + (int) row[2];break;
                        case "Pfizer": Pfizer = (int) row[2]; total = total + (int) row[2];break;
                        case "Sinopharm y Sinovac": Sinopharm = (int) row[2]; total = total + (int) row[2];break;
                        case "Johnson_Johnson": Johnson = (int) row[2]; total = total + (int) row[2];break;
                        }                  
                    }
                }
        }
        if (centro.getNombre().equals("0")) {
                nombre = "Gobierno";
        } else {
            nombre = centro.getNombre();
        }
        modeloT4.addRow(new Object[]{nombre, total});
        total = 0;
        modeloT5.addRow(new Object[]{nombre, Sputnik, Pfizer, Sinopharm, Johnson, AstraZeneca});
       }
     }

    private void manejoViales() {
        int renglones = modeloT6.getRowCount();
        int columnas = modeloT6.getColumnCount();
          
        for (int r = 0; r < renglones; r++) {
            for (int c = 1; c < columnas; c++) {
                Object valor = modeloT6.getValueAt(r, c);
                if (valor != null && !valor.toString().isEmpty()) {
                    int cantidad = Integer.parseInt(valor.toString());

                    if (jCheckBox1.isSelected()) {
                        if (cantidad > 0) {
                            String vacuna = nombreRealVial(modeloT6.getColumnName(c));
                            int idVacunatorio = vD.listarVacunatorioNombre(((modeloT6.getValueAt(r, 0).equals("Gobierno")) ? "0" : modeloT6.getValueAt(r, 0).toString())).get(0).getIdVacunatorio();
                            for (int i = 0; i < cantidad; i++) {
                                sD.compraViales(idVacunatorio, vacuna);
                            }
                            jButton1.setEnabled(false);
                            jButton3.setEnabled(false);
                            jComboBox3.setEnabled(false);
                        }
                    } else if (jCheckBox2.isSelected()) {
                        int asignacionesRealizadas = 0;
                        Vacunatorio aceptor = vD.listarVacunatorioNombre(modeloT6.getValueAt(r, 0).toString()).get(0);
                        Vacunatorio dador = vD.listarVacunatorioNombre("0").get(0);
                        for (Vial vial : sD.listarViales(0, dador.getIdVacunatorio())) {
                            if (vial.getMarca().equals(nombreRealVial(modeloT6.getColumnName(c)))) {
                                sD.reasignarViales(dador, aceptor, vial);
                                asignacionesRealizadas++;
                                if (asignacionesRealizadas >= cantidad) {
                                    jButton1.setEnabled(false);
                                    jButton3.setEnabled(false);
                                    jComboBox3.setEnabled(false);
                                    break;
                                }
                            }
                        }
                    }                    
                    else if (jCheckBox3.isSelected()){
                        int asignacionesRealizadas = 0;
                        Vacunatorio dador = vD.listarVacunatorioNombre(modeloT6.getValueAt(r, 0).toString()).get(0);
                        Vacunatorio aceptor = vD.listarVacunatorioNombre("0").get(0);
                        for (Vial vial : sD.listarViales(0, dador.getIdVacunatorio())) {
                            if (vial.getMarca().equals(nombreRealVial(modeloT6.getColumnName(c)))) {
                                sD.reasignarViales(dador, aceptor, vial);
                                asignacionesRealizadas++;
                                if (asignacionesRealizadas >= cantidad) {
                                    jButton1.setEnabled(false);
                                    jButton3.setEnabled(false);
                                    jComboBox3.setEnabled(false);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        calcularStocks();
    }

    public void armarListasPedidos(String estado) {
        ArrayList<Pedidos> pedidos = vD.listarPedidos(estado);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        DefaultListModel<String> listModel2 = new DefaultListModel<>();
        listModel.addElement("N° Pedido - ID Centro - Fecha Realizacion");

        jList1.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (index == 0) {
                    // Aplicar fuente en negrita al primer elemento
                    setFont(getFont().deriveFont(Font.BOLD));
                }
                return this;
            }
        });

        for (Pedidos pedido : pedidos) {
            listModel.addElement(pedido.toString());
        }
        jList1.setModel(listModel);

        jList1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                listModel2.clear();
                if (!e.getValueIsAdjusting()) {
                    int indice = jList1.getSelectedIndex();
                    if (indice > 0) {
                        String selectedValue = jList1.getModel().getElementAt(indice);
                        String[] partesLista = selectedValue.split(" - ");
                        if (partesLista.length == 3) {
                            int idPedido = Integer.parseInt(partesLista[0]);
                            for (Pedidos pedido1 : pedidos) {
                                if (pedido1.getIdPedido() == idPedido) {
                                    pedido = pedido1;
                                    modeloT7.setRowCount(0);
                                    modeloT7.addRow(new Object[]{Integer.toString(pedido.getPf()), Integer.toString(pedido.getJhon()), Integer.toString(pedido.getAstra()), Integer.toString(pedido.getSyno()), Integer.toString(pedido.getSpuk())});
                                    if (jRadioButton7.isSelected()){
                                            jButton8.setEnabled(true);
                                    }
                                } 
                            }
                        }
                    } else {
                     jButton8.setEnabled(false);
                    }
                }
            }
        });
    }

    private void darStocks() {
        int Pfizer = 0, Johnson = 0, AstraZeneca = 0, Sinopharm = 0, Sputnik = 0;
        for (Vial viales : sD.listarViales(0, 0)) {
            switch (viales.getMarca()) {
                case "Sputnik V":Sputnik++;break;
                case "Pfizer":Pfizer++;break;
                case "Sinopharm y Sinovac":Sinopharm++;break;
                case "Johnson_Johnson":Johnson++;break;
                case "AstraZeneca": AstraZeneca++;break;
            }
        }
        String faltantes = "";
        int cont = 0;
        if (pedido.getAstra() > AstraZeneca) {
            faltantes += "AstraZeneca ";
            cont++;
        } else if (pedido.getJhon() > Johnson) {
            faltantes += ((cont > 0) ? "," : "");
            faltantes += "Johnson ";
            cont++;
        } else if (pedido.getPf() > Pfizer) {
            faltantes += ((cont > 0) ? "," : "");
            faltantes += " Pfizer ";
            cont++;
        } else if (pedido.getSpuk() > Sputnik) {
            faltantes += ((cont > 0) ? "," : "");
            faltantes += " Sputnik ";
            cont++;
        } else if (pedido.getSyno() > Sinopharm) {
            faltantes += ((cont > 0) ? "," : "");
            faltantes += " Sinopharm ";
            cont++;
        } else if (cont > 0) {
            JOptionPane.showMessageDialog(null, "Faltante de stock de los viales " + faltantes);
        } else {
            asignarViales_pedido();
        }
    }

    public void asignarViales_pedido() {
        int AstraCont = 0, SputCont = 0, SinoCont = 0, JonhCont = 0, PfizCont = 0;
        for (Vial viales : sD.listarViales(0, 0)) {
            switch (viales.getMarca()) {
                case "AstraZeneca":
                    if (AstraCont < pedido.getAstra()) {
                        sD.reasignarViales(vD.buscarVacunatorio(0), pedido.getCentro(), viales);
                        AstraCont++;
                    }
                    break;
                case "Pfizer":
                    if (PfizCont < pedido.getPf()) {
                        sD.reasignarViales(vD.buscarVacunatorio(0), pedido.getCentro(), viales);
                        PfizCont++;
                    }
                    break;
                case "Sinopharm y Sinovac":
                    if (SinoCont < pedido.getSyno()) {
                        sD.reasignarViales(vD.buscarVacunatorio(0), pedido.getCentro(), viales);
                        SinoCont++;
                    }
                    break;
                case "Sputnik V":
                    if (SputCont < pedido.getSpuk()) {
                        sD.reasignarViales(vD.buscarVacunatorio(0), pedido.getCentro(), viales);
                        SputCont++;
                    }
                    break;
                case "Johnson_Johnson":
                    if (JonhCont < pedido.getJhon()) {
                        sD.reasignarViales(vD.buscarVacunatorio(0), pedido.getCentro(), viales);
                        JonhCont++;
                    }
                    break;
            }
        }
        if (JonhCont == pedido.getJhon()
                && SputCont == pedido.getSpuk()
                && SinoCont == pedido.getSyno()
                && PfizCont == pedido.getPf()
                && AstraCont == pedido.getAstra()) {
            JOptionPane.showMessageDialog(null, "Pedido Completo");
            sD.actualizarEstadoPedido(pedido);
        }
    }

    private DefaultTableModel modelosTablas_noEdit(String[] columnas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hace que todas las celdas sean no editables
            }
        };

        modelo.setColumnCount(0);
        for (String nombres : columnas) {
            modelo.addColumn(nombres);
        }
        tabla.setModel(modelo);
        modeloTabla(tabla, modelo);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < modelo.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        tabla.getTableHeader().setReorderingAllowed(false);

        return modelo;
    }
       
    private DefaultTableModel modelosTablas_Edit(String[] columnas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0;
            }
        };

        modelo.setColumnCount(0);
        for (String nombres : columnas) {
            modelo.addColumn(nombres);
        }
        tabla.setModel(modelo);
        modeloTabla(tabla, modelo);

         DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < modelo.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        tabla.getTableHeader().setReorderingAllowed(false);
        

        return modelo;
    }
    
    public void modeloTabla(JTable tabla, DefaultTableModel modelo) {
        JTableHeader header = tabla.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        tabla.setShowGrid(false);
        tabla.setShowVerticalLines(false);
        JScrollPane scrollPane = (JScrollPane) SwingUtilities.getAncestorOfClass(JScrollPane.class, tabla);
        if (scrollPane != null) {
            scrollPane.setBorder(BorderFactory.createEmptyBorder());
        }

        for (int i = 0; i < modelo.getColumnCount(); i++) {
            int minWidth = 5;
            int col = i;
            int max = 0;

            for (int row = 0; row < modelo.getRowCount(); row++) {
                TableCellRenderer renderer = tabla.getCellRenderer(row, col);
                Component comp = tabla.prepareRenderer(renderer, row, col);
                max = Math.max(comp.getPreferredSize().width + 1, max);
            }
            TableColumn columna = tabla.getColumnModel().getColumn(i);
            columna.setPreferredWidth(Math.max(max, minWidth));
        }
    }

    public void centrarColumaDerecha(JTable tabla, int columna) {
        DefaultTableCellRenderer rightAlignmentRenderer = new DefaultTableCellRenderer();
        rightAlignmentRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tabla.getColumnModel().getColumn(columna).setCellRenderer(rightAlignmentRenderer);
    }
    
    private boolean verificarNumerosEnTabla(JTable tabla) {
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    int filas = modelo.getRowCount();
    int columnas = modelo.getColumnCount();

    for (int fila = 0; fila < filas; fila++) {
        for (int columna = 1; columna < columnas; columna++) {
            Object valor = modelo.getValueAt(fila, columna);
            if (valor != null && !valor.toString().isEmpty()) {
                String valorStr = valor.toString();
                if (!esNumero(valorStr)) {
                    JOptionPane.showMessageDialog(null, "El valor en la fila " + (fila + 1) + ", columna " + (columna + 1) + " no es un número válido.");
                    return false;
                }
            }
        }
    }
    return true;
}
    
    private boolean esNumero(String str) {
    try {
        int valor = Integer.parseInt(str);
        return valor >= 0;
    } catch (NumberFormatException e) {
        return false;
    }
}
    
    private String nombreRealVial(String pila){
        String nombre;
        switch(pila){
            case "Sputnik": nombre = "Sputnik V"; break;
            case "Pfizer": nombre = "Pfizer"; break;
            case "Sinopharm": nombre = "Sinopharm y Sinovac"; break;
            case "Johnson": nombre = "Johnson_Johnson"; break;
            default: nombre = "AstraZeneca";
        }
        return nombre;
    }
}
