package ExercicesTDD.StringCalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {

  public int add(String numbers) {
    int sum = 0;
    if (numbers != "") {
      String[] numbersTab = numbers.split("[/,\\n;]");
      ArrayList<Integer> negatives = new ArrayList<>();
      for (String s : numbersTab) {
        if (s != null || !s.isEmpty())
          try {
            int numberToAdd = Integer.parseInt(s.trim());
            sum += numberToAdd;
            if (numberToAdd < 0)
              negatives.add(numberToAdd);
          } catch (NumberFormatException e) {
          sum += 0;
        }
      }
      if (negatives.size() > 0)
        throw new RuntimeException("Negatives not allowed : " + negatives.toString());
    }
    return sum;
  }
}
