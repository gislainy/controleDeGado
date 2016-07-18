import db.schemas.Data;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class TesteData {
  @Test
  public void test1() {
    Data p;
    p = new Data(23,8,1996);
    assertEquals(228,p.calcularIdadeEmMeses());
    p = new Data(1,1,2015);
    assertEquals(18,p.calcularIdadeEmMeses());
    
    System.out.println("Passou Teste 1 - primeira faixa");
  }
  @Test
  public void test2() {
    Data p;
    p = new Data(23,8,1996);
    assertEquals("23/8/1996",p.toString());
    p = new Data(01,1,2016);
    assertEquals("1/1/2016",p.toString());
    System.out.println("Passou Teste 2 - segunda faixa");
  }
  @BeforeClass
    public static void inicializaClass() {
    System.out.println("iniciou série de teste");
  }
  @AfterClass
    public static void finalizaClass() {
    System.out.println("Finalizou série de teste");
  }
}