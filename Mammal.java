public class Mammal {
	String name;

	// Constructor
	public Mammal () {
		setName("Mammal");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.toUpperCase();
	}
}
