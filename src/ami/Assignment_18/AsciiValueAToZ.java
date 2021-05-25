/*

Program 3:  write a method which will print ascii value of A to Z.

 */

package ami.Assignment_18;

public class AsciiValueAToZ {

	void printAsciiValue() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int character = ch;
			System.out.println("ASCII value of " + ch + " is " + character);
		}
	}

	public static void main(String[] args) {
		AsciiValueAToZ value = new AsciiValueAToZ();
		value.printAsciiValue();

	}

}
