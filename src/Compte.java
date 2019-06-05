
public abstract class Compte {

	protected Proprietaire proprietaire;
	protected double numCompte;
	protected int montant;

	private static int compteur = 1;

	// ******** CONSTRUCTOR ********
	public Compte(Proprietaire proprietaire, int montant) {
		super();
		this.proprietaire = proprietaire;
		this.numCompte = compteur++;
		this.montant = montant;
	}

	// ******** GETTERS ******

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public int getMontant() {
		return montant;
	}

	public double getNumCompte() {
		return numCompte;
	}

	// ******** SETTERS ********

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	public void setNumCompte(double numCompte) {
		this.numCompte = numCompte;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "\nType de propriétaire du compte: " + proprietaire + "\nNuméro de compte: " + numCompte + "\nMontant: "
				+ montant;
	}

}
