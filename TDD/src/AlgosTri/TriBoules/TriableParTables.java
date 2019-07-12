package AlgosTri.TriBoules;

public abstract class TriableParTables {

  private int[] itemTries;

  public TriableParTables(int nbElements) {
    this.itemTries = new int[nbElements];
  }

  protected void addItem(int i) {
    this.itemTries[i] += 1;
  }

  protected int nbOccurences(int i) {
    return this.itemTries[i];
  }

  public MyIterator createIterator() {
    return new IteratorSurTable();
  }

  private class IteratorSurTable implements MyIterator {

    private int curseur = -1;

    @Override
    public boolean hasNext() {
      for (int i = curseur + 1 ; i < itemTries.length ; i++) {
        if (itemTries[i] != 0) {
          return true;
        }
      }
      return false;
    }

    @Override
    public int next() {
      for (int i = 0 ; i < itemTries.length ; i++) {
        if (itemTries[i] != 0) {
          curseur = i;
        }
      }
      return 0;
    }

  }

}
