/*Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)*/

package rashmi.Assignment_18;

public class CharacterOfAsciiValue {

	char getAsciiOfChar(int asciiValue) {
		return (char)asciiValue;
	}

	public static void main(String[] args) {
		System.out.println("Character of given Ascii value is " + new CharacterOfAsciiValue().getAsciiOfChar(90));
		
	}
}
