package prachi.Coding_Exam_10;

/*"Print the first non-repeated character of String.
Input : abcgbca
output : g"*/

public class GetFirstNonRepeatingChar {

	char getFirstNonRepeatedChar(String str) {
		char character = 0;
		for (int index = 1; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				character = ch;
				break;
			}
		}
		return character;
	}

	public static void main(String[] args) {
		GetFirstNonRepeatingChar character = new GetFirstNonRepeatingChar();
		char output = character.getFirstNonRepeatedChar("abcgbfca");
		System.out.println("1st nonRepeating character is: " + output);
	}
}


