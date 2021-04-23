/*Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character. */


package pravin.Assignment_24;

public class MiddleCharacterOfString {
	char[] getMiddleChar(String[] word) {
		char[] output = new char[3];
		int charcount = 0;
		for (int index = 0; index < word.length; index++) {
			if (word[index].length() % 2 == 0) {
				int index1 = word[index].length() / 2 - 1;
				output[charcount] = word[index].charAt(index1);
				charcount++;
			} else {
				if (word[index].length() % 2 != 0) {
					int index2 = word[index].length() / 2;
					output[charcount] = word[index].charAt(index2);
					charcount++;
				}
			}
		}
		return output;
	}
	public static void main(String[] args) {
		MiddleCharacterOfString middleCharacterOfString = new MiddleCharacterOfString();
		String[] arr = { "Techno", "Hello", "Credits" };
		char[] outputChar = middleCharacterOfString.getMiddleChar(arr);
		for (int index = 0; index < outputChar.length; index++) {
			System.out.println(outputChar[index]);
		}
	}
}