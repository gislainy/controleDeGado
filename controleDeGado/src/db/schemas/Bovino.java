package db.schemas;

import java.util.ArrayList;
public abstract class Bovino {
  private int sexo;
  private Data dataDeNascimento;
  private int codigo;
  private int status;
  private ArrayList<Vacina> vacinaList;

  /**
   *
   * @param dataDeNascimento
   * @param codigo
   */
  public Bovino(Data dataDeNascimento, int codigo){
    this.dataDeNascimento = dataDeNascimento;
    this.codigo = codigo;
    this.vacinaList = new ArrayList<>();
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

  /**
   *
   * @param vacina
   */
  public void adicionarVacina(Vacina vacina){
    this.vacinaList.add(vacina);
  }
}
