package rx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gislainy
 */
public class formPrincipal extends javax.swing.JFrame {

  /**
   * Creates new form Principal
   */
  public formPrincipal() { 
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

    pFundo = new javax.swing.JPanel();
    btnCadastro = new javax.swing.JButton();
    btnRebanho = new javax.swing.JButton();
    btnLeite = new javax.swing.JButton();
    lbFundo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Controle de Gado");
    setAlwaysOnTop(true);
    setBackground(new java.awt.Color(255, 255, 255));
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setExtendedState(getExtendedState());
    setMaximizedBounds(getMaximizedBounds());

    pFundo.setBackground(new java.awt.Color(255, 255, 255));
    pFundo.setLayout(null);

    btnCadastro.setBackground(new java.awt.Color(255, 255, 255));
    btnCadastro.setText("Cadastro");
    btnCadastro.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCadastroActionPerformed(evt);
      }
    });
    pFundo.add(btnCadastro);
    btnCadastro.setBounds(170, 90, 250, 35);

    btnRebanho.setBackground(new java.awt.Color(255, 255, 255));
    btnRebanho.setText("Rebanho");
    btnRebanho.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRebanhoActionPerformed(evt);
      }
    });
    pFundo.add(btnRebanho);
    btnRebanho.setBounds(170, 140, 250, 35);

    btnLeite.setBackground(new java.awt.Color(255, 255, 255));
    btnLeite.setText("Leite");
    btnLeite.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLeiteActionPerformed(evt);
      }
    });
    pFundo.add(btnLeite);
    btnLeite.setBounds(170, 190, 250, 35);

    lbFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg"))); // NOI18N
    lbFundo.setText("jLabel1");
    pFundo.add(lbFundo);
    lbFundo.setBounds(-40, 0, 650, 390);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    setSize(new java.awt.Dimension(600, 400));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
    formCadastroBovino cadatro = new formCadastroBovino();
    cadatro.setResizable(false);
    cadatro.setVisible(true);
    dispose();
  }//GEN-LAST:event_btnCadastroActionPerformed

  private void btnRebanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRebanhoActionPerformed
    formRebanho  rebanho = new formRebanho();
    rebanho.setResizable(false);
    rebanho.setVisible(true);
    dispose();
  }//GEN-LAST:event_btnRebanhoActionPerformed

  private void btnLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeiteActionPerformed
    formLeite  leite = new formLeite();
    leite.setResizable(false);
    leite.setVisible(true);
    dispose();
  }//GEN-LAST:event_btnLeiteActionPerformed

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
      java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
	new formPrincipal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCadastro;
  private javax.swing.JButton btnLeite;
  private javax.swing.JButton btnRebanho;
  private javax.swing.JLabel lbFundo;
  private javax.swing.JPanel pFundo;
  // End of variables declaration//GEN-END:variables
}
