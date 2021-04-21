/*Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.*/
package prashant.Assignment_24;

public class MiddleCharStr {

	char printmiddlechar(String Str) {
		char middlechar;
		if (Str.length() % 2 == 0) {
			int mid = (Str.length() - 1) / 2;
			middlechar = Str.charAt(mid);
		} else {
			int mid = Str.length() / 2;
			middlechar = Str.charAt(mid);
		}
		return middlechar;
	}

	public static void main(String[] args) {
		MiddleCharStr midChar = new MiddleCharStr();
		String[] strarr = { "Techno", "Hello", "Credits" };
		for (int i = 0; i < strarr.length; i++) {
			char ch = midChar.printmiddlechar(strarr[i]);
			System.out.println("Middle Char of " + "" + strarr[i] + "  word in Given array is " + ch);
		}
	}
}
