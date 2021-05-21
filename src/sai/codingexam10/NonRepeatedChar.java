package sai.codingexam10;

public class NonRepeatedChar {

	static char firstNonRepeatingChar(String input) {
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
		String str = "abcgbca";
		System.out.println("First non repeated character is: " + firstNonRepeatingChar(str));
	}

}
