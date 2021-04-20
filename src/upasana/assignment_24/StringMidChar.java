/*
 Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note: for name having even length, consider length/2-1 index is middle character.
 */

package upasana.assignment_24;

public class StringMidChar {

	char[] midCharOfString(String[] arr) {
		char[] character = new char[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0) {
				int index1 = arr[index].length() / 2 - 1;
				character[index] = arr[index].charAt(index1);
			} else if (arr[index].length() % 2 != 0) {
					int index1 = arr[index].length() / 2;
					character[index] = arr[index].charAt(index1);
			}
		}
		return character;
	}
	public static void main(String[] args) {
		String[] arr = { "Techno", "Hello", "Credits" };
		char[] character = new StringMidChar().midCharOfString(arr);
		for (int index = 0; index < character.length; index++) {
			System.out.println(character[index]);
		}

	}
}
