/*
Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17
 */
package paras.Coding_exam_17;

import java.util.ArrayList;

public class MaxSumTriplet {

	int maxSum;

	ArrayList<ArrayList<Integer>> maxSumTriplet(int[] arr) {
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
		MaxSumTriplet maxSumTriplet = new MaxSumTriplet();
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		System.out.println(maxSumTriplet.maxSumTriplet(arr));
	}
}
