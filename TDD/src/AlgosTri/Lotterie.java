package AlgosTri;

public class Lotterie {

  private final int NB_BOULES = 60;
  final int[] boules = new int[NB_BOULES];

  public Lotterie() {
    for (int i = 0 ; i < NB_BOULES ; i++)
      boules[i] = 0;
  }

  public void add(int valeurBoule) {
    boules[valeurBoule] = 1;
  }

  public String getBoulesTirees() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0 ; i < NB_BOULES ; i++)
      sb.append(boules[i] == 1 ? i + " " : "");
    return sb.toString();
  }

}
