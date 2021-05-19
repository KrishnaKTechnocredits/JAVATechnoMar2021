/*
Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
*/

package sandesh.coding_exam_10;

public class PrintFirstNonRepeatedCharacter {

	private char getFirstNonRepeatedChar(String inputStr) {
		inputStr = inputStr.toLowerCase();
		char nonRepeatingChar = ' ';
		for (int index = 0; index < inputStr.length(); index++) {
			if (inputStr.indexOf(inputStr.charAt(index)) == inputStr.lastIndexOf(inputStr.charAt(index))) {
				nonRepeatingChar = inputStr.charAt(index);
				break;
			}
		}
		return nonRepeatingChar;
	}

	public static void main(String[] args) {
		String input = "abcgbca";
		char ch = new PrintFirstNonRepeatedCharacter().getFirstNonRepeatedChar(input);
		System.out.println("First non repeating character is -: " + ch);
	}
}
