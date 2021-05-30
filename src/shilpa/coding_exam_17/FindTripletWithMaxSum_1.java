/*Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 -->
output : 3,1,11 -> 15
*/
package shilpa.coding_exam_17;

import java.util.ArrayList;

public class FindTripletWithMaxSum_1 {
	String getTripletWithMaxSum(int[] arr) {
		int max = 0;
		ArrayList<Integer> tripletList = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index = index + 3) {
			if ((arr[index] + arr[index + 1] + arr[index + 2]) > max) {
				max = arr[index] + arr[index + 1] + arr[index + 2];
				tripletList.clear();
				tripletList.add(arr[index]);
				tripletList.add(arr[index + 1]);
				tripletList.add(arr[index + 2]);
			}
		}
		return tripletList + " -> " + max;
	}

	public static void main(String[] args) {
		FindTripletWithMaxSum_1 FindTriplet = new FindTripletWithMaxSum_1();
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		String output = FindTriplet.getTripletWithMaxSum(input);
		System.out.println("Triplet With Max Sum");
		System.out.println(output);
	}
}
