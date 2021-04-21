/*Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
 */

package radha.CharacterMethods.Assignment18;

public class ReturnAscii {
	int getAsciiOfChar(char ch) {
		return ch;
	}
	
	public static void main(String[] args) {
		ReturnAscii returnAsciiValue = new ReturnAscii();
			int value = returnAsciiValue.getAsciiOfChar('H');
			System.out.println("ASCII value of H is "+value);
	}
}

/*
Output:

ASCII value of H is 72
 */
