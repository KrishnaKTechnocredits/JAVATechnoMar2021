package dhanshri.Assignment_17;

import java.util.Scanner;

public class BooleanTargetNum {

	boolean targetNum(int[] input, int target) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] == target) {
				System.out.println("Target number is present in the array");
				return true;
			}
		}
		System.out.println("Target number is not present in given array");
		return false;
	}

	public static void main(String[] args) {
		BooleanTargetNum booleanTargetNum = new BooleanTargetNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array lenth:");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("enter elements of an  array");

		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Enter target number: ");
		int tNum = scanner.nextInt();
		scanner.close();
		booleanTargetNum.targetNum(array, tNum);

	}
}
