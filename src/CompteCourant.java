
public final class CompteCourant extends Compte {

	//Un compte courant dispose d'un découvert autorisé qui peut être variable. Par défaut ce découvert autorisé est de 0€.
	/*private int decouvert;*/

	public CompteCourant(Proprietaire proprietaire, int solde, String typeDeCompte /*, int decouvert*/) {
		super(proprietaire, solde, typeDeCompte);
		//this.decouvert = 0;
	}

	// ******** GETTERS ******

	/*public int getDecouvert() {
		return decouvert;
	}*/

	// ******** SETTERS ******

	/*public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}*/

	public int decouvertAutorise (){
		return -100;
	}



	// Un retrait ou un virement qui dépasse le découvert autorisé sera refusé.
	/* public boolean isAccepted(){
		if (crediter() || virement < this.decouvert){
			return crediter || virement;
		}
		return false;
	}*/
}
