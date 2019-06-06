
public final class LDD extends Epargne {

	public LDD(Proprietaire proprietaire, int solde) {
		super(proprietaire, solde);

	}

	@Override
	public int soldeMin() {
		return 15;
	}

	@Override
	public int soldeMax() {
		return 12_000;
	}

	@Override
	public float interets() {
		return 0.01f;
	}
	/*
	 * public boolean () if (debiter > soldeMin) { return String "
	 */
}
