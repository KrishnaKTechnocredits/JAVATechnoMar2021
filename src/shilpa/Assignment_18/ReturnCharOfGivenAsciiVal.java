/*Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
*/

package shilpa.Assignment_18;

public class ReturnCharOfGivenAsciiVal {

	char getAsciiOfChar(int asciiVal) {
		char ch = (char) asciiVal;
		System.out.println("Number " + asciiVal + " represents Character" + "'" + ch + "'");
		return ch;
	}

	public static void main(String[] args) {
		ReturnCharOfGivenAsciiVal CharOfGivenAsciiVal = new ReturnCharOfGivenAsciiVal();
		CharOfGivenAsciiVal.getAsciiOfChar(80);
	}
}
