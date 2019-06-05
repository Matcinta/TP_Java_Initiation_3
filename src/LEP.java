
public abstract class LEP extends Compte {

	public LEP(Proprietaire proprietaire, int montant) {
		super(proprietaire, montant);

	}

	// Le proprietaire du compte peut etre une societe ou une personne physique
	public boolean isSocieteOuPersonne() {
		if (proprietaire instanceof Societe) {
			return false;
		}
		return true;
	}
}
