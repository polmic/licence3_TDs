package composite;

public class ExpressionMoins extends ExpressionArithmetique {

  public int evaluate() {
    int result = 0;
    for (ExpressionArithmetique e : expressions) {
      result -= e.evaluate();
    }
    return result;
  }

}
