//Program 5: return true if you find a target number from given array else return false.

package krati_Shukla.Array;

import java.util.Scanner;

public class ReturnTargetNumber {
	
	boolean isNumberFound(int[] input, int target) {
		boolean flag = false;
		for(int index=0; index<input.length; index++) {
			if (input[index] == target)
				flag = true;
		}
		return flag;
	}
	
	public static void main(String[] a) {
		ReturnTargetNumber returnTargetNumber = new ReturnTargetNumber();
		int[] input = {10,23,23,44,23,10,23,4,23};
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number to be found ");
		int target = scanner.nextInt();
		
		boolean flag = returnTargetNumber.isNumberFound(input, target);
		if (flag)
			System.out.println("Number "+target+" was found in array");
		else
			System.out.println("Number "+target+" was not found in array");
		
	}

}
