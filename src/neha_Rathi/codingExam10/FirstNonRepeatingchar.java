package neha_Rathi.codingExam10;

public class FirstNonRepeatingchar {

	static char nonRepeatingchar(String input) {
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
		System.out.println("Input string is: " + str);
		System.out.println("first non-repeated character in above input is: " + nonRepeatingchar(str));
	}
}
