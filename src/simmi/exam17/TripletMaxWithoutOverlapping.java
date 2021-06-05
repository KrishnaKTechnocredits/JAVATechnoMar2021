/*Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 11,4,2 -> 17*/

package simmi.exam17;

import java.util.ArrayList;

public class TripletMaxWithoutOverlapping {
	String triplet(int[] arr) {
		int maxSum = 0;
		ArrayList<ArrayList<Integer>> outputList = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < arr.length - (arr.length % 3) - 2; index++) {
			if (arr[index] + arr[index + 1] + arr[index + 2] > maxSum) {
				maxSum = arr[index] + arr[index + 1] + arr[index + 2];
				ArrayList<Integer> numberList = new ArrayList<Integer>();
				numberList.add(arr[index]);
				numberList.add(arr[index + 1]);
				numberList.add(arr[index + 2]);
				outputList.clear();
				outputList.add(numberList);
			}
		}
		return ("ArrayList of triplet having maximum sum without overlapping is " + outputList + " and the sum is "
				+ maxSum);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		String output = new TripletMaxWithoutOverlapping().triplet(arr);
		System.out.println(output);
	}
}
