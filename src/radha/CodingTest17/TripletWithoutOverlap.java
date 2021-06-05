/*
Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2]
output : 11,4,2 -> 17
 */
package radha.CodingTest17;

import java.util.ArrayList;

public class TripletWithoutOverlap {
	
	String findTripletWithoutOverlap(int[] input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int num = input.length % 3, maxSum=0;
		for(int index=0;index<input.length-num-2;index=index+3) {
			int sum= input[index]+input[index+1]+input[index+2];
			if(sum>maxSum) {
				maxSum=sum;
				output.clear();
				output.add(input[index]);
				output.add(input[index+1]);
				output.add(input[index+2]);
			}
		}
		return output+" -> "+maxSum;
	}
	
	public static void main(String[] args) {
		TripletWithoutOverlap noOverlap = new TripletWithoutOverlap();
		int[] inputArr = {1,10,2,3,1,11,4,2,1,33,2};
		String output = noOverlap.findTripletWithoutOverlap(inputArr);
		System.out.println("Triplet with maximum sum without overlapping index\n"+output);
	}
}