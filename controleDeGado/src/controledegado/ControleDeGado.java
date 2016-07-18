package controledegado;

import java.io.File;
import rx.formPrincipal;

public class ControleDeGado {
  public static void main(String[] args) {
    
    formPrincipal principal = new formPrincipal();
    principal.setResizable(false);
    principal.setVisible(true);
    File diretorio = new File("files"); 
    diretorio.mkdir(); 
  }
}
