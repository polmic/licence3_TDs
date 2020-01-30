import java.util.ArrayList;
import java.util.List;

public class Medicine implements Comparable<Medicine> {

  private String name;
  private List<Prescription> prescriptions;

  public Medicine(String name) {
    this.name = name;
    this.prescriptions = new ArrayList<>();
  }

  public void addPrescription(Prescription toAdd) {
      prescriptions.add(toAdd);
  }

  public List<Prescription> getPrescriptions() {
    return prescriptions;
  }

  public String getName() {
    return name;
  }

  @Override
  public int compareTo(Medicine medicine) {
    return name.compareTo(medicine.name);
  }

  @Override
  public String toString() {
    return "[Medicine] - Prescriptions for " + name + " : " + prescriptions + "\n";
  }
}
