/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System_Farmacia;

import FARM.mensajesSYS.datosAlmacenados;
import java.awt.Color;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinicio
 */
public class Agotados extends javax.swing.JFrame {
public static String url = "jdbc:mysql://localhost:3306/bd_farm";
public static String user = "root";
public static String pass = "";
int unids;
Color grisborde =new Color(224,224,224);
Color grisPress =new Color(179,179,179);
Color ColorFont =new Color(123,123,123);
Color ColorSalida =new Color(0,102,204);
Color ColorSalida2 =new Color(2,72,142);
Border thickBorde = new LineBorder(Color.WHITE, 4);
 public static String code, cate, prod, provv;
 public  static BigDecimal price0,price1,price2;
public static int unit,alerts; 
private int x;
private int y;
Connection cnx,conI = null;

    public Agotados() {
        initComponents();
        jTextField1.requestFocus();
         setLocationRelativeTo(null);
         LlenarTabla("SELECT codigo_producto, categoria, producto,proveedor,unidades,alerta_unidades,precio_compra,precio_venta,precio_mayoreo FROM producto where Unidades=0");
       jButton1.setBorder(thickBorde);
        jButton3.setBorder(thickBorde);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos Agotados");
        setBackground(new java.awt.Color(153, 102, 255));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(123, 123, 123));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 0, 40, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 0, 40, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(123, 123, 123));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<<");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 0, 40, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setFocusPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 0, 41, 40));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 231, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EDITAR PRODUCTO AGOTADOS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/AZUL.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 630, 40));

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 82, 82));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PRECIO DE VENTA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 810, 280, 30));

        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(82, 82, 82));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CODIGO PRODUCTO");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 330, 30));

        jLabel14.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(82, 82, 82));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CATEGORIA");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 330, 30));

        jLabel15.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(82, 82, 82));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("PRECIO MAYOREO");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 320, 30));

        jLabel17.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(114, 77, 77));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("UNIDADES");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 50, 320, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 330, 40));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 330, 40));

        jTextField3.setBackground(new java.awt.Color(157, 123, 123));
        jTextField3.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 80, 320, 40));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(153, 153, 153));
        jTextField4.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 680, 280, 40));

        jTextField5.setBackground(new java.awt.Color(153, 153, 153));
        jTextField5.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(null);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 840, 280, 40));

        jButton5.setBackground(new java.awt.Color(92, 42, 42));
        jButton5.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EDITAR");
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 760, 440, 120));

        jLabel25.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(82, 82, 82));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("PROVEEDOR");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 280, 30));

        jTextField6.setBackground(new java.awt.Color(153, 153, 153));
        jTextField6.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(null);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 680, 320, 40));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(153, 153, 153));
        jTextField8.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(null);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 840, 330, 40));

        jLabel27.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(82, 82, 82));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("PRODUCTO");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 810, 330, 30));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 690, 40));

        jTextField10.setBackground(new java.awt.Color(153, 153, 153));
        jTextField10.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setBorder(null);
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 760, 280, 40));

        jLabel31.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(82, 82, 82));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("PRECIO COMPRA");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 730, 280, 30));

        jTable1.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "codigo_Producto", "codigo_barras", "categoria", "producto", "Proveedor", "Unidades", "alerta", "fecha vencimiento", "Precio de Compra", "Precio de Venta", "Precio Mayoreo", "descuento", "porciones"
            }
        ));
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1590, 510));

        jTextField7.setBackground(new java.awt.Color(157, 123, 123));
        jTextField7.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(null);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 760, 320, 40));

        jLabel18.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(114, 77, 77));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ALERTA DE UNIDADES");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 730, 320, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setExtendedState(ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        Border thickBorder = new LineBorder(grisPress, 54);
        jButton1.setBorder(thickBorder);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        Border thickBorder = new LineBorder(grisborde, 54);
        jButton1.setBorder(thickBorder);
        jButton3.setBorder(thickBorde);
        jLabel3.setForeground(ColorFont);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        Border thickBorder = new LineBorder(grisPress, 54);
        jButton1.setBorder(thickBorder);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        Border thickBorder = new LineBorder(grisborde, 54);
        jButton1.setBorder(thickBorder);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        Border thickBorder = new LineBorder(grisborde, 54);
        jButton1.setBorder(thickBorder);
        jButton3.setBorder(thickBorde);
        jLabel2.setForeground(Color.BLACK);
        jLabel3.setForeground(ColorFont);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        Border thickBorder = new LineBorder(ColorSalida2, 54);
        jButton3.setBorder(thickBorder);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        Border thickBorder = new LineBorder(ColorSalida2, 54);
        jButton3.setBorder(thickBorder);
         if(LoginGT.boot==0){
        MENUadmin.controlVentana2=true;
        }
        if(LoginGT.boot==1){
                MENUusuario.controlVentana2=true;
        }
 this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        Border thickBorder = new LineBorder(ColorSalida, 54);
        jButton3.setBorder(thickBorder);
        jButton1.setBorder(thickBorde);
        jLabel2.setForeground(ColorFont);
        jLabel3.setForeground(Color.WHITE);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseMoved

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseMoved
        Border thickBorder = new LineBorder(Color.BLUE, 54);
        jButton3.setBorder(thickBorder);
        jButton1.setBorder(thickBorde);
        jLabel3.setForeground(Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        Border thickBorder = new LineBorder(Color.WHITE, 5);
        jButton1.setBorder(thickBorder);
        jButton3.setBorder(thickBorder);
        jLabel2.setForeground(ColorFont);
        jLabel3.setForeground(ColorFont);        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       ModificarProd(Integer.parseInt(jTextField3.getText()),jTextField1.getText(),jTextField2.getText(),jTextField8.getText(), new BigDecimal(jTextField10.getText()),new BigDecimal(jTextField5.getText()),new BigDecimal(jTextField6.getText()),Integer.parseInt(jTextField7.getText()));
       inventario.test=1;
        conteoAgotados("SELECT count(codigo_producto)as cuantos FROM producto where Unidades=0");
        LlenarTabla("SELECT codigo_producto, categoria, producto,proveedor,unidades,alerta_unidades,precio_compra,precio_venta,precio_mayoreo FROM producto where Unidades=0");
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");
jTextField8.setText("");
jTextField10.setText("");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
code = ((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
cate = ((String) jTable1.getValueAt(jTable1.getSelectedRow(), 1));
prod = ((String) jTable1.getValueAt(jTable1.getSelectedRow(), 2));
provv = ((String) jTable1.getValueAt(jTable1.getSelectedRow(), 3));
price0 = ((BigDecimal) jTable1.getValueAt(jTable1.getSelectedRow(), 6));
price1 = ((BigDecimal) jTable1.getValueAt(jTable1.getSelectedRow(), 7));
price2 = ((BigDecimal) jTable1.getValueAt(jTable1.getSelectedRow(), 8));
unit = ((int) jTable1.getValueAt(jTable1.getSelectedRow(), 4));
alerts = ((int) jTable1.getValueAt(jTable1.getSelectedRow(), 5));
        jTextField1.setText(code);
        jTextField1.setText(code);
        jTextField2.setText(cate);
        jTextField8.setText(prod);
        jTextField4.setText(provv);
        jTextField10.setText(String.valueOf(price0));
        jTextField5.setText(String.valueOf(price1));
        jTextField6.setText(String.valueOf(price2));
        jTextField7.setText(String.valueOf(alerts));
        jTextField3.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
if (evt.getKeyCode()==10){
       ModificarProd(Integer.parseInt(jTextField3.getText()),jTextField1.getText(),jTextField2.getText(),jTextField8.getText(), new BigDecimal(jTextField10.getText()),new BigDecimal(jTextField5.getText()),new BigDecimal(jTextField6.getText()),Integer.parseInt(jTextField7.getText()));
       inventario.test=1;
        conteoAgotados("SELECT count(codigo_producto)as cuantos FROM producto where Unidades=0");
        LlenarTabla("SELECT codigo_producto, categoria, producto,proveedor,unidades,alerta_unidades,precio_compra,precio_venta,precio_mayoreo FROM producto where Unidades=0");
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");
jTextField8.setText("");
jTextField10.setText("");


}        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyPressed

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
            java.util.logging.Logger.getLogger(Agotados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agotados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agotados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agotados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agotados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static final javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

   
    
  public void ModificarProd(int unid, String code, String categ, String Prod, BigDecimal precio1,BigDecimal precio2,BigDecimal precio3, int alerts ){
          
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
           CallableStatement cmst= conn.prepareCall("call ModificarProducto_Agotado (?,?,?,?,?,?,?,?)");
           
           cmst.setInt(1,unid);
           cmst.setString(2,code);
           cmst.setString(3,categ);
           cmst.setString(4,Prod);
           cmst.setBigDecimal(5,precio1);
           cmst.setBigDecimal(6,precio2);
           cmst.setBigDecimal(7,precio3);
           cmst.setInt(8,alerts);
           cmst.execute();            
       
        conn.close();
        
        
        }catch(SQLException sqlex){
         JOptionPane.showMessageDialog(this,sqlex);
        }
    }
 public void conteoAgotados(String sql){
    try{
             cnx = DriverManager.getConnection(url, user,pass);
             Statement st = cnx.prepareStatement(sql);
             ResultSet res = st.executeQuery(sql);  
            while (res.next()){
              if(LoginGT.boot==0){
                MENUadmin.jLabel29.setText(res.getString(1));
                }
                if(LoginGT.boot==1){
                MENUusuario.jLabel29.setText(res.getString(1));
                }
            }
        }
        catch(SQLException ex){JOptionPane.showMessageDialog(this,ex);}
       }
 
 
  public void LlenarTabla(String Query){
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        Connection cnx = null;
        if (cnx == null) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, user,pass);
           
             Statement st = cnx.prepareStatement(Query);
             ResultSet res = st.executeQuery(Query);
             ResultSetMetaData rsMd = res.getMetaData();
             int cantidadColumnas = rsMd.getColumnCount();
             for (int i = 1; i <= cantidadColumnas; i++) {
            modelo.addColumn(rsMd.getColumnLabel(i));
         }
         while (res.next()){
         Object[] fila = new Object[cantidadColumnas];
         for (int i = 0; i < cantidadColumnas; i++) {
         fila[i]=res.getObject(i+1);
         }
              modelo.addRow(fila);
             
             }
             } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(this,ex);
             } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(this,ex);
            } 
            }   
    }
}
