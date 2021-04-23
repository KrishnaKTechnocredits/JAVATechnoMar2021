/*Java Assignment 24:  18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
Output: c l d

Note: for name having even length, consider length/2-1 index is middle character.
*/

package vaibhav.Assignment_24;

public class MiddleChar {

	char getMiddleChar(String str) {
		int mCharIndex;

		if (str.length() % 2 == 0)
			mCharIndex = str.length() / 2 - 1;
		else
			mCharIndex = str.length() / 2;

		char ch = str.charAt(mCharIndex);
		return ch;
	}

	public static void main(String[] args) {
		MiddleChar middleChar = new MiddleChar();
		String[] arr = { "Techno", "Hello", "Credits" };
		char[] midChArr = new char[arr.length];

		for (int index = 0; index < arr.length; index++) {
			midChArr[index] = middleChar.getMiddleChar(arr[index]);
		}
		
		System.out.println("Output : " + midChArr[0] +" "+ midChArr[1] + " " + midChArr[2]);
	}
}
