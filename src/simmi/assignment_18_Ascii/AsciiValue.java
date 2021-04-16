/*Assignment 18 : 14th April'2021

Program 3:  write a method which will print ascii value of A to Z.
*/
package simmi.assignment_18_Ascii;

public class AsciiValue {
	void printAsciiValue() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int character = ch;
			System.out.println("ASCII value of " + ch + " is " + character);
		}
	}

	public static void main(String[] args) {
		AsciiValue asciiValue = new AsciiValue();
		asciiValue.printAsciiValue();
	}

}
