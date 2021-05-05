/*Java Assignment 32:  4th May 2021

program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
*/

package vaibhav.Assignment_32;

import java.util.Scanner;

public class SwapTwoStingsWithTemp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter input 1 : ");
		String str1 = scanner.next();	// Techno
		System.out.println("Enter input 2 : ");
		String str2 = scanner.next();	// Credits

		System.out.println("");
		System.out.println("Before Swap");
		System.out.println("input 1 : " + str1);
		System.out.println("input 2 : " + str2);

		String temp;
		temp = str1;
		str1 = str2;
		str2 = temp;

		System.out.println("");
		System.out.println("After Swap with temparaty variable");
		System.out.println("input 1 : " + str1);
		System.out.println("input 2 : " + str2);

		scanner.close();

	}
}
