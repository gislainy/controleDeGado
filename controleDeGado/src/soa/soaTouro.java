package soa;

import db.schemas.Touro;
import java.io.IOException;
import util.SalvarObjeto;

public class soaTouro {

    public static void adicionar(Touro touro) throws IOException {
        SalvarObjeto.salvar(touro, "touros.dat", false);
    }

    public static void alterar(Touro touro, boolean apagar) throws IOException {
        SalvarObjeto.salvar(touro, "touros.dat", apagar);
    }

    public static void excluir(Touro touro, boolean apagar) throws IOException {
        SalvarObjeto.salvar(touro, "touros.dat", apagar);
    }
}
