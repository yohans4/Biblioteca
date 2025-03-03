
import conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author santi
 */
public class Biblioteca extends javax.swing.JFrame {

    /**
     * Creates new form Biblioteca
     */
    public Biblioteca() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        jButtonRegistro = new javax.swing.JButton();
        jButtonAbrirAutores = new javax.swing.JButton();
        jButtonLibros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("MENÚ BIBLIOTECA");

        jButtonRegistro.setBackground(new java.awt.Color(255, 0, 0));
        jButtonRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRegistro.setActionCommand("Clientes");
        jButtonRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonRegistro.setBorderPainted(false);
        jButtonRegistro.setDefaultCapable(false);
        jButtonRegistro.setLabel("Clientes");
        jButtonRegistro.setMaximumSize(new java.awt.Dimension(81, 23));
        jButtonRegistro.setMinimumSize(new java.awt.Dimension(81, 23));
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });

        jButtonAbrirAutores.setBackground(new java.awt.Color(255, 0, 0));
        jButtonAbrirAutores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAbrirAutores.setText("Autores");
        jButtonAbrirAutores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAbrirAutores.setBorderPainted(false);
        jButtonAbrirAutores.setDefaultCapable(false);
        jButtonAbrirAutores.setMaximumSize(new java.awt.Dimension(81, 23));
        jButtonAbrirAutores.setMinimumSize(new java.awt.Dimension(81, 23));
        jButtonAbrirAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirAutoresActionPerformed(evt);
            }
        });

        jButtonLibros.setBackground(new java.awt.Color(255, 0, 0));
        jButtonLibros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLibros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonLibros.setBorderPainted(false);
        jButtonLibros.setDefaultCapable(false);
        jButtonLibros.setLabel("Libros");
        jButtonLibros.setMaximumSize(new java.awt.Dimension(81, 23));
        jButtonLibros.setMinimumSize(new java.awt.Dimension(81, 23));
        jButtonLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLibrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonAbrirAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))))
                    .addComponent(jLabel1))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAbrirAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirAutoresActionPerformed
        Autores autoresFrame = new Autores();
        autoresFrame.setVisible(true);
    }//GEN-LAST:event_jButtonAbrirAutoresActionPerformed

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
                                                      
    registro registroFrame = new registro();
    registroFrame.setVisible(true);

    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jButtonLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLibrosActionPerformed
        Libros LibrosFrame = new Libros();
        LibrosFrame.setVisible(true);
    }//GEN-LAST:event_jButtonLibrosActionPerformed

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
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirAutores;
    private javax.swing.JButton jButtonLibros;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
Conectar cc = new Conectar();
Connection cn = (Connection) cc.conexion();
}
