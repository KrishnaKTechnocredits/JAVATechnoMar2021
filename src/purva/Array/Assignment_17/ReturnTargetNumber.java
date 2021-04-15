/*
 * Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.
 */
package purva.Array.Assignment_17;

import java.util.Scanner;

public class ReturnTargetNumber {
	boolean isTargetNumberPresent(int[] numbers, int targetNumber) {
		for(int index=0;index<numbers.length;index++) {
			if(numbers[index]==targetNumber)
				return true;
		
		}
		return false;
	}

	public static void main(String[] args) {
		ReturnTargetNumber returnTargetNumber = new ReturnTargetNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size= scanner.nextInt();
		int[] numbers = new int[size];
		
		for(int index=0;index<numbers.length;index++) {
			System.out.println("enter number"+(index+1));
			numbers[index]= scanner.nextInt();
		}
		System.out.println("Enter targetNumber ");
		int targetNumber =scanner.nextInt();
		boolean value = returnTargetNumber.isTargetNumberPresent(numbers, targetNumber);
		if(value==true) 
			System.out.println("Number "+targetNumber+" is present in array");
		else
			System.out.println("Number "+targetNumber+" is not present in array");
		
		
	}
}
