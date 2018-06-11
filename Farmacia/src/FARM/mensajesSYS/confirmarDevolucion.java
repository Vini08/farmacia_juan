/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FARM.mensajesSYS;

import com.sun.awt.AWTUtilities;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicio
 */
public class confirmarDevolucion extends javax.swing.JFrame {
Connection cnx,conI = null;
static String url = "jdbc:mysql://localhost:3306/bd_farm";
static String user = "root";
static String pass = "";
public static String codigoFact, codigoDetalle,codigoProduct;
public static int unidades,sumaUnids;
public static Double total,tt;
public static BigDecimal total2;
BigDecimal sumTotal ;
   
public confirmarDevolucion(String cF, String cD, String cP, int uP, BigDecimal tP) {
        initComponents();
        setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        codigoFact=cF;
        codigoDetalle=cD;
        codigoProduct=cP;
        unidades=uP;
        total=tP.doubleValue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OK");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(522, 218));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 231, 231));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("¿Esta seguro de hacer la devolución?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 520, 30));

        jLabel7.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(217, 217, 217));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Presione ENTER para confirmar la devolución");
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 520, 50));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 231, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 480, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/corinto.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 520, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/grisFondo.jpg"))); // NOI18N
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
      // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
if (evt.getKeyCode()==10){
this.dispose();

}// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
if (evt.getKeyCode()==10){
rollbackDevo();

}        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7KeyPressed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseReleased

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
            java.util.logging.Logger.getLogger(confirmarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirmarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirmarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirmarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new confirmarDevolucion(codigoFact,codigoDetalle,codigoProduct, unidades, total2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

public void rollbackDevo(){
      int UD;
      Double tFactur ; 
      //Selecciona unidad de X producto para despues sumarle lo que se va a devolver y acutalizarlo
            try{    
            cnx = DriverManager.getConnection(url, user,pass);
             String sql = "Select unidades from producto where codigo_producto='"+codigoProduct+"'";
             Statement st = cnx.prepareStatement(sql);
             ResultSet res = st.executeQuery(sql);
             
            while (res.next()){  
            UD  = res.getInt(1);
      conI = DriverManager.getConnection(url, user,pass);
      String query = "update producto set unidades = ? where codigo_producto='"+codigoProduct+"'";
      sumaUnids = UD+unidades;
      PreparedStatement preparedStmt = conI.prepareStatement(query);
      preparedStmt.setInt   (1, sumaUnids);
      preparedStmt.executeUpdate();
      
            }
            }
            catch(SQLException ex){
            JOptionPane.showMessageDialog(this,ex+" Update");
            }
            //elimina el producto despues de haberlo actualziado
        try{
        conI = DriverManager.getConnection(url, user,pass);
        String Qury = "Delete from detalle_factura where codigo_producto='"+codigoProduct+"' && codigo_detalle_factura='"+codigoDetalle+"' && codigo_factura='"+codigoFact+"'";
        Statement sts =  conI.createStatement();
        sts.executeUpdate(Qury);
        }
        catch(SQLException ex){
        JOptionPane.showMessageDialog(this,ex+ " Truncate");
        }
        //actualiza el total de la tabla factura 
               try{    
             cnx = DriverManager.getConnection(url, user,pass);
             String sql = "Select total from factura where codigo_factura='"+codigoFact+"'";
             Statement st = cnx.prepareStatement(sql);
             ResultSet res = st.executeQuery(sql);
             
                while (res.next()){  
                tFactur  = res.getDouble(1);
                conI = DriverManager.getConnection(url, user,pass);
                String query = "update factura set total = ? where codigo_factura='"+codigoFact+"'";
                tt=tFactur-total;
                PreparedStatement preparedStmt = conI.prepareStatement(query);
                preparedStmt.setDouble   (1, tt);
                preparedStmt.executeUpdate();
                }
                    datosAlmacenados vt = new datosAlmacenados();
                    vt.setVisible(true);
                    vt.setLocationRelativeTo(null);
                    this.dispose();
                }
                catch(SQLException ex){
                JOptionPane.showMessageDialog(this,ex+" Update");
                }
 }

}