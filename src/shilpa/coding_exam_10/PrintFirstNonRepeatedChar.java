/*Programming Test - 10 : 19th May'2021 (12 mins) 
Print the first non-repeated character of String.
Input : abcgbca
output : g
*/
package shilpa.coding_exam_10;

public class PrintFirstNonRepeatedChar {
	char getFirstNonRepeatedChar(String str) {
		char FirstNonRepeatingCHar = 0;
		for (int index1 = 1; index1 < str.length(); index1++) {
			char ch = str.charAt(index1);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				FirstNonRepeatingCHar = ch;
				break;
			}
		}
		return FirstNonRepeatingCHar;
	}

	public static void main(String[] args) {
		PrintFirstNonRepeatedChar printFirstNonRepeatedChar = new PrintFirstNonRepeatedChar();
		char output = printFirstNonRepeatedChar.getFirstNonRepeatedChar("abcgbfca");
		System.out.println("First Non repeating character is:- " + output);

	}

}
