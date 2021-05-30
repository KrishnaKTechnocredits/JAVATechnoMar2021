/*
Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 3,1,11 -> 15
*/

package sandesh.coding_exam_17;

import java.util.ArrayList;

public class TripletHavingMaximumSumUnevenInput_ArrayList {

	private String getMaxTriplet(int[] inputArray) {
		int sum = 0;
		ArrayList<ArrayList<Integer>> listOfOutput = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < (inputArray.length - (inputArray.length % 3)); index = index + 3) {
			if (sum < inputArray[index] + inputArray[index + 1] + inputArray[index + 2]) {
				sum = inputArray[index] + inputArray[index + 1] + inputArray[index + 2];
				ArrayList<Integer> listOfNum = new ArrayList<Integer>();
				listOfNum.add(inputArray[index]);
				listOfNum.add(inputArray[index + 1]);
				listOfNum.add(inputArray[index + 2]);
				listOfOutput.add(listOfNum);
			}
		}
		return listOfOutput.get(listOfOutput.size() - 1) + " -> " + sum;
	}

	public static void main(String[] args) {
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		String listOfOutMaxTriplet = new TripletHavingMaximumSumUnevenInput_ArrayList().getMaxTriplet(input);
		System.out.println("Triplet having maximum sum is -: ");
		System.out.println(listOfOutMaxTriplet);
	}
}
