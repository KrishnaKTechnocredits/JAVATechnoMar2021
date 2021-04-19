/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

package rahul_Hiremath.exam_1;

import java.util.Scanner;

public class Exam1_Prog1 {

	int flag;

	void indices(int[] array, int target) {
		for (int index = 0; index < array.length; index++) {
			for (int j = 1; j < array.length; j++) {
				int sum = array[index] + array[j];
				if (sum == target) {
					flag = 1;
					System.out.println("[" + index + "," + j + "]");
				}
			}
		}
		if (flag == 0)
			System.out.println("Indices cant be found for "  +target);
	}

	public static void main(String[] args) {
		Exam1_Prog1 exam1_Prog1 = new Exam1_Prog1();
		int[] inputArray = { 2, 11, 15, 7, 4 };
		System.out.println("Please enter target number");
		Scanner scanner = new Scanner(System.in);
		int target = scanner.nextInt();
		exam1_Prog1.indices(inputArray, target);
		scanner.close();
	}
}
