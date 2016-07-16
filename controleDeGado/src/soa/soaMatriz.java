package soa;
import db.schemas.Matriz;
import java.io.IOException;

public class soaMatriz {
  public void adicionar(Matriz matriz) throws IOException{
    SalvarObjeto.salvar(matriz, "/home/gislainy/controleDeGado/controleDeGado/files/matrizes.ser");
  } 
}
