
import java.util.ArrayList;

public class TestArrayList {

  private ArrayList<Mot> mots = new ArrayList<>();

  public void ajouterMot(Mot m) {
    if (!mots.contains(m)) {
      mots.add(m);
      m.incrementer();
    } else {
      for (Mot m2 : mots)
        if (m.equals(m2))
          m2.incrementer();
    }
  }

  public void print() {
    StringBuilder sb = new StringBuilder();
    for (Mot m : mots)
      System.out.println(m.toString());
  }

  public static void main(String[] args) {
    TestArrayList tr = new TestArrayList();
    String[] motsStr = {"toto", "tuutu", "titii", "toto", "tata", "toto", "tuutu", "toto"};
    for (String s : motsStr)
      tr.ajouterMot(new Mot(s));
    tr.print();
  }

}
