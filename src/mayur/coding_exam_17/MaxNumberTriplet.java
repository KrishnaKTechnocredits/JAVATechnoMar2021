package mayur.coding_exam_17;

import java.util.ArrayList;

public class MaxNumberTriplet {
	static int max;

	ArrayList<ArrayList<Integer>> getMaxNumberTriplet(int[] arr) {
		ArrayList<ArrayList<Integer>> triplet = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < arr.length - 2; index = index + 3) {
			ArrayList<Integer> numberList = new ArrayList<Integer>();
			numberList.add(arr[index]);
			numberList.add(arr[index + 1]);
			numberList.add(arr[index + 2]);
			int sum = arr[index] + arr[index + 1] + arr[index + 2];
			if (sum > max) {
				triplet.clear();
				max = sum;
				triplet.add(numberList);
				sum = 0;
			}
		}
		return triplet;
	}

	public static void main(String[] args) {
		MaxNumberTriplet num = new MaxNumberTriplet();
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		ArrayList<ArrayList<Integer>> triplet = num.getMaxNumberTriplet(arr);
		System.out.println("Triplet having maximum sum of " + max + " is " + triplet);
	}
}
