import java.util.Scanner;

public class Tableau {
	
	private int[] tab;
	private int n;
	
	public Tableau(int N) {
		this.tab = new int[N];
		this.n = 0;
	}

	// lit une suite de valeurs terminée par un marqueur
	// et les charge dans un tableau tab d'au plus N éléments
	// édite aussi dans n le nombre de valeurs chargées dans tab
	public void lireValeurs() {
    int marqueur;
    int valeur;
    Scanner sc = new Scanner(System.in);
    System.out.println("valeur du marqueur de fin :");
    marqueur = sc.nextInt();
    do {
      System.out.println("saisir une valeur");
      valeur = sc.nextInt();
      if (valeur != marqueur && n != tab.length)
        ajouterValeur(valeur);
    } while (valeur != marqueur);
	}
	
	// insère la valeur v dans le tableau tab au rang n
	private void ajouterValeur(int v) {
	  assert(n != tab.length);
      tab[n] = v;
      n++;
	}
	
	// écrit les valeurs lues du tableau tab
	public String toString() {
		String res = "";
		for (int i = 0; i < this.n; i++)
			res += "tab[" + i + "] = " + tab[i] + "\n";	
		return res;
	}

	public static void main (String[] args) {
		System.out.println("nombre d'éléments du tableau :");
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
		Tableau tab = new Tableau(nb);
		tab.lireValeurs();
		System.out.println(tab);
		sc.close();
	}
	
}
