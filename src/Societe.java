public class Societe extends Proprietaire {

	private String managerName;

	// CONSTRUCTOR

	public Societe(String name, String adress, String managerName) {
		super(name, adress);

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

}
