package aashay.Test_10;
/*
 * Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
 */

public class FirstNonDuplicateChar {

	char nonDuplicateChar(String input) {
		char singleChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			singleChar = input.charAt(index);
			if (input.indexOf(singleChar) == input.lastIndexOf(singleChar)) {
				break;
			}
			singleChar = input.charAt(index);
		}
		return singleChar;
	}

	public static void main(String[] args) {
		FirstNonDuplicateChar firstNonDuplicateChar = new FirstNonDuplicateChar();
		String input = "abcgbca";
		char singleChar = firstNonDuplicateChar.nonDuplicateChar(input);
		System.out.print("First single character from given string abcgbca is: " + singleChar);

	}

}
