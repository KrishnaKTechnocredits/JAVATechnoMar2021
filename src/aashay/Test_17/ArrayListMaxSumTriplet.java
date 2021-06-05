package aashay.Test_17;
/*
 * Test - 17 :
Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15
 */

import java.util.ArrayList;

public class ArrayListMaxSumTriplet {
	
	static int maxSum;

	ArrayList<ArrayList<Integer>> tripletHavingMaxSum(int[] input) {

		ArrayList<ArrayList<Integer>> triplets = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < input.length - 2; index = index + 3) {
			ArrayList<Integer> numList = new ArrayList<Integer>();
			numList.add(input[index]);
			numList.add(input[index + 1]);
			numList.add(input[index + 2]);
			int sum = input[index] + input[index + 1] + input[index + 2];
			if (sum > maxSum) {
				triplets.clear();
				maxSum = sum;
				triplets.add(numList);
				sum = 0;
			}
		}
		return triplets;
	}

	public static void main(String[] args) {
		ArrayListMaxSumTriplet arrayListMaxSumTriplet = new ArrayListMaxSumTriplet();
		int[] input = {1,10,2,3,1,11,4,2,1};
		ArrayList<ArrayList<Integer>> output = arrayListMaxSumTriplet.tripletHavingMaxSum(input);
		System.out.println("Overlapping: Triplet having maximum sum of " + maxSum + " is " + output);
	}

}
