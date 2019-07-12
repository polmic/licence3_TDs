package ExercicesTDD.StringCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

  private StringCalculator sc;

  @BeforeEach
  void setUp() {
    sc = new StringCalculator();
  }

  @AfterEach
  void tearDown() {
    sc = null;
  }

  @Test
  void addWithNegatives() {
    Throwable exception = assertThrows(RuntimeException.class, () -> {
      sc.add("10,-5,-6,-7");
    });
  }

  @Test
  void newDelimiters() {
    assertEquals(10, sc.add("//;\n5;5"));
  }

  @Test
  void invalidInput() {
    assertEquals(1, sc.add("1,\n"));
  }

  @Test
  void addNumbersWithNewLines() {
    assertEquals(6, sc.add("1\n2,3"));
  }

  @Test
  void manyNumbers() {
    assertEquals(54, sc.add("1, 4,5   ,6, 28, 10"));
  }

  @Test
  void oneNumber() {
    assertEquals(1, sc.add("1"));
  }

  @Test
  void threeNumbers() {
    assertEquals(6, sc.add("1,2,3"));
  }

  @Test
  void twoNumbers() {
    assertEquals(44, sc.add("1,43"));
  }

  @Test
  void twoNumbersWithSpaces() {
    assertEquals(44, sc.add("1 , 43"));
  }

  @Test
  void emptyString() {
    assertEquals(0, sc.add(""));
  }

}