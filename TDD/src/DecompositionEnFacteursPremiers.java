import java.util.ArrayList;
import java.util.List;

public class DecompositionEnFacteursPremiers {
  List<Integer> factors;

  public List<Integer> compute(int n) {
    factors = new ArrayList<>();
    int facteurPremier = 2;
    while (n > 1) {
      while (n % facteurPremier == 0) {
        factors.add(facteurPremier);
        n /= facteurPremier;
      }
      facteurPremier++;
    }
    return factors;
  }

}