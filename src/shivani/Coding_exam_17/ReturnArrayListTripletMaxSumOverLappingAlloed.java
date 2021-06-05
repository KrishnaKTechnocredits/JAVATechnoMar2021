package shivani.Coding_exam_17;

import java.util.ArrayList;

/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17*/
public class ReturnArrayListTripletMaxSumOverLappingAlloed {
	
	ArrayList<Integer> getMaxTriplet(int[] input) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int maxSum = 0, sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (index < input.length - 2) {
				sum = input[index] + input[index + 1] + input[index + 2];
				if (maxSum < sum) {
					maxSum = sum;
					if (!arrList.isEmpty()) {
						arrList.clear();
					}
					arrList.add(Integer.valueOf(input[index]));
					arrList.add(Integer.valueOf(input[index + 1]));
					arrList.add(Integer.valueOf(input[index + 2]));
				}
			}
		}
		return arrList;
	}

	public static void main(String[] args) {
		int[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		System.out.println("ArrayList of triplet having maximum sum: " + new ReturnArrayListTripletMaxSumOverLappingAlloed().getMaxTriplet(input));
	}
}


