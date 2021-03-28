package anubhav;

public class Display {
	
	void displayName (String name) {
		System.out.println("Username is " + name);
	}
	public static void main(String[] args) {
		Display display= new Display ();
		display.displayName("Anubhav");
		System.out.println("Welcom to the Technocredits.");
	}
}
