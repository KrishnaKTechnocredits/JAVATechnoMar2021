/*
Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
 */

package radha.CharacterMethods.Assignment18;

public class ReturnCharValue {
	char getAsciiOfChar(int asciiValue) {
		return (char)asciiValue;
	}
	
	public static void main(String[] args) {
		ReturnCharValue getCharValue = new ReturnCharValue();
		char retValue = getCharValue.getAsciiOfChar(99);
		System.out.println("The Character is "+retValue+".");
	}
}

/*
Output:

The Character is c.
 */
