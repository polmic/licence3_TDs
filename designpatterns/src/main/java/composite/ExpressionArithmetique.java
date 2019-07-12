package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class ExpressionArithmetique {

  List<ExpressionArithmetique> expressions;

  public ExpressionArithmetique() {
    this.expressions = new ArrayList<ExpressionArithmetique>();
  }

  public void add(ExpressionArithmetique e) {
    expressions.add(e);
  }

  public abstract int evaluate();

}
