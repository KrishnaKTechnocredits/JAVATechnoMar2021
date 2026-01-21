package vaibhav.SelfStudy;

public class Display {
	
	void displayName (String name) {
		System.out.println("User Name is " + name);	
	}
	
	public static void main(String[] args) {
		Display display = new Display();
		display.displayName("Vaibhav");
	}
}
