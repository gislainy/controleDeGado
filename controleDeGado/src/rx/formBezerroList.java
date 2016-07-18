package rx;

import db.schemas.Matriz;
import db.schemas.Touro;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import util.RestaurarObjeto;

public class formBezerroList extends javax.swing.JFrame {

    public formBezerroList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        btnMostrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        lbFundo = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Listagem de bezerros");
        getContentPane().setLayout(null);
        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(140, 310, 110, 25);
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
        lbFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg")));
        lbFundo.setText("jLabel1");
        getContentPane().add(lbFundo);
        lbFundo.setBounds(-40, 0, 480, 390);
        setSize(new java.awt.Dimension(441, 410));
        setLocationRelativeTo(null);
    }

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultListModel model = new DefaultListModel();
        ArrayList<Object> list;
        list = RestaurarObjeto.restautarList("matrizes.dat");
        for (int i = 0; i < list.size(); i++) {
            Matriz texto;
            texto = (Matriz) list.get(i);
            if (texto.ehBezerro())
                model.add(model.getSize(), texto.bezerro());
        }
        list = RestaurarObjeto.restautarList("touros.dat");
        for (int i = 0; i < list.size(); i++) {
            Touro texto;
            texto = (Touro) list.get(i);
            if (texto.ehBezerro())
                model.add(model.getSize(), texto.bezerro());
        }
        if (model.getSize() == 0)
            model.add(model.getSize(), "Nenhum bezerro cadastrado!");
        lista.setModel(model);
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        formRebanho principal;
        principal = new formRebanho();
        principal.setResizable(false);
        principal.setVisible(true);
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
            java.util.logging.Logger.getLogger(formBezerroList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formBezerroList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formBezerroList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formBezerroList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formBezerroList().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnMostrar;

    private javax.swing.JButton btnVoltar;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JLabel lbFundo;

    private javax.swing.JList<String> lista;

    private void initComponents() {
    }
}
