//Program 3:  write a method which will print ascii value of A to Z.

package rashmi.Assignment_18;

public class PrintAsciiValue {

	void display() {
		System.out.println("Ascii value of A to Z : \n");
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		new PrintAsciiValue().display();
	}
}
