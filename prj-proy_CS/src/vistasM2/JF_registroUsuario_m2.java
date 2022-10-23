/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasM2;

import vistasM2.*;
import extensiones.TextPrompt;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import prj.proy_cs.cls_funcionesM2;
import prj.proy_cs.cls_funcionesUsuario;

/**
 *
 * @author Derek
 */
public class JF_registroUsuario_m2 extends javax.swing.JFrame {
    //--INSTANCIAS--

    /**
     * Creates new form JF_registroUsuario
     */
    public JF_registroUsuario_m2() {
        initComponents();
        TextPrompt txtNombre = new TextPrompt("Digite su nombre", jtf_nombre);
        TextPrompt txtApe = new TextPrompt("Digite su apellido", jtf_apellido);
        TextPrompt txtCedula = new TextPrompt("Digite su cedula", jtf_cedula);
        TextPrompt txtamil = new TextPrompt("Digite su mail", jtf_telefono);
        TextPrompt txttel = new TextPrompt("Digite su telefono", jtf_telefono);
        cbx_ninos.setEnabled(false);
        llenarCmb();
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
        jtf_apellido = new javax.swing.JTextField();
        cbx_tipoUsuario = new javax.swing.JComboBox<>();
        jtf_telefono = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        btn_crear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtf_cedula = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cbx_ninos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(new java.awt.Point(600, 170));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_apellido.setBorder(null);
        jPanel1.add(jtf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 250, 20));

        cbx_tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TIPO DE USUARIO", "DEPORTISTA", "PADRE" }));
        cbx_tipoUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_tipoUsuarioItemStateChanged(evt);
            }
        });
        cbx_tipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipoUsuarioActionPerformed(evt);
            }
        });
        cbx_tipoUsuario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbx_tipoUsuarioPropertyChange(evt);
            }
        });
        jPanel1.add(cbx_tipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 250, -1));

        jtf_telefono.setBorder(null);
        jtf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 250, 20));

        jtf_nombre.setBorder(null);
        jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 250, 20));

        btn_crear.setText("CREAR");
        btn_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearMouseClicked(evt);
            }
        });
        jPanel1.add(btn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 100, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 250, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_nombre2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_nombre.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_usuario.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

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
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_crearUsu.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_tipoUsu.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, 20));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 250, 20));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 250, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_numTel24.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jtf_cedula.setBorder(null);
        jtf_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cedulaActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 250, 20));

        jtf_email.setBorder(null);
        jtf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_emailActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 250, 20));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 250, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_mail24.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        cbx_ninos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCION UN NIÑO" }));
        jPanel1.add(cbx_ninos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearMouseClicked
        // TODO add your handling code here:]
        try {
            if (!jtf_nombre.getText().isBlank() && !jtf_nombre.getText().isEmpty()
                    && !jtf_apellido.getText().isBlank() && !jtf_apellido.getText().isEmpty()
                    && !jtf_cedula.getText().isBlank() && !jtf_cedula.getText().isEmpty()
                    && !jtf_email.getText().isBlank() && !jtf_email.getText().isEmpty()
                    && !jtf_telefono.getText().isBlank() && !jtf_telefono.getText().isEmpty()
                    && cbx_tipoUsuario.getSelectedIndex() != 0) {

                cls_funcionesM2 FM = new cls_funcionesM2();
                String nombre = jtf_nombre.getText();
                String apellido = jtf_apellido.getText();
                String cedula = jtf_cedula.getText();
                String mail = jtf_email.getText();
                String numtel = jtf_telefono.getText();

                int tipo = cbx_tipoUsuario.getSelectedIndex();
                String nombreNino = "";

                if (tipo == 1) {
                    FM.agregarUsuarios(nombre, apellido, cedula, mail, numtel, tipo, nombreNino);
                    JOptionPane.showMessageDialog(null, "NIÑO CREADO CORRECTAMENTE");
                    dispose();
                    new JF_menuUsuarios_m2().setVisible(true);

                } else {
                    if (cbx_ninos.getSelectedItem() == null) {
                        JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN NIÑO ");
                    } else {
                        nombreNino = (String) cbx_ninos.getSelectedItem();
                        FM.agregarUsuarios(nombre, apellido, cedula, mail, numtel, tipo, nombreNino);
                        JOptionPane.showMessageDialog(null, "PADRE CREADO CORRECTAMENTE");
                        dispose();
                        new JF_menuUsuarios_m2().setVisible(true);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "DEBER RELLENAR LOS DATOS");
            }
        } catch (Exception e) {
            dispose();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_btn_crearMouseClicked

    private void cbx_tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tipoUsuarioActionPerformed

    private void jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreActionPerformed

    private void jtf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_telefonoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseClicked
        // TODO add your handling code here:
        dispose();
        JF_menuUsuarios_m2 JFM = new JF_menuUsuarios_m2();
        JFM.setVisible(true);
    }//GEN-LAST:event_btn_cancelarMouseClicked

    private void cbx_tipoUsuarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbx_tipoUsuarioPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tipoUsuarioPropertyChange

    private void jtf_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_cedulaActionPerformed

    private void jtf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_emailActionPerformed

    private void cbx_tipoUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_tipoUsuarioItemStateChanged
        // TODO add your handling code here:
        if (cbx_tipoUsuario.getSelectedIndex() == 1 || cbx_tipoUsuario.getSelectedIndex() == 0) {
            cbx_ninos.setEnabled(false);
        }

        if (cbx_tipoUsuario.getSelectedIndex() == 2) {
            cbx_ninos.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_tipoUsuarioItemStateChanged

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
            java.util.logging.Logger.getLogger(JF_registroUsuario_m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_registroUsuario_m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_registroUsuario_m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_registroUsuario_m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_registroUsuario_m2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_crear;
    private javax.swing.JComboBox<String> cbx_ninos;
    private javax.swing.JComboBox<String> cbx_tipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jtf_apellido;
    private javax.swing.JTextField jtf_cedula;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables

    private void llenarCmb() {
        String vecNombres[] = new String[99999];

        int cont = 0;
        cls_funcionesM2 FM = new cls_funcionesM2();
        FM.llenarcmbBxninos(vecNombres);

        for (int i = 0; i < vecNombres.length; i++) {
            if (vecNombres[i] != null) {
                cont++;
            }
        }
        String vecNombres2[] = new String[cont];
        cont = 0;
        for (int i = 0; i < vecNombres.length; i++) {
            if (vecNombres[i] != null) {

                vecNombres2[cont] = vecNombres[i];
                cont++;
            }
        }

        cbx_ninos.setModel(new DefaultComboBoxModel<>(vecNombres2));
    }
}
