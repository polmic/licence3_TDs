package AlgosTri.TriBoules.TriBoules;

import AlgosTri.TriBoules.MyIterator;
import AlgosTri.TriBoules.TriableParTables;

public class Lotterie extends TriableParTables {

  public Lotterie() {
    super(60);
  }

  public String toString() {
    MyIterator it = createIterator();
    String res = "";
    while (it.hasNext()) {
      int i = it.next();
      if (!res.equals(""))
        res += " ";
      res += i;
    }
    return res;
  }

  public void add(int valeurBoule) {
    this.addItem(valeurBoule);
  }

}
