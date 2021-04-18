/*Coding Exam - 1 : 18th April 2021

Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

package simmi.exam1;

public class ArrayInteger {
	int[] integerArray(int[] arr, int target) {
		//int[] output = new int[arr.length];
		for(int index = 0; index<arr.length; index++) {
			for(int innerIndex = 1;innerIndex < arr.length; innerIndex++ ) {
				int sum = arr[index]+arr[innerIndex];
			if(sum == target) {
				return new int[] {index,innerIndex};
			}
		}
		}
		return arr;
	}
	public static void main(String[] args) {
		ArrayInteger arrayInteger = new ArrayInteger();
		int[] arr = new int[] {2,11,15,7,4};
		int target = 9;
		int[] output = arrayInteger.integerArray(arr, target);
	System.out.println("["+ output[0]+ " " +output[1] + "]");
	}
}
