/*
Test - 17 :
Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15
 */

package sourabh.CodingExam_17;

import java.util.ArrayList;

public class FindTripletHavingMaximumSum {
	ArrayList<ArrayList<Integer>> getTripletHavingMaximumSum(int[] arrInput) {
		ArrayList<ArrayList<Integer>> outputList = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < arrInput.length - 2; index = index + 3) {
			if (arrInput[index] + arrInput[index + 1] + arrInput[index + 2] > maxSum) {
				maxSum = arrInput[index] + arrInput[index + 1] + arrInput[index + 2];
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(arrInput[index]);
				list.add(arrInput[index + 1]);
				list.add(arrInput[index + 2]);
				outputList.clear();
				outputList.add(list);

			}
		}
		//System.out.println(outputList);
		return outputList;

	}

	public static void main(String[] args) {
		FindTripletHavingMaximumSum findTripletHavingMaximumSum = new FindTripletHavingMaximumSum();
		int[] arrInput = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };

		ArrayList<ArrayList<Integer>> output= findTripletHavingMaximumSum.getTripletHavingMaximumSum(arrInput);
		System.out.println(output);
	}

}
