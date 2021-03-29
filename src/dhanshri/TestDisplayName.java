package dhanshri;

public class TestDisplayName {
	String name;
	
	
	void displayName(String name) {
		System.out.println("test name is "+name);
	}
	
	public static void main(String[] args) {
		TestDisplayName testDisplayName = new TestDisplayName();
	    testDisplayName.displayName("Dhanshri");
	}
}