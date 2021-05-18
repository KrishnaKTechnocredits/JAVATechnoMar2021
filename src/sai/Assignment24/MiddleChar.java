package sai.Assignment24;

/*
 * Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.

 */

public class MiddleChar {

	public static void main(String[] args) {

		MiddleChar middleChar = new MiddleChar();
		String[] arr = { "Techno", "Hello", "Credits" };
		middleChar.middleCharacter(arr);
	}

	void middleCharacter(String[] words) {
		int charAtMiddle;
		for (int index = 0; index < words.length; index++) {
			if (words[index].length() % 2 == 0) {
				charAtMiddle = ((words[index].length() / 2) - 1);
			} else {
				charAtMiddle = ((words[index].length() / 2));
			}
			System.out.print(words[index].charAt(charAtMiddle));
		}
	}
}

