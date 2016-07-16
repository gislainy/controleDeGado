package db.schemas;

import java.io.Serializable;
import java.util.ArrayList;

public class Touro extends Bovino implements Serializable{
  /**
   *
   * @param dataDeNascimento
   * @param codigo
   */
  public Touro(String nome, Data dataDeNascimento, int codigo){
    super(nome, dataDeNascimento, codigo);
  }

  /**
   *
   * @return
   */
  public String getStatusText(){
    switch (this.getStatus()) {
      case 10:
	return "Reprodutor";
      case 20:
	return "Venda";
      case 30:
	return "Morto";
      case 40:
	return "Venda";
      case 50:
	return "Bezerro";
      default:
	throw new IllegalArgumentException("Status inválido");
    }
  }
}
