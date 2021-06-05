/*Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 3,1,11 -> 15
*/
package kajal.Codingexam;

import java.util.ArrayList;

public class MaxSumTriplet {

	ArrayList<ArrayList<Integer>> getTriplet(int[] input) {
		ArrayList<ArrayList<Integer>> tripletList = new ArrayList<ArrayList<Integer>>();
		int maxSum = 0;
		for (int index = 0; index < input.length - 2; index += 3) {
			int sum = input[index] + input[index + 1] + input[index + 2];
			if (sum > maxSum) {
				maxSum = sum;
				ArrayList<Integer> numlist = new ArrayList<Integer>();
				tripletList.clear();
				numlist.add(input[index]);
				numlist.add(input[index + 1]);
				numlist.add(input[index + 2]);
				tripletList.add(numlist);
			}
		}
		return tripletList;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1, 33, 2 };
		System.out.println("Triplet having maximum sum is: " + new MaxSumTriplet().getTriplet(arr));
	}
}