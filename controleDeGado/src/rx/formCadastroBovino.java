package rx;

import db.schemas.Data;
import db.schemas.Matriz;
import db.schemas.Touro;
import db.schemas.expections.mostraMensagem;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import soa.Bovino;
import soa.soaMatriz;

public class formCadastroBovino extends javax.swing.JFrame {

  public formCadastroBovino() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    grupoRadioTipo = new javax.swing.ButtonGroup();
    panelFundo = new javax.swing.JPanel();
    lbNome = new javax.swing.JLabel();
    editNome = new javax.swing.JTextField();
    lbDataNascimento1 = new javax.swing.JLabel();
    editDia = new javax.swing.JTextField();
    editMes = new javax.swing.JTextField();
    editAno = new javax.swing.JTextField();
    editCodigo = new javax.swing.JTextField();
    lbNome1 = new javax.swing.JLabel();
    radioMatriz = new javax.swing.JRadioButton();
    radioTouro = new javax.swing.JRadioButton();
    btnSalvar = new javax.swing.JButton();
    btnCancelar = new javax.swing.JButton();
    fundo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("Cadastro de Bovino");
    setName("frameCadastroBovino"); // NOI18N
    getContentPane().setLayout(null);

    panelFundo.setBackground(new java.awt.Color(255, 255, 255));
    panelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lbNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    lbNome.setForeground(new java.awt.Color(255, 255, 255));
    lbNome.setText("Nome do Animal");
    panelFundo.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

    editNome.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        editNomeActionPerformed(evt);
      }
    });
    panelFundo.add(editNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 360, 30));

    lbDataNascimento1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    lbDataNascimento1.setForeground(new java.awt.Color(255, 255, 255));
    lbDataNascimento1.setText("Data Nascimento:");
    panelFundo.add(lbDataNascimento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

    editDia.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        editDiaActionPerformed(evt);
      }
    });
    panelFundo.add(editDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 80, 30));

    editMes.setToolTipText("");
    editMes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        editMesActionPerformed(evt);
      }
    });
    panelFundo.add(editMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 40, 30));

    editAno.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        editAnoActionPerformed(evt);
      }
    });
    panelFundo.add(editAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 40, 30));

    editCodigo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        editCodigoActionPerformed(evt);
      }
    });
    panelFundo.add(editCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 360, 30));

    lbNome1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    lbNome1.setForeground(new java.awt.Color(255, 255, 255));
    lbNome1.setText("Código:");
    panelFundo.add(lbNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

    grupoRadioTipo.add(radioMatriz);
    radioMatriz.setText("Matriz");
    radioMatriz.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioMatrizActionPerformed(evt);
      }
    });
    panelFundo.add(radioMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
    radioMatriz.getAccessibleContext().setAccessibleName("");

    grupoRadioTipo.add(radioTouro);
    radioTouro.setText("Touro");
    radioTouro.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioTouroActionPerformed(evt);
      }
    });
    panelFundo.add(radioTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
    radioTouro.getAccessibleContext().setAccessibleName("");

    btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
    btnSalvar.setText("SALVAR");
    btnSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalvarActionPerformed(evt);
      }
    });
    panelFundo.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

    btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
    btnCancelar.setText("CANCELAR");
    btnCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelarActionPerformed(evt);
      }
    });
    panelFundo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

    fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg"))); // NOI18N
    panelFundo.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 410, 380));

    getContentPane().add(panelFundo);
    panelFundo.setBounds(-10, -10, 410, 390);

    setSize(new java.awt.Dimension(400, 400));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void editNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNomeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_editNomeActionPerformed

  private void editDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDiaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_editDiaActionPerformed

  private void editMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMesActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_editMesActionPerformed

  private void editAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAnoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_editAnoActionPerformed

  private void editCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCodigoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_editCodigoActionPerformed

  private void radioMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMatrizActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioMatrizActionPerformed

  private void radioTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTouroActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_radioTouroActionPerformed

  private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    mostraMensagem mensagem;
    mensagem = new mostraMensagem();
    String nome = editNome.getText();
    int dia = 0, mes = 0, ano = 0, codigo = 0;
    boolean tudoCorreto = false;
    if (editDia.getText().length() > 0 &&
	  editMes.getText().length() > 0 &&
	  editAno.getText().length() > 0 && 
	  editCodigo.getText().length() > 0 &&
	  editNome.getText().length() > 0) {
      dia = Integer.parseInt(editDia.getText());
      mes = Integer.parseInt(editMes.getText());
      ano = Integer.parseInt(editAno.getText());
      codigo = Integer.parseInt(editCodigo.getText());
      tudoCorreto = true;
    } else {
      mensagem.exibir("Atençao", "Campo obrigatório não preenchido!");
    }
    if(tudoCorreto){
    Data dataNascimento = new Data(dia, mes, ano);
    if (radioMatriz.isSelected()) {
      Matriz matriz = new Matriz(nome, dataNascimento, codigo);
      try {
	soaMatriz soa = new soaMatriz();
	soa.adicionar(matriz);
      } catch (IOException ex) {
	Logger.getLogger(formCadastroBovino.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    if (radioTouro.isSelected()) {
      Touro touro = new Touro(nome, dataNascimento, codigo);
    }
    formPrincipal principal = new formPrincipal();
    principal.setResizable(false);
    principal.setVisible(true);
    }
  }//GEN-LAST:event_btnSalvarActionPerformed

  private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    this.setVisible(false);
    formPrincipal principal = new formPrincipal();
    principal.setResizable(false);
    principal.setVisible(true);
  }//GEN-LAST:event_btnCancelarActionPerformed

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
      java.util.logging.Logger.getLogger(formCadastroBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(formCadastroBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(formCadastroBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(formCadastroBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new formCadastroBovino().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancelar;
  private javax.swing.JButton btnSalvar;
  private javax.swing.JTextField editAno;
  private javax.swing.JTextField editCodigo;
  private javax.swing.JTextField editDia;
  private javax.swing.JTextField editMes;
  private javax.swing.JTextField editNome;
  private javax.swing.JLabel fundo;
  private javax.swing.ButtonGroup grupoRadioTipo;
  private javax.swing.JLabel lbDataNascimento1;
  private javax.swing.JLabel lbNome;
  private javax.swing.JLabel lbNome1;
  private javax.swing.JPanel panelFundo;
  private javax.swing.JRadioButton radioMatriz;
  private javax.swing.JRadioButton radioTouro;
  // End of variables declaration//GEN-END:variables
}
