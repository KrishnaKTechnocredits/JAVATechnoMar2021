/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17*/

package simmi.exam17;

import java.util.ArrayList;

public class TripletMaxWithOverLapping {
	String triplet(int[] input) {
		int maxSum = 0;
		ArrayList<ArrayList<Integer>> outputList = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < input.length-2; index++) {
			if (input[index] + input[index + 1] + input[index + 2] > maxSum) {
				maxSum = input[index] + input[index + 1] + input[index + 2];
				ArrayList<Integer> numberList = new ArrayList<Integer>();
				numberList.add(input[index]);
				numberList.add(input[index + 1]);
				numberList.add(input[index + 2]);
				outputList.clear();
				outputList.add(numberList);
			}
		}
		return ("ArrayList of triplet having maximum sum with overlapping is " + outputList + " and the sum is " + maxSum);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		String output = new TripletMaxWithOverLapping().triplet(arr);
		System.out.println(output);
	}
}
