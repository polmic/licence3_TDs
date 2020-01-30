package templatemethod;

import java.util.LinkedList;
import java.util.List;

public class MyString extends MyComparable{

  public MyString(List<Character> data) {
    this.data = data;
  }

  private List<Character> data;

  public MyString(String s) {
    this.data = new LinkedList<Character>();
    for (char c : s.toCharArray())
      data.add(Character.toLowerCase(c));
  }


  @Override
  public boolean egal(MyComparable mc) throws IncompatibleTypesException {
    testIncompatibleTypesException(mc);
    return sameSize((MyString) mc) && areCharactersEquals((MyString) mc);
  }

  @Override
  public boolean inferieur(MyComparable mc) throws IncompatibleTypesException {
    testIncompatibleTypesException(mc);
    MyString s = (MyString) mc;
    int minimalSize = data.size() < s.data.size() ? data.size() : s.data.size();
    for (int i = 0; i < minimalSize; i++) {
      if (data.get(i) < s.data.get(i))
        return true;
    }
    return isSizeSmaller(s);
  }

  private boolean sameSize(MyString s) {
    return s.data.size() == data.size();
  }

  private boolean areCharactersEquals(MyString s) {
    for (int i = 0; i < data.size(); i++) {
      if (data.get(i) != s.data.get(i))
        return false;
    }
    return true;
  }

  private boolean isSizeSmaller(MyString s) {
    return data.size() < s.data.size();
  }

  @Override
  public void testIncompatibleTypesException(MyComparable mc) {
    if (!(mc instanceof MyString))
      throw new IncompatibleTypesException("templatemethod.MyString non comparable avec " + mc.getClass());
  }
}
