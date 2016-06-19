package tests;

import db.schemas.Data;
public class Tests {
  public static void main(String[] args){
    Data dataNascimento = new Data(19,05,2015);
    soa.Matriz vaca = new soa.Matriz();
    vaca.adicionar(dataNascimento, 1);
    System.out.println(vaca);
    System.out.println(vaca);
//    System.out.println(dataNascimento.calcularIdadeEmMeses());
  }
}
