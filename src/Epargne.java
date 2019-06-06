
public abstract class Epargne extends Compte {

	// CONSTRUCTOR

	public Epargne(Proprietaire proprietaire, int solde) {
		super(proprietaire, solde);

	}

	// Methodes abstraites a implementer dans les classes filles LDD et LEP
	public abstract int soldeMin();

	public abstract int soldeMax();

	public abstract float interets();

	public void appliquerInterets() {
		this.solde *= (1 + this.interets());
	}

}
