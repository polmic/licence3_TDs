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
    return mot + " : " + nbOccurences + " occurences.\n";
  }



}
