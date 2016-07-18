package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
public class RestaurarObjeto {
  public static Object restaurar(String caminho) {
    Object objeto = null;
    try {
      FileInputStream restFile = new FileInputStream("files/"+caminho);
      try (ObjectInputStream stream = new ObjectInputStream(restFile)) {
	objeto = stream.readObject();
      }
    } catch (IOException | ClassNotFoundException e) {
    }
    return objeto;
  }
  public static ArrayList<Object> restautarList(String caminho) {
    ArrayList<Object> objectList = new ArrayList<>();
    Object objeto = null;
    try {
      FileInputStream restFile = new FileInputStream("files/"+caminho);
      try (ObjectInputStream stream = new ObjectInputStream(restFile)) {
	while(true){
	  try {
	  objeto = stream.readObject();
	  objectList.add(objeto);
	  }
	  catch(IOException | ClassNotFoundException e){
	    break;
	  }
	}
      }
    } catch (IOException e) {
    }
    return objectList;
  }
}



