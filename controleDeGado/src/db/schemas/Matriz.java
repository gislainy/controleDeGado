package db.schemas;

import java.io.Serializable;
import java.util.ArrayList;

public class Matriz extends Bovino implements Serializable{
  public ArrayList<Leite> producaoDeLeiteList;
  /**
   *
   * @param dataDeNascimento
   * @param codigo
   */
  public Matriz(String nome, Data dataDeNascimento, int codigo){
    super(nome, dataDeNascimento, codigo, 0);
    producaoDeLeiteList = new ArrayList<>();
  }

  /**
   *
   * @return
   */
  public String getStatusText(){
    switch (this.getStatus()) {
      case 0:
	return "A definir";
      case 10:
	return "Grávida";
      case 20:
	return "Monta";
      case 30:
	return "Novilha";
      case 40:
	return "Venda";
      case 50:
	return "Bezerra";
      case 60:
      return "Morta";
      default:
	throw new IllegalArgumentException("Status inválido");
    }
  }

  /**
   *
   * @param leite
   */
  public void adicionarProducaoDeLeite(Leite leite){
    this.producaoDeLeiteList.add(leite);
  }
  @Override
  public String toString(){
    return super.toString() + "  " + this.getStatusText();
  }
  public String mostrar(){
    return super.toString() + "  " + this.getStatusText();
  }

  public String getLeiteItem(int i) {
    return this.producaoDeLeiteList.get(i).getQuantidade() + "L - " + this.producaoDeLeiteList.get(i).getData();
  }
}
