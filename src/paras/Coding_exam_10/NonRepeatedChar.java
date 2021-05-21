/*
Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
 */
package paras.Coding_exam_10;

public class NonRepeatedChar {

	void printFirstNonRepeatedChar(String input) {
		char nonRepeatedch = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				nonRepeatedch = ch;
				break;
			}
		}
		System.out.println("First non-repeated character of String is: " + nonRepeatedch);
	}

	public static void main(String[] args) {
		NonRepeatedChar nonRepeatedChar = new NonRepeatedChar();
		nonRepeatedChar.printFirstNonRepeatedChar("abcgbca");
	}
}
