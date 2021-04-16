package sai.Assignment18;

/*
 * Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)

 */


public class ReturnCharForAscii {

	char getAsciiOfChar(int asciiValue) {
		char ch = (char) (asciiValue);
		return ch;
	}

	public static void main(String[] args) {
		ReturnCharForAscii returnCharForAscii = new ReturnCharForAscii();
		char ch = returnCharForAscii.getAsciiOfChar(89);
		System.out.println("Character for given ascii is " + ch);
	}

}
