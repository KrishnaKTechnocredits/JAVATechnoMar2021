package monika;

public class TestDisplay {
	String name;
	
	void inputName(String inputName) {
		name = inputName;
	}
	
	void displayName() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		TestDisplay testDisplay = new TestDisplay();
		testDisplay.inputName("Monika Kaul");
		testDisplay.displayName();
	}
}
