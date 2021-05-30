/*Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 3,1,11 -> 15*/

package shilpa.coding_exam_17;

import java.util.ArrayList;

public class FindTripletWithMaxSum_2 {
	String getOverlappingTriplet2(int[] arr) {
		int max = 0;
		ArrayList<Integer> tripletList = new ArrayList<Integer>();
		int size=arr.length-(arr.length%3);
		for (int index = 0; index < size; index=index+3) {
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
		FindTripletWithMaxSum_2 overlappingTriplet = new FindTripletWithMaxSum_2();
		int[] input = {1,10,2,3,1,11,4,2,1,33,2};
		String output = overlappingTriplet.getOverlappingTriplet2(input);
		System.out.println("Triplet With Max Sum");
		System.out.println(output);
		
	}
}
