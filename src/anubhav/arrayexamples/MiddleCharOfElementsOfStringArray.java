package anubhav.arrayexamples;

/* Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d
Note:  for name having even length, consider length/2-1 index is middle character*/

public class MiddleCharOfElementsOfStringArray {

	char[] inputArray(String[] temp) {
		char[] outputArray = new char[10];
		int lengthOfArray = temp.length;
		for (int index = 0; index < lengthOfArray; index++) {
			String firstStringInArray = temp[index];
			int lengthOfString = firstStringInArray.length();
			if (lengthOfString % 2 == 0) {
				int evenLength = (lengthOfString / 2) - 1;
				outputArray[index] = firstStringInArray.charAt(evenLength);
			} else {
				int oddLength = lengthOfString/ 2;
				outputArray[index] = firstStringInArray.charAt(oddLength);
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		MiddleCharOfElementsOfStringArray middleCharOfElementsOfStringArray = new MiddleCharOfElementsOfStringArray();
		String[] temp = { "Techno", "Hello", "Credits" };
		middleCharOfElementsOfStringArray.inputArray(temp);
		char[] mc = middleCharOfElementsOfStringArray.inputArray(temp);
		System.out.println(mc);
	}
}
