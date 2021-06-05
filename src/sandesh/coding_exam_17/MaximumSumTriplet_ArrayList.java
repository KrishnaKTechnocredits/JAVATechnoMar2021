/*
Test - 17 :
Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15
*/

package sandesh.coding_exam_17;

import java.util.ArrayList;

public class MaximumSumTriplet_ArrayList {

	private String getMaxSumTriplet(int[] inputArr) {
		ArrayList<ArrayList<Integer>> listOfTriplets = new ArrayList<ArrayList<Integer>>();
		int sum = 0;
		for (int index = 0; index < inputArr.length; index = index + 3) {
			if (sum < (inputArr[index] + inputArr[index + 1] + inputArr[index + 2])) {
				ArrayList<Integer> listOfNum = new ArrayList<Integer>();
				listOfNum.add(inputArr[index]);
				listOfNum.add(inputArr[index + 1]);
				listOfNum.add(inputArr[index + 2]);
				listOfTriplets.add(listOfNum);
				sum = inputArr[index] + inputArr[index + 1] + inputArr[index + 2];
			}
		}
		return listOfTriplets.get(listOfTriplets.size() - 1) + " -> " + sum;
	}

	public static void main(String[] args) {
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		String listOfTripletsOut = new MaximumSumTriplet_ArrayList().getMaxSumTriplet(input);
		System.out.println("Triplet having maximum sum is -: ");
		System.out.println(listOfTripletsOut);
	}
}
