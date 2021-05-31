/*
 Test - 17 :

Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 11,4,2 -> 17
 */
package upasana.coding_exam_17;

import java.util.ArrayList;

public class Triplet3 {

	ArrayList<ArrayList<Integer>> getTriplet(int[] input) {
		ArrayList<ArrayList<Integer>> listOutput = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < input.length - (input.length % 3) - 2; index += 3) {
			if (input[index] + input[index + 1] + input[index + 2] > maxSum) {
				listOutput.clear();
				maxSum = input[index] + input[index + 1] + input[index + 2];
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(input[index]);
				list.add(input[index + 1]);
				list.add(input[index + 2]);
				listOutput.add(list);
			}

		}

		return listOutput;

	}

	public static void main(String[] args) {
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<ArrayList<Integer>> listOutput = new Triplet3().getTriplet(input);
		System.out.println(listOutput);
	}
}
