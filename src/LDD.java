
public final class LDD extends Epargne {

	public LDD(Proprietaire proprietaire, int solde) { // creer une exception ici
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

	// methode debiter a creer ici + exception
	// methode crediter a creer ici + exception

}
