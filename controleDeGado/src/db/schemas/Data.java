package db.schemas;

import java.util.Calendar;

public abstract class Data {
  protected int dia;
  protected int mes;
  protected int ano;
  public int calcularIdadeEmMeses(){
    Calendar c = Calendar.getInstance();
    int ano = c.get(Calendar.YEAR);
    int mes = c.get(Calendar.MONTH);
    int dia = c.get(Calendar.DAY_OF_MONTH);
    int qtdMeses;
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
}
