package sai.Assignment18;

/*
 * Program 4:  write a program which will print characters between ascii value 97 to 122.
 */

public class CharForValue {

	public static void main(String[] args) {
		CharForValue charForValue = new CharForValue();
		for (int i = 97; i <= 122; i++) {
			char value = (char) charForValue.getAsciiValues(i);
			System.out.println("The Character of Ascii Value of " + i + " is " + value);
		}

	}

	char getAsciiValues(int asciiValue) {
		return (char) asciiValue;
	}
}
