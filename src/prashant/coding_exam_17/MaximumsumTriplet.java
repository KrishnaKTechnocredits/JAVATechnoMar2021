/*Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15*/
package prashant.coding_exam_17;

import java.util.ArrayList;

public class MaximumsumTriplet {
	static int maxsum;

	ArrayList<ArrayList<Integer>> tripletsum(int[] num) {
		ArrayList<ArrayList<Integer>> tripletnum = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < num.length; index = index + 3) {
			ArrayList<Integer> List = new ArrayList<Integer>();
			List.add(num[index]);
			List.add(num[index + 1]);
			List.add(num[index + 2]);
			if (maxsum < num[index] + num[index + 1] + num[index + 2]) {
				tripletnum.clear();
				maxsum = num[index] + num[index + 1] + num[index + 2];
				tripletnum.add(List);
			}
		}
		return tripletnum;
	}

	public static void main(String[] args) {
		int[] numarr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<ArrayList<Integer>> output = new MaximumsumTriplet().tripletsum(numarr);
		System.out.println("wihout overlap :triplet having maximum sum" + output + " ->" + maxsum);
	}
}
