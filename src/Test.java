import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Proprietaire p1 = new Personne("Jean, Dupont", "1 rue des Peupliers", "Personne", "10 Mai 2010");
		Proprietaire s1 = new Societe("IKEA", "Knut Knut, Sweden","Societe", "Borg");

		Compte c1 = new CompteCourant(p1, 1000, "Compte Courant");
		Compte c2 = new CompteCourant(s1, 20_000, "Compte Courant");


		System.out.println(c1 + "\nSolde apres debit: " + c1.debiter(200)+ "\nDecouvert autorise: "+ c1.decouvertAutorise());

		System.out.println("\n"+ c2);
		System.out.println("Solde apres credit: " + c2.crediter(200));
		System.out.println("Solde apres dedit: " + c2.debiter(200));

		System.out.println();




	}

}
