import java.util.ArrayList;

public class Societe extends Proprietaire {

	private String managerName;

	// CONSTRUCTOR


	public Societe(String name, String adress, String typeDeProprio, String managerName) {
		super(name, adress, typeDeProprio);
		this.managerName = managerName;
	}

	// ******** GETTERS ********
	public String getManagerName() {
		return managerName;
	}

	// ******** SETTERS ********
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Type de proprietaire: Societe" +
				"\nNom du gerant: " + managerName + "\nNom de la societe: " + name + "\nAdresse de la societe: " + adress;
	}
}
