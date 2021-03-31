package adwait;

public class TestDisplay {
	
	String name;

	void setName( String strName){
		name = strName;
	}
	void displayName(){
		System.out.println("User Name is: "+name);
	}
	
	public static void main(String[] args) {
		TestDisplay testDisplay = new TestDisplay();
		testDisplay.setName("Adwait");
		testDisplay.displayName();
	}
}
