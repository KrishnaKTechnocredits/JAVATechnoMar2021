package krishnaCodingTest_1;
/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
Input: nums = [2,11,15,7,4], target = 9
Output: [0, 3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3].
*/

import java.util.Scanner;

public class ReturnIndices {
	int outputindex[] = new int[2];

	int[] numAddTarget(int num[], int targetNum) {

		for (int index = 0; index < num.length; index++) {
			for (int i = index + 1; i < num.length; i++) {
				if (num[index] + num[i] == targetNum) {
					outputindex[0] = index;
					outputindex[1] = index + i;
				}
			}

		}
		return outputindex;
	}

	public static void main(String[] args) {
		ReturnIndices returnIndices = new ReturnIndices();
		Scanner scanner = new Scanner(System.in);
		int num[] = { 2, 11, 15, 7, 4 };
		System.out.println("Enter the target number :");
		int targetNum = scanner.nextInt();
		int[] outputindex = returnIndices.numAddTarget(num, targetNum);
		for (int index = 0; index < outputindex.length; index++) {
			System.out.println("output :" + outputindex[index]);
		}
	}
}
