/*
 Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)

*/

package ami.Assignment_18;

public class ReturnChartoAscii {

	char getAsciiOfChar(int asciiValue) {
		char ch = (char) asciiValue;
		return ch;
	}

	public static void main(String[] args) {
		ReturnChartoAscii Returnchar = new ReturnChartoAscii();
		String asciiValue = null;
		char ch = Returnchar.getAsciiOfChar(Integer.parseInt("50"));
		System.out.println("Character value is: " + ch);
	}
}
