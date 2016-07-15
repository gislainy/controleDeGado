package db.schemas;

import java.util.Calendar;

/**
 *
 * @author gislainy
 */
public class Data {
  private int dia;
  private int mes;
  private int ano;

  /**
   *
   * @param dia
   * @param mes
   * @param ano
   */
  public Data(int dia, int mes, int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  /**
   *
   * @return
   */
  public int calcularIdadeEmMeses(){
    Calendar c = Calendar.getInstance();
    int ano = c.get(Calendar.YEAR);
    int mes = c.get(Calendar.MONTH)+1;
    int dia = c.get(Calendar.DAY_OF_MONTH);
    if(this.ano == ano){
      if(this.mes < mes){
        if((this.dia < dia) || (this.dia == dia)) {
          return mes - this.mes;
        } 
        else {
          return (mes - this.mes)-1; 
        }
      } else if(this.mes == mes){
        return 0;
      }
    } else if((this.ano < ano)){
      if(this.mes <= mes){
        return ((ano - this.ano)*12)+(mes - this.mes);
      }
      else {
        return (((ano - this.ano)-1)*12);
      }
    }
    else {
      throw new IllegalArgumentException("Data inválida");
    }
    return 0;
  }  
  public String toString(){
    return dia + "/" + mes + "/" + ano;
  }
}
