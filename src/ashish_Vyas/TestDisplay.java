package ashish_Vyas;

public class TestDisplay {
	String name;
	
	void setName(String stdName) {
		name =stdName;
	}
	void display() {
		System.out.println(name);
	}

	public static void main(String[] ar) {
		TestDisplay testDisplay = new TestDisplay();
		testDisplay.setName("Ashish");
		testDisplay.display();
	}
}
