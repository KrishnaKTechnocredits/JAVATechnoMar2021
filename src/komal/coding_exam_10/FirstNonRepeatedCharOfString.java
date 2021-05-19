package komal.coding_exam_10;

/*Print the first non-repeated character of String.
Input : abcgbca
output : g*/
public class FirstNonRepeatedCharOfString {
	static char nonRepeatingChar(String input) {
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
		System.out.println("Input String Is: " + str);
		System.out.println("First Non-Repeated Character of String is : " + nonRepeatingChar(str));
	}
}
