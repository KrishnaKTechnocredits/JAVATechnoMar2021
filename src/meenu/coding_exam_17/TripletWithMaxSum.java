package meenu.coding_exam_17;

import java.util.ArrayList;

/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17
*/

public class TripletWithMaxSum {

	ArrayList<ArrayList<Integer>> getTripletWithMaxSum(int[] arr) {
		ArrayList<ArrayList<Integer>> outputList = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < arr.length - 2; index++) {
			int sum = arr[index] + arr[index + 1] + arr[index + 2];
			if (sum > maxSum) {
				maxSum = sum;
				ArrayList<Integer> innerList = new ArrayList<Integer>();
				outputList.clear();
				innerList.add(arr[index]);
				innerList.add(arr[index + 1]);
				innerList.add(arr[index + 2]);
				outputList.add(innerList);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		int[] arrOfNum = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		TripletWithMaxSum tripletWithMaxSum = new TripletWithMaxSum();
		System.out.println("Triplet with Maximum Sum is : " + tripletWithMaxSum.getTripletWithMaxSum(arrOfNum));
	}
}
