public class Test {

	public static void main(String[] args) {

		Personne p1 = new Personne("Jean, Dupont", "1 rue des Peupliers", "10 Mai 2010");
		Societe s1 = new Societe("IKEA", "Knut Knut, Sweden", "Borg");
		Personne p2 = new Personne("Marcel, Paul", "1 rue des Troenes", "11 Juin 1954");

		CompteCourant c1 = new CompteCourant(p1, 100, 0);
		CompteCourant c2 = new CompteCourant(s1, 20_000, 0);
		LEP lep1 = new LEP(p1, 5000);

		/*
		 * c1.virement(45, lep1); System.out.println(lep1);
		 * 
		 * 
		 * System.out.println("-------------------------------------");
		 * 
		 * System.out.println(c2); System.out.println("Solde apres credit: " +
		 * c2.crediter(200)); System.out.println("Solde apres debit: " +
		 * c2.debiter(200));
		 * 
		 * System.out.println("-------------------------------------");
		 */

		// Creation d'une banque
		Banque banquePop = new Banque();

		// Ajout d'un compte dans la Banque banquePop

		banquePop.ajouterCompte(c1);

		banquePop.ajouterCompte(lep1);
		banquePop.ajouterCompte(c2);

		// c1.virement(30, c2);

		// Afficher le contenu de la Banque banquePop

		// banquePop.afficherComptes();

		System.out.println("-------------------------------------");

		// Ajout d'un proprietaire dans la Banque banquePop
		banquePop.ajouterProprietaire(p1);
		banquePop.ajouterProprietaire(p2);

		// Afficher le contenu de la Banque banquePop

		// banquePop.afficherProprietaires();
		lep1.appliquerInterets();

		System.out.println(lep1);

		System.out.println("-------------------------------------");

		// banquePop.listeProprietaire.rechercheNomProprio("Jean");

		System.out.println(c1 + "\nSolde apres debit: "); // + c1.debiter(200));
		p1.afficherComptes();

		System.out.println("-------------------------------------");
		for (Proprietaire p : banquePop.rechercheNomProprio("e")) {
			System.out.println(p);
		}

		System.out.println("-------------------------------------");
		for (Compte c : banquePop.listeCompte) {
			System.out.println(c);
		}

		System.out.println("-------------------------------------");
		for (Compte c : banquePop.afficherlisteComptesDecouvert()) {
			System.out.println(c);
		}

	}

}
