package radha;

public class Display {

	void display(String name, int age) {
		System.out.println("Name is "+name+" and age is "+age);
	}
	
	public static void main(String[] args) {
		Display display1 = new Display();
		display1.display("Radha",25);
	}
}
