/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

package rashmi.CodingTest1;

import java.util.Scanner;

public class NumberArray {

	int[] indicesOfNum(int[] num, int targetNum) {
		int returnArray[] = new int[2];
		for (int index = 0; index < num.length; index++) {

			for (int innerIndex = 0; innerIndex < num.length; innerIndex++) {

				if (index != innerIndex) {
					if (targetNum == num[index] + num[innerIndex]) {

						returnArray[0] = index;
						returnArray[1] = innerIndex;

					}
				}
			}
		}

		return returnArray;
	}

	public static void main(String[] args) {
		int num[] = { 2, 11, 15, 7, 4 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target number ");
		int targetNum = sc.nextInt();
		int[] returnIndicesArray = new NumberArray().indicesOfNum(num, targetNum);
		for (int index = 0; index < returnIndicesArray.length; index++) {
			System.out.print(returnIndicesArray[index] + " ");
		}
		sc.close();
	}

}
