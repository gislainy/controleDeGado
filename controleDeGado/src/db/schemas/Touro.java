package db.schemas;

import java.util.ArrayList;

public class Touro extends Bovino {
  private ArrayList<Bovino> filhosList;

  /**
   *
   * @param dataDeNascimento
   * @param codigo
   */
  public Touro(Data dataDeNascimento, int codigo){
    super(dataDeNascimento, codigo);
    filhosList = new ArrayList<>();
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

  /**
   *
   * @param filho
   */
  public void adicionarFilhos(Bovino filho){
    this.filhosList.add(filho);
  }
  
//  @Override
//  public String toString(){
//    return "Idade: " + idade.calcularIdadeEmMeses() + " meses - Stutus: " + status;
//  }
  //Doenças? Ração? 
}
