/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System_Farmacia;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import static System_Farmacia.inventario.tablaInventario;

/**
 *
 * @author Vinicio
 */
public class VentasDIA extends javax.swing.JFrame {

private int x;
private int y;
static int w=0; 
public boolean check=true;
static String inv[]=new String[5000];
static String GN[]=new String[5000];
String url = "jdbc:mysql://localhost:3306/bd_farm";
String user = "root";
String pass = "";
int busqueda;
Color grisMoved =new Color(180,180,180);
Color grisborde =new Color(224,224,224);
Color grisPress =new Color(179,179,179);
Color ColorFont =new Color(123,123,123);
Color ColorSalida =new Color(0,102,204);
Color ColorSalida2 =new Color(2,72,142);
Color CBTNmenu =new Color(39,39,39);
Color cleaan =new Color(0,0,255);
Color vver =new Color(102,102,102);
Border thickBorde = new LineBorder(Color.WHITE, 4);
static float invT=0;
public static String delDia,alDia;      
    public VentasDIA() {
        initComponents();
         setLocationRelativeTo(null);
       jButton1.setBorder(thickBorde);
        jButton3.setBorder(thickBorde);
     JTableHeader th1;
     th1 = tablaVentas.getTableHeader();
      Font fuente1 = new Font("Microsoft Yi Baiti", Font.PLAIN, 22); 
        th1.setFont(fuente1); 
DateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
Date date = new Date();
delDia =  String.valueOf(dateFormat.format(date));
alDia =  String.valueOf(dateFormat.format(date));        

LLenarDELAL(delDia,alDia);
        jLabel2.setToolTipText(null);
        jLabel3.setToolTipText(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas Realizadas");
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1285, 0, 40, 40));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1285, 0, 40, 40));

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
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1325, 0, 40, 40));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1325, 0, 41, 40));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 231, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VENTAS REALIZADAS POR DIA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/solid-orange-background.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 480, 40));

        tablaVentas.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 24)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Factura", "Usuario", "Total Factura", "Fecha"
            }
        ));
        tablaVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaVentas.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tablaVentas.setRowHeight(19);
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablaVentasMouseEntered(evt);
            }
        });
        tablaVentas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tablaVentasMouseMoved(evt);
            }
        });
        tablaVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaVentasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1320, 450));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/barraMensajes.png"))); // NOI18N
        jLabel20.setPreferredSize(new java.awt.Dimension(367, 70));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 730, 80));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, 40));

        jLabel14.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 58)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Q");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 570, 50, 70));

        jLabel13.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 58)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 570, 210, 70));

        jLabel10.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 58)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(96, 96, 96));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Total Venta ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 310, 70));

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(102, 102, 102));
        jLabel75.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 570, 70));

        jLabel27.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/clear.png"))); // NOI18N
        jLabel27.setText("   Limpiar Tabla");
        jLabel27.setToolTipText("");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel27MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel27MouseReleased(evt);
            }
        });
        jLabel27.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel27MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 50));

        jButton9.setBackground(new java.awt.Color(0, 0, 255));
        jButton9.setForeground(new java.awt.Color(3, 64, 124));
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton9.setFocusPainted(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton9MouseReleased(evt);
            }
        });
        jButton9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton9MouseMoved(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel12MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 690, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/barraMensajes.png"))); // NOI18N
        jLabel21.setPreferredSize(new java.awt.Dimension(367, 70));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 730, 80));

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
        jLabel3.setForeground(Color.gray);
        if(LoginGT.boot==0){
        MENUadmin.controlVentana4=true;
        }
        if(LoginGT.boot==1){
                MENUusuario.controlVentana4=true;
        }   Border thickBorderX = new LineBorder(Color.WHITE, 5);
        jButton3.setBorder(thickBorderX);

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

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseDragged

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
x = evt.getX();
                y = evt.getY();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
