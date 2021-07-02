package amrutaM.stringAssignments;

/*
Count Digits, Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/
public class CountAll {
	static void getCountOfAll(String input) {
		int digitCount = 0, letterCount = 0, upperCount = 0, lowerCount = 0, specialCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				digitCount++;
			else if (Character.isLetter(ch)) {
				letterCount++;
				if (Character.isUpperCase(ch))
					upperCount++;
				else if (Character.isLowerCase(ch))
					lowerCount++;
			} else
				specialCount++;
		}
		System.out.println("Total digits: " + digitCount);
		System.out.println("Total letters: " + letterCount);
		System.out.println("Total Uppercase: " + upperCount);
		System.out.println("Total Lowercase: " + lowerCount);
		System.out.println("Total Special Characters: " + specialCount);
	}

	public static void main(String[] args) {
		String input = "1rRpd3F9#K(E";
		getCountOfAll(input);
	}
}
