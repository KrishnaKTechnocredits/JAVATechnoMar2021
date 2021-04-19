/*
Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.
 */

package ankit.assignment_24;

public class MiddleCharInString {
	
	char getMiddleCharacterInString(String str) {
		char middleChar = ' ' ;
		if (str.length() % 2 == 0) {
			middleChar = str.charAt((str.length()/2)-1);
		}else {
			middleChar = str.charAt(str.length()/2);
		}return middleChar;
	}
	 
	char[] getMiddleCharFromStringArray(String[] strArr) {
		char[] middleCharArr = new char[strArr.length];
		for (int index = 0 ; index < strArr.length ; index++) {
			middleCharArr[index] = getMiddleCharacterInString(strArr[index]);
		}return middleCharArr;
	}
	public static void main(String[] args) {
		MiddleCharInString middleCharInString = new MiddleCharInString();
		//String str = "Credits"; // Single string
		//middleCharInString.getMiddleCharacterInString(str); // method can be called if we want middle character fro a single string
		String[] strArr = {"Techno", "Hello", "Credits"};
		char[] charArr = middleCharInString.getMiddleCharFromStringArray(strArr);
		for (int index = 0 ; index < charArr.length ; index++) {
			System.out.print(charArr[index]+ " ");
		}
	}
}

