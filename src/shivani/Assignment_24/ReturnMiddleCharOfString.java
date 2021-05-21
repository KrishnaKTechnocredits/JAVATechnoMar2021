package shivani.Assignment_24;
/*Create a method which will return middle char of each string .Print output in main method.
String[] arr = {"Techno","Hello","Credits"};
op: c|d*/

public class ReturnMiddleCharOfString {

	char[] returnChar(String[] arr) {
		char[] midCharArray = new char[arr.length];
		for (int index = 0; index < arr.length; index++) {
			int strLength = arr[index].length();
			for (int innerIndex = 0; innerIndex < strLength; innerIndex++) {
				if (strLength % 2 == 0)
					midCharArray[index] = arr[index].charAt(((strLength / 2) - 1));
				else
					midCharArray[index] = arr[index].charAt((strLength / 2));
			}
		}

		return midCharArray;
	}

	public static void main(String[] args) {
		ReturnMiddleCharOfString returnMiddleCharOfString = new ReturnMiddleCharOfString();
		String[] arr = { "Techno", "Hello", "Credits" };
		char[] midcharArray = returnMiddleCharOfString.returnChar(arr);
		System.out.println("Mid char of names in provided array is: ");
		for (int index = 0; index < midcharArray.length; index++) {
			System.out.println(midcharArray[index]);
		}
	}
}
