package soa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class RestaurarObjeto {
  public static Object restaurar(String caminho) {
    Object objeto = null;
    try {
      FileInputStream restFile = new FileInputStream(caminho);
      try (ObjectInputStream stream = new ObjectInputStream(restFile)) {
	objeto = stream.readObject();
      }
    } catch (IOException | ClassNotFoundException e) {
    }
    return objeto;
  }
}

