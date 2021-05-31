/*Test - 17 :
Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15*/

package simmi.exam17;

import java.util.ArrayList;

public class TripletMaximumSum {

	String triplet(int[] input) {
		int maxSum = 0;
		ArrayList<ArrayList<Integer>> outputList = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < input.length - 2; index = index + 3) {

			if ( input[index] + input[index + 1] + input[index + 2] > maxSum) {

				maxSum = input[index] + input[index + 1] + input[index + 2];
				ArrayList<Integer> numberList = new ArrayList<Integer>();
				numberList.add(input[index]);
				numberList.add(input[index + 1]);
				numberList.add(input[index + 2]);
				outputList.clear();
				outputList.add(numberList);

			}
		}
		return ("ArrayList of triplet having maximum sum is " + outputList + " and the sum is " + maxSum);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		String output = new TripletMaximumSum().triplet(arr);
		System.out.println(output);
	}
}
