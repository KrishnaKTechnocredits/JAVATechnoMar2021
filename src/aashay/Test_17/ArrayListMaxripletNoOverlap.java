package aashay.Test_17;
/*
 * Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17

 */
import java.util.ArrayList;

public class ArrayListMaxripletNoOverlap {
	static int maxSum;
	ArrayList<ArrayList<Integer>> tripletHavingMaxSum(int[] input) {
		
		ArrayList<ArrayList<Integer>> triplets = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < input.length - 3; index++) {
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
		ArrayListMaxripletNoOverlap arrayListMaxripletNoOverlap = new ArrayListMaxripletNoOverlap();
		int[] input = {1,10,2,3,1,11,4,2,1 };
		ArrayList<ArrayList<Integer>> output = arrayListMaxripletNoOverlap.tripletHavingMaxSum(input);
		System.out.println("Without overlapping :Triplet having maximum sum of " + maxSum + " is " + output);
	}

}
