import java.util.ArrayList;

public class Personne extends Proprietaire {

	private String birthDate;
	ArrayList<Compte> listeComptes;

	// CONSTRUCTOR

	public Personne(String name, String adress, String birthDate) {
		super(name, adress);
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
		return "Type de propriétaire: " + getClass() + "\nNom du proprietaire: " + name + "\nAdresse du proprietaire: "
				+ adress + "\nDate de naissance: " + birthDate + "\nNuméro de compte: ";
	}
}
