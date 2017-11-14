package AlgosTri;

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
    assertEquals("", l.getBoulesTirees());
  }

  @Test
  void uneBouleTiree() {
    l.add(10);
    assertEquals("10", l.getBoulesTirees());
  }

  @Test
  void deuxBoulesTirees() {
    l.add(10);
    l.add(20);
    assertEquals("10, 20", l.getBoulesTirees());
  }

}