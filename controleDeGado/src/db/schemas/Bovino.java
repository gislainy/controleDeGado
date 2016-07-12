package db.schemas;

public abstract class Bovino {
  private int sexo;
  private Data dataDeNascimento;
  private int codigo;
  private int status;
  public Bovino(int sexo, Data dataDeNascimento, int codigo, int status){
    this.sexo = sexo;
    this.dataDeNascimento = dataDeNascimento;
    this.codigo = codigo;
    this.status = status;
  }
}
