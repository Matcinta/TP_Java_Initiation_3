
public final class Personne extends Proprietaire {

	private String birthDate;

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
		return "\nNom du proprietaire: " + name + "\nAdresse du proprietaire: " + adress + "\nDate de naissance: "
				+ birthDate;
	}
}
