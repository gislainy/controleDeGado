package db.schemas;

import java.util.ArrayList;

public class Touro extends Bovino {
  private int status;
  private ArrayList<Bezerro> filhosList;
  public Touro(int sexo, Data dataDeNascimento, int codigo, int status){
    super(sexo, dataDeNascimento, codigo, status);
    filhosList = new ArrayList<>();
  }
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
  
//  @Override
//  public String toString(){
//    return "Idade: " + idade.calcularIdadeEmMeses() + " meses - Stutus: " + status;
//  }
  //Doenças? Ração? 
}
