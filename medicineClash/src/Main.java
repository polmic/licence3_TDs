public class Main {

  private static Medicine pinkMedicine;
  private static Medicine yellowMedicine;
  private static Medicine blueMedicine;

  public static void main(String[] args) {
    Patient toto = new Patient();
    initMedicines();
    toto.addMedicine(pinkMedicine);
    toto.addMedicine(yellowMedicine);
    toto.addMedicine(blueMedicine);

    System.out.println(pinkMedicine);
    System.out.println(yellowMedicine);
    System.out.println(blueMedicine);

    System.out.println("\n\n");

    toto.getClashingPrescriptions("2018-01-20", 2);
  }

  private static void initMedicines() {
    pinkMedicine = new Medicine("pink");
    Prescription firstPinkPrescription = new Prescription("2017-12-20", 30); // 2017(December 20 - January 19)2018
    Prescription secondPinkPrescription = new Prescription("2017-12-27", 10); // 2017(December 27 - January 5)2018
    Prescription thirdPinkPrescription = new Prescription("2018-01-20", 5); // 2018(January 20 - January 25)
    pinkMedicine.addPrescription(firstPinkPrescription);
    pinkMedicine.addPrescription(secondPinkPrescription);
    pinkMedicine.addPrescription(thirdPinkPrescription);
    yellowMedicine = new Medicine("yellow");
    Prescription firstYellowPrescription = new Prescription("2017-12-25", 13); // 2017(December 25 - January 8)2018
    Prescription secondYellowPrescription = new Prescription("2018-01-15", 10); // 2018(January 15 - January 25)2018
    Prescription thirdYellowPrescription = new Prescription("2018-02-01", 10); // 2018(February 1 - February 10)2018
    yellowMedicine.addPrescription(firstYellowPrescription);
    yellowMedicine.addPrescription(secondYellowPrescription);
    yellowMedicine.addPrescription(thirdYellowPrescription);
    blueMedicine = new Medicine("blue");
    Prescription firstBluePrescription = new Prescription("2018-02-05", 12); // 2018(February 5 - February 17)2018
    Prescription secondBluePrescription = new Prescription("2018-01-05", 25); // 2018(January 5 - January 30)2018
    Prescription thirdBluePrescription = new Prescription("2017-12-15", 5); // 2017(December 15 - December 22)2017
    blueMedicine.addPrescription(firstBluePrescription);
    blueMedicine.addPrescription(secondBluePrescription);
    blueMedicine.addPrescription(thirdBluePrescription);
  }
}
