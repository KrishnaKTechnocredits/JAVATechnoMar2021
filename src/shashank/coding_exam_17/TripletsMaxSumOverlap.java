package shashank.coding_exam_17;

import java.util.ArrayList;
import java.util.Arrays;

/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17*/

public class TripletsMaxSumOverlap {
	static int maxSum=0;
	public ArrayList<Integer>getTripletsMaxSumNoOverlap(ArrayList<Integer> input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int sum=0;
		for (int index=0;index<input.size()-2;index++) {
			sum=input.get(index)+input.get(index+1)+input.get(index+2);
			if (sum>maxSum) {
				maxSum=sum;
				if (!(output.isEmpty()))
					output.clear();
				output.add(input.get(index));
				output.add(input.get(index+1));
				output.add(input.get(index+2));
			}
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TripletsMaxSumOverlap tripletsMaxSumOverlap = new TripletsMaxSumOverlap();
		Integer arr[]= {1,10,2,3,1,11,4,2,1};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> output=tripletsMaxSumOverlap.getTripletsMaxSumNoOverlap(list);
		System.out.println("Triplets in the input array with the max sum of '" + maxSum + "' is :" + output);

	}

}
