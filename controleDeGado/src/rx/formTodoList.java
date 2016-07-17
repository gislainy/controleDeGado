/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rx;

import db.schemas.Matriz;
import db.schemas.Touro;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import util.RestaurarObjeto;

/**
 *
 * @author gislainy
 */
public class formTodoList extends javax.swing.JFrame {

  /**
   * Creates new form formTodoList
   */
  public formTodoList() {
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

    btnMostrar = new javax.swing.JButton();
    btnVoltar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    lista = new javax.swing.JList<>();
    lbFundo = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(null);

    btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
    btnMostrar.setText("MOSTRAR");
    btnMostrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMostrarActionPerformed(evt);
      }
    });
    getContentPane().add(btnMostrar);
    btnMostrar.setBounds(140, 510, 110, 25);

    btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
    btnVoltar.setText("VOLTAR");
    btnVoltar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVoltarActionPerformed(evt);
      }
    });
    getContentPane().add(btnVoltar);
    btnVoltar.setBounds(150, 540, 88, 25);

    lista.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    lista.setToolTipText("");
    jScrollPane1.setViewportView(lista);

    getContentPane().add(jScrollPane1);
    jScrollPane1.setBounds(30, 10, 370, 490);

    lbFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg"))); // NOI18N
    lbFundo.setText("jLabel1");
    getContentPane().add(lbFundo);
    lbFundo.setBounds(-40, 0, 460, 580);

    setSize(new java.awt.Dimension(429, 606));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
    DefaultListModel model = new DefaultListModel();
    ArrayList<Object> list;
    list = RestaurarObjeto.restautarList("matrizes.dat");
    for(int i=0; i<list.size(); i++){
      Matriz texto;
      texto = (Matriz) list.get(i);
      model.add(model.getSize(), texto.mostrar() + " Matriz");
    }
    list = RestaurarObjeto.restautarList("touros.dat");
    for(int i=0; i<list.size(); i++){
      Touro texto;
      texto = (Touro) list.get(i);
      model.add(model.getSize(), texto.mostrar() + " Touro");
    }
     if(model.getSize()==0)
      model.add(model.getSize(), "Nenhum animal cadastrado!");
    lista.setModel(model);
  }//GEN-LAST:event_btnMostrarActionPerformed

  private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
    this.setVisible(false);
    formRebanho  rebanho = new formRebanho();
    rebanho.setResizable(false);
    rebanho.setVisible(true);
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
      java.util.logging.Logger.getLogger(formTodoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(formTodoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(formTodoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(formTodoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
	new formTodoList().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnMostrar;
  private javax.swing.JButton btnVoltar;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbFundo;
  private javax.swing.JList<String> lista;
  // End of variables declaration//GEN-END:variables
}
