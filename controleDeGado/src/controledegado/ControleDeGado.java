package controledegado;

import db.schemas.Matriz;
import java.util.ArrayList;
import rx.formPrincipal;
import util.RestaurarObjeto;

public class ControleDeGado {

    public static void main(String[] args) {
        formPrincipal principal = new formPrincipal();
        principal.setResizable(false);
        principal.setVisible(true);
        ArrayList<Object> matrizesList;
        matrizesList = RestaurarObjeto.restautarList("matrizes.dat");
        for (int i = 0; i < matrizesList.size(); i++) {
            System.out.println("Funcionou");
            Matriz matriz = (Matriz) matrizesList.get(i);
            System.out.println(matriz);
        }
    }
}
