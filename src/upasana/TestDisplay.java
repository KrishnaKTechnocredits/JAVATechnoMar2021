package upasana;

public class TestDisplay {
	String sname;
	
	void display() {
		System.out.println("Name is" +" " +sname );
	}
	
	void input(String name) {
		sname = name;
	}
	
	public static void main(String[] args) {
		TestDisplay testDisplay = new TestDisplay();
		testDisplay.input("Upasana");
		testDisplay.display();
	}
}
