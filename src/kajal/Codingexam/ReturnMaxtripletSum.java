/*
Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15

 */
package kajal.Codingexam;

import java.util.ArrayList;

public class ReturnMaxtripletSum {
	ArrayList<ArrayList<Integer>> getTriplets(int[] input) {
		ArrayList<ArrayList<Integer>> tripleList = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < input.length; index += 3) {
			int sum = input[index] + input[index + 1] + input[index + 2];
			if (sum > maxSum) {
				maxSum = sum;
				ArrayList<Integer> numlist = new ArrayList<Integer>();
				tripleList.clear();
				numlist.add(input[index]);
				numlist.add(input[index + 1]);
				numlist.add(input[index + 2]);
				tripleList.add(numlist);
			}
		}
		return tripleList;
	}

	public static void main(String[] args) {
		ReturnMaxtripletSum maxTripletSum = new ReturnMaxtripletSum();
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		System.out.println("Triplet with Maximum Sum is : " + maxTripletSum.getTriplets(arr));

	}
}
