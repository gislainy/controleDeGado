package db.schemas;

import java.util.ArrayList;

public class Matriz extends Bovino {
  private ArrayList<Leite> producaoDeLeiteList = new ArrayList<Leite>(); 
  private ArrayList<Bezerro> filhosList = new ArrayList<Bezerro>();
  public Matriz(int sexo, Data dataDeNascimento, int codigo, int status){
    super(sexo, dataDeNascimento, codigo, status);
  }
//  @Override
//  public String toString(){
//    return "Idade: " + idade.calcularIdadeEmMeses() + " meses - Stutus: " + status;
//  }
  //Doenças? Ração? 
}
