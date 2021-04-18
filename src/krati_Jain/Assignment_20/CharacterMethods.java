/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
Input: 1rRpd3F9#K(E*/

package krati_Jain.Assignment_20;

public class CharacterMethods {

	static int digitCount;
	static int upperCount;
	static int lowerCount;
	static int specialCount;
	static int letterCount;

	public static void main(String[] args) {
		String inputStr = "1rRpd3F9#K(E";
		CharacterMethods charMethod = new CharacterMethods();
		charMethod.readingString(inputStr);
		System.out.println("Total Digits: " + digitCount + "\nTotal Letters: " + letterCount + "\nTotal Uppercase: "
				+ upperCount + "\nTotal Lowercase: " + lowerCount + "\nTotal Special char: " + specialCount);

	}

	void readingString(String inputStr) {
		int index = 0;
		for (index = 0; index < inputStr.length(); index++) {
			char stringToChar = inputStr.charAt(index);
			if (Character.isDigit(stringToChar))
				digitCount++;
			else if (Character.isLowerCase(stringToChar)) {
				lowerCount++;
				letterCount++;
			} else if (Character.isUpperCase(stringToChar)) {
				upperCount++;
				letterCount++;
			} else
				specialCount++;
		}
	}

}
