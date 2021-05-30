/*
Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17
*/

package sandesh.coding_exam_17;

import java.util.ArrayList;

public class TripletHavingMaximumSumOverlapping_ArrayList {

	private String getMaxTriplet(int[] inputArray) {
		int sum = 0;
		ArrayList<ArrayList<Integer>> outputArrayList = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < inputArray.length - 2; index++) {
			if (sum < (inputArray[index] + inputArray[index + 1] + inputArray[index + 2])) {
				sum = inputArray[index] + inputArray[index + 1] + inputArray[index + 2];
				ArrayList<Integer> numList = new ArrayList<Integer>();
				numList.add(inputArray[index]);
				numList.add(inputArray[index + 1]);
				numList.add(inputArray[index + 2]);
				outputArrayList.add(numList);
			}
		}
		return outputArrayList.get(outputArrayList.size() - 1) + " -> " + sum;
	}

	public static void main(String[] args) {
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		String listOfTripletsOut = new TripletHavingMaximumSumOverlapping_ArrayList().getMaxTriplet(input);
		System.out.println("Triplet having maximum sum is -: ");
		System.out.println(listOfTripletsOut);
	}
}
