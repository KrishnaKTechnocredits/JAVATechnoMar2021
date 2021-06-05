package komal.coding_exam_17;

import java.util.ArrayList;

/*Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15
*/

public class MaxTripletSum {

	ArrayList<ArrayList<Integer>> getTriplets(int[] arr) {
		ArrayList<ArrayList<Integer>> tripleList = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < arr.length; index += 3) {
			int sum = arr[index] + arr[index + 1] + arr[index + 2];
			if (sum > maxSum) {
				maxSum = sum;
				ArrayList<Integer> innerList = new ArrayList<Integer>();
				tripleList.clear();
				innerList.add(arr[index]);
				innerList.add(arr[index + 1]);
				innerList.add(arr[index + 2]);
				tripleList.add(innerList);
			}
		}
		return tripleList;
	}

	public static void main(String[] args) {
		MaxTripletSum maxTripletSum = new MaxTripletSum();
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		System.out.println("Triplet with Maximum Sum is : " + maxTripletSum.getTriplets(arr));
	}
}
