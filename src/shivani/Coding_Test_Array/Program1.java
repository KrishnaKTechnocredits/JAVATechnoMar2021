package shivani.Coding_Test_Array;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

public class Program1 {

	int[] numbers(int[] arr, int tar) {

		for (int i = 0; i < arr.length; i++) {
			for (int index = i + 1; index < arr.length; index++) {
				if (arr[i] + arr[index] == tar) {
					return new int[] { i, index };
				}
			}
		}
		return new int[] {};

	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		int arr[] = { 2, 11, 15, 7, 4 };
		int[] getindex = program1.numbers(arr, 9);

		if (getindex.length == 2) {

			System.out.println(getindex[0] + "  " + getindex[1]);
		}

	}

}
