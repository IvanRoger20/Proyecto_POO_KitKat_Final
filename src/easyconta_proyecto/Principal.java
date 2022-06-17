/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyconta_proyecto;

/**
 *
 * @author IvanTron
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMercancia = new javax.swing.JTextField();
        chbxDeber = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Introduzca sus saldos iniciales: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 20));

        jLabel2.setText("Caja(Efectivo): ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtCaja.setText("0");
        getContentPane().add(txtCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, -1));

        jLabel3.setText("Banco: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 140, 20));

        txtBanco.setText("0");
        getContentPane().add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 150, -1));

        jLabel4.setText("Mercancia(Costo de la mercancia que posee): ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 230, -1));

        txtMercancia.setText("0");
        txtMercancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMercanciaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMercancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, -1));

        chbxDeber.setText("¿Le debe dinero a algun proveedor?");
        chbxDeber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxDeberActionPerformed(evt);
            }
        });
        getContentPane().add(chbxDeber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 200, -1));

        jLabel5.setText("Saldo a deber a los proveedores");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 180, -1));

        txtProveedor.setEditable(false);
        txtProveedor.setText("0");
        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 170, -1));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 160, 50));

        jLabel6.setText("     ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 50, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LogoPequeño.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jLabel7.setText("$");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        jLabel9.setText("$");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        jLabel10.setText("$");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 10, 20));

        jLabel11.setText("$");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbxDeberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxDeberActionPerformed
        // TODO add your handling code here:
        txtProveedor.setEditable(true);
    }//GEN-LAST:event_chbxDeberActionPerformed

    private void txtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        Asientos_Contables asientos = new Asientos_Contables(Convertidor.StringADouble(txtCaja.getText()), Convertidor.StringADouble(txtBanco.getText())
        , Convertidor.StringADouble(txtMercancia.getText()),Convertidor.StringADouble(txtProveedor.getText()));
        //CuentasT cuentast = new CuentasT();
        asientos.setResizable(false);
        asientos.setVisible(true);
        //cuentast.setResizable(false);
        //cuentast.setVisible(true);
        Principal principal = new Principal();
        principal.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtMercanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMercanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMercanciaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JCheckBox chbxDeber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtMercancia;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
