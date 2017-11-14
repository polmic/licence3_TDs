package AlgosTri;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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
  public void aucuneBouleTiree() {
    assertEquals("", l.getBoulesTirees());
  }

}