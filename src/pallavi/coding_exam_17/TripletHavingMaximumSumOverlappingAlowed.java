package pallavi.coding_exam_17;

import java.util.ArrayList;

/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17
*/

public class TripletHavingMaximumSumOverlappingAlowed {

	String getTriplet(int arr[]) {
		int maxSum = 0;
		ArrayList<ArrayList<Integer>> finalList = new ArrayList<ArrayList<Integer>>();
		for (int index = 0; index < arr.length - 2; index++) {

			if (arr[index] + arr[index + 1] + arr[index + 2] > maxSum) {
				maxSum = arr[index] + arr[index + 1] + arr[index + 2];
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(arr[index]);
				list.add(arr[index + 1]);
				list.add(arr[index + 2]);
				finalList.clear();
				finalList.add(list);
			}

		}
		return finalList + " sum is " + maxSum + " : If overlapping is  allowed";

	}

	public static void main(String[] args) {
		int input[] = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		String output = new TripletHavingMaximumSumOverlappingAlowed().getTriplet(input);
		System.out.println(output);
	}

}
