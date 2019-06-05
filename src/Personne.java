import java.util.ArrayList;

public class Personne extends Proprietaire {

	private String birthDate;


	// CONSTRUCTOR

	public Personne(String name, String adress, String typeDeProprio, String birthDate) {
		super(name, adress, typeDeProprio);
		this.birthDate = birthDate;

	}


	// ******** GETTERS ********

	public String getBirthDate() {
		return birthDate;
	}

	// ********SETTERS ********

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Type de propriétaire: " + typeDeProprio + "\nNom du proprietaire: " + name + "\nAdresse du proprietaire: "
				+ adress + "\nDate de naissance: " + birthDate;
	}
}
