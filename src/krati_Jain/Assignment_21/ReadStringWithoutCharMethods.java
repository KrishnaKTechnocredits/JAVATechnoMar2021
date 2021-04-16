/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E*/

package krati_Jain.Assignment_21;

public class ReadStringWithoutCharMethods {

	static int digitCount;
	static int upperCount;
	static int lowerCount;
	static int specialCount;
	static int letterCount;

	public static void main(String[] args) {
		ReadStringWithoutCharMethods ReadStringCharacters = new ReadStringWithoutCharMethods();

		String inputString = "1rRpd3F9#K(E*";
		ReadStringCharacters.readString(inputString);
		System.out.println("Total Digits: " + digitCount + "\nTotal Letters: " + letterCount + "\nTotal Uppercase: "
				+ upperCount + "\nTotal Lowercase: " + lowerCount + "\nTotal Special char: " + specialCount);

	}

	void readString(String inputString) {

		for (int index = 0; index < inputString.length(); index++) {
			char stringToChar = inputString.charAt(index);
			if (stringToChar >= 'A' && stringToChar <= 'Z') {
				upperCount++;
				letterCount++;
			} else if (stringToChar >= 'a' && stringToChar <= 'z') {
				lowerCount++;
				letterCount++;
			} else if (stringToChar >= '0' && stringToChar <= '9')
				digitCount++;
			else
				specialCount++;

		}
	}

}
