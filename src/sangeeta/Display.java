package sangeeta;

public class Display {
	
	void displayName(String name) {
		System.out.println(" User name is "+ name);
		System.out.println(" User name is "+ name);	
	}
	
	public static void main(String[] args) {
		Display display = new Display();
		display.displayName("Krishna");
	}
}
