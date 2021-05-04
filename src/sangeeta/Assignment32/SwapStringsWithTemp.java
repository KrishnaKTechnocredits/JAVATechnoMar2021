/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

package sangeeta.Assignment32;

import java.util.Scanner;

public class SwapStringsWithTemp {

	void swapStrings(String str1, String str2) {
		String temp = str1;
		str1 = str2;
		str2 = temp;
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
