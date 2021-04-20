package komal.coding_exam_1;

import java.util.Scanner;

/*
 * Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
Input: nums = [2,11,15,7,4], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */
public class ReturnIndices {

		int num;

		void indices(int[] array, int target) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 1; j < array.length; j++) {
					int sum = array[i] + array[j];
					if (sum == target) {
						num = 1;
						System.out.println("[" + i + "," + j + "]");
					}
				}
			}
			if (num == 0)
				System.out.println("Indices cant be found for "  +target);
		}

		public static void main(String[] args) {
			ReturnIndices ReturnIndices = new ReturnIndices();
			int[] inputArray = { 2, 11, 15, 7, 4 };
			System.out.println("Please enter target number");
			Scanner scanner = new Scanner(System.in);
			int target = scanner.nextInt();
			ReturnIndices.indices(inputArray, target);
			scanner.close();
		}
	}