
public abstract class Epargne extends Compte {

	protected int soldeMax;
	protected int soldeMin;
	protected float interets;

	// CONSTRUCTOR

	public Epargne(Proprietaire proprietaire, int solde, String typeDeCompte, int soldeMax, int soldeMin, float interets) {
		super(proprietaire, solde, typeDeCompte);
		this.soldeMax = soldeMax;
		this.soldeMin = soldeMin;
		this.interets = interets;
	}


	// ******** GETTERS ********

	public int getSoldeMax() {
		return soldeMax;
	}

	public float getInterets() {
		return interets;
	}

	public int getSoldeMin() {
		return soldeMin;
	}

	// ******** SETTERS ********

	public void setInterets(float interets) {
		this.interets = interets;
	}

}
