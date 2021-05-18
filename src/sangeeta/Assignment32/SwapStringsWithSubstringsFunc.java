/*program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"


Hint : you can use subString method.*/

package sangeeta.Assignment32;

import java.util.Scanner;

public class SwapStringsWithSubstringsFunc {

	void swapStrings(String str1, String str2) {
		str1 = str1 + str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println("First string = " + str1);
		System.out.println("Second string = " + str2);
	}

	public static void main(String[] a) {
		SwapStringsWithTemp swapStringsWithTemp = new SwapStringsWithTemp();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = scanner.next();
		System.out.println("Enter second string");
		String str2 = scanner.next();
		swapStringsWithTemp.swapStrings(str1, str2);
	}
}
