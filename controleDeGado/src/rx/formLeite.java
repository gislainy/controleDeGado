/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rx;

/**
 *
 * @author gislainy
 */
public class formLeite extends javax.swing.JFrame {

  /**
   * Creates new form formLeite
   */
  public formLeite() {
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

    btnTodos3 = new javax.swing.JButton();
    btnStatus = new javax.swing.JButton();
    btnVoltar = new javax.swing.JButton();
    fundo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Leite");
    getContentPane().setLayout(null);

    btnTodos3.setBackground(new java.awt.Color(255, 255, 255));
    btnTodos3.setText("Adicionar");
    btnTodos3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnTodos3ActionPerformed(evt);
      }
    });
    getContentPane().add(btnTodos3);
    btnTodos3.setBounds(90, 110, 250, 35);

    btnStatus.setBackground(new java.awt.Color(255, 255, 255));
    btnStatus.setText("Ver leite por matriz");
    btnStatus.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnStatusActionPerformed(evt);
      }
    });
    getContentPane().add(btnStatus);
    btnStatus.setBounds(90, 160, 250, 35);

    btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
    btnVoltar.setText("VOLTAR");
    btnVoltar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVoltarActionPerformed(evt);
      }
    });
    getContentPane().add(btnVoltar);
    btnVoltar.setBounds(170, 360, 88, 25);

    fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg"))); // NOI18N
    getContentPane().add(fundo);
    fundo.setBounds(-8, -8, 480, 480);

    setSize(new java.awt.Dimension(450, 458));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnTodos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodos3ActionPerformed
    formLeiteAdd leite = new formLeiteAdd();
    leite.setResizable(false);
    leite.setVisible(true);
    dispose();
  }//GEN-LAST:event_btnTodos3ActionPerformed

  private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
    formLeiteList leite = new formLeiteList();
    leite.setResizable(false);
    leite.setVisible(true);
    dispose();
  }//GEN-LAST:event_btnStatusActionPerformed

  private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
    this.setVisible(false);
    formPrincipal principal = new formPrincipal();
    principal.setResizable(false);
    principal.setVisible(true);
  }//GEN-LAST:event_btnVoltarActionPerformed

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
      java.util.logging.Logger.getLogger(formLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(formLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(formLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(formLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
	new formLeite().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnStatus;
  private javax.swing.JButton btnTodos3;
  private javax.swing.JButton btnVoltar;
  private javax.swing.JLabel fundo;
  // End of variables declaration//GEN-END:variables
}
