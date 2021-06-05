package aashay.Test_17;
/*
 * Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2]
output : 11,4,2 -> 17
 */

import java.util.ArrayList;

public class ArrayListMaxTripletNoOverlapProblem3 {
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
		ArrayListMaxTripletNoOverlapProblem3 arrayListMaxTripletNoOverlapProblem3 = new ArrayListMaxTripletNoOverlapProblem3();
		int[] input = {1,10,2,3,1,11,4,2,1,33,2};
		ArrayList<ArrayList<Integer>> output = arrayListMaxTripletNoOverlapProblem3.tripletHavingMaxSum(input);
		System.out.println("overlapping :Triplet having maximum sum of " + maxSum + " is " + output);
	}

}
