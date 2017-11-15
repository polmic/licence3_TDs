public class Mot {

  private String mot;
  private int nbOccurences;

  public Mot(String mot) {
    this.mot = mot;
    this.nbOccurences = 0;
  }

  public void incrementer() {
    nbOccurences++;
  }

  public String toString() {
    return mot + " : " + nbOccurences + " occurence(s).";
  }

  @Override
  public boolean equals(Object o) {
    Mot mot1 = (Mot) o;
    return mot1.getClass() == getClass() && mot.equals(mot1.mot);
  }

  @Override
  public int hashCode() {
    int result = mot != null ? mot.hashCode() : 0;
    result = 31 * result + nbOccurences;
    return result;
  }
}
