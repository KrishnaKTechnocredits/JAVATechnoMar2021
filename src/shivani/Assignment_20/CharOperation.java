package shivani.Assignment_20;
/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

public class CharOperation {

	void countAll(String str) {
		int digitSum = 0;
		int letterSum = 0;
		int upperCaseSum = 0;
		int lowerCaseSum = 0;
		int SpecialCharSum = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				digitSum++;

			} else if (Character.isUpperCase(str.charAt(i))) {
				upperCaseSum++;
				letterSum++;

			} else if (Character.isLowerCase(str.charAt(i))) {
				lowerCaseSum++;
				letterSum++;
			}

			else {
				SpecialCharSum++;
				}
		}

		System.out.println("Toal digit :" + digitSum);
		System.out.println("Toatl letter :" + letterSum);
		System.out.println("Toatl Uppercase :" + upperCaseSum);
		System.out.println("Total LowerCase :" + lowerCaseSum);
		System.out.println("Total SpecailChar :" + SpecialCharSum);
	}

	public static void main(String[] argd) {

		CharOperation charOperation = new CharOperation();
		charOperation.countAll("1rRpd3F9#K(E");

	}
}
