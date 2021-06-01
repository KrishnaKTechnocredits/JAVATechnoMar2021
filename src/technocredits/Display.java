package technocredits;

public class Display {

	void displayName(String name) {
		System.out.println("User Name is: " + name);
		System.out.println("User Name is: " + name);
	}
	
	void m1(){
		System.out.print("Hi");
		System.out.println("Hello");
	}
	
	//a. HiHello
	//b. Hi
	// Hello

	public static void main(String[] args) {
		Display display = new Display();
		display.displayName("Krishna");
	}
}
