package db.schemas;

/**
 *
 * @author gislainy
 */
public class Leite {
  private Data data;
  private float quantidade;

  /**
   *
   * @param data
   * @param quantidade
   */
  public Leite(Data data, float quantidade){
    this.data = data;
    this.quantidade = quantidade;
  }

  /**
   *
   * @return
   */
  public float getQuantidade(){
    return this.quantidade;
  }
}
