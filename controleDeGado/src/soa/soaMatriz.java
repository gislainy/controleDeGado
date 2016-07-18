package soa;
import util.SalvarObjeto;
import db.schemas.Matriz;
import java.io.IOException;

public class soaMatriz {
  public static void adicionar(String caminho, Matriz matriz) throws IOException{
    SalvarObjeto.salvar(matriz, "files/"+ caminho, false);
  }
  public static void alterar(String caminho, Matriz matriz, boolean apagar) throws IOException{
    SalvarObjeto.salvar(matriz, "files/"+ caminho, apagar);
  }
  public static void excluir(String caminho, Matriz matriz, boolean apagar) throws IOException{
    SalvarObjeto.salvar(matriz, "files/"+ caminho, apagar);
  }
}
