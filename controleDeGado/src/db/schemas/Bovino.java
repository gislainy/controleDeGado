package db.schemas;

import java.io.Serializable;

public abstract class Bovino implements Serializable{
  private String nome;
  private int sexo;
  private Data dataDeNascimento;
  private int codigo;
  private int status;

  /**
   *
   * @param dataDeNascimento
   * @param codigo
   */
  public Bovino(String nome, Data dataDeNascimento, int codigo, int sexo){
    this.nome = nome;
    this.dataDeNascimento = dataDeNascimento;
    this.codigo = codigo;
    this.sexo = sexo;
  }

  /**
   *
   * @param sexo
   * @param dataNascimento
   * @param codigo
   * @param status
   */
  public void alterar(int sexo, Data dataNascimento, int codigo, int status){
    this.sexo = sexo;
    this.dataDeNascimento = dataNascimento;
    this.codigo = codigo;
  }

  /**
   *
   * @return
   */
  public String getSexo(){
    return this.sexo==1 ? "Macho": "Fêmea";
  }


  /**
   *
   * @return
   */
  public int getCodigo(){
    return this.codigo;
  }
  
  /**
   *
   * @return
   */
  public String getNome(){
    return this.nome;
  }

  /**
   *
   * @return
   */
  public int getStatus(){
    return this.status;
  }
  
  /**
   *
   * @param status
   */
  public void setStatus(int status){
    this.status = status;
  }

  @Override
  public String toString(){
    return "" + this.nome + "  " + this.codigo + "  " + this.dataDeNascimento;
  }
  public String bezerro(){
    if(this.ehBezerro()){
      return this.toString();
    }
    return " ";
  }
  public boolean ehBezerro(){
    return this.status == 50;
  }
}
