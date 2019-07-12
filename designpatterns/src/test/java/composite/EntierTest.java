package composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class EntierTest {

  @Test
  public void testEvaluatePositif() {
    Entier e = new Entier(1024);
    assertEquals(e.evaluate(), 1024);
  }

  @Test
  public void testEvaluateZero() {
    Entier e = new Entier(0);
    assertEquals(e.evaluate(), 0);
  }

  @Test
  public void testEvaluateNegatif() {
    Entier e = new Entier(-1024);
    assertEquals(e.evaluate(), -1024);
  }
}
