/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasM2;


import extensiones.TextPrompt;
import javax.swing.JOptionPane;
import prj.proy_cs.cls_funcionesM2;


/**
 *
 * @author usuario
 */
public class JF_desactivarUsuario_m2 extends javax.swing.JFrame {

    /**
     * Creates new form JF_consultaUsuario
     */
    public JF_desactivarUsuario_m2() {
        initComponents();
        TextPrompt txtConsulta = new TextPrompt("Digite la cedula del usuario", jtf_cedula);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_desactivar = new javax.swing.JButton();
        jtf_cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 170));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseClicked(evt);
            }
        });
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 110, 30));

        btn_desactivar.setText("DESACTIVAR");
        btn_desactivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_desactivarMouseClicked(evt);
            }
        });
        btn_desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desactivarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_desactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 110, 30));

        jtf_cedula.setBorder(null);
        jPanel1.add(jtf_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_buscar32.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_desactivar64.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 210, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseClicked
        // TODO add your handling code here:
        dispose();
        new JF_menuUsuarios_m2().setVisible(true);


    }//GEN-LAST:event_btn_cancelarMouseClicked

    private void btn_desactivarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_desactivarMouseClicked
        // TODO add your handling code here:
        


    }//GEN-LAST:event_btn_desactivarMouseClicked

    private void btn_desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desactivarActionPerformed
        // TODO add your handling code here:
        if (!jtf_cedula.getText().isBlank() && !jtf_cedula.getText().isEmpty()) {
            String cedula = jtf_cedula.getText();
            cls_funcionesM2 clsF = new cls_funcionesM2();
            clsF.desactivarUsuario(cedula);
            JOptionPane.showMessageDialog(null, "Desactivado con Exito");
            dispose();

            JF_menuUsuarios_m2 JFMR = new JF_menuUsuarios_m2();
            JFMR.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "DEBE RELLENAR LOS ESPACIO REQUERIDOS");
        }
    }//GEN-LAST:event_btn_desactivarActionPerformed

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
            java.util.logging.Logger.getLogger(JF_desactivarUsuario_m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_desactivarUsuario_m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_desactivarUsuario_m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_desactivarUsuario_m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_desactivarUsuario_m2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_desactivar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jtf_cedula;
    // End of variables declaration//GEN-END:variables
}
