package db.schemas;

import java.util.ArrayList;

public abstract class Touro {
  protected Data idade;
  protected int status;
  protected ArrayList<Bezerro> filhosList = new ArrayList<Bezerro>();
}
