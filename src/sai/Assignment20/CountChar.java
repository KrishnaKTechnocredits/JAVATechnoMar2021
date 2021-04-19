package sai.Assignment20;

/*
 * 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

 */

public class CountChar {

	public static void main(String[] args) {
		String name = "1rRpd3F9#K(E";
		CountChar countChar = new CountChar();
		countChar.countAll(name);
		System.out.println("Total digit " + digitCount);
		System.out.println("Total letters " + (upperCount + lowerCount));
		System.out.println("Total Uppercase " + upperCount);
		System.out.println("Total LowerCase " + lowerCount);
		System.out.println("Total special char " + specialCharCount);
	}

	static int upperCount = 0, lowerCount = 0, digitCount = 0, specialCharCount = 0;

	void countAll(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				digitCount++;
			} else if (Character.isUpperCase(ch)) {
				upperCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCount++;
			} else {
				specialCharCount++;
			}

		}
	}
}