package AlgosTri.TriBoules.TriPhrase;

import AlgosTri.TriBoules.MyIterator;
import AlgosTri.TriBoules.TriableParTables;

public class Phrase extends TriableParTables {

  private String message = "";

  public Phrase() {
    super(60);
  }

  public String toString() {
    String res = "";
    caracteresTiresDuMessage();

    MyIterator it = this.createIterator();
    while (it.hasNext()) {
      int i = it.next();
      for (int j = 0 ; j < this.nbOccurences(i) ; j++) {
        res += (char)('a' + i);
      }
    }
    return res;
  }

  private void caracteresTiresDuMessage() {
    for (int i = 0 ; i < message.length() ; i++) {
      char c = message.charAt(i);
      if (Character.isLetter(c)) {
        c = Character.toLowerCase(c);
        this.add(c);
      }
    }
  }

  public void setChaine(String s) {
    message = s;
  }

  private void add(char c) {
    this.addItem(c - 'a');
  }
}
