package pavan;

	public class TestDisplay {

	static	String name;
	
	void setDetails(String hername){
		name=hername;
	}
	
	void display() {
		System.out.println("name of the student is "+ name);
	}
		
	public static void main (String[]args) {
		TestDisplay testDisplay= new TestDisplay();
				testDisplay.setDetails("Nayomi");
				testDisplay.display();
	}		
	
}
