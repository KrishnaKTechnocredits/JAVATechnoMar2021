/*
 Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17
 */
package kajal.Codingexam;

import java.util.ArrayList;

public class TripletwithMaxSum {
	ArrayList<ArrayList<Integer>> getTripletwithMaxSum(int[] input) {
		ArrayList<ArrayList<Integer>> outputList = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < input.length - 2; index++) {
			int sum = input[index] + input[index + 1] + input[index + 2];
			if (sum > maxSum) {
				maxSum = sum;
				ArrayList<Integer> numlist = new ArrayList<Integer>();
				outputList.clear();
				numlist.add(input[index]);
				numlist.add(input[index + 1]);
				numlist.add(input[index + 2]);
				outputList.add(numlist);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		System.out.println("Triplet with Maximum Sum is : " + new TripletwithMaxSum().getTripletwithMaxSum(arr));
	}
}
