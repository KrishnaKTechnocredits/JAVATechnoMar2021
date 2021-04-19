package pallavi.Assignment_20;

/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

public class CountDiffChar {

	static int countDigit = 0, countU = 0, countL = 0, countSpecialChar = 0;

	void count(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				countDigit++;
			}

			else if (Character.isUpperCase(ch)) {
				countU++;
			}

			else if (Character.isLowerCase(ch)) {
				countL++;
			}

			else {
				countSpecialChar++;
			}
		}
	}

	public static void main(String[] args) {
		String name = "1rRpd3F9#K(E";
		new CountDiffChar().count(name);
		System.out.println("Total digit " + countDigit);
		System.out.println("Total letters " + (countU + countL));
		System.out.println("Total Uppercase " + countU);
		System.out.println("Total LowerCase " + countL);
		System.out.println("Total special char " + countSpecialChar);

	}

}
