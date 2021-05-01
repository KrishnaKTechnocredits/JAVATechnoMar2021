/*Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d*/

package sangeeta.StringArrayPrograms;

import java.util.Scanner;

public class ReturnMiddleCharOfstring {

	void middleCharOfString(String[] strarr) {
		int length = 0;
		int mid = 0;
		char[] mChar = new char[strarr.length];
		for (int index = 0; index < strarr.length; index++) {
			String str = strarr[index];
			length = str.length();
			if (length % 2 == 0) {
				mid = length / 2 - 1;
				mChar[index] = str.charAt(mid);
			} else {
				mid = length / 2;
				mChar[index] = str.charAt(mid);
			}
		}
			System.out.println(mChar);

	}

	public static void main(String[] a) {
		ReturnMiddleCharOfstring returnMiddleCharOfstring = new ReturnMiddleCharOfstring();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		String[] str = new String[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < str.length; i++) {
			str[i] = scanner.next();
		}
		returnMiddleCharOfstring.middleCharOfString(str);
	}

}
