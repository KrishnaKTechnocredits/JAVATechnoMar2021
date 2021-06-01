/*Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 3,1,11 -> 15
*/
package prashant.coding_exam_17;

import java.util.ArrayList;

public class MaxsumNoIndexoverlap {
	static int maxsum;

	ArrayList<ArrayList<Integer>> tripletmaxSumNooverlap(int[] input) {
		ArrayList<ArrayList<Integer>> tripletnum = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < input.length - 2; index = index + 3) {
			ArrayList<Integer> List = new ArrayList<Integer>();
			List.add(input[index]);
			List.add(input[index + 1]);
			List.add(input[index + 2]);
			if (maxsum < input[index] + input[index + 1] + input[index + 2]) {
				tripletnum.clear();
				maxsum = input[index] + input[index + 1] + input[index + 2];
				tripletnum.add(List);
			}
		}
		return tripletnum;
	}

	public static void main(String[] args) {
		int[] numarr = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		ArrayList<ArrayList<Integer>> output = new MaxsumNoIndexoverlap().tripletmaxSumNooverlap(numarr);
		System.out.println("with No overlap :triplet having maximum sum" + output + " " + maxsum);
	}
}
