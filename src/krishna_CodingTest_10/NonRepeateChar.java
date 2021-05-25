/*Print the first non-repeated character of String.
Input : abcgbca
output : g*/

package krishna_CodingTest_10;
public class NonRepeateChar {

	char nonRepeatedChar(String givenStr) {
		char nonRepeatedChar = ' ';
		for (int index = 0; index < givenStr.length(); index++) {
			char ch = givenStr.charAt(index);
			if (givenStr.indexOf(ch) == givenStr.lastIndexOf(ch)) {
				nonRepeatedChar = ch;
				break;
			}
		}
		return nonRepeatedChar;
	}

	public static void main(String[] args) {
		NonRepeateChar nonRepeateChar = new NonRepeateChar();
		String str = "abcgbca";
		char nonRepeatedChar = nonRepeateChar.nonRepeatedChar(str);
		System.out.println("First Non-repeated character is: " + nonRepeatedChar);
	}
}
