package db.schemas;

public class Vacina {
  private Data dataVacina;
  private String nome;

  /**
   *
   * @param nome
   * @param dataVacina
   */
  public Vacina(String nome, Data dataVacina){
    this.nome = nome;
    this.dataVacina = dataVacina;
  }

  /**
   *
   * @param nome
   * @param dataVacina
   */
  public void alterar(String nome, Data dataVacina){
    this.nome = nome;
    this.dataVacina = dataVacina;
  }

  /**
   *
   * @return
   */
  public String getNome(){
    return this.nome;
  }
}
