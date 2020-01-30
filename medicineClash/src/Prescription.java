import java.time.LocalDate;
import java.time.Period;

public class Prescription {
  private LocalDate dispenseDate;
  private long daysSupply;

  public Prescription(String dispenseDate, long daysSupply) {
    this.dispenseDate = LocalDate.parse(dispenseDate);
    this.daysSupply = daysSupply;
  }

  public boolean isOverlapping(Prescription prescription) {
    LocalDate prescriptionEnd = prescription.getPrescriptionEnd();
    return this.startsBeforeOrEquallyTo(prescriptionEnd) && prescription.startsBeforeOrEquallyTo(getPrescriptionEnd());
  }

  public boolean includesDate(LocalDate localDate) {
    return this.startsBeforeOrEquallyTo(localDate) && this.endsAfterOrEquallyTo(localDate);
  }

  private boolean endsAfterOrEquallyTo(LocalDate date) {
    return getPrescriptionEnd().isAfter(date) || getPrescriptionEnd().isEqual(date);
  }

  private boolean startsBeforeOrEquallyTo(LocalDate date) {
    return dispenseDate.isBefore(date) || dispenseDate.isEqual(date);
  }

  public void setDispenseDate(LocalDate dispenseDate) {
    this.dispenseDate = dispenseDate;
  }

  public LocalDate getDispenseDate() {
    return dispenseDate;
  }

  public LocalDate getPrescriptionEnd() {
    return dispenseDate.plusDays(daysSupply);
  }

  @Override
  public String toString() {
    return "\t" + "Dispense date : " + dispenseDate +
      " | Days of supply : " + daysSupply +
      " | Ends : " + dispenseDate.plusDays(daysSupply);
  }
}


