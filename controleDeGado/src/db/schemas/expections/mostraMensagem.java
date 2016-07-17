package db.schemas.expections;

import javax.swing.JOptionPane;

public class mostraMensagem {
  public static void exibir(String titulo, String mensagem){
    Object[] options = {"Ok","Cancelar"};
    int n = JOptionPane.showOptionDialog(null, 
      mensagem, titulo,
      JOptionPane.YES_NO_CANCEL_OPTION,
      JOptionPane.QUESTION_MESSAGE,
      null,
      options,
      options[0]);
  }
}
