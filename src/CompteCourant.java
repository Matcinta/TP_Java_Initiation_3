
public final class CompteCourant extends Compte {

	private int decouvert;

	/*
	 * public CompteCourant(Proprietaire proprietaire, int solde, int decouvert) {
	 * super(proprietaire, solde, 0);
	 * 
	 * }
	 */

	public CompteCourant(Proprietaire proprietaire, int solde, int decouvert) {
		super(proprietaire, solde);
		this.decouvert = decouvert;
	}

	// ******** GETTERS ******

	public int getDecouvert() {
		return decouvert;
	}

	// ******** SETTERS ******

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	// EXCEPTION
	// Un retrait ou un virement qui dépasse le découvert autorisé sera refusé.

	/*
	 * public boolean isAccepted() { if (debiter() || virement() > this.decouvert) {
	 * return crediter || virement; } return false; }
	 */

}
