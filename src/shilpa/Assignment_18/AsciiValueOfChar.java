/*Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
*/

package shilpa.Assignment_18;

public class AsciiValueOfChar {

	int getAsciiOfChar(char ch) {
		int Asccival = (int) ch;
		System.out.println("Ascii value of character " + ch + ":-" + Asccival);
		return Asccival;
	}

	public static void main(String[] args) {
		AsciiValueOfChar asciiValues = new AsciiValueOfChar();
		asciiValues.getAsciiOfChar('a');
	}
}
