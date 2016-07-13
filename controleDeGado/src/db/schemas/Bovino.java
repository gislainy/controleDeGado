package db.schemas;

public abstract class Bovino {
  private int sexo;
  private Data dataDeNascimento;
  private int codigo;
  private int status;

  /**
   *
   * @param sexo
   * @param dataDeNascimento
   * @param codigo
   * @param status
   */
  public Bovino(int sexo, Data dataDeNascimento, int codigo, int status){
    this.sexo = sexo;
    this.dataDeNascimento = dataDeNascimento;
    this.codigo = codigo;
    this.status = status;
  }
  public void alterar(int sexo, Data dataNascimento, int codigo, int status){
    this.sexo = sexo;
    this.dataDeNascimento = dataNascimento;
    this.codigo = codigo;
  }
  public String getSexo(){
    return this.sexo==1 ? "Macho": "Fêmea";
  }
  public int getCodigo(){
    return this.codigo;
  }
  public int getStatus(){
    return this.status;
  }
}
