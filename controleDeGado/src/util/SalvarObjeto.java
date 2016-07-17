package util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class SalvarObjeto {
    public static void salvar(Object objeto, String caminho, boolean apagar) {
      if(apagar) {
	File arquivo = new File(caminho);
	arquivo.delete();
      }
      try {
	File saveFile = new File(caminho);
	ObjectOutputStream stream = null;
	if (saveFile.exists()) {
	 FileOutputStream fos = new FileOutputStream(saveFile, true);
	 stream = new AppendingObjectOutputStream(fos);
      } else {
	 FileOutputStream fos = new FileOutputStream(saveFile);
	 stream = new ObjectOutputStream(fos);
      }
      stream.writeObject(objeto);
      stream.close();
      } catch (Exception exc) {
    }
    }
}