package rx;

import db.schemas.Data;
import db.schemas.Matriz;
import db.schemas.Touro;
import db.schemas.expections.mostraMensagem;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import soa.soaMatriz;
import soa.soaTouro;

public class formCadastroBovino extends javax.swing.JFrame {

    public formCadastroBovino() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        grupoRadioTipo = new javax.swing.ButtonGroup();
        grupoStatusTouro = new javax.swing.ButtonGroup();
        grupoStatusMatriz = new javax.swing.ButtonGroup();
        panelFundo = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        editNome = new javax.swing.JTextField();
        lbDataNascimento1 = new javax.swing.JLabel();
        editAno = new javax.swing.JTextField();
        editDia = new javax.swing.JTextField();
        editMes = new javax.swing.JTextField();
        editCodigo = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        radioMatriz = new javax.swing.JRadioButton();
        radioTouro = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbCodigo1 = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        radioReprodutor = new javax.swing.JRadioButton();
        radioVendaTouro = new javax.swing.JRadioButton();
        radioBezerro = new javax.swing.JRadioButton();
        radioGravida = new javax.swing.JRadioButton();
        radioMonta = new javax.swing.JRadioButton();
        radioBezerra = new javax.swing.JRadioButton();
        radioVendaMatriz = new javax.swing.JRadioButton();
        radioNovilha = new javax.swing.JRadioButton();
        fundo = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Bovino");
        setName("frameCadastroBovino");
        getContentPane().setLayout(null);
        panelFundo.setBackground(new java.awt.Color(255, 255, 255));
        panelFundo.setLayout(null);
        lbNome.setFont(new java.awt.Font("Dialog", 0, 12));
        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("Nome do Animal");
        panelFundo.add(lbNome);
        lbNome.setBounds(20, 20, 101, 15);
        editNome.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNomeActionPerformed(evt);
            }
        });
        panelFundo.add(editNome);
        editNome.setBounds(20, 40, 360, 30);
        lbDataNascimento1.setFont(new java.awt.Font("Dialog", 0, 12));
        lbDataNascimento1.setForeground(new java.awt.Color(255, 255, 255));
        lbDataNascimento1.setText("Data Nascimento:");
        panelFundo.add(lbDataNascimento1);
        lbDataNascimento1.setBounds(20, 70, 112, 15);
        editAno.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAnoActionPerformed(evt);
            }
        });
        panelFundo.add(editAno);
        editAno.setBounds(100, 90, 80, 30);
        editDia.setToolTipText("");
        editDia.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDiaActionPerformed(evt);
            }
        });
        panelFundo.add(editDia);
        editDia.setBounds(20, 90, 40, 30);
        editMes.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMesActionPerformed(evt);
            }
        });
        panelFundo.add(editMes);
        editMes.setBounds(60, 90, 40, 30);
        editCodigo.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCodigoActionPerformed(evt);
            }
        });
        panelFundo.add(editCodigo);
        editCodigo.setBounds(20, 140, 360, 30);
        lbSexo.setFont(new java.awt.Font("Dialog", 0, 12));
        lbSexo.setForeground(new java.awt.Color(255, 255, 255));
        lbSexo.setText("Status");
        panelFundo.add(lbSexo);
        lbSexo.setBounds(20, 230, 41, 15);
        grupoRadioTipo.add(radioMatriz);
        radioMatriz.setForeground(java.awt.Color.black);
        radioMatriz.setText("Matriz");
        radioMatriz.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMatrizActionPerformed(evt);
            }
        });
        panelFundo.add(radioMatriz);
        radioMatriz.setBounds(240, 200, 70, 23);
        radioMatriz.getAccessibleContext().setAccessibleName("");
        grupoRadioTipo.add(radioTouro);
        radioTouro.setForeground(java.awt.Color.black);
        radioTouro.setText("Touro");
        radioTouro.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTouroActionPerformed(evt);
            }
        });
        panelFundo.add(radioTouro);
        radioTouro.setBounds(20, 200, 66, 23);
        radioTouro.getAccessibleContext().setAccessibleName("");
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panelFundo.add(btnSalvar);
        btnSalvar.setBounds(170, 490, 87, 25);
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelFundo.add(btnCancelar);
        btnCancelar.setBounds(160, 520, 105, 25);
        lbCodigo1.setFont(new java.awt.Font("Dialog", 0, 12));
        lbCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigo1.setText("Código:");
        panelFundo.add(lbCodigo1);
        lbCodigo1.setBounds(20, 120, 47, 15);
        lbStatus.setFont(new java.awt.Font("Dialog", 0, 12));
        lbStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbStatus.setText("Sexo");
        panelFundo.add(lbStatus);
        lbStatus.setBounds(20, 180, 30, 15);
        grupoStatusTouro.add(radioReprodutor);
        radioReprodutor.setForeground(java.awt.Color.black);
        radioReprodutor.setText("Reprodutor");
        radioReprodutor.setToolTipText("");
        radioReprodutor.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioReprodutorActionPerformed(evt);
            }
        });
        panelFundo.add(radioReprodutor);
        radioReprodutor.setBounds(20, 250, 106, 23);
        grupoStatusTouro.add(radioVendaTouro);
        radioVendaTouro.setForeground(java.awt.Color.black);
        radioVendaTouro.setText("Venda");
        radioVendaTouro.setToolTipText("");
        radioVendaTouro.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVendaTouroActionPerformed(evt);
            }
        });
        panelFundo.add(radioVendaTouro);
        radioVendaTouro.setBounds(20, 280, 70, 23);
        grupoStatusTouro.add(radioBezerro);
        radioBezerro.setForeground(java.awt.Color.black);
        radioBezerro.setText("Bezerro");
        radioBezerro.setToolTipText("");
        radioBezerro.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBezerroActionPerformed(evt);
            }
        });
        panelFundo.add(radioBezerro);
        radioBezerro.setBounds(20, 310, 81, 23);
        grupoStatusMatriz.add(radioGravida);
        radioGravida.setForeground(java.awt.Color.black);
        radioGravida.setText("Grávida");
        panelFundo.add(radioGravida);
        radioGravida.setBounds(240, 240, 79, 23);
        grupoStatusMatriz.add(radioMonta);
        radioMonta.setForeground(java.awt.Color.black);
        radioMonta.setText("Monta");
        panelFundo.add(radioMonta);
        radioMonta.setBounds(240, 270, 70, 23);
        grupoStatusMatriz.add(radioBezerra);
        radioBezerra.setForeground(java.awt.Color.black);
        radioBezerra.setText("Bezerra");
        panelFundo.add(radioBezerra);
        radioBezerra.setBounds(240, 360, 81, 23);
        grupoStatusMatriz.add(radioVendaMatriz);
        radioVendaMatriz.setForeground(java.awt.Color.black);
        radioVendaMatriz.setText("Venda");
        panelFundo.add(radioVendaMatriz);
        radioVendaMatriz.setBounds(240, 330, 70, 23);
        grupoStatusMatriz.add(radioNovilha);
        radioNovilha.setForeground(java.awt.Color.black);
        radioNovilha.setText("Novilha");
        panelFundo.add(radioNovilha);
        radioNovilha.setBounds(240, 300, 77, 23);
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rx/imagens/cadastro.jpg")));
        panelFundo.add(fundo);
        fundo.setBounds(0, 0, 410, 600);
        getContentPane().add(panelFundo);
        panelFundo.setBounds(-10, -10, 410, 600);
        setSize(new java.awt.Dimension(400, 600));
        setLocationRelativeTo(null);
    }

    private void radioBezerroActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        formPrincipal principal = new formPrincipal();
        principal.setResizable(false);
        principal.setVisible(true);
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = editNome.getText();
        int dia = 0, mes = 0, ano = 0, codigo = 0;
        boolean tudoCorreto = false;
        if (editAno.getText().length() > 0 && editDia.getText().length() > 0 && editMes.getText().length() > 0 && editCodigo.getText().length() > 0 && editNome.getText().length() > 0) {
            dia = Integer.parseInt(editDia.getText());
            mes = Integer.parseInt(editMes.getText());
            ano = Integer.parseInt(editAno.getText());
            codigo = Integer.parseInt(editCodigo.getText());
            tudoCorreto = true;
        } else {
            mostraMensagem.exibir("Atençao", "Campo obrigatório não preenchido!");
        }
        if (tudoCorreto) {
            Data dataNascimento = new Data(dia, mes, ano);
            if (radioMatriz.isSelected()) {
                Matriz matriz = new Matriz(nome, dataNascimento, codigo);
                if (radioBezerra.isSelected())
                    matriz.setStatus(50);
                else if (radioVendaMatriz.isSelected())
                    matriz.setStatus(40);
                else if (radioGravida.isSelected())
                    matriz.setStatus(10);
                else if (radioMonta.isSelected())
                    matriz.setStatus(20);
                else if (radioNovilha.isSelected())
                    matriz.setStatus(30);
                try {
                    soaMatriz.adicionar(matriz);
                } catch (IOException ex) {
                    Logger.getLogger(formCadastroBovino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (radioTouro.isSelected()) {
                Touro touro = new Touro(nome, dataNascimento, codigo);
                if (radioBezerro.isSelected())
                    touro.setStatus(50);
                else if (radioVendaTouro.isSelected())
                    touro.setStatus(20);
                else if (radioReprodutor.isSelected())
                    touro.setStatus(10);
                try {
                    soaTouro.adicionar(touro);
                } catch (IOException ex) {
                    Logger.getLogger(formCadastroBovino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            mostraMensagem.exibir("", "Cadastro realizado com sucesso!");
            editAno.setText("");
            editDia.setText("");
            editMes.setText("");
            editCodigo.setText("");
            editNome.setText("");
            grupoRadioTipo.clearSelection();
            grupoStatusTouro.clearSelection();
            grupoStatusMatriz.clearSelection();
        }
    }

    private void radioTouroActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void radioMatrizActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void editCodigoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void editMesActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void editDiaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void editAnoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void editNomeActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void radioReprodutorActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void radioVendaTouroActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(formCadastroBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCadastroBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCadastroBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCadastroBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(()->{
    new formCadastroBovino().setVisible(true);
});
    }

    private javax.swing.JButton btnCancelar;

    private javax.swing.JButton btnSalvar;

    private javax.swing.JTextField editAno;

    private javax.swing.JTextField editCodigo;

    private javax.swing.JTextField editDia;

    private javax.swing.JTextField editMes;

    private javax.swing.JTextField editNome;

    private javax.swing.JLabel fundo;

    private javax.swing.ButtonGroup grupoRadioTipo;

    private javax.swing.ButtonGroup grupoStatusMatriz;

    private javax.swing.ButtonGroup grupoStatusTouro;

    private javax.swing.JLabel lbCodigo1;

    private javax.swing.JLabel lbDataNascimento1;

    private javax.swing.JLabel lbNome;

    private javax.swing.JLabel lbSexo;

    private javax.swing.JLabel lbStatus;

    private javax.swing.JPanel panelFundo;

    private javax.swing.JRadioButton radioBezerra;

    private javax.swing.JRadioButton radioBezerro;

    private javax.swing.JRadioButton radioGravida;

    private javax.swing.JRadioButton radioMatriz;

    private javax.swing.JRadioButton radioMonta;

    private javax.swing.JRadioButton radioNovilha;

    private javax.swing.JRadioButton radioReprodutor;

    private javax.swing.JRadioButton radioTouro;

    private javax.swing.JRadioButton radioVendaMatriz;

    private javax.swing.JRadioButton radioVendaTouro;

    private void initComponents() {
    }
}
