package db.schemas;

import java.util.ArrayList;

public abstract class Touro {
  private Data idade;
  private int status;
  private ArrayList<Bezerro> filhosList = new ArrayList<Bezerro>();
}
