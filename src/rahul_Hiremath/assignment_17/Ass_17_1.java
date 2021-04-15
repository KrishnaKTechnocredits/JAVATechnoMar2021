/*Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3*/


package rahul_Hiremath.assignment_17;

import java.util.Scanner;

public class Ass_17_1 {

	void evenNoCount(int[] nums) {
		int count = 0;
		int totalNums = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Even count is: " + count);
		int odd = totalNums - count;
		System.out.println("Odd count is: " + odd);
	}

	public static void main(String[] args) {

		Ass_17_1 ass_17_1 = new Ass_17_1();
		int[] array1 = { 10, 23, 26, 27, 88, 87, 65 };
		ass_17_1.evenNoCount(array1);
	}
}
