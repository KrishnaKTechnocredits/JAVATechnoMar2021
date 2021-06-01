package sai.codingexam17;

import java.util.ArrayList;

public class Triplet2 {

	int maxSum;

	ArrayList<ArrayList<Integer>> tripletMaxSum(int[] arr) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < arr.length - 3; index++) {
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
		Triplet2 t2 = new Triplet2();
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1};
		System.out.println("Maximum sum of triplet when allowing overlapping is " + t2.tripletMaxSum(arr) + " " + t2.maxSum);
	}
}
