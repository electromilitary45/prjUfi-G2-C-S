/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasM2;

import extensiones.TextPrompt;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import prj.proy_cs.cls_funcionesM2;

/**
 *
 * @author Derek
 */
public class JF_editarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JF_editarUsuario
     */
    public JF_editarUsuario() {
        initComponents();
        TextPrompt txtCelBus = new TextPrompt("Digite una cedula para buscar", jtf_cedula1);
        jtf_nombre.setEnabled(false);
        jtf_apellido.setEnabled(false);
        jtf_cedula.setEnabled(false);
        jtf_email.setEnabled(false);
        jtf_telefono.setEnabled(false);
        cbx_tipoUsuario.setEnabled(false);
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

        jPanel4 = new javax.swing.JPanel();
        jtf_apellido = new javax.swing.JTextField();
        cbx_tipoUsuario = new javax.swing.JComboBox<>();
        jtf_telefono = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
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
        jtf_cedula1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_apellido.setBorder(null);
        jPanel4.add(jtf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 250, 20));

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
        jPanel4.add(cbx_tipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 250, -1));

        jtf_telefono.setBorder(null);
        jtf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_telefonoActionPerformed(evt);
            }
        });
        jPanel4.add(jtf_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 250, 20));

        jtf_nombre.setBorder(null);
        jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nombreActionPerformed(evt);
            }
        });
        jPanel4.add(jtf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 250, 20));

        btn_guardar.setText("GUARDAR");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 100, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 250, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_nombre2.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_nombre.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_usuario.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

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
        jPanel4.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_editarUsuario64.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_tipoUsu.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, 20));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 250, 20));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 250, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_numTel24.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jtf_cedula.setBorder(null);
        jtf_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cedulaActionPerformed(evt);
            }
        });
        jPanel4.add(jtf_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 250, 20));

        jtf_email.setBorder(null);
        jtf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_emailActionPerformed(evt);
            }
        });
        jPanel4.add(jtf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 250, 20));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 250, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_mail24.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        cbx_ninos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCION UN NIÑO" }));
        cbx_ninos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_ninosItemStateChanged(evt);
            }
        });
        cbx_ninos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ninosActionPerformed(evt);
            }
        });
        jPanel4.add(cbx_ninos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 250, -1));

        jtf_cedula1.setBorder(null);
        jtf_cedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cedula1ActionPerformed(evt);
            }
        });
        jPanel4.add(jtf_cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 200, 20));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, 20));

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_tipoUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_tipoUsuarioItemStateChanged
        // TODO add your handling code here:
        /*if (cbx_ninos.getSelectedItem().equals("DEPORTISTA") || cbx_ninos.getSelectedIndex() == 0) {
            cbx_ninos.setEnabled(false);
        }*/

        if (cbx_tipoUsuario.getSelectedIndex() == 1 || cbx_tipoUsuario.getSelectedIndex() == 0) {
            cbx_ninos.setEnabled(false);
        }

        if (cbx_tipoUsuario.getSelectedIndex() == 2) {
            cbx_ninos.setEnabled(true);
        }
    }//GEN-LAST:event_cbx_tipoUsuarioItemStateChanged

    private void cbx_tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbx_tipoUsuarioActionPerformed
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
    private void cbx_tipoUsuarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbx_tipoUsuarioPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tipoUsuarioPropertyChange

    private void jtf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_telefonoActionPerformed

    private void jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nombreActionPerformed

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        // TODO add your handling code here:]

    }//GEN-LAST:event_btn_guardarMouseClicked

    private void btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseClicked
        // TODO add your handling code here:
        dispose();
        JF_menuUsuarios_m2 JFM = new JF_menuUsuarios_m2();
        JFM.setVisible(true);
    }//GEN-LAST:event_btn_cancelarMouseClicked

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jtf_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_cedulaActionPerformed

    private void jtf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_emailActionPerformed

    private void cbx_ninosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_ninosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_ninosItemStateChanged

    private void cbx_ninosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ninosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_ninosActionPerformed

    private void jtf_cedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_cedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_cedula1ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:\]
        String vecDatos[] = new String[8];
        
        try {
            String cedula = jtf_cedula1.getText();

            cls_funcionesM2 FM = new cls_funcionesM2();

            FM.buscarUserJF(vecDatos, cedula);
            if (vecDatos[1] != null) {
                jtf_nombre.setText(vecDatos[0]);
                jtf_nombre.setEnabled(true);
                jtf_apellido.setText(vecDatos[1]);
                jtf_apellido.setEnabled(true);
                jtf_cedula.setText(vecDatos[2]);
                jtf_cedula.setEnabled(true);
                jtf_email.setText(vecDatos[3]);
                jtf_email.setEnabled(true);
                jtf_telefono.setText(vecDatos[4]);
                jtf_telefono.setEnabled(true);
                if (vecDatos[5].equals("1")) {
                    cbx_tipoUsuario.setSelectedIndex(1);
                } else {
                    cbx_tipoUsuario.setSelectedIndex(2);
                }

                if (vecDatos[6] != null) {
                    cbx_ninos.setSelectedItem(vecDatos[6]);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        try {
            if (!jtf_nombre.getText().isBlank() && !jtf_nombre.getText().isEmpty()
                    && !jtf_apellido.getText().isBlank() && !jtf_apellido.getText().isEmpty()
                    && !jtf_cedula.getText().isBlank() && !jtf_cedula.getText().isEmpty()
                    && !jtf_email.getText().isBlank() && !jtf_email.getText().isEmpty()
                    && !jtf_telefono.getText().isBlank() && !jtf_telefono.getText().isEmpty()) {

                cls_funcionesM2 FM = new cls_funcionesM2();
                String cedulaVieja = jtf_cedula1.getText();
                String cedulaNueva = jtf_cedula.getText();
                String nombre = jtf_nombre.getText();
                String apellido = jtf_apellido.getText();
                String mail = jtf_email.getText();
                String numtel = jtf_telefono.getText();
                int tipo = cbx_tipoUsuario.getSelectedIndex();
                String nombreNino = "";

                if (tipo == 1) {
                    FM.editarUsuario(cedulaVieja, cedulaNueva, nombre, apellido, mail, numtel, tipo, nombreNino);
                    JOptionPane.showMessageDialog(null, "NIÑO EDITADO CORRECTAMENTE");
                    dispose();
                    new JF_menuUsuarios_m2().setVisible(true);

                } else {
                    if (cbx_ninos.getSelectedItem() == null) {
                        JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN NIÑO ");
                    } else {
                        nombreNino = (String) cbx_ninos.getSelectedItem();
                        FM.editarUsuario(cedulaVieja, cedulaNueva, nombre, apellido, mail, numtel, tipo, nombreNino);
                        JOptionPane.showMessageDialog(null, "PADRE EDITADO CORRECTAMENTE");
                        dispose();
           
             new JF_menuUsuarios_m2().setVisible(true);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe rellenar los espacios");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(JF_editarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_editarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_editarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_editarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_editarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    public static javax.swing.JComboBox<String> cbx_ninos;
    private javax.swing.JComboBox<String> cbx_tipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jtf_apellido;
    private javax.swing.JTextField jtf_cedula;
    private javax.swing.JTextField jtf_cedula1;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
