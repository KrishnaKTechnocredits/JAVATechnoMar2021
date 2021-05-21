package aashay.Test_1;
/*
 * Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */

public class Program1 {

	int[] targetSum(int[] arr, int targetNum) {
		
		int expectedNum[] = new int[2];
		for (int index = 0; index < arr.length; index++) {
		 	int firstIndex = arr[index];

			for (int innrIndex = 0; innrIndex < arr.length; innrIndex++) {
				if ((firstIndex + arr[innrIndex]) == targetNum) {
					expectedNum[0] = innrIndex;
					expectedNum[1] = index;
				}
			}
		}
		return expectedNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 program1 = new Program1();
		int[] arr = { 2, 11, 15, 7, 4 };
		int targetNum = 9;
		int expectedNum[] = new int[2];
		expectedNum = program1.targetSum(arr, targetNum);
		System.out.println("Output: [" + expectedNum[0] + "," + expectedNum[1] + "]");

	}

}
