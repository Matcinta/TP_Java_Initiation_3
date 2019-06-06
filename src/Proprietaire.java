import java.util.ArrayList;

public abstract class Proprietaire {

	protected String name;
	protected String adress;
	ArrayList<Compte> listeCompte;

	// ******** CONSTRUCTORS ********

	public Proprietaire(String name, String adress) {
		this.name = name;
		this.adress = adress;

		this.listeCompte = new ArrayList<>();
	}

	// ******** GETTERS ********

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}

	// ******** SETTERS ********

	public void setName(String name) {
		this.name = name;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public ArrayList<Compte> getListeCompte() {
		return listeCompte;
	}

	public void afficherComptes() {
		for (int i = 0; i < this.listeCompte.size(); i++) {
			System.out.println(listeCompte.get(i));
		}
	}
}
