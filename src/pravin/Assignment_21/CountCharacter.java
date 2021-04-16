/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2 */

package pravin.Assignment_21;

public class CountCharacter {
	int uppercasecount = 0;
	int lowerCaseCount = 0;
	int digit = 0;
	int specialCharacter;
	void charCount(String input) {
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			if (ch >= 65 && ch <= 90)
				uppercasecount++;
			else if (ch >= 97 && ch <= 122)
				lowerCaseCount++;
			else if (ch >= 48 && ch <= 57)
				digit++;
			else
				specialCharacter++;
		}
	}
	void display() {
		System.out.println("UpperCase cpunt : " + uppercasecount);
		System.out.println("LowerCase count : " + lowerCaseCount);
		System.out.println("Digit count: " + digit);
		System.out.println("Letter count is: " + (uppercasecount + lowerCaseCount));
		System.out.println("Special character count is: " + specialCharacter);
	}
	public static void main(String[] args) {
		CountCharacter countCharacter = new CountCharacter();
		countCharacter.charCount("1rRpd3F9#K(E");
		countCharacter.display();
	}
}
