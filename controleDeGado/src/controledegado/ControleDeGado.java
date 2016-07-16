package controledegado;

import db.schemas.Matriz;
import rx.formPrincipal;
import soa.RestaurarObjeto;

public class ControleDeGado {
  public static void main(String[] args) {
    formPrincipal principal = new formPrincipal();
    principal.setResizable(false);
    principal.setVisible(true);
    System.out.println("Funcionou");
    System.out.println((Matriz) RestaurarObjeto.restaurar("/home/gislainy/controleDeGado/controleDeGado/files/matrizes.ser"));       

  }
}
