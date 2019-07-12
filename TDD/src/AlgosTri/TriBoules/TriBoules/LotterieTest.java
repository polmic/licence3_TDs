package AlgosTri.TriBoules.TriBoules;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotterieTest {

  private Lotterie l;

  @BeforeEach
  void setUp() {
    l = new Lotterie();
  }

  @AfterEach
  void tearDown() {
    l = null;
  }

  @Test
  void aucuneBouleTiree() {
    assertEquals("", l.toString());
  }

  @Test
  void uneBouleTiree() {
    l.add(10);
    assertEquals("10", l.toString());
  }

  @Test
  void deuxBoulesTirees() {
    l.add(10);
    l.add(20);
    assertEquals("10 20", l.toString());
  }

  @Test
  void troisBoulesTirees() {
    l.add(10);
    l.add(20);
    l.add(30);
    assertEquals("10 20 30", l.toString());
  }

  @Test
  void acceptation() {
    l.add(0);
    l.add(30);
    l.add(20);
    l.add(40);
    l.add(5);
    l.add(3);
    assertEquals("0 3 5 20 30 40", l.toString());
  }

}