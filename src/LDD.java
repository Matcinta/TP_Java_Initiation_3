
public final class LDD extends Epargne {


	public LDD(Proprietaire proprietaire, int solde, String typeDeCompte, int soldeMax, int soldeMin, float interets) {
		super(proprietaire, solde, typeDeCompte, soldeMax, soldeMin, interets);
	}

	@Override
	public int decouvertAutorise() {
		return 0;
	}



/* public boolean ()
	if (debiter > soldeMin) {
		return String "
	 */
}
