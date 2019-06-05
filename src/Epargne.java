
public abstract class Epargne extends Compte {

	protected int plafond;
	protected int minimum;
	protected float interets;

	// CONSTRUCTOR

	public Epargne(Proprietaire proprietaire, int montant, int plafond, int minimum, float interets) {
		super(proprietaire, montant);
		this.plafond = plafond;
		this.minimum = minimum;
		this.interets = interets;
	}

	// ******** GETTERS ********

	public int getPlafond() {
		return plafond;
	}

	public float getInterets() {
		return interets;
	}

	public int getMinimum() {
		return minimum;
	}

	// ******** SETTERS ********

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public void setPlafond(int plafond) {
		this.plafond = plafond;
	}

	public void setInterets(float interets) {
		this.interets = interets;
	}

	// Le proprietaire du compte peut etre une societe ou une personne physique
	public abstract boolean isSocieteOuPersonne();
}
