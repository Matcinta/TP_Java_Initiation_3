import java.util.ArrayList;

public abstract class Proprietaire {

	protected String name;
	protected String adress;
	protected String typeDeProprio;


	// ******** CONSTRUCTOR ********

	public Proprietaire(String name, String adress, String typeDeProprio) {
		this.name = name;
		this.adress = adress;
		this.typeDeProprio = typeDeProprio;
	}

	// ******** GETTERS ********

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}

	public String getTypeDeProprio() {
		return typeDeProprio;
	}


	// ******** SETTERS ********


	public void setName(String name) {
		this.name = name;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setTypeDeProprio(String typeDeProprio) {
		this.typeDeProprio = typeDeProprio;
	}
}
