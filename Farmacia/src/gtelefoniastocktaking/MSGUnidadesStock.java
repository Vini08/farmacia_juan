/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtelefoniastocktaking;

import com.sun.awt.AWTUtilities;
import java.awt.event.KeyEvent;


public class MSGUnidadesStock extends javax.swing.JFrame {

public static String cantidad, deseada;
    public MSGUnidadesStock(String cant, String canTdesea) {
        initComponents();
        setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        cantidad=cant;
        deseada = canTdesea;
        jLabel7.setText(cantidad );
         jLabel9.setText(deseada);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OK");
        setUndecorated(true);
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

        jLabel7.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(217, 217, 217));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("00");
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 40, 40));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 231, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("No se puede realizar la venta porque ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 520, 40));

        jLabel9.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(217, 217, 217));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("00");
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel9KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 60, 40));

        jLabel8.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(217, 217, 217));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ENTER = SALIR");
        jLabel8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel8KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 500, 40));

        jLabel10.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(217, 217, 217));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("la cantidad de unidades en bodega es: ");
        jLabel10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel10KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 430, 40));

        jLabel12.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(217, 217, 217));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("No existen suficientes unidades en bodega.");
        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel12KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 500, 40));

        jLabel13.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(217, 217, 217));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("y la cantidad de unidades deseadas es: ");
        jLabel13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel13KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 430, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/barraMensajes.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 520, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/grisFondo.jpg"))); // NOI18N
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
      // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
if (evt.getKeyCode()==KeyEvent.VK_ENTER){
this.dispose();
}        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7KeyPressed

    private void jLabel8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8KeyPressed

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9KeyPressed

    private void jLabel10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel10KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10KeyPressed

    private void jLabel12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12KeyPressed

    private void jLabel13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel13KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13KeyPressed

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
            java.util.logging.Logger.getLogger(MSGUnidadesStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MSGUnidadesStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MSGUnidadesStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MSGUnidadesStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MSGUnidadesStock(cantidad, deseada).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
