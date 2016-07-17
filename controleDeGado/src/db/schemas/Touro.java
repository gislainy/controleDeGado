package db.schemas;

import java.io.Serializable;

public class Touro extends Bovino implements Serializable{
  /**
   *
   * @param dataDeNascimento
   * @param codigo
   */
  public Touro(String nome, Data dataDeNascimento, int codigo){
    super(nome, dataDeNascimento, codigo, 1);
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
      case 0:
	return "A definir";
      case 50:
	return "Bezerro";
      default:
	throw new IllegalArgumentException("Status inválido");
    }
  }
  public String toString(){
    return super.toString() + "  " + this.getStatusText();
  }
  public String mostrar(){
    return super.toString() + "  " + this.getStatusText();
  }
}
