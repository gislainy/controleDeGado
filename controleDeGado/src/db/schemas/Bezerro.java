package db.schemas;
public class Bezerro extends Bovino {
  private int status;
  public Bezerro(int sexo, Data dataDeNascimento, int codigo, int status) {
    super(sexo, dataDeNascimento, codigo, status);
  }
  public String getStatusText(){
    switch (this.getStatus()) {
      case 10:
	return "Vacinado";
      case 20:
	return "Morto";
      case 30:
	return "Natimorto";
      default:
	throw new IllegalArgumentException("Status inválido");
    }
  }
}
