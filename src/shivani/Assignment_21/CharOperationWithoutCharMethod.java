package shivani.Assignment_21;
/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
With out using Char method
*/

public class CharOperationWithoutCharMethod {

	void countAll(String str) {
		int digitSum = 0;
		int letterSum = 0;
		int upperCaseSum = 0;
		int lowerCaseSum = 0;
		int SpecialCharSum = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				digitSum++;

			} else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				upperCaseSum++;
				letterSum++;

			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
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

		CharOperationWithoutCharMethod charOperation = new CharOperationWithoutCharMethod();
		charOperation.countAll("1rRpd3F9#K(E");

	}
}
