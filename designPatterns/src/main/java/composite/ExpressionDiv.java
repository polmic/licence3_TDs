package composite;

public class ExpressionDiv extends ExpressionArithmetique {

  public int evaluate() {
    int result = 0;
    for (ExpressionArithmetique e : expressions) {
      try {
        result /= e.evaluate();
      } catch (ArithmeticException ae) {
        System.out.println(ae.getMessage());
      }
    }
    return result;
  }

}
