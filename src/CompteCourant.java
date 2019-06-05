
public class CompteCourant extends Compte {

	private int decouvert;

	public CompteCourant(Proprietaire proprietaire, int montant, int decouvert) {
		super(proprietaire, montant);
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

}
