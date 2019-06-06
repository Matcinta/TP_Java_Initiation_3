
public final class LEP extends Epargne {

	public LEP(Personne personne, int solde) {
		super(personne, solde);

	}

	@Override
	public int soldeMin() {
		return 30;
	}

	@Override
	public int soldeMax() {
		return 7700;
	}

	// Le proprietaire du compte peut etre une societe ou une personne physique
	/*
	 * public boolean isSocieteOuPersonne() { if (proprietaire instanceof Societe) {
	 * return false; } return true; }
	 */

	@Override
	public float interets() {
		return 0.015f;
	}

}
