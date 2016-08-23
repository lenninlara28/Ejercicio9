/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author hp 14
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFinal = new javax.swing.JTextField();
        cmbConsultar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRecargo = new javax.swing.JTextField();
        cmbNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Tarjetas Para Realizar Llamadas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese Su  Monto Inicial");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInicialKeyTyped(evt);
            }
        });
        jPanel1.add(txtInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 110, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese Su Monto Final");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, -1));

        txtFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFinalKeyTyped(evt);
            }
        });
        jPanel1.add(txtFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 110, -1));

        cmbConsultar.setBackground(new java.awt.Color(0, 0, 0));
        cmbConsultar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbConsultar.setForeground(new java.awt.Color(255, 255, 255));
        cmbConsultar.setText("OK");
        cmbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("El Monto De Su Llamada Es De :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtMonto.setEditable(false);
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 130, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Recargo Del 20%");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtRecargo.setEditable(false);
        jPanel1.add(txtRecargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, -1));

        cmbNuevo.setBackground(new java.awt.Color(0, 0, 0));
        cmbNuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        cmbNuevo.setText("Nueva Tarjeta");
        jPanel1.add(cmbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConsultarActionPerformed
       String Descuento,total;
       int ini,fini,resul,porcen,costo;
       
       if (txtInicial.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite Monto Inicial","error", JOptionPane.ERROR_MESSAGE);
         txtInicial.requestFocusInWindow();}
       else if (txtFinal.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite Monto Final ","error", JOptionPane.ERROR_MESSAGE);
         txtFinal.requestFocusInWindow();}
       else{
              
       ini=Integer.parseInt(txtInicial.getText());
       fini=Integer.parseInt(txtFinal.getText());
       
       resul=ini-fini;
       porcen=(resul*20)/100;
       costo=resul+porcen;
       
      Descuento=String.valueOf(porcen);
      txtRecargo.setText("$"+Descuento);
      
      total= String.valueOf(costo);
      txtMonto.setText("$"+total);
       
       }
    }//GEN-LAST:event_cmbConsultarActionPerformed

    private void txtInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInicialKeyTyped
        char c=evt.getKeyChar(); 
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtInicialKeyTyped

    private void txtFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalKeyTyped
        char c=evt.getKeyChar(); 
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_txtFinalKeyTyped

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
    private javax.swing.JButton cmbConsultar;
    private javax.swing.JButton cmbNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtInicial;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtRecargo;
    // End of variables declaration//GEN-END:variables
}
