import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.TreeSet;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

  private Patient patient;
  private Medicine pinkMedicine;
  private Medicine yellowMedicine;
  private Medicine blueMedicine;

  @BeforeEach
  void setUp() {
    patient = new Patient();
    addMedicinesToPatient();
  }

  @AfterEach
  void tearDown() {
    patient = null;
  }

  @Test
  void testGetClashingPrescriptionsAtASpecificDate() {
    HashMap<Medicine, Prescription> testMap = new HashMap<>();
    testMap.put(yellowMedicine, yellowMedicine.getPrescriptions().get(0));
    testMap.put(pinkMedicine, pinkMedicine.getPrescriptions().get(0));
    System.out.println(testMap);
    assertThat(patient.getClashingPrescriptions("2017-12-31",0).equals(testMap), is(true));
  }

  @Test
  void testGetMedicines() {
    TreeSet<Medicine> testSet = new TreeSet<>();
    testSet.add(pinkMedicine);
    testSet.add(yellowMedicine);
    testSet.add(blueMedicine);
    assertThat(patient.getMedicines().equals(testSet), is(true));
  }

  private void addMedicinesToPatient() {
    initMedicines();
    patient.addMedicine(pinkMedicine);
    patient.addMedicine(yellowMedicine);
    patient.addMedicine(blueMedicine);
  }

  private void initMedicines() {
    initPinkMedicine();
    initYellowMedicine();
    initBlueMedicine();
  }

  private void initPinkMedicine() {
    pinkMedicine = new Medicine("pink");
    Prescription firstPrescription = new Prescription("2017-12-20", 12); // 2017(December 20 - January 1)2018
    Prescription secondPrescription = new Prescription("2017-12-17", 10); // 2017(December 17 - December 27)2018
    Prescription thirdPrescription = new Prescription("2018-01-20", 5); // 2018(January 20 - January 25)
    pinkMedicine.addPrescription(firstPrescription);
    pinkMedicine.addPrescription(secondPrescription);
    pinkMedicine.addPrescription(thirdPrescription);
  }

  private void initYellowMedicine() {
    yellowMedicine = new Medicine("yellow");
    Prescription firstPrescription = new Prescription("2017-12-25", 13); // 2017(December 25 - January 8)2018
    Prescription secondPrescription = new Prescription("2018-01-20", 10); // 2018(January 20 - January 30)2018
    Prescription thirdPrescription = new Prescription("2018-02-01", 10); // 2018(February 1 - February 10)2018
    yellowMedicine.addPrescription(firstPrescription);
    yellowMedicine.addPrescription(secondPrescription);
    yellowMedicine.addPrescription(thirdPrescription);
  }

  private void initBlueMedicine() {
    blueMedicine = new Medicine("blue");
    Prescription firstPrescription = new Prescription("2018-02-05", 12); // 2018(February 5 - February 17)2018
    Prescription secondPrescription = new Prescription("2018-03-05", 25); // 2018(March 5 - March 30)2018
    Prescription thirdPrescription = new Prescription("2017-12-15", 5); // 2017(December 15 - December 22)2017
    blueMedicine.addPrescription(firstPrescription);
    blueMedicine.addPrescription(secondPrescription);
    blueMedicine.addPrescription(thirdPrescription);
  }
}