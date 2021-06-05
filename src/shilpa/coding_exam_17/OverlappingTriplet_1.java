/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17
*/
package shilpa.coding_exam_17;

import java.util.ArrayList;

public class OverlappingTriplet_1 {
	String getOverlappingTriplet1(int[] arr) {
		int max = 0;
		ArrayList<Integer> tripletList = new ArrayList<Integer>();
		for (int index = 0; index < arr.length - 2; index++) {
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
		OverlappingTriplet_1 OverlappingTriplet = new OverlappingTriplet_1();
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		String output = OverlappingTriplet.getOverlappingTriplet1(input);
		System.out.println("Overlapped Triplet With Max Sum");
		System.out.println(output);
	}
}
