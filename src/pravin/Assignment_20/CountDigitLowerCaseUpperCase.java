/*Assignment 20: 14th April'2021
1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2 */

package pravin.Assignment_20;
	
	public class CountDigitLowerCaseUpperCase {
		int uppercasecount = 0;
		int lowerCaseCount = 0;
		int digit = 0;
		int specialCharacter;
		void characterCount(String input) {
			for (int index = 0; index < input.length(); index++) {
				if (Character.isUpperCase(input.charAt(index)))
					uppercasecount++;
				else  if (Character.isLowerCase(input.charAt(index)))
					lowerCaseCount++;
				else if (Character.isDigit(input.charAt(index)))
					digit++;
			}
			specialCharacter = input.length()-(uppercasecount +lowerCaseCount+digit);
		}
		void display() {
			System.out.println("UpperCase cpunt : " +uppercasecount);
			System.out.println("LowerCase count : "+lowerCaseCount);
			System.out.println("Digit count: " +digit);
			System.out.println("Letter count is: " + (uppercasecount +lowerCaseCount));
			System.out.println("Special character count is: " +specialCharacter);
		}
		public static void main(String[] args) {
			CountDigitLowerCaseUpperCase countDigitLowerCaseUpperCase = new CountDigitLowerCaseUpperCase();
			countDigitLowerCaseUpperCase.characterCount("1rRpd3F9#K(E");
			countDigitLowerCaseUpperCase.display();
		}
	}
	
