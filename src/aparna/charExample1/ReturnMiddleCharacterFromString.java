/*Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.
 */

package aparna.charExample1;

public class ReturnMiddleCharacterFromString {
	char middleCharacter;

	// finding middle character in given single Input String
	char getMiddleCharacterFromSingleString(String inputName) {

		if (inputName.length() % 2 == 0) {
			middleCharacter = inputName.charAt((inputName.length() / 2) - 1);
		} else {
			middleCharacter = inputName.charAt(inputName.length() / 2);
		}
		return middleCharacter;
	}

	// finding middle character in given Array of String
	char[] getMiddleCharacterFromStringArray(String[] inputNameArray) {
		char[] middleChar = new char[inputNameArray.length];
		for (int index = 0; index < inputNameArray.length; index++) {
			getMiddleCharacterFromSingleString(inputNameArray[index]);
			middleChar[index] = middleCharacter;
		}
		return middleChar;
	}

	public static void main(String[] args) {
		ReturnMiddleCharacterFromString returnMiddleCharacterFromString = new ReturnMiddleCharacterFromString();
		// String singleName = "Technocredits"; // Single Input Name
		// char middleCharInString =
		// returnMiddleCharacterFromString.getMiddleCharacterFromSingleString(singleName);
		// System.out.println(middleCharInString);

		String[] NameArray = { "Techno", "Hello", "Credits" };// Array of Input names
		char[] middleChar = returnMiddleCharacterFromString.getMiddleCharacterFromStringArray(NameArray);

		for (int index = 0; index < NameArray.length; index++) {
			System.out.println(
					"Middle character in a given Input name " + NameArray[index] + " is : " + middleChar[index]);
		}
	}
}
