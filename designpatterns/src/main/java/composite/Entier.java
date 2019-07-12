package composite;

public class Entier extends ExpressionArithmetique {

  private int value;

  public Entier(int i) {
    this.value = i;
  }

  public int evaluate() {
    return this.value;
  }

}
