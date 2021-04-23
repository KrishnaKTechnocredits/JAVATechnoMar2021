package pallavi.Assignment_24;

/*
Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};

Note: for name having even length, consider length/2-1 index is middle character.
output : c l d*/

public class ReturnMiddleCharOfString {

	char[] findMiddleChar(String[] array) {
		char[] output = new char[array.length];

		for (int index = 0; index < array.length; index++) {
			int midLength = 0;
			String name = array[index];
			if (name.length() % 2 == 0) {
				midLength = name.length() / 2 - 1;
				output[index] = name.charAt(midLength);
			} else {
				midLength = name.length() / 2;
				output[index] = name.charAt(midLength);
			}

		}
		return output;

	}

	public static void main(String[] args) {
		String[] arr = { "Techno", "Hello", "Credits" };
		ReturnMiddleCharOfString returnMiddleCharOfString = new ReturnMiddleCharOfString();
		char[] array = returnMiddleCharOfString.findMiddleChar(arr);
		for (int index1 = 0; index1 < array.length; index1++) {
			System.out.print(array[index1]);
			System.out.print(" ");
		}

	}

}
