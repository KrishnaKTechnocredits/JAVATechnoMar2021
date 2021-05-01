package krishna.Assignment_17;

import java.util.Scanner;
/*
 Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
 */

public class MinArrayValue {
	int min(int[] number) {
		int minNum = number[0];
		for (int index = 1; index < number.length; index++) {
			if (minNum > number[index]) {
				minNum = number[index];
			}
		}
		return minNum;
	}

	public static void main(String[] args) {
		MinArrayValue minArrayValue = new MinArrayValue();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to give :");
		int count = scanner.nextInt();
		int[] number = new int[count];

		for (int index = 0; index < count; index++) {
			System.out.println("Enter the number :");
			number[index] = scanner.nextInt();
		}
		int manimumNumber = minArrayValue.min(number);
		System.out.println("The minimum number is :" + manimumNumber);

	}

}
