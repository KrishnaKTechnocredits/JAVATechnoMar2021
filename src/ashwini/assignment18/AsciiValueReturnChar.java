package ashwini.assignment18;
/*
 Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)

 */

public class AsciiValueReturnChar {
	int asciiValues;
	char getAsciiOfChar(int asciiValue) {
		asciiValues = asciiValue;
		char ch = (char) asciiValue;
		System.out.println("The ASCII value " + asciiValue + " hold the character : " + ch); 
		return ch;
	}


	public static void main(String[] args) {
		AsciiValueReturnChar asciiValueReturnChar = new AsciiValueReturnChar();
		asciiValueReturnChar.getAsciiOfChar(65);
	}

}
