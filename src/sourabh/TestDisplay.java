package sourabh;

public class TestDisplay {
	
    String name;
	
	void display() {
		System.out.println("Name is" + " " +name );
	}
	
	void input(String stuname) {
		name = stuname;
	}
	
	public static void main(String[] args) {
		TestDisplay testDisplay = new TestDisplay();
		testDisplay.input("Sourabh");
		testDisplay.display();
	}
}