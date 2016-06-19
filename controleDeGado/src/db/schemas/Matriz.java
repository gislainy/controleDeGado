package db.schemas;

import java.util.ArrayList;

public class Matriz {
  private Data idade;
  private float[] producaoDeLeite;
  private int status;
  private ArrayList<Bezerro> filhosList = new ArrayList<Bezerro>();
  public Matriz(db.schemas.Data idade, int status){
    this.idade = idade;
    this.status = status;
  }
  @Override
  public String toString(){
    return "Idade: " + idade.calcularIdadeEmMeses() + " meses - Stutus: " + status;
  }
  //Doenças? Ração? 
}
