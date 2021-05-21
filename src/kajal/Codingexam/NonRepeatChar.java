/*
/*Print the first non-repeated character of String.
Input : abcgbca
output : g
*/
package kajal.Codingexam;

public class NonRepeatChar {
	char NonrepeatChar(String input) {
		char nonRepeatChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				nonRepeatChar = input.charAt(index);
				break;
			}
		}
		return nonRepeatChar;
	}

	public static void main(String[] args) {
		String input = "abcgbca";
		char output = new NonRepeatChar().NonrepeatChar(input);
		System.out.println("Non Repeated char is: " + output);

	}
}
