
public class Test {

	public static void main(String[] args) {

		Personne p1 = new Personne("Jean, Dupont", "1 rue des Peupliers", "10 Mai 2010");

		CompteCourant c1 = new CompteCourant(p1, 1000, -100);

		System.out.println(p1);

		System.out.println(c1);

	}

}
