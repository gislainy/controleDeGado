package db.schemas;

import java.util.ArrayList;

public abstract class Matriz {
  protected Data idade;
  protected float[] producaoDeLeite;
  protected int status;
  protected ArrayList<Bezerro> filhosList = new ArrayList<Bezerro>();
  //Doenças? Ração? 
}
