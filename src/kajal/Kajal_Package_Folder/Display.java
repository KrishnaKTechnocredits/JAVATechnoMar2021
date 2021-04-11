package kajal.Kajal_Package_Folder;

public class Display {
	
	void displayName(String name) {
		System.out.println("Username is: " + name);
	}
	
	public static void main(String [] args) {
		Display display = new Display();
		display.displayName("Kajal");
	}
}
