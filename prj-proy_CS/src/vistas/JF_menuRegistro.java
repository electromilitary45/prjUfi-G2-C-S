/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author Derek
 */
public class JF_menuRegistro extends javax.swing.JFrame {

    /**
     * Creates new form JF_menuRegistro
     */
    public JF_menuRegistro() {
        initComponents();
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
        ico_retroceder = new javax.swing.JLabel();
        ico_registroUsu = new javax.swing.JLabel();
        jbl_resgistroUsu = new javax.swing.JLabel();
        ico_consultaUsuario = new javax.swing.JLabel();
        jbl_consultarUsuario = new javax.swing.JLabel();
        ico_desactivarUsuario = new javax.swing.JLabel();
        jbl_desactivarUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ico_retroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_retroceder.png"))); // NOI18N
        jPanel1.add(ico_retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        ico_registroUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_UsuRegistro.png"))); // NOI18N
        jPanel1.add(ico_registroUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jbl_resgistroUsu.setText("NUEVO USUARIO");
        jPanel1.add(jbl_resgistroUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        ico_consultaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_UsuConsulta.png"))); // NOI18N
        jPanel1.add(ico_consultaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jbl_consultarUsuario.setText("BUSCAR USUARIO");
        jPanel1.add(jbl_consultarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        ico_desactivarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_UsuDesactivar.png"))); // NOI18N
        jPanel1.add(ico_desactivarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jbl_desactivarUsuario.setText("DESACTIVAR USUARIO");
        jPanel1.add(jbl_desactivarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 560));

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
            java.util.logging.Logger.getLogger(JF_menuRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_menuRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_menuRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_menuRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_menuRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ico_consultaUsuario;
    private javax.swing.JLabel ico_desactivarUsuario;
    private javax.swing.JLabel ico_registroUsu;
    private javax.swing.JLabel ico_retroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbl_consultarUsuario;
    private javax.swing.JLabel jbl_desactivarUsuario;
    private javax.swing.JLabel jbl_resgistroUsu;
    // End of variables declaration//GEN-END:variables
}
