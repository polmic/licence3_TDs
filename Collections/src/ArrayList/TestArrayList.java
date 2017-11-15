package ArrayList;

import java.util.ArrayList;

public class TestArrayList {

  private ArrayList<Mot> mots = new ArrayList<>();

  public void ajouterMot(Mot m) {
    if (mots.contains(m))
      m.incrementer();
    else
      mots.add(m);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Mot m : mots)
      sb.append(m.toString());
    return sb.toString();
  }

  public static void main(String[] args) {
    TestArrayList tr = new TestArrayList();
    String[] motsStr = {"toto, tuutu, titii, toto, tata, toto, tuutu, toto"};
    for (String s : motsStr)
      tr.ajouterMot(new Mot(s));
    System.out.println(tr.toString());
  }

}
