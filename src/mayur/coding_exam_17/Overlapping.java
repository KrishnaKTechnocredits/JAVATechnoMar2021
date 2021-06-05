package mayur.coding_exam_17;

import java.util.ArrayList;

public class Overlapping {
	static int max;

	ArrayList<ArrayList<Integer>> getOverlapping(int[] arr) {
		ArrayList<ArrayList<Integer>> triplet = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < arr.length - 3; index++) {
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
		Overlapping overlapping = new Overlapping();
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<ArrayList<Integer>> triplet = overlapping.getOverlapping(arr);
		System.out.println("Triplet having maximum sum of " + max + " is " + triplet);
	}
}
