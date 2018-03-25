
package System_Farmacia;

import FARM.mensajesSYS.datosAlmacenados;
import static System_Farmacia.MENUadmin.horaMenu;
import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Vinicio
 */
 
public class LoginGT extends javax.swing.JFrame implements Runnable {

 String url = "jdbc:mysql://localhost:3306/bd_farm";
String user = "root";
String pass = "";
Color grisMoved =new Color(180,180,180);
Color grisborde =new Color(224,224,224);
Color grisPress =new Color(179,179,179);
Color ColorFont =new Color(123,123,123);
Color ColorSalida =new Color(0,102,204);
Color ColorSalida2 =new Color(2,72,142);
Border thickBorde = new LineBorder(Color.WHITE, 4);
String nombre, contraseña , n, p;
String hora,minutos,segundos,ampm;
Calendar fecha;    
Thread h1;
public static int nvl, boot;
private int x;
private int y;
      
public LoginGT() {
        initComponents();
        setLocationRelativeTo(null);
        h1 = new Thread(this);
        h1.start();
     
       jButton1.setBorder(thickBorde);
        jButton3.setBorder(thickBorde);
         jButton6.setBorder(thickBorde);
         name.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        passw = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        ms = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("inicio");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(366, 430));
        setUndecorated(true);
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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 0, 40, 40));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 231, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        jButton11.setBackground(new java.awt.Color(3, 64, 124));
        jButton11.setForeground(new java.awt.Color(3, 64, 124));
        jButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton11.setFocusPainted(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton11MouseReleased(evt);
            }
        });
        jButton11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton11MouseMoved(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 0, 40, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(123, 123, 123));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
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
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, 40, 40));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, 40, 40));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setFocusPainted(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });
        jButton6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton6MouseMoved(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 40));

        jLabel6.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 108, 197));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 367, 50));

        jLabel7.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 108, 197));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 360, 50));

        name.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 230, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/user.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 40, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/usuario_1.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/blanco.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 367, 40));

        passw.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        passw.setForeground(new java.awt.Color(102, 102, 102));
        passw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passw.setBorder(null);
        passw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwFocusGained(evt);
            }
        });
        passw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwKeyPressed(evt);
            }
        });
        getContentPane().add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 230, 50));

        jButton2.setBackground(new java.awt.Color(3, 64, 124));
        jButton2.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("entrar");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, 90));

        ms.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 14)); // NOI18N
        ms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 260, 30));

        jLabel19.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(187, 187, 187));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 360, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/azulBarra.jpg"))); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(367, 70));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 370, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void run(){
 Thread ct = Thread.currentThread();
 while(ct == h1) {   
  calcula();
  horaMenu = hora + ":" + minutos + ":" + segundos + " "+ampm;
  jLabel19.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
  try {
   Thread.sleep(1000);
  }catch(InterruptedException e) {}
 }
}


    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
Border thickBorder = new LineBorder(grisborde, 54);
        jButton1.setBorder(thickBorder);
        jButton3.setBorder(thickBorde);
        jLabel2.setForeground(Color.BLACK);
        jLabel3.setForeground(ColorFont);
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
Border thickBorder = new LineBorder(Color.WHITE, 5);
        jButton1.setBorder(thickBorder);
        jButton3.setBorder(thickBorder);
        jButton6.setBorder(thickBorder);
        jLabel2.setForeground(ColorFont);
        jLabel3.setForeground(ColorFont);
        
    }//GEN-LAST:event_formMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
Border thickBorder = new LineBorder(grisPress, 54);
        jButton1.setBorder(thickBorder);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
     Border thickBorder = new LineBorder(grisborde, 54);
        jButton1.setBorder(thickBorder);
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseReleased

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
this.setExtendedState(ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
Border thickBorder = new LineBorder(grisPress, 54);
        jButton1.setBorder(thickBorder);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
Border thickBorder = new LineBorder(ColorSalida2, 54);
        jButton3.setBorder(thickBorder);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
Border thickBorder = new LineBorder(grisborde, 54);
        jButton1.setBorder(thickBorder); 
        jButton3.setBorder(thickBorde);
jLabel3.setForeground(ColorFont);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
Border thickBorder = new LineBorder(ColorSalida, 54);
        jButton3.setBorder(thickBorder); 
        jButton1.setBorder(thickBorde);
        jLabel3.setToolTipText(null);
jLabel2.setForeground(ColorFont);
jLabel3.setForeground(Color.WHITE);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseMoved

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        Border thickBorder = new LineBorder(ColorSalida2, 54);
        jButton3.setBorder(thickBorder);    
        System.exit(1);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseReleased

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseReleased

    private void jButton6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseMoved

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
inicia();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwKeyPressed
if(evt.getKeyCode()==10){
inicia();
}
// TODO add your handling code here:
    }//GEN-LAST:event_passwKeyPressed

    private void passwFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwFocusGained
ms.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_passwFocusGained

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
      // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseReleased

    private void jButton11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseMoved

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseDragged

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
x = evt.getX();
                y = evt.getY();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MousePressed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
if(evt.getKeyCode()==10){
passw.requestFocus();
}         // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyPressed

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
            java.util.logging.Logger.getLogger(LoginGT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGT().setVisible(true);
            }
        });
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel ms;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField passw;
    // End of variables declaration//GEN-END:variables

public void inicia(){
Calendar fechax = new GregorianCalendar();

int año = fechax.get(Calendar.YEAR);
int mes = fechax.get(Calendar.MONTH);
int dia = fechax.get(Calendar.DAY_OF_MONTH);    
String dat = año+"-"+(mes+1)+"-"+dia;    
nombre = name.getText();
contraseña = passw.getText();
Connection cnx = null;
       
 try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, user,pass);
             String sql = "Select *from usuario";
             Statement st = cnx.prepareStatement(sql);
             ResultSet res = st.executeQuery(sql);
             
            while (res.next()){
            n = res.getString(2);
            p = res.getString(3);
            nvl  = res.getInt(4);
            if (n.equals(nombre) ){
   
            if (p.equals(contraseña)){
                
                if (nvl==0){
                    boot=0;
                    bitacora(n, dat, jLabel19.getText(),"- - - -");
                MENUadmin menu = new MENUadmin(n);
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                this.dispose();
                }
                if (nvl==1){
                    boot=1;
                bitacora(n, dat, jLabel19.getText(),"- - - -");
                MENUusuario menu = new MENUusuario(n);
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                this.dispose();
                }
            }
            }
            else 
                ms.setText("Usuario o Contraseña incorrectos");
            }
                } catch (ClassNotFoundException ex) {
                } catch (SQLException ex) {
                Logger.getLogger(LoginGT.class.getName()).log(Level.SEVERE, null, ex);
                }
 name.setText("");
 passw.setText("");
 name.requestFocus();

}


    public void calcula () {        
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";

        if(ampm.equals("PM")){
         int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
         hora = h>9?""+h:"0"+h;
        }else{
         hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);            
        }
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
    }

    public void bitacora(String us,String  fecha,String ingr, String sald)
   {      
       try {            
       Connection conn = DriverManager.getConnection(url, user, pass);
       CallableStatement proc = conn.prepareCall(" CALL bitacora(?, ?, ?, ?) ");
            //se cargan los parametros de entrada
            proc.setString(1, us);
            proc.setString(2, fecha);
            proc.setString(3, ingr);
            proc.setString(4, sald);
            // Se ejecuta el procedimiento almacenado
            proc.execute();  

        } catch (SQLException ex) { 
        JOptionPane.showMessageDialog(this,ex);
    }  
   }
}
