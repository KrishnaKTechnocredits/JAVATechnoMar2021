/*Java Assignment 32:  4th May 2021

program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

Hint : you can use subString method.

*/

package vaibhav.Assignment_32;

public class SwapTwoStingsWithoutTemp {

	public static void main(String[] args) {
		
		String str1 = "Techno";
		String str2 = "Credits";

		System.out.println("Before Swap");
		System.out.println("input 1 : " + str1);
		System.out.println("input 2 : " + str2);

		str1 = str2 + str1;								// CreditsTechno
		str2 = str1.substring(str2.length());			// Techno
		str1 = str1.substring(0,(str1.length() - str2.length()));	// Credits
		
		System.out.println("");
		System.out.println("After Swap without temparaty variable");
		System.out.println("input 1 : " + str1);
		System.out.println("input 2 : " + str2);

	}
}
