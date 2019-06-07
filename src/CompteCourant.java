
public final class CompteCourant extends Compte {

	private int decouvert;

	/*
	 * public CompteCourant(Proprietaire proprietaire, int solde, int decouvert) {
	 * super(proprietaire, solde, 0);
	 * 
	 * }
	 */

	public CompteCourant(Proprietaire proprietaire, int solde, int decouvert) { // creer une exception ici
		super(proprietaire, solde);
		this.decouvert = decouvert;
	}

	// Creer un deuxieme constructeur ou on spc�cifie que le decouvert est a 0

	// ******** GETTERS ******

	public int getDecouvert() {
		return decouvert;
	}

	// ******** SETTERS ******

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	// EXCEPTION
	// Un retrait ou un virement qui d�passe le d�couvert autoris� sera refus�.

	// methode debiter a creer ici + exception
	// methode crediter a creer ici + exception

}
