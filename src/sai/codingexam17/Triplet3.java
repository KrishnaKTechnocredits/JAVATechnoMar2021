package sai.codingexam17;

/*
 * Overlapping is not allowed but used Arraylist
 */

import java.util.ArrayList;

public class Triplet3 {

	int maxSum;
	ArrayList<ArrayList<Integer>> tripletMaxSum(int[] arr) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < arr.length - 2; index = index + 3) {
			ArrayList<Integer> number = new ArrayList<Integer>();
			number.add(arr[index]);
			number.add(arr[index + 1]);
			number.add(arr[index + 2]);
			int sum = arr[index] + arr[index + 1] + arr[index + 2];
			if (sum > maxSum) {
				output.clear();
				maxSum = sum;
				output.add(number);
			}
		}
		return output;

	}

	public static void main(String[] args) {
		Triplet3 t3 = new Triplet3();
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		System.out.println("Maximum sum of triplet without allowing overlapping is "  + t3.tripletMaxSum(arr) + " " + t3.maxSum);
	}
}
