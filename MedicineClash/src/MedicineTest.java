import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;

class MedicineTest {

  private Medicine medicineRose;

  @BeforeEach
  void setUp() {
    medicineRose = new Medicine("rose");
  }

  @AfterEach
  void tearDown() {
    medicineRose = null;
  }

  @Test
  void testAddPrescriptions() {
    medicineRose.addPrescription(new Prescription("2017-09-16", 10));
    medicineRose.addPrescription(new Prescription("2017-09-24", 10));
    assertThat(medicineRose.getPrescriptions().size(), is(2));
    assertThat(medicineRose.getPrescriptions().get(0).getDispenseDate(), is(LocalDate.parse("2017-09-16")));
    assertThat(medicineRose.getPrescriptions().get(1).getPrescriptionEnd(), is(LocalDate.parse("2017-10-04")));
  }

  @Test
  void testAddUnePrescription() {
    medicineRose.addPrescription(new Prescription("2017-09-16", 10));
    assertThat(medicineRose.getPrescriptions().size(), is(1));
  }

  @Test
  void testGetPrescriptionsVide() {
    assertEquals(medicineRose.getPrescriptions().getClass(), ArrayList.class);
    assertThat(medicineRose.getPrescriptions().size(), is(0));
  }

}