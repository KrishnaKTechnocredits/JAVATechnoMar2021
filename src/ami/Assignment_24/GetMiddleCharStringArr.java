/*
 Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.

 */

package ami.Assignment_24;

public class GetMiddleCharStringArr {

	char[] returnMiddleChar(String[] arr) {
		char[] output = new char[arr.length];
		int outputIndex = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0) {
				outputIndex = arr[index].length() / 2 - 1;
				output[index] = arr[index].charAt(outputIndex);
			} else if (arr[index].length() % 2 != 0) {
				outputIndex = arr[index].length() / (2);
				output[index] = arr[index].charAt(outputIndex);
			}

		}
		return output;
	}

	public static void main(String[] args) {
		GetMiddleCharStringArr getMiddleCharStringArr = new GetMiddleCharStringArr();
		String[] name = { "Techno", "Hello", "Credits" };
		char[] letters = getMiddleCharStringArr.returnMiddleChar(name);
		for (int index = 0; index < letters.length; index++) {
			System.out.println("The middle letters of the names are : " + letters[index]);
		}
	}
}
