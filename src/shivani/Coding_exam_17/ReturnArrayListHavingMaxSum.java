package shivani.Coding_exam_17;

import java.util.ArrayList;

/*Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15*/

public class ReturnArrayListHavingMaxSum {
	
	ArrayList<Integer> getFindMaxTripletSum(int[] arr) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int maxSum = 0;
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = arr[index] + arr[index + 1] + arr[index + 2];
			if (maxSum < sum) {
				maxSum = sum;
				if (!arrList.isEmpty()) {
					arrList.clear();
				}
				arrList.add(Integer.valueOf(arr[index]));
				arrList.add(Integer.valueOf(arr[index + 1]));
				arrList.add(Integer.valueOf(arr[index + 2]));
			}
			index = index + 2;
		}
		return arrList;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		System.out.println("ArrayList of triplet having maximum sum: "+new ReturnArrayListHavingMaxSum().getFindMaxTripletSum(arr));
	}
}
