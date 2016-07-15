package db.schemas;

import java.util.ArrayList;

public abstract class Touro {
  private Data idade;
  private int status;
  private ArrayList<Bezerro> filhosList = new ArrayList<Bezerro>();
  
  Touro (Data idade, int status, ArrayList<Bezerro> filhosList){
    this.idade = idade;
    this.status = status;
    this.filhosList = filhosList;
  }
  
  public void setIdade(Data idade){
    this.idade = idade;
  }
  
  public Data getIdade (){
    return idade;
  }
  
  public void setStatus (int status){
    this.status = status;
  }
  
  public int getStatus (){
    return status;
  }
  
  public void setFilhosList (ArrayList<Bezerro> filhosList){
    this.filhosList = filhosList;
  }
  
  public ArrayList<Bezerro> getFilhosList (){
    return filhosList;
  }
  
}