Border thickBorder2 = new LineBorder(cleaan, 60);
jButton9.setBorder(thickBorder2);

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseReleased

    private void jButton9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseMoved

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
// TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void tablaVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaVentasMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void tablaVentasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseMoved
      // TODO add your handling code here:
    }//GEN-LAST:event_tablaVentasMouseMoved

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel12MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseDragged

    private void jLabel27MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseMoved
        Color X1 =new Color(9,9,165);
        Border thickBorder = new LineBorder(X1, 86);
        jLabel27.setToolTipText(null);
        jButton9.setBorder(thickBorder);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseMoved

    private void jLabel27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseReleased
        LLenarDELAL(delDia,alDia);              // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseReleased

    private void jLabel27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MousePressed

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        Border thickBorder2 = new LineBorder(cleaan, 60);
        jButton9.setBorder(thickBorder2);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseExited

    private void tablaVentasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaVentasKeyPressed
int pressEnter = evt.getKeyCode();
if(pressEnter==KeyEvent.VK_ENTER){
  busqueda= (Integer) tablaVentas.getValueAt(tablaVentas.getSelectedRow(), 0);   
  buscarT(busqueda); 
}
// TODO add your handling code here:
    }//GEN-LAST:event_tablaVentasKeyPressed

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
            java.util.logging.Logger.getLogger(VentasDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentasDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentasDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentasDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VentasDIA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables

 
 public void buscarT(int busq){
         DefaultTableModel modelo = new DefaultTableModel();
        tablaVentas.setModel(modelo);
        Connection cnx = null;
        if (cnx == null) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, user,pass);
             String sql = "Select *from detalle_factura where codigo_factura='"+busq+"'";
             Statement st = cnx.prepareStatement(sql);
             ResultSet res = st.executeQuery(sql);
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
             throw new ClassCastException(ex.getMessage());
             } catch (SQLException ex) { 
                Logger.getLogger(LoginGT.class.getName()).log(Level.SEVERE, null, ex);
            } 
        sumaT();
            }   
    }
 
 
 public void sumaT(){
     double sumatoria1=0.0;
        int totalRow= tablaVentas.getRowCount();
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++)
        {
             double sumatoria= Double.parseDouble(String.valueOf(tablaVentas.getValueAt(i,8)));
             sumatoria1+=sumatoria;
 }
   jLabel13.setText(Double.toString(sumatoria1));
   
 }
 
  public void LLenarDELAL(String delDia,String alDia){
     tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(90);
tablaVentas.getColumnModel().getColumn(1).setPreferredWidth(100);
tablaVentas.getColumnModel().getColumn(2).setPreferredWidth(150);
tablaVentas.getColumnModel().getColumn(3).setPreferredWidth(200);
tablaVentas.setAutoResizeMode(tablaVentas.AUTO_RESIZE_LAST_COLUMN);
jLabel13.setText("");
invT=0;
w=0;


DefaultTableModel modelo = new DefaultTableModel();
        tablaVentas.setModel(modelo);
        Connection cnx = null;
        if (cnx == null) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, user,pass);
             String sql = "SELECT * FROM factura  where DATE(fecha) BETWEEN '"+delDia+"' AND '"+alDia+"'";
             Statement st = cnx.prepareStatement(sql);
             ResultSet res = st.executeQuery(sql);
             ResultSetMetaData rsMd = res.getMetaData();
             int cantidadColumnas = rsMd.getColumnCount();
             for (int i = 1; i <= cantidadColumnas; i++) {
            modelo.addColumn(rsMd.getColumnLabel(i));
         }
         while (res.next()){
             inv[w] = res.getString(3);
                    Float auxo = Float.parseFloat(inv[w]);
                    invT = invT + auxo;
                    w++;
         Object[] fila = new Object[cantidadColumnas];
         for (int i = 0; i < cantidadColumnas; i++) {
         fila[i]=res.getObject(i+1);
         }
              modelo.addRow(fila);
             
             }
         jLabel13.setText(""+invT);
         invT = 0;
             } catch (ClassNotFoundException ex) {
             throw new ClassCastException(ex.getMessage());
             } catch (SQLException ex) { 
                Logger.getLogger(LoginGT.class.getName()).log(Level.SEVERE, null, ex);
            } 
            }   
    }
}


