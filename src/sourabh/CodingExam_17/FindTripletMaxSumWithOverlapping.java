
/*
Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17
 */
package sourabh.CodingExam_17;

import java.util.ArrayList;

public class FindTripletMaxSumWithOverlapping {
	ArrayList<ArrayList<Integer>> getMaximumSum(int[] arrInput) {
		ArrayList<ArrayList<Integer>> outputList = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < arrInput.length - 2; index++) {
			
			if (arrInput[index] + arrInput[index + 1] + arrInput[index + 2] > maxSum) {
				maxSum= arrInput[index] + arrInput[index + 1] + arrInput[index + 2];
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(arrInput[index]);
				list.add(arrInput[index + 1]);
				list.add(arrInput[index + 2]);
				outputList.clear();
				outputList.add(list);

			}
		}
		return outputList;

	}

	public static void main(String[] args) {
		FindTripletMaxSumWithOverlapping findTripletMaxSum = new FindTripletMaxSumWithOverlapping();
		int[] arrInput = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<ArrayList<Integer>> output = findTripletMaxSum.getMaximumSum(arrInput);
		System.out.println(output);
	}
}
