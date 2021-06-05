/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17*/

package krati_Jain.codingExam17;

import java.util.ArrayList;
import java.util.Arrays;

public class TripletsMaxSumOverlap {
	static int max;

	public static void main(String[] args) {

		TripletsMaxSumOverlap tripletsMaxSumOverlap = new TripletsMaxSumOverlap();
		Integer[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<Integer> finalTriplet = tripletsMaxSumOverlap.getMaxSumTripletNoOverLap(input);
		System.out.println("Triplets in the input array with the max sum of '" + max + "' is :\n" + finalTriplet);
	}

	ArrayList<Integer> getMaxSumTripletNoOverLap(Integer[] input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int sum = 0;
		for (int index = 0; index < input.length - 2; index++) {
			sum = input[index] + input[index + 1] + input[index + 2]; // 1+10+2

			if (sum > max) { // 13
				max = sum; // 13 //15
				output.removeAll(output);
				output.add(input[index]);
				output.add(input[index + 1]);
				output.add(input[index + 2]);
			}
		}
		return output;
	}
}
