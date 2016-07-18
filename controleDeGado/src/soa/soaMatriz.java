package soa;

import util.SalvarObjeto;
import db.schemas.Matriz;
import java.io.IOException;

public class soaMatriz {

    public static void adicionar(Matriz matriz) throws IOException {
        SalvarObjeto.salvar(matriz, "matrizes.dat", false);
    }

    public static void alterar(Matriz matriz, boolean apagar) throws IOException {
        SalvarObjeto.salvar(matriz, "matrizes.dat", apagar);
    }

    public static void excluir(Matriz matriz, boolean apagar) throws IOException {
        SalvarObjeto.salvar(matriz, "matrizes.dat", apagar);
    }
}
