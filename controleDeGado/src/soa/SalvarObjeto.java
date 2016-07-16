package soa;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class SalvarObjeto {
  public static void salvar(Object objeto, String caminho) {
    try {
      FileOutputStream saveFile = new FileOutputStream(caminho);
      try (ObjectOutputStream stream = new ObjectOutputStream(saveFile)) {
	stream.writeObject(objeto);
      }
    } catch (Exception exc) {
    }
  }
}