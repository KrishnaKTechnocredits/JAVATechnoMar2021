package purva;

public class Display {
    void displayName(String name) {
    	System.out.println("name is"+name);
    }
    public static void main(String[] args) {
    	Display display = new Display();
    	display.displayName("Purva");
    }
}
