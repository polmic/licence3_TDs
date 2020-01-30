import java.time.LocalDate;
import java.util.*;


public class Patient {

  private Set<Medicine> medicines;
  LocalDate dateToConsider;

  public Patient() {
    this.medicines = new TreeSet<>();
  }

  public HashMap<Medicine, Prescription> getClashingPrescriptions(int daysBeforeConsideration) {
    dateToConsider = LocalDate.now().minusDays(daysBeforeConsideration);
    return printClashingPrescriptions();
  }

  public HashMap<Medicine, Prescription> getClashingPrescriptions(String dateString, int daysBeforeConsideration) {
    this.dateToConsider = LocalDate.parse(dateString).minusDays(daysBeforeConsideration);
    return printClashingPrescriptions();
  }

  private HashMap<Medicine, Prescription> fillClashingPrescriptionsMap() {
    HashMap<Medicine, Prescription> clashingPrescriptions = new HashMap<>();
    for (Medicine aMedicine : medicines) {
      for (Prescription aPrescription : aMedicine.getPrescriptions()) {
        if (aPrescription.includesDate(dateToConsider)) {
          clashingPrescriptions.put(aMedicine, aPrescription);
        }
      }
    }
    return clashingPrescriptions;
  }

  private HashMap<Medicine, Prescription> printClashingPrescriptions() {
    HashMap<Medicine, Prescription> clashingPrescriptions = fillClashingPrescriptionsMap();
    System.out.println("The clashing prescriptions are : ");
    for (Medicine m : clashingPrescriptions.keySet()) {
      System.out.print("\n" + m.getName() + " : " + clashingPrescriptions.get(m).toString());
    }
    return clashingPrescriptions;
  }

  public void addMedicine(Medicine m) {
    medicines.add(m);
  }

  public Set<Medicine> getMedicines() {
    return medicines;
  }

}
