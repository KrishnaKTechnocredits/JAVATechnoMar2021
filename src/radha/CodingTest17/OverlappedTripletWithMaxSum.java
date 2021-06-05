/*
Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17
*/
package radha.CodingTest17;

import java.util.ArrayList;

public class OverlappedTripletWithMaxSum {

	String findoverlappedTriplet(int[] input) {
		ArrayList<Integer> overlapped = new ArrayList<Integer>();
		int maxSum = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] + input[index + 1] + input[index] + 2 > maxSum) {
				maxSum = input[index] + input[index + 1] + input[index+2];
				overlapped.clear();
				overlapped.add(input[index]);
				overlapped.add(input[index + 1]);
				overlapped.add(input[index + 2]);
			}
		}
		return overlapped + " -> " + maxSum;
	}

	public static void main(String[] args) {
		OverlappedTripletWithMaxSum overlap = new OverlappedTripletWithMaxSum();
		int[] input = {1,10,2,3,1,11,4,2,1};
		String output = overlap.findoverlappedTriplet(input);
		System.out.println("Triplet with maximum sum with overlapped index\n"+output);
	}
}