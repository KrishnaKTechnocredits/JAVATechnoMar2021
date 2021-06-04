package prachi.Coding_Exam_17;

import java.util.ArrayList;

/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17*/

public class Program_2 {

	ArrayList<ArrayList<Integer>> getArrayListOfTriplet(int[] input) {
		
		ArrayList<ArrayList<Integer>> innerList = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] + input[index + 1] + input[index + 2] > maxSum) {
				innerList.clear();
				maxSum = input[index] + input[index + 1] + input[index + 2];
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(input[index]);
				list.add(input[index + 1]);
				list.add(input[index + 2]);
				innerList.add(list);
			}
		}
		return innerList;
	}

	public static void main(String[] args) {
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<ArrayList<Integer>> output = new Program_2().getArrayListOfTriplet(input);
		System.out.println("triplet having maximum sum, index overlapping is allowed : ");
		System.out.println(output);
	}
}