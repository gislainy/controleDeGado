package rx;

public class formRebanho extends javax.swing.JFrame {

    public formRebanho() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        btnTodos = new javax.swing.JButton();
        btnMatrizes = new javax.swing.JButton();
        btnBezerros = new javax.swing.JButton();
        btnTouros = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Rebalho");
        setName("frameRebanho");
        getContentPane().setLayout(null);
        btnTodos.setBackground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("Ver todo o rebanho");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTodos);
        btnTodos.setBounds(90, 90, 250, 35);
        btnMatrizes.setBackground(new java.awt.Color(255, 255, 255));
        btnMatrizes.setText("Matrizes");
        btnMatrizes.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMatrizes);
        btnMatrizes.setBounds(90, 140, 250, 35);
        btnBezerros.setBackground(new java.awt.Color(255, 255, 255));
        btnBezerros.setText("Bezerros");
        btnBezerros.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBezerrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnBezerros);
        btnBezerros.setBounds(90, 240, 250, 35);
        btnTouros.setBackground(new java.awt.Color(255, 255, 255));
        btnTouros.setText("Touros");
        btnTouros.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTouros);
        btnTouros.setBounds(90, 190, 250, 35);
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
        fundo.setBounds(-8, -8, 450, 420);
        setSize(new java.awt.Dimension(444, 434));
        setLocationRelativeTo(null);
    }

    private void btnMatrizesActionPerformed(java.awt.event.ActionEvent evt) {
        formMatrizesList matrizes = new formMatrizesList();
        matrizes.setVisible(true);
        dispose();
    }

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {
        formTodoList todos = new formTodoList();
        todos.setVisible(true);
        dispose();
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        formPrincipal principal = new formPrincipal();
        principal.setResizable(false);
        principal.setVisible(true);
    }

    private void btnTourosActionPerformed(java.awt.event.ActionEvent evt) {
        formTouroList touro = new formTouroList();
        touro.setResizable(false);
        touro.setVisible(true);
        dispose();
    }

    private void btnBezerrosActionPerformed(java.awt.event.ActionEvent evt) {
        formBezerroList bezerro = new formBezerroList();
        bezerro.setResizable(false);
        bezerro.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(formRebanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formRebanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formRebanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formRebanho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new formRebanho().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnBezerros;

    private javax.swing.JButton btnMatrizes;

    private javax.swing.JButton btnTodos;

    private javax.swing.JButton btnTouros;

    private javax.swing.JButton btnVoltar;

    private javax.swing.JLabel fundo;

    private void initComponents() {
    }
}
