package monali.coding_exam_17;

import java.util.ArrayList;

public class TripletHavingMaximumSum {
	
	static int maxsum = 0;

	ArrayList<ArrayList<Integer>> getArrayListOfTriplet(int[] number) {
		ArrayList<ArrayList<Integer>> tripleList = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < number.length - 3; index++) {
			ArrayList<Integer> numberList = new ArrayList<Integer>();
			numberList.add(number[index]);
			numberList.add(number[index + 1]);
			numberList.add(number[index + 2]);
			int sum = number[index] + number[index + 1] + number[index + 2];
			if (sum > maxsum) {
				tripleList.clear();
				maxsum = sum;
				tripleList.add(numberList);
				sum = 0;
			}
		}

		return tripleList;
	}
	public static void main(String[] args) {
		TripletHavingMaximumSum triple = new TripletHavingMaximumSum();
		int[] number = { 1,10,2,3,1,11,4,2,1};
		ArrayList<ArrayList<Integer>> output = triple.getArrayListOfTriplet(number);
		System.out.println("Triplet having maximum sum of " + maxsum + " is " + output);
	}
}

