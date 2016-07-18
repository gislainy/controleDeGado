package rx;

public class formLeite extends javax.swing.JFrame {

    public formLeite() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        btnTodos3 = new javax.swing.JButton();
        btnStatus = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg")));
        getContentPane().add(fundo);
        fundo.setBounds(-8, -8, 460, 450);
        setSize(new java.awt.Dimension(457, 462));
        setLocationRelativeTo(null);
    }

    private void btnTodos3ActionPerformed(java.awt.event.ActionEvent evt) {
        formLeiteAdd leite = new formLeiteAdd();
        leite.setResizable(false);
        leite.setVisible(true);
        dispose();
    }

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {
        formLeiteList leite = new formLeiteList();
        leite.setResizable(false);
        leite.setVisible(true);
        dispose();
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        formPrincipal principal = new formPrincipal();
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
            java.util.logging.Logger.getLogger(formLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formLeite().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnStatus;

    private javax.swing.JButton btnTodos3;

    private javax.swing.JButton btnVoltar;

    private javax.swing.JLabel fundo;

    private void initComponents() {
    }
}
