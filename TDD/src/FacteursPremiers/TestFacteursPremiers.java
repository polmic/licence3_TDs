package FacteursPremiers;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TestFacteursPremiers {
  private DecompositionEnFacteursPremiers d;

  @Before
  public void setUp() {
    this.d = new DecompositionEnFacteursPremiers();
  }

  @After
  public void tearDown() throws Exception {
    this.d = null;
  }

  @Test
  public void UnNapasDeFacteursPremiers() {
    setUp();
    assertEquals(Arrays.asList(), d.compute(1));
  }

  @Test
  public void DeuxAUnFacteurPremierDeux() {
    setUp();
    assertEquals(Arrays.asList(2), d.compute(2));
  }

  @Test
  public void TroisAUnFacteurPremierTrois() {
    setUp();
    assertEquals(Arrays.asList(3), d.compute(3));
  }

  @Test
  public void QuatreADeuxFaceursPremiersDeuxDeux() {
    setUp();
    assertEquals(Arrays.asList(2,2), d.compute(4));
  }

  @Test
  public void CinqAUnFacteurPremierCinq() {
    setUp();
    assertEquals(Arrays.asList(5), d.compute(5));
  }

  @Test
  public void SixADeuxFacteursPremiersDeuxTrois() {
    setUp();
    assertEquals(Arrays.asList(2,3), d.compute(6));
  }

  @Test
  public void HuitATroisFacteursPremiersDeuxDeuxDeux() {
    setUp();
    assertEquals(Arrays.asList(2,2,2), d.compute(8));
  }

  @Test
  public void NeufADeuxFacteursPremiersTroisTrois() {
    setUp();
    assertEquals(Arrays.asList(3,3), d.compute(9));
  }

  @Test
  public void DixADeuxFacteursPremiersDeuxCinq() {
    setUp();
    assertEquals(Arrays.asList(2,5), d.compute(10));
  }

  @Test
  public void QuaranteDeuxATroisFacteursPremiersDeuxTroisSept() {
    setUp();
    assertEquals(Arrays.asList(2,3,7), d.compute(42));
  }
}