/*Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)*/

package rashmi.Assignment_18;

public class AsciiValOfChar {

	int getAsciiOfChar(char ch) {
		return ch;
	}

	public static void main(String[] args) {
		System.out.println("Ascii value  is " + new AsciiValOfChar().getAsciiOfChar('0'));
	}
}
