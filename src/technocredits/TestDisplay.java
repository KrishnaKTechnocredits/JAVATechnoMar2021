package technocredits;

public class TestDisplay {
	String name;

	void setName(String stdName) {
		name = stdName;
	}

	void display() {
		System.out.println("Student name is " + name);
	}

	public static void main(String[] args) {
		TestDisplay testDisplay = new TestDisplay();
		testDisplay.setName("Technocredits");
		testDisplay.display();
	}
}
