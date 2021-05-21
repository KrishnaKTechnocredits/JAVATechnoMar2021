/*Java Assignment 31:  4th May 2021

program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
*/

package vaibhav.Assignment_31;

import java.util.Scanner;

public class SwapTwoNumWithTemp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number 1 : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter Number 2 : ");
		int num2 = scanner.nextInt();
		
		System.out.println("");
		System.out.println("Before Swap");
		System.out.println("Number 1 : " + num1);
		System.out.println("Number 2 : " + num2);

		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("");
		System.out.println("After Swap with temparaty variable");
		System.out.println("Number 1 : " + num1);
		System.out.println("Number 2 : " + num2);

		scanner.close();
	}
}
