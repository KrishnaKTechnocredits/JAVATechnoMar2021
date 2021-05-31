package meenu.coding_exam_17;

import java.util.ArrayList;

/*Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 3,1,11 -> 15
*/

public class MaxSumOfTriplet {

	ArrayList<ArrayList<Integer>> getTriplets(int[] arr) {
		ArrayList<ArrayList<Integer>> tripletList = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < arr.length - 2; index += 3) {
			int sum = arr[index] + arr[index + 1] + arr[index + 2];
			if (sum > maxSum) {
				maxSum = sum;
				ArrayList<Integer> innerList = new ArrayList<Integer>();
				tripletList.clear();
				innerList.add(arr[index]);
				innerList.add(arr[index + 1]);
				innerList.add(arr[index + 2]);
				tripletList.add(innerList);
			}
		}
		return tripletList;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		MaxSumOfTriplet maxSumOfTriplet = new MaxSumOfTriplet();
		System.out.println("Triplet having maximum sum is: " + maxSumOfTriplet.getTriplets(arr));
	}
}
