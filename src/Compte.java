
public abstract class Compte {

	protected Proprietaire proprietaire;
	protected final int numCompte; // Le numero de compte est non modifiable donc final et on supprime le setter (?)
	protected int solde;
	protected String typeDeCompte;

	private static int compteur = 441;

	// ******** CONSTRUCTOR ********
	public Compte(Proprietaire proprietaire, int solde, String typeDeCompte) {
		super();
		this.proprietaire = proprietaire;
		this.numCompte = compteur++;
		this.solde = 0;
		this.typeDeCompte = typeDeCompte;
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

	public abstract int decouvertAutorise ();

	public int crediter(int montant){
		this.solde = montant + this.solde;
		return solde;
	}


	public int debiter(int montant){
		return solde = solde - montant;
	}
	// Un virement effectué entre deux comptes ayant le même propriétaire est
	//gratuit, alors qu'un virement effectué entre deux comptes de propriétaires
	//différents est facturé 1€ (au compte débité).

	/*public int virement(int montant){
		if ( compte A  ){
			return solde
		}
		return solde;
	}*/
}
