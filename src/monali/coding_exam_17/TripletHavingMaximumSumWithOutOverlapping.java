package monali.coding_exam_17;

import java.util.ArrayList;

public class TripletHavingMaximumSumWithOutOverlapping {

	static int maxsum = 0;

	ArrayList<ArrayList<Integer>> tripletHavingMaxSum(int[] number) {
		ArrayList<ArrayList<Integer>> tripleList = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < number.length - 2; index++) {
			ArrayList<Integer> numberList = new ArrayList<Integer>();
			numberList.add(number[index]);
			numberList.add(number[index + 1]);
			numberList.add(number[index + 2]);
			int sum = number[index] + number[index + 1] + number[index + 2];
			if (sum >= maxsum) {
				tripleList.clear();
				maxsum = sum;
				tripleList.add(numberList);
				sum = 0;
			}
		}

		return tripleList;
	}

	public static void main(String[] args) {
		TripletHavingMaximumSumWithOutOverlapping triple = new TripletHavingMaximumSumWithOutOverlapping();
		int[] number = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		ArrayList<ArrayList<Integer>> output = triple.tripletHavingMaxSum(number);
		System.out.println("Triplet having maximum sum of " + maxsum + " is " + output);
	}

}
