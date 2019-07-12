package templatemethod;

import java.awt.*;

public class MyColor extends MyComparable {

  private Color color;

  public MyColor(Color c) {
    this.color = c;
  }

  @Override
  public boolean egal(MyComparable mc) {
    testIncompatibleTypesException(mc);
    return ((MyColor) mc).color.getRGB() == this.color.getRGB();
  }

  @Override
  public boolean inferieur(MyComparable mc) {
    testIncompatibleTypesException(mc);
    return sommeRGB() < ((MyColor) mc).sommeRGB();
  }

  private int sommeRGB() {
    return color.getRed() + color.getGreen() + color.getBlue();
  }

  @Override
  public void testIncompatibleTypesException(MyComparable mc) {
    if (!(mc instanceof MyColor))
      throw new IncompatibleTypesException("Couleur non comparable avec " + mc.getClass());
  }

}
