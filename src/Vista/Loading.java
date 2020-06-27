/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Vanessa Estefania Corredor Andrade
 */
public class Loading extends javax.swing.JFrame {
    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();
      BarraProgreso.setValue(0);
      // Centrar
      setLocationRelativeTo(null);
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Porcentaje = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Info2 = new javax.swing.JLabel();
        Info1 = new javax.swing.JLabel();
        Info = new javax.swing.JLabel();
        BarraProgreso = new javax.swing.JProgressBar();
        Titulo = new javax.swing.JLabel();
        Reloj = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Porcentaje.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        Porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        Porcentaje.setText("50%");
        getContentPane().add(Porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 52, 40, 300));

        Info2.setFont(new java.awt.Font("Corbel", 3, 14)); // NOI18N
        Info2.setForeground(new java.awt.Color(255, 255, 255));
        Info2.setText("©Vanessa Correodor");
        getContentPane().add(Info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 330, -1));

        Info1.setFont(new java.awt.Font("Corbel", 3, 14)); // NOI18N
        Info1.setForeground(new java.awt.Color(255, 255, 255));
        Info1.setText("Año : 2020");
        getContentPane().add(Info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 130, -1));

        Info.setFont(new java.awt.Font("Corbel", 3, 14)); // NOI18N
        Info.setForeground(new java.awt.Color(255, 255, 255));
        Info.setText("Versión : 1.0");
        getContentPane().add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 130, -1));

        BarraProgreso.setBackground(new java.awt.Color(255, 255, 255));
        BarraProgreso.setForeground(new java.awt.Color(240, 104, 104));
        BarraProgreso.setValue(40);
        BarraProgreso.setBorderPainted(false);
        getContentPane().add(BarraProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 800, 15));

        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Loading/texto.png"))); // NOI18N
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        Reloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Loading/reloj.png"))); // NOI18N
        getContentPane().add(Reloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Loading/fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        getAccessibleContext().setAccessibleDescription("El siguiente aplicativo consiste en una agenda para gestionar contactos ,eventos y notas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar BarraProgreso;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel Info1;
    private javax.swing.JLabel Info2;
    public javax.swing.JLabel Porcentaje;
    private javax.swing.JLabel Reloj;
    private javax.swing.JLabel Titulo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
