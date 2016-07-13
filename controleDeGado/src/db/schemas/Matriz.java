package db.schemas;

import java.util.ArrayList;

public class Matriz extends Bovino {
  private ArrayList<Leite> producaoDeLeiteList;
  private ArrayList<Bezerro> filhosList;
  public Matriz(int sexo, Data dataDeNascimento, int codigo, int status){
    super(sexo, dataDeNascimento, codigo, status);
    producaoDeLeiteList = new ArrayList<>();
    filhosList = new ArrayList<>();
  }
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
	return "Morta";
      default:
	throw new IllegalArgumentException("Status inválido");
    }
  }
  public int getStatusEnum(){
    return this.getStatus();
  }
  
//  @Override
//  public String toString(){
//    return "Idade: " + idade.calcularIdadeEmMeses() + " meses - Stutus: " + status;
//  }
  //Doenças? Ração? 
}
