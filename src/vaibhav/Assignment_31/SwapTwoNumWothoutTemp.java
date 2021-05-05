/*Java Assignment 31:  4th May 2021

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.
*/

package vaibhav.Assignment_31;

import java.util.Scanner;

public class SwapTwoNumWothoutTemp {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number 1 : ");
		int num1 = scanner.nextInt(); // 10
		System.out.println("Enter Number 2 : ");
		int num2 = scanner.nextInt(); //15
		
		System.out.println("");
		System.out.println("Before Swap");
		System.out.println("Number 1 : " + num1);
		System.out.println("Number 2 : " + num2);

		 
		num1 = num1 + num2; // 10 + 15 = 25
		num2 = num1 - num2; // 25 - 15 = 10
		num1 = num1 - num2; // 25- 10 = 15 
		

		System.out.println("");
		System.out.println("After Swap without temparaty variable");
		System.out.println("Number 1 : " + num1);
		System.out.println("Number 2 : " + num2);

		scanner.close();
	}
	
}
