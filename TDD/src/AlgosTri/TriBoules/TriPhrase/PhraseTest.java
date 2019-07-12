package AlgosTri.TriBoules.TriPhrase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseTest {

  private Phrase p;

  @BeforeEach
  void setUp() {
    p = new Phrase();
  }

  @AfterEach
  void tearDown() {
    p = null;
  }

  @Test
  void chaineVide() {
    assertEquals("", p.toString());
  }

  @Test
  void queDesLettresA() {
    p.setChaine("aAA");
    assertEquals("aaa", p.toString());
  }

  @Test
  void avecDesAEtSpecialChars() {
    p.setChaine("...aAA!!?");
    assertEquals("aaa", p.toString());
  }

  @Test
  void acceptation() {
    p.setChaine("Je suis le meilleur en TDD !!!");
    assertEquals("ddeeeeeiijlllmnrsstuu", p.toString());
  }

}