/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtelefoniastocktaking;

import gtelefoniastocktaking.mensajesSYS.UserNew;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Vinicio
 */
public class modifyUsers extends javax.swing.JFrame {

public static Double sumaT;
Connection cnx = null;
String url = "jdbc:mysql://localhost:3306/inventario";
String user = "root";
String pass = "Disatel88";
String nomb, contra;
Color grisMoved =new Color(180,180,180);
Color grisborde =new Color(224,224,224);
Color grisPress =new Color(179,179,179);
Color ColorFont =new Color(123,123,123);
Color ColorSalida =new Color(0,102,204);
Color ColorSalida2 =new Color(2,72,142);
Border thickBorde = new LineBorder(Color.WHITE, 4);
int opciox;
String  n, p;
int nvl;
private int x;
private int y;

    public modifyUsers() {
        initComponents();
         setLocationRelativeTo(null);
        jButton1.setBorder(thickBorde);
        jButton3.setBorder(thickBorde);
        jLabel19.setVisible(false);   
        jLabel25.setVisible(false);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        nombrU = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        pssw = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ms = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");
        setMinimumSize(new java.awt.Dimension(540, 150));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(540, 150));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(91, 91, 91));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Escoja una de las opciones");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });
        jLabel22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel22MouseDragged(evt);
            }
        });
        jLabel22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel22KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 410, 40));

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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 40));

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(123, 123, 123));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/conT.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(123, 123, 123));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setToolTipText(""); // NOI18N
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
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 40, 40));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 41, 40));

        jLabel1.setText(".");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 10, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/GteleXela.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 510, 40));

        jButton2.setBackground(new java.awt.Color(3, 64, 124));
        jButton2.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Editar Usuario");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 230, 60));

        jButton4.setBackground(new java.awt.Color(3, 64, 124));
        jButton4.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Crear Usuario");
        jButton4.setBorder(null);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 240, 60));

        jLabel18.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(52, 52, 52));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Nombre");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 190, 30));

        nombrU.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        nombrU.setForeground(new java.awt.Color(102, 102, 102));
        nombrU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombrU.setBorder(null);
        nombrU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrUActionPerformed(evt);
            }
        });
        getContentPane().add(nombrU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, 30));

        jLabel17.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(52, 52, 52));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Contraseña");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 30));

        pssw.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 21)); // NOI18N
        pssw.setForeground(new java.awt.Color(102, 102, 102));
        pssw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pssw.setBorder(null);
        pssw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psswActionPerformed(evt);
            }
        });
        pssw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                psswKeyPressed(evt);
            }
        });
        getContentPane().add(pssw, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 190, 30));

        jButton5.setBackground(new java.awt.Color(3, 64, 124));
        jButton5.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ENTRAR");
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 130, 40));

        jLabel21.setFont(new java.awt.Font("Microsoft Tai Le", 1, 13)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("INSTRUCCIONES");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 180, -1));

        jLabel16.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(" ENTRAR ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 170, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("sistema le permita editar o crear ususarios.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 240, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("abrir la ventana donde usted podrá editar");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 240, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ingrese su NOMBRE y CONTRASEÑA");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 240, -1));

        jLabel20.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("después presione ENTRAR para");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 240, -1));

        ms.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 14)); // NOI18N
        ms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 30));

        jLabel23.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("los datos del usuario o crear uno nuevo.");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 240, -1));

        jLabel24.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Sus datos son necesarios para que el");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 240, -1));

        jLabel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Yi Baiti", 0, 22), new java.awt.Color(102, 102, 102))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, 270));

        jLabel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Yi Baiti", 0, 22), new java.awt.Color(102, 102, 102))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 240, 270));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blancoE2.jpg"))); // NOI18N
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel5KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 240, 270));

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
        LoginGT lG = new LoginGT();
        lG.setVisible(true);
        lG.setLocationRelativeTo(null);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        Border thickBorder = new LineBorder(ColorSalida, 54);
        jButton3.setBorder(thickBorder);
        jButton1.setBorder(thickBorde);
        jLabel2.setForeground(ColorFont);
        jLabel3.setForeground(Color.WHITE);
    
       
// TODO add your handling code here:
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
        jLabel3.setForeground(ColorFont);
   
    }//GEN-LAST:event_formMouseMoved

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
      // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        Border thickBorder = new LineBorder(grisPress, 54);
               // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        Border thickBorder = new LineBorder(grisborde, 54);
                 // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

opciox=1;
jLabel19.setVisible(true);
jLabel25.setVisible(true);   
this.setMinimumSize(new Dimension(541, 423)); 
this.setLocationRelativeTo(null);
nombrU.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
opciox=2;
jLabel19.setVisible(true);
jLabel25.setVisible(true);
this.setMinimumSize(new Dimension(541, 423)); 
this.setLocationRelativeTo(null);
nombrU.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nombrUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrUActionPerformed

    private void psswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psswActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
if(opciox==1){
inicia();
}
if(opciox==2){
inicia();
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyPressed
         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5KeyPressed

    private void jLabel22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel22KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22KeyPressed

    private void psswKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psswKeyPressed
if(evt.getKeyCode()==10){
inicia();
}        // TODO add your handling code here:
    }//GEN-LAST:event_psswKeyPressed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
this.dispose();
LoginGT g = new LoginGT();
g.setVisible(true);
g.setLocationRelativeTo(null);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel22MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseDragged
this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseDragged

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
x = evt.getX();
                y = evt.getY();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MousePressed

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
            java.util.logging.Logger.getLogger(modifyUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifyUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifyUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifyUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new modifyUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel ms;
    private javax.swing.JTextField nombrU;
    private javax.swing.JPasswordField pssw;
    // End of variables declaration//GEN-END:variables

public void inicia(){
    nomb = nombrU.getText();
contra = pssw.getText();
Connection cnx = null;
       
 try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, user,pass);
             String sql = "Select *from usuarios";
             Statement st = cnx.prepareStatement(sql);
             ResultSet res = st.executeQuery(sql);
             
            while (res.next()){
            n = res.getString(1);
            p = res.getString(2);
            nvl  = res.getInt(3);
            if (n.equals(nomb) ){
   
            if (p.equals(contra)&&opciox==1){
            modUsers u = new modUsers(n);
            u.setVisible(true);
            u.setLocationRelativeTo(null);
            this.dispose();
            }
            if (p.equals(contra)&&opciox==2){
            UserNew u = new UserNew();
            u.setVisible(true);
            u.setLocationRelativeTo(null);
            this.dispose();
            } 
            }
            else 
                ms.setText("Datos Incorrectos");
            }
                } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
                } catch (SQLException ex) {
                Logger.getLogger(LoginGT.class.getName()).log(Level.SEVERE, null, ex);
                }
 nombrU.setText("");
 pssw.setText("");
 nombrU.requestFocus();

}

}
