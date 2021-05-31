/*Test - 17 :
Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15*/

package krati_Jain.codingExam17;

import java.util.ArrayList;
import java.util.Arrays;

public class TripletsMaxSum {
	static int maxSum = 0;

	public static void main(String[] args) {

		TripletsMaxSum tripletsMaxSum = new TripletsMaxSum();
		Integer[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> finalTriplet = tripletsMaxSum.getMaxSumTripletNoOverLap(list);
		System.out.println("Triplets in the input array with the max sum of '" + maxSum + "' is :\n" + finalTriplet);
	}

	ArrayList<Integer> getMaxSumTripletNoOverLap(ArrayList<Integer> list) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int sum = 0;
		for (int index = 0; index < list.size() - 2; index += 3) {
			sum = list.get(index) + list.get(index + 1) + list.get(index + 2); // 1+10+2
			if (sum > maxSum) { // 13
				maxSum = sum;
				output.removeAll(output);
				output.add(list.get(index));
				output.add(list.get(index + 1));
				output.add(list.get(index + 2));
			}

		}
		return output;
	}
}
