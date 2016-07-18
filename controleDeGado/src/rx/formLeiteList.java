package rx;

import db.schemas.Matriz;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import util.RestaurarObjeto;

public class formLeiteList extends javax.swing.JFrame {

    public formLeiteList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        Mostrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dados = new javax.swing.JList();
        btnInfo = new javax.swing.JButton();
        lbFundo = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        lista.setFont(new java.awt.Font("Dialog", 0, 12));
        lista.setToolTipText("");
        jScrollPane1.setViewportView(lista);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 20, 170, 410);
        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setText("VER MATRIZES");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar);
        Mostrar.setBounds(40, 440, 140, 25);
        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(180, 510, 88, 25);
        dados.setFont(new java.awt.Font("Dialog", 0, 12));
        dados.setToolTipText("");
        jScrollPane2.setViewportView(dados);
        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(250, 20, 170, 410);
        btnInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnInfo.setText("INFO");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo);
        btnInfo.setBounds(280, 440, 110, 25);
        lbFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg")));
        lbFundo.setText("jLabel1");
        getContentPane().add(lbFundo);
        lbFundo.setBounds(-40, 0, 470, 550);
        setSize(new java.awt.Dimension(435, 576));
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
        lista.setModel(model);
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        formLeite leite = new formLeite();
        leite.setResizable(false);
        leite.setVisible(true);
    }

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultListModel model = new DefaultListModel();
        ArrayList<Object> list;
        list = RestaurarObjeto.restautarList("matrizes.dat");
        int index = lista.getSelectedIndex();
        Matriz matriz;
        matriz = (Matriz) list.get(index);
        for (int i = 0; i < matriz.producaoDeLeiteList.size(); i++) {
            model.add(model.getSize(), matriz.getLeiteItem(i));
        }
        if (matriz.producaoDeLeiteList.isEmpty())
            model.add(model.getSize(), "Sem produção");
        dados.setModel(model);
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
            java.util.logging.Logger.getLogger(formLeiteList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLeiteList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLeiteList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLeiteList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formLeiteList().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Mostrar;

    private javax.swing.JButton btnInfo;

    private javax.swing.JButton btnVoltar;

    private javax.swing.JList<String> dados;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JScrollPane jScrollPane2;

    private javax.swing.JLabel lbFundo;

    private javax.swing.JList<String> lista;

    private void initComponents() {
    }
}
