/* Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note: for name having even length, consider length/2-1 index is middle character.   */

package amruta.Assignment_24;

public class GetMiddleChar {

	char[] getmiddlecharofstring(String[] str) {

		char[] arrayMidChar = new char[str.length];

		for (int index = 0; index < str.length; index++) {

			int strLength = str[index].length();

			for (int innerIndex = 0; innerIndex < strLength; innerIndex++) {
				if (strLength % 2 == 0)
					arrayMidChar[index] = str[index].charAt(((strLength / 2) - 1));
				else
					arrayMidChar[index] = str[index].charAt((strLength / 2));
			}
		}
		return arrayMidChar;
	}

	public static void main(String[] args) {
		GetMiddleChar findchar = new GetMiddleChar();

		String[] str = { "Techno", "Hello", "Credits" };

		char[] arrayMidChar = findchar.getmiddlecharofstring(str);

		System.out.println("Mid char of strings in given array is: ");

		for (int index = 0; index < arrayMidChar.length; index++) {
			System.out.println(arrayMidChar[index]);
		}
	}
}
