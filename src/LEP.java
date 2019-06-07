
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

	@Override
	public float interets() {
		return 0.015f;
	}

}
