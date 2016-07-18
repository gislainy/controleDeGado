package rx;

import db.schemas.Matriz;
import db.schemas.expections.mostraMensagem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import soa.soaMatriz;
import util.RestaurarObjeto;

public class formMatrizesList extends javax.swing.JFrame {

    public formMatrizesList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        Mostrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        btnExcluir = new javax.swing.JButton();
        lbFundo = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Listagem de matrizes");
        getContentPane().setLayout(null);
        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setText("MOSTRAR");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar);
        Mostrar.setBounds(140, 310, 110, 25);
        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(150, 340, 88, 25);
        lista.setFont(new java.awt.Font("Dialog", 0, 12));
        lista.setToolTipText("");
        jScrollPane1.setViewportView(lista);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 10, 370, 290);
        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(300, 310, 110, 25);
        lbFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg")));
        lbFundo.setText("jLabel1");
        getContentPane().add(lbFundo);
        lbFundo.setBounds(-40, 0, 470, 380);
        setSize(new java.awt.Dimension(430, 399));
        setLocationRelativeTo(null);
    }

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultListModel model = new DefaultListModel();
        ArrayList<Object> list;
        list = RestaurarObjeto.restautarList("matrizes.dat");
        for (int i = 0; i < list.size(); i++) {
            Matriz texto;
            texto = (Matriz) list.get(i);
            model.add(model.getSize(), texto.mostrar());
        }
        if (model.getSize() == 0)
            model.add(model.getSize(), "Nenhuma matriz cadastrada!");
        lista.setModel(model);
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        formRebanho rebanho = new formRebanho();
        rebanho.setResizable(false);
        rebanho.setVisible(true);
        dispose();
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<Object> list;
        DefaultListModel model = new DefaultListModel();
        list = RestaurarObjeto.restautarList("matrizes.dat");
        boolean tudoCorreto = false;
        int index = -1;
        if (lista.getSelectedIndex() > -1) {
            index = lista.getSelectedIndex();
            tudoCorreto = true;
        }
        if (list.size() == 0) {
            mostraMensagem.exibir("Atenção", "Pelo menos um cadastro deve existir!");
            tudoCorreto = false;
        }
        if (tudoCorreto) {
            Matriz matriz;
            list.remove(index);
            for (int i = 0; i <= list.size() - 1; i++) {
                matriz = (Matriz) list.get(i);
                if (i == 0)
                    try {
                        soaMatriz.excluir(matriz, true);
                    } catch (IOException ex) {
                        Logger.getLogger(formLeiteAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                else
                    try {
                        soaMatriz.excluir(matriz, false);
                    } catch (IOException ex) {
                        Logger.getLogger(formLeiteAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            list = RestaurarObjeto.restautarList("matrizes.dat");
            for (int i = 0; i < list.size(); i++) {
                Matriz texto;
                texto = (Matriz) list.get(i);
                model.add(model.getSize(), texto.mostrar());
            }
            if (model.getSize() == 0)
                model.add(model.getSize(), "Nenhuma matriz cadastrada!");
            lista.setModel(model);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formMatrizesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMatrizesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMatrizesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMatrizesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formMatrizesList().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Mostrar;

    private javax.swing.JButton btnExcluir;

    private javax.swing.JButton btnVoltar;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JLabel lbFundo;

    private javax.swing.JList<String> lista;

    private void initComponents() {
    }
}
