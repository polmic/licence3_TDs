import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;

class PrescriptionTest {

  private Medicine rose;
  private Medicine bleue;
  private Prescription prescriptionPink;
  private Prescription prescriptionGreen;
  private Prescription prescriptionBlue;

  @org.junit.jupiter.api.BeforeEach
  void setUp() {
    prescriptionPink = new Prescription("2017-11-10", 14);
    prescriptionGreen = new Prescription("2017-11-20", 30);
    prescriptionBlue = new Prescription("2017-12-10", 7);
  }

  @org.junit.jupiter.api.AfterEach
  void tearDown() {
    prescriptionPink = null;
    prescriptionGreen = null;
    prescriptionBlue = null;
  }

  @Test
  public void testIsOverLapping() {
    assertThat(prescriptionPink.isOverlapping(prescriptionGreen), is(true));
    assertThat(prescriptionGreen.isOverlapping(prescriptionPink), is(true));
    assertThat(prescriptionPink.isOverlapping(prescriptionBlue), is(false));
  }

  @Test
  public void testIncludesDate() {
    assertThat(prescriptionPink.includesDate(LocalDate.parse("2017-11-17")), is(true));
    assertThat(prescriptionGreen.includesDate(LocalDate.parse("2017-11-17")), is(false));
    assertThat(prescriptionBlue.includesDate(LocalDate.parse("2017-12-10")), is(true));
    assertThat(prescriptionBlue.includesDate(LocalDate.parse("2017-12-17")), is(true));
    assertThat(prescriptionGreen.includesDate(LocalDate.parse("2017-11-18")), is(false));
  }

  @Test
  public void testSetDispenseDate() {
    prescriptionBlue.setDispenseDate(prescriptionPink.getDispenseDate());
    assertThat(prescriptionBlue.getDispenseDate(), is(LocalDate.parse("2017-11-10")));
  }

  @Test
  public void testGetPrescriptionEnd() {
    assertThat(prescriptionPink.getPrescriptionEnd(), is(LocalDate.parse("2017-11-24")));
    assertThat(prescriptionPink.getPrescriptionEnd(), is(not(LocalDate.parse("2017-11-14"))));
  }

}