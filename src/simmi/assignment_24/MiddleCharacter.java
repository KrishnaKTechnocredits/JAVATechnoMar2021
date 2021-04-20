/*Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note: for name having even length, consider length/2-1 index is middle character.*/

package simmi.assignment_24;

public class MiddleCharacter {
	char[] middleCharacterName(String[] name) {
		char[] output = new char[name.length];
		int outputIndex = 0;
		for (int index = 0; index < output.length; index++) {
			if (name[index].length() % 2 == 0) {
				outputIndex = name[index].length() / 2 - 1;
				output[index] = name[index].charAt(outputIndex);
			} else if (name[index].length() % 2 != 0) {
				outputIndex = name[index].length() / 2;
				output[index] = name[index].charAt(outputIndex);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		MiddleCharacter middleCharacter = new MiddleCharacter();
		String[] name = { "Techno", "Hello", "Credits" };
		char[] letters = middleCharacter.middleCharacterName(name);
		for (int index = 0; index < letters.length; index++) {
			System.out.println("The middle letters of the names are " + letters[index]);
		}

	}

}
