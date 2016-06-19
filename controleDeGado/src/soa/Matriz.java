package soa;

//import db.schemas.Matriz;
import db.schemas.Data;

public class Matriz {
  public void adicionar(Data dataNascimento, int status){
    db.schemas.Matriz matriz = new db.schemas.Matriz(dataNascimento, status);
  } 
}
