package db.schemas;

import java.util.ArrayList;

public class Matriz extends Bovino {
  private ArrayList<Leite> producaoDeLeiteList;
  private ArrayList<Bovino> filhosList;

  /**
   *
   * @param dataDeNascimento
   * @param codigo
   */
  public Matriz(Data dataDeNascimento, int codigo){
    super(dataDeNascimento, codigo);
    producaoDeLeiteList = new ArrayList<>();
    filhosList = new ArrayList<>();
  }

  /**
   *
   * @return
   */
  public String getStatusText(){
    switch (this.getStatus()) {
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

  /**
   *
   * @param filho
   */
  public void adicionarFilhos(Bovino filho){
    this.filhosList.add(filho);
  }
}
