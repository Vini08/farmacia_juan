/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtelefoniastocktaking;

import gtelefoniastocktaking.mensajesSYS.datosAlmacenados;
import static gtelefoniastocktaking.stocktaking.test;
import java.awt.Color;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Vinicio
 */
public class EditarProdcut extends javax.swing.JFrame {

String url = "jdbc:mysql://localhost:3306/inventario";
String user = "root";
String pass = "Disatel88";
String g=" SELECT *FROM producto where Unidades=0";
int unids;
String codP, nameP,modP, provP, unidP;
Double precCP, preVP, preGP;
Color grisborde =new Color(224,224,224);
Color grisPress =new Color(179,179,179);
Color ColorFont =new Color(123,123,123);
Color ColorSalida =new Color(0,102,204);
Color ColorSalida2 =new Color(2,72,142);
Border thickBorde = new LineBorder(Color.WHITE, 4);
 public static String code, mark, model, provv, porcs;
public static BigDecimal price1,price2;   
public static int unit; 
    public EditarProdcut(String codes,String marks,String models,int unitss,String provvs,BigDecimal price1s,BigDecimal price2s,String porciones   ) {
        initComponents();
        jTextField1.requestFocus();
         setLocationRelativeTo(null);
       jButton1.setBorder(thickBorde);
        jButton3.setBorder(thickBorde);
        code=codes;
        mark=marks;
        model=models;
        unit=unitss;
        provv=provvs;
        price1=price1s;
        price2=price2s;
        porcs=porciones;
        
        jTextField1.setText(code);
        jTextField2.setText(mark);
        jTextField8.setText(model);
        jTextField3.setText(Integer.toString(unit));
        jTextField4.setText(provv);
        jTextField5.setText(String.valueOf(price1));
        jTextField6.setText(String.valueOf(price2));
        jTextField7.setText(String.valueOf(porcs));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo Producto");
        setMinimumSize(new java.awt.Dimension(940, 670));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(940, 670));
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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 40));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 40));

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
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 40, 40));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 41, 40));

        jLabel1.setText(".");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 10, -1));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 231, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EDITAR PRODUCTO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/AZUL.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 670, 40));

        jLabel22.setFont(new java.awt.Font("Microsoft Tai Le", 0, 10)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("presione EDITAR y los datos serán");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, -1));

        jLabel24.setFont(new java.awt.Font("Microsoft Tai Le", 0, 10)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("presione EDITAR y los datos serán");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/barraGTgris.png"))); // NOI18N
        jLabel20.setPreferredSize(new java.awt.Dimension(367, 70));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 330, 70));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/GtelefoniaCentro.png"))); // NOI18N
        jLabel19.setPreferredSize(new java.awt.Dimension(367, 70));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 360, 70));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/barraGTgris.png"))); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(367, 70));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 350, 70));

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 82, 82));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PRECIO DE VENTA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 230, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft Tai Le", 0, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ingrese valores para cada una de");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 190, -1));

        jLabel16.setFont(new java.awt.Font("Microsoft Tai Le", 0, 10)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("de las celdas, verifique que cada uno ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 190, -1));

        jLabel21.setFont(new java.awt.Font("Microsoft Tai Le", 0, 10)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("sea correcto, para finalizar ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft Tai Le", 0, 10)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("almacenados en su Base de Datos.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 30));

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("INSTRUCCIONES");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(82, 82, 82));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CODIGO PRODUCTO");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 230, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(82, 82, 82));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CATEGORIA");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 230, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blancoE2.jpg"))); // NOI18N
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel5KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 560));

        jLabel15.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(82, 82, 82));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("PRECIO DE MAYOREO");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 230, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(82, 82, 82));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("UNIDADES");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 230, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 230, 30));

        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 230, 30));

        jTextField3.setBackground(new java.awt.Color(153, 153, 153));
        jTextField3.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        jTextField4.setBackground(new java.awt.Color(153, 153, 153));
        jTextField4.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 230, 30));

        jTextField5.setBackground(new java.awt.Color(153, 153, 153));
        jTextField5.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(null);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 230, 30));

        jLabel23.setFont(new java.awt.Font("Microsoft Tai Le", 0, 10)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("presione 'Ingresar' y los datos ");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 190, -1));

        jButton5.setBackground(new java.awt.Color(54, 54, 54));
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
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 230, 40));

        jLabel25.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(82, 82, 82));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("PROVEEDOR");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 230, -1));

        jTextField6.setBackground(new java.awt.Color(153, 153, 153));
        jTextField6.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(null);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 230, 30));

        jTextField7.setBackground(new java.awt.Color(153, 153, 153));
        jTextField7.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(null);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 230, 30));

        jLabel26.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(82, 82, 82));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("PRECIO ORO");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 230, -1));

        jTextField8.setBackground(new java.awt.Color(153, 153, 153));
        jTextField8.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(null);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 230, 30));

        jLabel27.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(82, 82, 82));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("PRODUCTO");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 230, -1));

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

    private void jLabel5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyPressed
    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        codP = jTextField1.getText();
        nameP=jTextField2.getText();
        modP=jTextField8.getText();
        provP = jTextField4.getText();
        precCP = Double.parseDouble(jTextField5.getText());
        preVP = Double.parseDouble(jTextField6.getText());
        preGP = Double.parseDouble(jTextField7.getText());
        unidP = jTextField3.getText();
        unids = Integer.parseInt(unidP);
        ModificarProd(unids, provP, precCP, preVP, preGP,codP,nameP,modP);
        stocktaking.test=1;
       hacer_ventas.test2=1;
       stocktaking.LlenarTabla(g);
       // insertProd();
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarProdcut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProdcut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProdcut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProdcut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProdcut(code, mark, model, unit, provv, price1,price2,porcs).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static final javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

   
    
  public void ModificarProd( int unid, String prov, Double p1,Double p2,Double p3,String codd,String nam, String mod){
          
        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
           CallableStatement cmst= conn.prepareCall("call ModificarProducto (?,?,?,?,?,?,?,?)");
           
           cmst.setInt(1,unid);
           cmst.setString(2,prov);
           cmst.setDouble(3,p1);
           cmst.setDouble(4,p2);
           cmst.setDouble(5,p3);
           cmst.setString(6,codd);
           cmst.setString(7,nam);
           cmst.setString(8,mod);
           cmst.execute();            
       
        conn.close();
       this.dispose();
        
        datosAlmacenados v = new datosAlmacenados();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
        }catch(SQLException sqlex){System.out.println(sqlex.getMessage());
         JOptionPane.showMessageDialog(this,sqlex);
        }catch(Exception ex){System.out.println(ex.getMessage());
           JOptionPane.showMessageDialog(this,ex);
        }
    }

}
