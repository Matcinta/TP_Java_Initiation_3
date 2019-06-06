
public abstract class Compte {

	protected Proprietaire proprietaire;
	protected final int numCompte;
	protected int solde;
	protected String typeDeCompte;

	private static int compteur = 441; // on peut initialiser directement dans les variables static

	// ******** CONSTRUCTOR ********
	public Compte(Proprietaire proprietaire, int solde /* , String typeDeCompte */) {
		super();
		this.proprietaire = proprietaire;
		this.numCompte = compteur++;
		this.solde = solde;
		// this.typeDeCompte = typeDeCompte;
		this.proprietaire.getListeCompte().add(this);
	}

	// ******** GETTERS ******

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public int getSolde() {
		return solde;
	}

	public double getNumCompte() {
		return numCompte;
	}

	// ******** SETTERS ********

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return proprietaire + "\nType de compte: " + typeDeCompte + "\nNuméro de compte: " + numCompte + "\nSolde: "
				+ solde;
	}

	public int crediter(int montant) {
		this.solde = montant + this.solde;
		return solde;
	}

	public int debiter(int montant) throws Exception {
		if (this.solde - montant < 0) {
			throw new Exception("Erreur, le solde est insuffisant!");
		}
		return solde = solde - montant;
	}

	// Un virement effectué entre deux comptes ayant le même propriétaire est
	// gratuit, alors qu'un virement effectué entre deux comptes de propriétaires
	// différents est facturé 1€ (au compte débité).

	public void virement(int montant, Compte compte) throws Exception {

		int taxe = 0;
		if (this.proprietaire.equals(compte.getProprietaire())) {
			taxe = 1;

		}
		this.debiter(montant);
		compte.crediter(montant);

	}

}
