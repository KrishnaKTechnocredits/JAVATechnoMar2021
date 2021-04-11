/*Java Assignment 17: 10th April 2021

Program 5: return true if you find a target number from given array else return false.

input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
if(arr[index] == target)
}*/

package vaibhav.Assignment_17;

import java.util.Scanner;

public class TargetNumPresence {

	int tCount;

	boolean isNumberPresent(int[] arr, int targetNum) {

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == targetNum)
				tCount++;
		}

		if (tCount > 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		int[] numArr = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };
		int targetNum;
		
		TargetNumPresence targetNumPresence = new TargetNumPresence();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter target number to find in given array : ");
		targetNum = scanner.nextInt();
		scanner.close();
		
		boolean isNumPresent = targetNumPresence.isNumberPresent(numArr, targetNum);

		if (isNumPresent == true)
			System.out.println("Number " + targetNum + " found in given array");
		else
			System.out.println("Number " + targetNum + " doesnt found in given array");
	}
}
