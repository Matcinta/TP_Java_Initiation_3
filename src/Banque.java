import java.util.ArrayList;

public final class Banque {

	ArrayList<Proprietaire> listeProprietaire;
	ArrayList<Compte> listeCompte;

	public Banque() {
		super();

		this.listeProprietaire = new ArrayList<>();
		this.listeCompte = new ArrayList<>();
	}

	// ******** GETTERS ******

	public ArrayList<Proprietaire> getListeProprietaire() {
		return listeProprietaire;
	}

	public ArrayList<Compte> getListeCompte() {
		return listeCompte;
	}

	// ****** SETTERS ******

	public void setListeProprietaire(ArrayList<Proprietaire> listeProprietaire) {
		this.listeProprietaire = listeProprietaire;
	}

	public void setListeCompte(ArrayList<Compte> listeCompte) {
		this.listeCompte = listeCompte;
	}

	// *********************************************

	// Ajoute un compte dans la banque

	public void ajouterCompte(Compte compte) {
		listeCompte.add(compte);
	}

	// Afficher les comptes enregistres dans la banque

	public void afficherComptes() {
		for (int i = 0; i < listeCompte.size(); i++) {
			System.out.println(listeCompte.get(i));
		}
	}

	// Ajoute un compte dans la banque

	public void ajouterProprietaire(Proprietaire proprietaire) {
		listeProprietaire.add(proprietaire);
	}

	// Afficher les proprietaires enregistres dans la banque

	public void afficherProprietaires() {
		for (int i = 0; i < listeProprietaire.size(); i++) {
			System.out.println(listeProprietaire.get(i));
		}
	}

	// Appliquer les interets sur les comptes Epargne une fois par an
	public void appliquerInterets(Epargne epargne) {

	}

	// Écrire une méthode de recherche d'un propriétaire par son nom ou une partie
	// de son nom
	public ArrayList<Proprietaire> rechercheNomProprio(String name) {
		ArrayList<Proprietaire> listeProprioParNoms = new ArrayList<>();
		for (int i = 0; i < this.listeProprietaire.size(); i++) {
			if (this.listeProprietaire.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
				listeProprioParNoms.add(this.listeProprietaire.get(i));
			}
		}
		return listeProprioParNoms;
	}

	// Écrire une méthode retournant tous les comptes à découvert

	public ArrayList<Compte> afficherlisteComptesDecouvert() {
		ArrayList<Compte> listeComptesDecouvert = new ArrayList<>();
		for (int i = 0; i < this.listeCompte.size(); i++) {
			if (this.listeCompte.get(i).getSolde() < 0) {
				listeComptesDecouvert.add(this.listeCompte.get(i));
			}
		}
		return listeComptesDecouvert;
	}

	// Écrire une méthode retournant la somme détenue par un propriétaire donné

}
