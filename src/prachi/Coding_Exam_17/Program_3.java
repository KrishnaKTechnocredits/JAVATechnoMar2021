package prachi.Coding_Exam_17;

import java.util.ArrayList;

/*Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 11,4,2 -> 17*/

public class Program_3 {
	
	ArrayList<ArrayList<Integer>> getArrayListOfTriplet(int[] input) {
		
		ArrayList<ArrayList<Integer>> innerList = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < input.length - (input.length % 3) - 2; index = index + 3) {
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
		ArrayList<ArrayList<Integer>> output = new Program_3().getArrayListOfTriplet(input);
		System.out.println(output);
	}
}