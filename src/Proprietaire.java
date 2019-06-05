import java.util.ArrayList;

public abstract class Proprietaire {

	protected String name;
	protected String adress;
	ArrayList<Compte> listeComptes;

	// ******** CONSTRUCTOR ********

	public Proprietaire(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
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

}
