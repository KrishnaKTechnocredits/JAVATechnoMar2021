/*Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15
*/

package shashank.coding_exam_17;

import java.util.ArrayList;
import java.util.Arrays;


public class TripletsMaxSum {
	 static int maxSum = 0;
	ArrayList<Integer> getMaxSumTripletNoOverLap(ArrayList<Integer> list) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index=0;index<list.size()-2;index+=3) {
			int sum =list.get(index)+list.get(index+1)+list.get(index+2);
			if(sum>maxSum) {
				maxSum=sum;
				if (!(output.isEmpty()))
					output.clear();
				output.add(list.get(index));
				output.add(list.get(index+1));
				output.add(list.get(index+2));
			}
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TripletsMaxSum tripletsMaxSum = new TripletsMaxSum();
		Integer[] input = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> finalTriplet = tripletsMaxSum.getMaxSumTripletNoOverLap(list);
		System.out.println("Triplets in the input array with the max sum of '" + maxSum + "' is :" + finalTriplet);
	}

}
