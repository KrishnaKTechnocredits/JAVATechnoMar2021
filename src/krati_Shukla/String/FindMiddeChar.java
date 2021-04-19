//Create a method which will return middle character of each String. Print output in main method.

package krati_Shukla.String;

public class FindMiddeChar {

	void MiddleChar(String[] input) {

		char[] outputStr = new char[6];
		int length = input.length;
		for (int index = 0; index < length; index++) {
			String str = input[index];
			int newLength = str.length();

			if (newLength % 2 == 0) {
				int evenLength = (newLength / 2) - 1;
				outputStr[index] = str.charAt(evenLength);
			} else
				outputStr[index] = str.charAt(newLength / 2);
			System.out.println(outputStr[index]);

		}

	}

	public static void main(String[] a) {
		FindMiddeChar findMiddleChar = new FindMiddeChar();
		String[] str = { "Techno", "Hello", "Credits" };
		findMiddleChar.MiddleChar(str);
	}

}
