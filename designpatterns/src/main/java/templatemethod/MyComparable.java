package templatemethod;

public abstract class MyComparable {

  public abstract boolean inferieur(MyComparable mc);

  public abstract boolean egal(MyComparable mc);

  public abstract void testIncompatibleTypesException(MyComparable mc);

  public boolean inferieurOuEgal(MyComparable mc) {
    return inferieur(mc) || egal(mc);
  }

  public boolean superieur(MyComparable mc) {
    return !inferieurOuEgal(mc);
  }

  public boolean superieurOuEgal(MyComparable mc) {
    return superieur(mc) || egal(mc);
  }

}
