/*return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
if(arr[index] == target)*/


package simmi.assignment_17_Array;

import java.util.Scanner;

public class Target {
	boolean isTargetNumber(int targetValue) {
		int[] arr = {10,23,23,44,23,10,23,4,23};
		for(int index=0; index<arr.length;index++) {
			if(arr[index] == targetValue) {
				return true; 
			}
		}
				return false;
	}
	
	public static void main(String[] args) {
		Target target = new Target();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the target value");
		int targetValue = scanner.nextInt();
		boolean isTarget= target.isTargetNumber(targetValue);
		if(isTarget == false)
			System.out.println(" Number "+targetValue+" doesn't found in given array");
		else
			System.out.println(" Number "+targetValue+" found in given array");
		scanner.close();
	}

}
