/*Java Assignment 18: 14th April 2021

Program 4:  write a program which will print characters between ascii value 97 to 122.

*/

package vaibhav.Assignment_18;

import java.util.Scanner;

public class PrintCharacter {

	void character(int startValue, int endValue) {
		
		if (startValue < endValue) {
			for (int index = startValue; index <=endValue; index++) {
				System.out.println("Character with ASCII value " + index + " is : " + (char)index);
			}
			
		}else if (startValue>endValue) {
			for (int index = endValue; index <= startValue;index++) {
				System.out.println("Character with ASCII value " + index + " is : " + (char)index);
			}
		}else
			System.out.println("Character with ASCII value " + startValue + " is : " + (char)startValue);
		
		
		
	}
	
	public static void main(String[] args) {
		PrintCharacter printCharacter = new PrintCharacter();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter starting ASCII value to find charater : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Please enter ending ASCII value to find charater : ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		printCharacter.character(num1, num2);
	}
	
}
