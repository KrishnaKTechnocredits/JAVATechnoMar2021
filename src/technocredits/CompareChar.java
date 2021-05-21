package technocredits;

public class CompareChar {
	
	void display() {
		String output = "12489TCCTehnoredis";
		if(output.charAt(0) > output.charAt(1))
			System.out.println("Hi");
		else
			System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		new CompareChar().display();
	}
}
