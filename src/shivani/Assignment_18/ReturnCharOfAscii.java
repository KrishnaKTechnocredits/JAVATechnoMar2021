package shivani.Assignment_18;

/*Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
*/
public class ReturnCharOfAscii {

	char getAsciiOfChar(int asciiValue) {
		System.out.println((char) asciiValue);

		return (char) asciiValue;
	}

	public static void main(String[] args) {
		ReturnCharOfAscii returnCharOfAscii = new ReturnCharOfAscii();
		returnCharOfAscii.getAsciiOfChar(100);
	}

}
