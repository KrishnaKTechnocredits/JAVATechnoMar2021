/*
Assignment 18 : 14th April'2021
Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
*/

package kapil.CharMethod;

public class AsciiValue {

	int getAsciiofChar(char ch) {

		System.out.println(+ch);
		return (int) ch;
	}

	public static void main(String[] args) {
		AsciiValue asciival = new AsciiValue();
		asciival.getAsciiofChar('K');

	}
}
