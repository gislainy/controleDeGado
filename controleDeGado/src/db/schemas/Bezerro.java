package db.schemas;


public abstract class Bezerro extends Bovino {
  //Vacina
  public Bezerro(int sexo, Data dataDeNascimento, int codigo, int status) {
    super(sexo, dataDeNascimento, codigo, status);
  }
}
