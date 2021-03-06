package rx;

import db.schemas.Data;
import db.schemas.Leite;
import db.schemas.Matriz;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import util.RestaurarObjeto;
import db.schemas.expections.mostraMensagem;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import soa.soaMatriz;

public class formLeiteAdd extends javax.swing.JFrame {

    public formLeiteAdd() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        Mostrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lbQuantidade = new javax.swing.JLabel();
        editAno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        editQuantidade = new javax.swing.JTextField();
        editDia = new javax.swing.JTextField();
        editMes = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lbFundo = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        Mostrar.setText("MOSTRAR");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar);
        Mostrar.setBounds(60, 440, 110, 25);
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(180, 510, 88, 25);
        lbQuantidade.setBackground(new java.awt.Color(0, 0, 0));
        lbQuantidade.setFont(new java.awt.Font("Dialog", 1, 14));
        lbQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        lbQuantidade.setText("Data");
        getContentPane().add(lbQuantidade);
        lbQuantidade.setBounds(210, 90, 180, 17);
        editAno.setToolTipText("");
        getContentPane().add(editAno);
        editAno.setBounds(310, 110, 70, 30);
        lista.setFont(new java.awt.Font("Dialog", 0, 12));
        lista.setToolTipText("");
        jScrollPane1.setViewportView(lista);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 20, 170, 410);
        editQuantidade.setToolTipText("");
        getContentPane().add(editQuantidade);
        editQuantidade.setBounds(210, 40, 210, 30);
        editDia.setToolTipText("");
        getContentPane().add(editDia);
        editDia.setBounds(210, 110, 50, 30);
        editMes.setToolTipText("");
        getContentPane().add(editMes);
        editMes.setBounds(260, 110, 50, 30);
        lbData.setBackground(new java.awt.Color(0, 0, 0));
        lbData.setFont(new java.awt.Font("Dialog", 1, 14));
        lbData.setForeground(new java.awt.Color(255, 255, 255));
        lbData.setText("Quantidade de leite");
        getContentPane().add(lbData);
        lbData.setBounds(210, 20, 240, 17);
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(170, 470, 110, 30);
        lbFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg")));
        lbFundo.setText("jLabel1");
        getContentPane().add(lbFundo);
        lbFundo.setBounds(-40, 0, 470, 550);
        setSize(new java.awt.Dimension(438, 572));
        setLocationRelativeTo(null);
    }

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultListModel model = new DefaultListModel();
        ArrayList<Object> list;
        list = RestaurarObjeto.restautarList("matrizes.dat");
        for (int i = 0; i < list.size(); i++) {
            Matriz texto;
            texto = (Matriz) list.get(i);
            System.out.println(texto.mostrar());
            model.add(model.getSize(), texto.getNome());
        }
        if (model.getSize() == 0)
            model.add(model.getSize(), "Sem matriz!");
        lista.setModel(model);
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        formLeite leite = new formLeite();
        leite.setResizable(false);
        leite.setVisible(true);
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        int dia = 0, mes = 0, ano = 0;
        int quantidade = 0;
        boolean tudoCorreto = false;
        if (editQuantidade.getText().length() > 0 && editDia.getText().length() > 0 && editMes.getText().length() > 0 && lista.getSelectedIndex() > -1 && editAno.getText().length() > 0) {
            dia = Integer.parseInt(editDia.getText());
            mes = Integer.parseInt(editMes.getText());
            ano = Integer.parseInt(editAno.getText());
            quantidade = Integer.parseInt(editQuantidade.getText());
            tudoCorreto = true;
        } else {
            mostraMensagem.exibir("Atençao", "Campo obrigatório não preenchido!");
        }
        if (tudoCorreto) {
            Data data = new Data(dia, mes, ano);
            ArrayList<Object> list;
            list = RestaurarObjeto.restautarList("matrizes.dat");
            int index = lista.getSelectedIndex();
            Matriz matriz;
            matriz = (Matriz) list.get(index);
            Leite leite = new Leite(data, quantidade);
            matriz.adicionarProducaoDeLeite(leite);
            for (int i = 0; i < list.size(); i++) {
                matriz = (Matriz) list.get(i);
                if (i == 0)
                    try {
                        soaMatriz.alterar(matriz, true);
                    } catch (IOException ex) {
                        Logger.getLogger(formLeiteAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                else
                    try {
                        soaMatriz.alterar(matriz, false);
                    } catch (IOException ex) {
                        Logger.getLogger(formLeiteAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            editQuantidade.setText("");
            editDia.setText("");
            editMes.setText("");
            editAno.setText("");
            lista.clearSelection();
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
            java.util.logging.Logger.getLogger(formLeiteAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLeiteAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLeiteAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLeiteAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formLeiteAdd().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Mostrar;

    private javax.swing.JButton btnSalvar;

    private javax.swing.JButton btnVoltar;

    private javax.swing.JTextField editAno;

    private javax.swing.JTextField editDia;

    private javax.swing.JTextField editMes;

    private javax.swing.JTextField editQuantidade;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JLabel lbData;

    private javax.swing.JLabel lbFundo;

    private javax.swing.JLabel lbQuantidade;

    private javax.swing.JList<String> lista;

    private void initComponents() {
    }
}
