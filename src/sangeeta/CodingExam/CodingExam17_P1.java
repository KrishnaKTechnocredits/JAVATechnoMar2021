/*return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15*/

package sangeeta.CodingExam;

import java.util.ArrayList;

public class CodingExam17_P1 {
	static int maxSum;

	ArrayList<ArrayList<Integer>> tripletHavingMaxSum(int[] arr) {
		ArrayList<ArrayList<Integer>> triplets = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < arr.length - 2; index = index + 3) {
			ArrayList<Integer> numberList = new ArrayList<Integer>();
			numberList.add(arr[index]);
			numberList.add(arr[index + 1]);
			numberList.add(arr[index + 2]);
			int sum = arr[index] + arr[index + 1] + arr[index + 2];
			if (sum > maxSum) {
				triplets.clear();
				maxSum = sum;
				triplets.add(numberList);
				sum = 0;
			}
		}
		return triplets;
	}

	public static void main(String[] args) {
		CodingExam17_P1 codingExam17_P1 = new CodingExam17_P1();
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<ArrayList<Integer>> output = codingExam17_P1.tripletHavingMaxSum(arr);
		System.out.println("Triplet having maximum sum of " + maxSum + " is " + output);
	}
}
