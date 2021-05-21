/*
 Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
 */
package priyanka_Panat.coding_exam_10;

public class FirstNonRepeatingChar {
	char printNonRepeatingChar(String input) {
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				ch = input.charAt(index);
				break;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		String inputStr = "abcgbca";
		System.out.println("First non repeating character from the given array is : "
				+ new FirstNonRepeatingChar().printNonRepeatingChar(inputStr));
	}
}
