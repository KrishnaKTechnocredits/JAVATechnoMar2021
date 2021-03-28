package neha_Rathi;

public class TestDisplay {
	String name;
	
	void studentInfo(String name) {
		this.name=name;
	}
	
	void display() {
		System.out.println("This is first code in git done by "+name);
	}

	public static void main(String[] args) {
		TestDisplay testDisplay = new TestDisplay();
		testDisplay.studentInfo("Neha");
		testDisplay.display();
	}

}
