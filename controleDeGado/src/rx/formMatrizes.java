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
public class formMatrizes extends javax.swing.JPanel {

  /**
   * Creates new form formMatrizes
   */
  public formMatrizes() {
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

    btnTodos = new javax.swing.JButton();
    btnStatus = new javax.swing.JButton();
    btnTrocarStatus = new javax.swing.JButton();
    btnVoltar = new javax.swing.JButton();
    fundo = new javax.swing.JLabel();

    setLayout(null);

    btnTodos.setBackground(new java.awt.Color(255, 255, 255));
    btnTodos.setText("Ver total");
    btnTodos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnTodosActionPerformed(evt);
      }
    });
    add(btnTodos);
    btnTodos.setBounds(90, 110, 250, 35);

    btnStatus.setBackground(new java.awt.Color(255, 255, 255));
    btnStatus.setText("Ver status");
    btnStatus.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnStatusActionPerformed(evt);
      }
    });
    add(btnStatus);
    btnStatus.setBounds(90, 160, 250, 35);

    btnTrocarStatus.setBackground(new java.awt.Color(255, 255, 255));
    btnTrocarStatus.setText("Trocar status");
    add(btnTrocarStatus);
    btnTrocarStatus.setBounds(90, 210, 250, 35);

    btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
    btnVoltar.setText("VOLTAR");
    btnVoltar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVoltarActionPerformed(evt);
      }
    });
    add(btnVoltar);
    btnVoltar.setBounds(170, 360, 88, 25);

    fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg"))); // NOI18N
    add(fundo);
    fundo.setBounds(-8, -8, 460, 450);
  }// </editor-fold>//GEN-END:initComponents

  private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed

  }//GEN-LAST:event_btnTodosActionPerformed

  private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed

  }//GEN-LAST:event_btnStatusActionPerformed

  private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
    this.setVisible(false);
    formPrincipal principal = new formPrincipal();
    principal.setResizable(false);
    principal.setVisible(true);
  }//GEN-LAST:event_btnVoltarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnStatus;
  private javax.swing.JButton btnTodos;
  private javax.swing.JButton btnTrocarStatus;
  private javax.swing.JButton btnVoltar;
  private javax.swing.JLabel fundo;
  // End of variables declaration//GEN-END:variables
}
